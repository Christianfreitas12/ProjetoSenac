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

    public static void intrucoes(){
        
    }
}
