import java.util.Scanner;
public class Game {
    public static void inicioGame(){
                Scanner input = new Scanner(System.in);
                int pontuacao = 0;
                String resposta;
        
                // Pergunta 1
                System.out.println("1. Qual é o nome do jogador que venceu a Bola de Ouro da FIFA em 2021?");
                System.out.println("a) Lionel Messi");
                System.out.println("b) Cristiano Ronaldo");
                System.out.println("c) Robert Lewandowski");
                resposta = input.nextLine();
                if (resposta.equals("c")) {
                    pontuacao++;
                }
        
                // Pergunta 2
                System.out.println("2. Qual país venceu a Copa do Mundo da FIFA de 2018?");
                System.out.println("a) Espanha");
                System.out.println("b) França");
                System.out.println("c) Brasil");
                resposta = input.nextLine();
                if (resposta.equals("b")) {
                    pontuacao++;
                }
        
                // Pergunta 3
                System.out.println("3. Qual time venceu a Liga dos Campeões da UEFA em 2020?");
                System.out.println("a) Bayern de Munique");
                System.out.println("b) Paris Saint-Germain");
                System.out.println("c) Manchester City");
                resposta = input.nextLine();
                if (resposta.equals("a")) {
                    pontuacao++;
                }
        
                // Pergunta 4
                System.out.println("4. Qual jogador tem o recorde de gols marcados em uma única temporada da Liga dos Campeões da UEFA?");
                System.out.println("a) Lionel Messi");
                System.out.println("b) Cristiano Ronaldo");
                System.out.println("c) Neymar");
                resposta = input.nextLine();
                if (resposta.equals("b")) {
                    pontuacao++;
                }
        
                // Pergunta 5
                int i = 0;
                while (i < 3) {
                    System.out.println("5. Qual é o apelido da seleção brasileira de futebol?");
                    System.out.println("a) Amarelinha");
                    System.out.println("b) Canarinho");
                    System.out.println("c) Verde-Amarela");
                    resposta = input.nextLine();
                    if (resposta.equals("b")) {
                        pontuacao++;
                        break;
                    } else {
                        i++;
                    }
                }

                System.out.println("6. Em que ano o Brasil venceu a sua primeira Copa do Mundo ? ");
                System.out.println("a) 1958");
                System.out.println("b) 1962");
                System.out.println("c) 1951");
                resposta = input.nextLine();
                if (resposta.equals("a")) {
                    pontuacao++;
                }
        
                System.out.println("7. Quém é o maior artilheiro de todos os tempos do Brasil ? ");
                System.out.println("a) Ronaldo Fenomeno");
                System.out.println("b) Pele");
                System.out.println("c) Neymar");
                resposta = input.nextLine();
                if (resposta.equals("b")) {
                    pontuacao++;
                }
                System.out.println("8. Quem foi o primeiro campeão Brasileiro ? ");
                System.out.println("a) Santos");
                System.out.println("b) Bahia");
                System.out.println("c) Atletico Mineiro");
                resposta = input.nextLine();
                if (resposta.equals("c")) {
                    pontuacao++;
                }
                System.out.println("9. Quantos titulos mundiais tem o Palmeiras ? ");
                System.out.println("a) 0");
                System.out.println("b) 1");
                System.out.println("c) 2");
                resposta = input.nextLine();
                if (resposta.equals("0")) {
                    pontuacao++;
                }
                System.out.println("10. Em que ano Pep Guardiola estreou como treinador do FC Barcelona ? ");
                System.out.println("a) 2009");
                System.out.println("b) 2008");
                System.out.println("c) 2010");
                resposta = input.nextLine();
                if (resposta.equals("b")) {
                    pontuacao++;
                }
                System.out.println("11. Quantas Copas do Mundo a Itália ganhou ? ");
                System.out.println("a) 4 Copas do mundo");
                System.out.println("b) 3 Copas do mundo");
                System.out.println("c) 2 Copas do mundo");
                resposta = input.nextLine();
                if (resposta.equals("a")) {
                    pontuacao++;
                }
                System.out.println("12. Qual estadio tem a maior capacidade de publico no Brasil ? ");
                System.out.println("a) Mané Garincha");
                System.out.println("b) Arena Castelão");
                System.out.println("c) Maracanã");
                resposta = input.nextLine();
                if (resposta.equals("c")) {
                    pontuacao++;
                }
                System.out.println("13. Qual é o time com mais champions league ? ");
                System.out.println("a) Milan");
                System.out.println("b) Real Madrid");
                System.out.println("c) Leverpool");
                resposta = input.nextLine();
                if (resposta.equals("b")) {
                    pontuacao++;
                }
                System.out.println("14. Qual jogador foi artilheiro da champions league 2021\22 ? ");
                System.out.println("a) Karim Benzema");
                System.out.println("b) Lewandowski");
                System.out.println("c) Mohamed Salah");
                resposta = input.nextLine();
                if (resposta.equals("a")) {
                    pontuacao++;
                }
                System.out.println("15. Onde o futebol foi criado ? ");
                System.out.println("a) Brasil");
                System.out.println("b) China");
                System.out.println("c) Inglaterra");
                resposta = input.nextLine();
                if (resposta.equals("a")) {
                    pontuacao++;
                }
                // Exibe a pontuação final
                System.out.println("Sua pontuação final é " + pontuacao + " de 15.");
        
                // Classificação do jogador
                if (pontuacao == 5) {
                    System.out.println("Excelente! Você é um verdadeiro fã de futebol.");
                } else if (pontuacao >= 3) {
                    System.out.println("Bom trabalho! Você sabe muito sobre futebol.");
                } else {
                    System.out.println("Que pena! Você precisa estudar mais sobre futebol.");
                }
            }
        }

