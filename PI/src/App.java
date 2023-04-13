import java.util.Scanner;

public class App {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Game game = new Game();

        int numOpcao;

        do {
            menu.finalMenu();
            numOpcao = read.nextInt();

            switch (numOpcao) {
                case 1:
                    menu.intrucoes();
                    break;
                case 2:
                    game.inicioGame();
                    break;
                case 3:
                    menu.creditos();
                    break;
                case 4:
                    System.out.println("Você escolheu a opção 4");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (numOpcao != 4);
    }
    
}
