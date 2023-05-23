import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {

    public static void timer() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void timer1() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void inicioGame() throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        int pontuacao = 0;
        String resposta;
        Menu menu = new Menu();

        // armazenando questões
        Collection<String> questoes = new ArrayList<>();
        questoes.add("1. Qual é o nome do jogador que venceu a Bola de Ouro da FIFA em 2021?");
        questoes.add("2. Qual país venceu a Copa do Mundo da FIFA de 2018?");
        questoes.add("3. Qual time venceu a Liga dos Campeões da UEFA em 2020?");
        questoes.add("4. Qual jogador tem o recorde de gols marcados em uma única temporada da Liga dos Campeões da UEFA?");
        questoes.add("5. Qual é o apelido da seleção brasileira de futebol?");
        questoes.add("6. Em que ano o Brasil venceu a sua primeira Copa do Mundo?");
        questoes.add("7. Quém é o maior artilheiro de todos os tempos do Brasil?");
        questoes.add("8. Quantos titulos mundiais tem o Palmeiras?");

        // aramazenando alternativas questão 1
        Collection<String> alternativasquest1 = new ArrayList<>();
        alternativasquest1.add("Lionel Messi");
        alternativasquest1.add("Cristiano Ronaldo");
        alternativasquest1.add("Robert Lewandowski");
        String alternativaCorreta = "Lionel Messi";

        // embaralhando a ordem das alternativas
        Collections.shuffle((List<String>) alternativasquest1);

        // mostrando questão 1
        System.out.println(((List<String>) questoes).get(0));
        timer();

        // mostrando as respostas
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ") " + ((List<String>) alternativasquest1).get(i));
            timer1();
        }
        // pegando respostas questão 1
        resposta = input.nextLine();
        menu.limparConsole();
        
        // verificando o valor digitado
        switch (resposta) {
            case "0":
            case "1":
            case "2":
                int respostaInt = Integer.parseInt(resposta);

                String valorResposta = ((List<String>) alternativasquest1).get(respostaInt);
                if (valorResposta.equals(alternativaCorreta)) {
                    pontuacao++;
                }
                break;
        }

        // Pergunta 2
        // aramazenando alternativas questão 2
        Collection<String> alternativasquest2 = new ArrayList<>();
        alternativasquest2.add("Espanha");
        alternativasquest2.add("França");
        alternativasquest2.add("Brasil");
        String alternativaCorreta2 = "França";

        // embaralhando a ordem das alternativas
        Collections.shuffle((List<String>) alternativasquest2);

        // mostrando questão 2
        System.out.println(((List<String>) questoes).get(1));
        timer();
        
        // mostrando as respostas
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ") " + ((List<String>) alternativasquest2).get(i));
            timer1();
        }
        // pegando respostas questão
        resposta = input.nextLine();
        menu.limparConsole();

        // verificando o valor digitado
        switch (resposta) {
            case "0":
            case "1":
            case "2":
                int respostaInt = Integer.parseInt(resposta);

                String valorResposta = ((List<String>) alternativasquest2).get(respostaInt);
                if (valorResposta.equals(alternativaCorreta2)) {
                    pontuacao++;
                }
                break;
        }

        // Pergunta 3
        Collection<String> alternativasquest3 = new ArrayList<>();
        alternativasquest3.add("Bayern de Munique");
        alternativasquest3.add("Paris Saint-Germain");
        alternativasquest3.add("Manchester City");
        String alternativaCorreta3 = "Bayern de Munique";

        // embaralhando a ordem das alternativas
        Collections.shuffle((List<String>) alternativasquest3);

        // mostrando questão 3
        System.out.println(((List<String>) questoes).get(2));
        timer();

        // mostrando as respostas
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ") " + ((List<String>) alternativasquest3).get(i));
            timer1();
        }
        // pegando respostas questão 
        resposta = input.nextLine();
        menu.limparConsole();

        // verificando o valor digitado
        switch (resposta) {
            case "0":
            case "1":
            case "2":
                int respostaInt = Integer.parseInt(resposta);

                String valorResposta = ((List<String>) alternativasquest3).get(respostaInt);
                if (valorResposta.equals(alternativaCorreta3)) {
                    pontuacao++;
                }
                break;
        }

        // Pergunta 4
        Collection<String> alternativasquest4 = new ArrayList<>();
        alternativasquest4.add("Lionel Messi");
        alternativasquest4.add("Cristiano Ronaldo");
        alternativasquest4.add("Neymar");
        String alternativaCorreta4 = "Cristiano Ronaldo";

        // embaralhando a ordem das alternativas
        Collections.shuffle((List<String>) alternativasquest4);

        // mostrando questão 4
        System.out.println(((List<String>) questoes).get(3));
        timer();

        // mostrando as respostas
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ") " + ((List<String>) alternativasquest4).get(i));
            timer1();
        }
        // pegando respostas questão 
        resposta = input.nextLine();
        menu.limparConsole();

        // verificando o valor digitado
        switch (resposta) {
            case "0":
            case "1":
            case "2":
                int respostaInt = Integer.parseInt(resposta);

                String valorResposta = ((List<String>) alternativasquest4).get(respostaInt);
                if (valorResposta.equals(alternativaCorreta4)) {
                    pontuacao++;
                }
                break;
        }

        // Pergunta 5
        Collection<String> alternativasquest5 = new ArrayList<>();
        alternativasquest5.add("Amarelinha");
        alternativasquest5.add("Canarinho");
        alternativasquest5.add("Verde-Amarela");
        String alternativaCorreta5 = "Canarinho";

        // embaralhando a ordem das alternativas
        Collections.shuffle((List<String>) alternativasquest5);

        // mostrando questão 5
        System.out.println(((List<String>) questoes).get(4));
        timer();

        // mostrando as respostas
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ") " + ((List<String>) alternativasquest5).get(i));
            timer1();
        }
        // pegando respostas questão 
        resposta = input.nextLine();
        menu.limparConsole();

        // verificando o valor digitado
        switch (resposta) {
            case "0":
            case "1":
            case "2":
                int respostaInt = Integer.parseInt(resposta);

                String valorResposta = ((List<String>) alternativasquest5).get(respostaInt);
                if (valorResposta.equals(alternativaCorreta5)) {
                    pontuacao++;
                }
                break;
        }

        // Pergunta 6
        Collection<String> alternativasquest6 = new ArrayList<>();
        alternativasquest6.add("1958");
        alternativasquest6.add("1962");
        alternativasquest6.add("1951");
        String alternativaCorreta6 = "1958";

        // embaralhando a ordem das alternativas
        Collections.shuffle((List<String>) alternativasquest6);

        // mostrando questão 6
        System.out.println(((List<String>) questoes).get(5));
        timer();

        // mostrando as respostas
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ") " + ((List<String>) alternativasquest6).get(i));
            timer1();
        }
        // pegando respostas questão 
        resposta = input.nextLine();
        menu.limparConsole();

        // verificando o valor digitado
        switch (resposta) {
            case "0":
            case "1":
            case "2":
                int respostaInt = Integer.parseInt(resposta);
            

                String valorResposta = ((List<String>) alternativasquest6).get(respostaInt);
                if (valorResposta.equals(alternativaCorreta6)) {
                    pontuacao++;
                }
                break;
        }

        // pergunta 7
        Collection<String> alternativasquest7 = new ArrayList<>();
        alternativasquest7.add("Pelé");
        alternativasquest7.add("Ronaldo Fenômeno");
        alternativasquest7.add("Neymar Júnior");
        String alternativaCorreta7 = "Pelé";

        // embaralhando a ordem das alternativas
        Collections.shuffle((List<String>) alternativasquest7);

        // mostrando questão 7
        System.out.println(((List<String>) questoes).get(6));
        timer();

        // mostrando as respostas
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ") " + ((List<String>) alternativasquest7).get(i));
            timer1();
        }
        // pegando respostas questão 
        resposta = input.nextLine();
        menu.limparConsole();

        // verificando o valor digitado
        switch (resposta) {
            case "0":
            case "1":
            case "2":
                int respostaInt = Integer.parseInt(resposta);
    
                String valorResposta = ((List<String>) alternativasquest7).get(respostaInt);
                if (valorResposta.equals(alternativaCorreta7)) {
                    pontuacao++;
                }
                break;
        }

        // pergunta 8
        Collection<String> alternativasquest8 = new ArrayList<>();
        alternativasquest8.add("0");
        alternativasquest8.add("1");
        alternativasquest8.add("2");
        String alternativaCorreta8 = "0";

        // embaralhando a ordem das alternativas
        Collections.shuffle((List<String>) alternativasquest8);

        // mostrando questão 8
        System.out.println(((List<String>) questoes).get(7));
        timer();

        // mostrando as respostas
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ") " + ((List<String>) alternativasquest8).get(i));
            timer1();
        }
        // pegando respostas questão 
        resposta = input.nextLine();
        menu.limparConsole();

        // verificando o valor digitado
        switch (resposta) {
            case "0":
            case "1":
            case "2":
                int respostaInt = Integer.parseInt(resposta);

                String valorResposta = ((List<String>) alternativasquest8).get(respostaInt);
                if (valorResposta.equals(alternativaCorreta8)) {
                    pontuacao++;
                }
                break;
        }

        menu.limparConsole();

        // Exibe a pontuação final
        System.out.printf("Sua pontuação final é %d de 8. \n", pontuacao);

        // Classificação do jogador
        if (pontuacao > 6) {
            System.out.println("Excelente! Você é um verdadeiro fã de futebol.");
        } else if (pontuacao > 4) {
            System.out.println("Bom trabalho! Você sabe muito sobre futebol.");
        } else {
            System.out.println("Que pena! Você precisa estudar mais sobre futebol.");
        }
        menu.tecleParaContinuar();
    }
}
