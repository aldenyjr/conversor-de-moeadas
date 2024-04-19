package br.com.alura.conversormoedas.principal;

import br.com.alura.conversormoedas.services.ConversorMoedasService;
import br.com.alura.conversormoedas.util.HistoricoConversoes;
import br.com.alura.conversormoedas.util.Menu;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcaoEscolhida = 0;

        var menu = new Menu();
        var historico = new HistoricoConversoes();
        var conversor = new ConversorMoedasService(historico);


        while (true){
            menu.exibirMenuOpcoes();
            opcaoEscolhida = leitura.nextInt();

            switch (opcaoEscolhida){
                case 1:
                    menu.exibirMenuValor();
                    conversor.converterMoeda("USD", "ARS", leitura.nextDouble());
                    break;
                case 2:
                    menu.exibirMenuValor();
                    conversor.converterMoeda("ARS", "USD", leitura.nextDouble());
                    break;
                case 3:
                    menu.exibirMenuValor();
                    conversor.converterMoeda("USD", "BRL", leitura.nextDouble());
                    break;
                case 4:
                    menu.exibirMenuValor();
                    conversor.converterMoeda("BRL", "USD", leitura.nextDouble());
                    break;
                case 5:
                    menu.exibirMenuValor();
                    conversor.converterMoeda("USD", "COP", leitura.nextDouble());
                    break;
                case 6:
                    menu.exibirMenuValor();
                    conversor.converterMoeda("COP", "USD", leitura.nextDouble());
                    break;
                case 7:
                    menu.exibirMenuSair();
                    break;
                case 8:
                    historico.exibirHistoricoDeConversoes();
                    break;
                default:
                    menu.exibirMenuOpcaoInvalida();
                    break;
                }

                if(opcaoEscolhida == 7 || opcaoEscolhida < 1 || opcaoEscolhida > 8){
                    break;
            }

        }


    }
}
