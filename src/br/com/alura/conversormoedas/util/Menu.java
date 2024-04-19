package br.com.alura.conversormoedas.util;

public class Menu {
    private final String menuOpcoes = """
*******************************************************************
Seja bem-vindo(a) ao Conversor de Moeda =]
                            
1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileiro
4) Real brasileiro =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Sair
8) Consultar Historico de Conversões
                            
Escolha uma opção válida:
*******************************************************************
            """;

    private final String menuValor = "Digite o valor que deseja converter:";
    private final String menuOpcaoInvalida = "Opção Invalida, digite uma das opções corresponde do MENU de Opções";
    private final String menuSair = "Saindo...";

    public void exibirMenuOpcoes() {
        System.out.println(this.menuOpcoes);
    }

    public void exibirMenuValor(){
        System.out.println(this.menuValor);
    }

    public void exibirMenuOpcaoInvalida(){ System.out.println(this.menuOpcaoInvalida); }
    public void exibirMenuSair(){ System.out.println(this.menuSair);
    }
}
