import java.util.Scanner;

public class Menu {
    static Scanner read = new Scanner(System.in);

    public static void finalMenu(){

        System.out.println("+--------------------------------+");
        System.out.println("|          Menu do jogo          |");
        System.out.println("+--------------------------------+");
        System.out.println("|   1 - Introdução               |");
        System.out.println("|   2 - Jogar                    |");
        System.out.println("|   3 - Créditos                 |");
        System.out.println("|   4 - Sair                     |");
        System.out.println("+--------------------------------+");

        System.out.println("Escolha uma opção...");
    }

    public static void creditos(){
        System.out.println("+--------------------------------+");
        System.out.println("|         Colaboradores          |");
        System.out.println("+--------------------------------+");
        System.out.println("| Christian de Freitas Guimarães |");
        System.out.println("| Danilo Vitorino Pessoa         |");
        System.out.println("| Fellipe Nobre Bizarria         |");
        System.out.println("| Vitor Hugo Santos Maia         |");
        System.out.println("+--------------------------------+");
    }

    public static void instrucoes(){
        System.out.println("+-------------------------------------------------------------------------------------+");
        System.out.println("|                                       Introdução                                    |");
        System.out.println("+-------------------------------------------------------------------------------------+");
        System.out.println("| Ola!, estas serão as instruçoes para iniciar o quiz sobre futebol                   |");
        System.out.println("| O quiz consiste em um teste de conhecimento sobre o futebol em geral                |");
        System.out.println("| Cada pergunta tera 3 escolhas e somente uma resposta correta                        |");
        System.out.println("| Cada resposta correta voce ganha 1 ponto.                                           |");
        System.out.println("| Voce tera que digitar no seu teclado a letra referente a resposta correta A, B ou C |");
        System.out.println("| Ao final do Quiz os seus pontos serão somados exibidos na tela                      |");
        System.out.println("+-------------------------------------------------------------------------------------+");

    }

}
