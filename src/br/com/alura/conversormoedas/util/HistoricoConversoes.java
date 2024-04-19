package br.com.alura.conversormoedas.util;

import java.util.ArrayList;
import java.util.List;

public class HistoricoConversoes {
    private List<String> historicos;

    public HistoricoConversoes() {
        historicos = new ArrayList<>();
    }

    public void adicionarConversao(String conversao){
        historicos.add(conversao);
    }

    public void exibirHistoricoDeConversoes() {
        System.out.println("Histórico de Conversões:");
        for (String conversao : historicos){
            System.out.println(conversao);
        }
    }
}
