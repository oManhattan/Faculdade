/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalBoss;

import static TestesProjeto.Templo3_Completo.GREEN;
import static TestesProjeto.Templo3_Completo.RED;
import static TestesProjeto.Templo3_Completo.RESET;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Teste4 {

    public static void main(String[] args) {
        int[] num; // sem X
        int[] numX; // com X
        int[] raiz;
        int[] raiz2;
        double[] cima = new double[2];
        double divisor;
        int x2, x, n; // A, B, C
        double delta;

        int[] respostaErradaInt_Raiz1;
        int[] respostaErradaInt_Raiz2;
        int[] baseConversao = new int[5];

        String respostaCerta;
        String[] respostaErrada;
        
        String[] opcoes = new String[5];
        ArrayList<String> embaralhador = new ArrayList();
        ////////////////////////////////////////////////////////////////////////
        // Determinando os numeros do exercicio e tambem a resolucao
        do {
            do {
                num = DeterminaNumero_FinalBoss(); // Determinando numeros sem X
                numX = DeterminaNumero_FinalBoss(); // Determinando numeros com X

                // Organizando a equacao
                x2 = (numX[0] * numX[1]) + (numX[2] * numX[3]); // Ax²
                x = (numX[0] * num[1]) + (num[0] * numX[1]) + (numX[2] * num[3]) + (num[2] * numX[3]); //Bx
                n = (num[0] * num[1]) + (num[2] * num[3]); // C
            } while (x2 == 0);
            delta = Math.pow(x, 2) - (4 * x2 * n); // Fazendo delta

        } while (Math.sqrt(delta) % 1 != 0);

        divisor = x2 * 2;
        cima[0] = -x + Math.sqrt(delta);
        cima[1] = -x - Math.sqrt(delta);

        System.out.printf("(%dx + %d) (%dx + %d) + (%dx + %d) (%dx + %d) = 0\n\n", // Enunciado
                numX[0], num[0], numX[1], num[1], numX[2], num[2], numX[3], num[3]);
        //        1        2       3        4        5       6       7        8
        /*
        System.out.printf("%dx² + %dx + %d = 0\n\n", x2, x, n);
        System.out.printf("Raiz1 = %.0f / %.0f\n", cima[0], divisor);
        System.out.printf("Raiz2 = %.0f / %.0f\n\n", cima[1], divisor);
         */
        // raiz 1
        if (cima[0] % divisor == 0) { // se a divisão for exata, fazer a divisão
            raiz = new int[1];
            raiz[0] = (int) (cima[0] / divisor);

            if (raiz[0] == 0) {
                raiz[0] = Math.abs(raiz[0]);
            }
            System.out.printf("Raiz 1 = %d\n", raiz[0]);
        } else { // se a divisão não for exata, simplificar a fração
            raiz = SimplificaFracao_FinalBoss(cima[0], divisor);

            System.out.printf("Raiz 1 = %d / %d\n", raiz[0], raiz[1]);
        }

        // raiz 2
        if (cima[1] % divisor == 0) { // se a divisão for exata, fazer a divisao
            raiz2 = new int[1];
            raiz2[0] = (int) (cima[1] / divisor);

            if (raiz[0] == 0) {
                raiz[0] = Math.abs(raiz[0]);
            }

            System.out.printf("Raiz 2 = %d\n", raiz2[0]);
        } else { // se a divisão não for exata, simplificar a fração
            raiz2 = SimplificaFracao_FinalBoss(cima[1], divisor);

            System.out.printf("Raiz 2 = %d / %d\n", raiz2[0], raiz2[1]);
        }

        ////////////////////////////////////////////////////////////////////////
        // Parte para gerar respostas em String e fazer o desafio
        // As respostas estarao convertidas em outras bases para que o player faça a conversão
        //Raiz 1
        respostaErradaInt_Raiz1 = ProduzRespostaErrada_FinalBoss(raiz);

        //Raiz 2
        respostaErradaInt_Raiz2 = ProduzRespostaErrada_FinalBoss(raiz2);

        // Fazendo a conversao de todas as respostas para bases
        for (int i = 0; i < 5; i++) { // Determinar as bases para conversao para cada alternativa
            baseConversao[i] = DeterminaBase_FinalBoss();
        }

        respostaCerta = ProduzRespostaCerta_FinalBoss(raiz, raiz2, baseConversao); // Juntando a resposta certa em uma String e tambem informando a base que a resposta foi convertida
        respostaErrada = ProduzRespostaErradaStr_FinalBoss(respostaErradaInt_Raiz1, respostaErradaInt_Raiz2, baseConversao); // Juntando todas as respostas erradas em Strings parecidas com a resposta certa
        
        //adicionando as opcoes para embaralhar
        embaralhador.add(respostaCerta);
        
        for (int i = 0; i < 4; i++) {
            embaralhador.add(respostaErrada[i]);
        }
        
        Collections.shuffle(embaralhador); // Emabralhando as opcoes
        Collections.shuffle(embaralhador);
        
        for (int i = 0; i < 5; i++) {
            opcoes[i] = embaralhador.get(i);
        }
        
    }   
    

    static int[] DeterminaNumero_FinalBoss() {
        Random dado = new Random();
        int[] num = new int[4];
        int determinaSinal;

        for (int i = 0; i < 4; i++) {
            do {
                num[i] = dado.nextInt(35);
            } while (num[i] <= 0);

            determinaSinal = dado.nextInt(2);

            if (determinaSinal == 1) {
                num[i] = num[i] * -1;
            }
        }

        return num;
    }

    static int[] SimplificaFracao_FinalBoss(double a, double b) {
        double auxA = a, auxB = b;
        int determinaSinal = 0;
        int[] resposta = new int[2];

        if ((a < 0 && b < 0)) {
            determinaSinal = 1;
        }

        if (a > 0 && b < 0) {
            determinaSinal = 2;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        switch (determinaSinal) {
            case 1:
            case 2:
                resposta[0] = (int) ((auxA / a) * -1);
                resposta[1] = (int) ((auxB / a) * -1);
                break;
            default:
                resposta[0] = (int) (auxA / a);
                resposta[1] = (int) (auxB / a);
                break;
        }

        return resposta;
    }

    static int[] ProduzRespostaErrada_FinalBoss(int[] raiz) {
        Random dado = new Random();
        int[] respostaErrada = null;

        //gerar resposta para as raizes de forma separada
        switch (raiz.length) {
            case 1:
                respostaErrada = new int[4];

                for (int i = 0; i < 4; i++) {
                    do {
                        respostaErrada[i] = (raiz[0] + dado.nextInt(28)) - 9;
                    } while (respostaErrada[i] == raiz[0]);
                }

                try {
                    //Checando para ver se nao tem opcao repetida
                    for (int i = 0; i < respostaErrada.length; i++) {
                        for (int j = 0; j < respostaErrada.length - 1; j++) {
                            if (respostaErrada[j] == respostaErrada[j + 1]) {
                                do {
                                    //System.out.println("PASSEI AQUI\n");
                                    respostaErrada[j] = respostaErrada[j] + dado.nextInt(3);
                                } while (respostaErrada[j] == raiz[0]);
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Deu ruim");
                }
                break;
            case 2:
                respostaErrada = new int[8];

                for (int i = 0; i < 8; i++) {
                    do {
                        respostaErrada[i] = (raiz[0] + dado.nextInt(28)) - 9;
                    } while (respostaErrada[i] == raiz[0]);
                }

                try {
                    //Checando para ver se nao tem opcao repetida
                    for (int i = 0; i < respostaErrada.length; i++) {
                        for (int j = 0; j < respostaErrada.length - 1; j++) {
                            if (respostaErrada[j] == respostaErrada[j + 1]) {
                                do {
                                    //System.out.println("PASSEI AQUI\n");
                                    respostaErrada[j] = respostaErrada[j] + dado.nextInt(3);
                                } while (respostaErrada[j] == raiz[0]);
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Deu ruim");
                }
                break;
        }
        return respostaErrada;
    }

    static String[] ProduzRespostaErradaStr_FinalBoss(int[] raiz, int[] raiz2, int[] baseConversao) {
        String[] raiz1Errada = new String[4];
        String[] raiz2Errada = new String[4];
        String[] respostaErrada = new String[4];
        for (int i = 0; i < 4; i++) {

        }

        switch (raiz.length) {
            case 4:
                for (int i = 0; i < 4; i++) {
                    raiz1Errada[i] = Integer.toString(raiz[i], baseConversao[i + 1]);
                }
                break;
            case 8:
                raiz1Errada[0] = Integer.toString(raiz[0], baseConversao[1]) + " / " + Integer.toString(raiz[1], baseConversao[1]);
                raiz1Errada[1] = Integer.toString(raiz[2], baseConversao[2]) + " / " + Integer.toString(raiz[3], baseConversao[2]);
                raiz1Errada[2] = Integer.toString(raiz[4], baseConversao[3]) + " / " + Integer.toString(raiz[5], baseConversao[3]);
                raiz1Errada[3] = Integer.toString(raiz[6], baseConversao[4]) + " / " + Integer.toString(raiz[7], baseConversao[4]);
                break;
        }

        switch (raiz2.length) {
            case 4:
                for (int i = 0; i < 4; i++) {
                    raiz2Errada[i] = Integer.toString(raiz2[i], baseConversao[i + 1]);
                }
                break;
            case 8:
                raiz2Errada[0] = Integer.toString(raiz2[0], baseConversao[1]) + " / " + Integer.toString(raiz2[1], baseConversao[1]);
                raiz2Errada[1] = Integer.toString(raiz2[2], baseConversao[2]) + " / " + Integer.toString(raiz2[3], baseConversao[2]);
                raiz2Errada[2] = Integer.toString(raiz2[4], baseConversao[3]) + " / " + Integer.toString(raiz2[5], baseConversao[3]);
                raiz2Errada[3] = Integer.toString(raiz2[6], baseConversao[4]) + " / " + Integer.toString(raiz2[7], baseConversao[4]);
                break;
        }
        for (int i = 0; i < 4; i++) {
            respostaErrada[i] = "X1 = " + raiz1Errada[i].toUpperCase() + "\nX2 = " + raiz2Errada[i].toUpperCase() + "\n(Na base " + Integer.toString(baseConversao[i + 1]) + ")";
        }
        return respostaErrada;
    }

    static int DeterminaBase_FinalBoss() {

        ArrayList<Integer> bases = new ArrayList();

        bases.add(2);
        bases.add(8);
        bases.add(16);

        Collections.shuffle(bases);
        Collections.shuffle(bases);

        return bases.get(0);
    }

    static String ProduzRespostaCerta_FinalBoss(int[] raiz, int[] raiz2, int[] baseConversao) {
        String raiz1Certa = null, raiz2Certa = null, respostaCerta;

        switch (raiz.length) {
            case 1:
                raiz1Certa = Integer.toString(raiz[0], baseConversao[0]);
                break;
            case 2:
                raiz1Certa = Integer.toString(raiz[0], baseConversao[0]) + " / " + Integer.toString(raiz[1], baseConversao[0]);
                break;
        }

        switch (raiz2.length) {
            case 1:
                raiz2Certa = Integer.toString(raiz2[0], baseConversao[0]);
                break;
            case 2:
                raiz2Certa = Integer.toString(raiz2[0], baseConversao[0]) + " / " + Integer.toString(raiz2[1], baseConversao[0]);
                break;
        }

        respostaCerta = "X1 = " + raiz1Certa.toUpperCase() + "\nX2 = " + raiz2Certa.toUpperCase() + "\n(Na base " + Integer.toString(baseConversao[0]) + ")";
        return respostaCerta;
    }

    //Area de funcoes gerais
    static int DanoRespostaErrada(int healthPoints) {
        Random dado = new Random();
        int jogada;

        System.out.println("A resposta está...");
        Timer();
        System.out.println("...");
        Timer();
        System.out.println("...");
        Timer();
        System.out.println("Errada :(");
        System.out.println("Agora iremos jogar o dado para saber quanto de dano você irá tomar.");
        System.out.println("O número que caiu no dado é...");
        Timer();
        System.out.println("...");
        Timer();
        System.out.println("...");
        Timer();

        jogada = dado.nextInt(20) + 1;

        System.out.printf("**\t%d\t**\n", jogada);

        if (jogada <= 5) {
            System.out.println("Parece que você deu sorte e se esquivou do dano.");
        } else if (jogada > 5 && jogada <= 15) {
            System.out.println("Você levou 20 de dano");
            healthPoints = healthPoints - 20;
        } else if (jogada > 15) {
            System.out.println("Você tomou dano crítico!");
            healthPoints = healthPoints - 30;
        }

        if (healthPoints < 0) {
            do {
                healthPoints++;
            } while (healthPoints < 0);
        }

        System.out.printf("Total HP: %d\n\n", healthPoints);
        return healthPoints;
    }

    static void GameOver() {
        System.out.println("Seu HP chegou a 0");

        String game = "G A M E";
        String over = "O V E R";

        FormataTexto2(game);
        FormataTexto2(over);

        System.out.println("\n");
    }

    static int[] UsePotion(int healthPoints, int qntPotions) {

        Scanner input = new Scanner(System.in);
        boolean condicao = true;
        char opcao = 0;
        int[] status = new int[2];

        System.out.printf("HP atual: %d\nQuantidade de potions: %d\n\n", healthPoints, qntPotions);

        do {
            try {
                System.out.println("Você tem certeza que quer usar uma potion?\n" + GREEN + "[S]" + RESET + " ou " + RED + "[N]\n" + RESET);
                System.out.print("Escolha: ");
                opcao = input.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Caracter invalido.");
            }

            if (qntPotions > 0) {
                switch (opcao) {
                    case 'S':
                        healthPoints = healthPoints + 20;
                        qntPotions--;

                        if (healthPoints > 100) {
                            do {
                                healthPoints--;
                            } while (healthPoints != 100);
                        }
                        System.out.println("Você usou uma potion.");
                        System.out.printf("Quantidade potions: %d\n", qntPotions);
                        System.out.printf("Total HP: %d\n\n", healthPoints);
                        condicao = false;
                        break;
                    case 'N':
                        System.out.println("Você guardou a potion de volta na bolsa\n");
                        condicao = false;
                        break;
                }
            } else {
                System.out.println("Você não tem potions");
                condicao = false;
            }

        } while (condicao);

        status[0] = healthPoints;
        status[1] = qntPotions;

        return status;
    }

    static void AcertouResposta(int healthPoints) {
        System.out.println("A resposta está...");
        Timer();
        System.out.println("...");
        Timer();
        System.out.println("...");
        Timer();
        System.out.println("Certa! :D\n");

        if (healthPoints >= 30 && healthPoints < 65) {
            System.out.println("Parece que foi um desafio para você.");
        }
        if (healthPoints < 30) {
            System.out.println("Foi por pouco que você conseguiu passar!");
        }

    }

    static int[] ProcessoAlternativas_Geral(String[] opcoes, int[] status, String respostaCerta) {
        //Area para declarar variaveis
        Scanner sc = new Scanner(System.in);
        String resposta;
        boolean condicao = true;

        System.out.printf("[ A ] %S\n", opcoes[0]);
        Timer2();
        System.out.printf("[ B ] %S\n", opcoes[1]);
        Timer2();
        System.out.printf("[ C ] %S\n", opcoes[2]);
        Timer2();
        System.out.printf("[ D ] %S\n", opcoes[3]);
        Timer2();
        System.out.printf("[ E ] %S\n\n", opcoes[4]);
        Timer2();
        System.out.println("Resposta certa: " + respostaCerta.toUpperCase());
        Timer2();

        ////////////////////////////////////////////////////////////////////////
        //Area para processo de alternativas
        do {
            System.out.print("Escolha: ");
            resposta = sc.next().toUpperCase();
            if (status[0] <= 0) {
                GameOver();
                condicao = false;
            }

            switch (resposta.charAt(0)) {
                case 'A':
                    if (opcoes[0].equals(respostaCerta)) {
                        AcertouResposta(status[0]);
                        condicao = false;
                    } else {
                        status[0] = DanoRespostaErrada(status[0]);
                        if (status[0] <= 0) {
                            GameOver();
                            condicao = false;
                        }
                    }
                    break;
                case 'B':
                    if (opcoes[1].equals(respostaCerta)) {
                        AcertouResposta(status[0]);
                        condicao = false;
                    } else {
                        status[0] = DanoRespostaErrada(status[0]);
                        if (status[0] <= 0) {
                            GameOver();
                            condicao = false;
                        }
                    }
                    break;

                case 'C':
                    if (opcoes[2].equals(respostaCerta)) {
                        AcertouResposta(status[0]);
                        condicao = false;
                    } else {
                        status[0] = DanoRespostaErrada(status[0]);
                        if (status[0] <= 0) {
                            GameOver();
                            condicao = false;
                        }
                    }
                    break;
                case 'D':
                    if (opcoes[3].equals(respostaCerta)) {
                        AcertouResposta(status[0]);
                        condicao = false;
                    } else {
                        status[0] = DanoRespostaErrada(status[0]);
                        if (status[0] <= 0) {
                            GameOver();
                            condicao = false;
                        }
                    }
                    break;
                case 'E':
                    if (opcoes[4].equals(respostaCerta)) {
                        AcertouResposta(status[0]);
                        condicao = false;
                    } else {
                        status[0] = DanoRespostaErrada(status[0]);
                        if (status[0] <= 0) {
                            GameOver();
                            condicao = false;
                        }
                    }
                    break;
                case 'P':
                    status = UsePotion(status[0], status[1]);
            }
        } while (condicao);

        return status;
    }

    static void FormataTexto1(String frase) {

        String[] palavra = frase.split(" ");

        for (String each : palavra) {
            System.out.print(each + " ");
            Timer2();
        }
    }

    static void FormataTexto2(String frase) {

        String[] palavra = frase.split(" ");

        for (String each : palavra) {
            System.out.print(each);
            Timer2();
        }

        System.out.print(" ");
    }

    static void Timer() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }

    static void Timer2() {
        try {
            Thread.sleep(300);
        } catch (Exception e) {

        }
    }
}
