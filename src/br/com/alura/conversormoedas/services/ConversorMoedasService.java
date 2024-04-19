package br.com.alura.conversormoedas.services;

import br.com.alura.conversormoedas.util.DataAtualFormatada;
import br.com.alura.conversormoedas.util.HistoricoConversoes;
import br.com.alura.conversormoedas.util.Log;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Logger;

public class ConversorMoedasService {
    private String origemMoeda;
    private String destinoMoeda;
    private double valorOrigem;
    private double valorDestino;
    HistoricoConversoes historico;
    Log log;

    public ConversorMoedasService(HistoricoConversoes historico) {
        this.historico = historico;
        this.log = new Log();
    }

    public void setOrigemMoeda(String origemMoeda) {
        this.origemMoeda = origemMoeda;
    }

    public void setDestinoMoeda(String destinoMoeda) {
        this.destinoMoeda = destinoMoeda;
    }

    public void setValorOrigem(double valorOrigem) {
        this.valorOrigem = valorOrigem;
    }

    public void converterMoeda(String origemMoeda, String destinoMoeda, double valorOrigem) {
        setOrigemMoeda(origemMoeda);
        setDestinoMoeda(destinoMoeda);
        setValorOrigem(valorOrigem);

        DataAtualFormatada dataAtualFormatada = new DataAtualFormatada();

        URI _URL = URI.create("https://v6.exchangerate-api.com/v6/a9e490a5e100ee3644594464/latest/" + this.origemMoeda);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(_URL)
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
               System.out.println("Falha ao consultar API: Not Found " + response.statusCode());
            }

            JsonParser jsonParser = new JsonParser();
            JsonElement jsonElement = jsonParser.parse(response.body());
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            double taxaDeConversao = Double.parseDouble(String.valueOf(jsonObject.getAsJsonObject("conversion_rates").get(this.destinoMoeda)));
            this.valorDestino = this.valorOrigem * taxaDeConversao;
            String mensagem = "Valor " + this.valorOrigem + " [" + this.origemMoeda + "] corresponde ao valor final de =>> " + this.valorDestino + " [" + destinoMoeda + "]";

            historico.adicionarConversao(mensagem);

            log.gerarLog().info(dataAtualFormatada.dataHoraAtual() + " | [" + this.origemMoeda + "][" + valorOrigem + "] " + " =>> [" + this.destinoMoeda + "][" + taxaDeConversao + "] Resultado = [" + valorDestino + "]" );
            System.out.println(mensagem + "\n");

        } catch (Exception e) {
            log.gerarLog().warning(dataAtualFormatada.dataHoraAtual() + "Falha ao consultar API: " + e.getMessage() );
            System.out.println("Falha ao consultar API: " + e.getMessage());

        }

    }
}
