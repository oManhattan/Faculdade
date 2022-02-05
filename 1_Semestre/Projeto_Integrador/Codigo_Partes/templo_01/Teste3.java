/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste_Templo1;

import static TestesProjeto.Templo3_Completo.GREEN;
import static TestesProjeto.Templo3_Completo.RED;
import static TestesProjeto.Templo3_Completo.RESET;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author Matheus
 */
import java.util.Scanner;

public class Teste3 {

    public static void main(String[] args) {
        int[] status = {100, 2}; // {Health Points, Quantidade de Potions}

        ExecutaTemplo1(status);
    }

    //Area de funcoes para o Templo 1
    static int[] ExecutaTemplo1(int[] status) {
        Scanner sc = new Scanner(System.in);
        boolean condicao = true;
        
        do {
            status = Desafio1_Templo1(status);
            if (status[0] > 0) {
                System.out.println("\nVocê concluiu o primeiro desafio!");
                Timer2();
                System.out.println("Parabéns, você ganhou uma Poção!");
                status[1]++;
                Timer2();
                System.out.println("HP: " + status[0]);
                Timer2();
                System.out.println("Poção: " + status[1]);
                Timer();
                System.out.println(" ");

                condicao = false;
            } else {
                System.out.println("Você terá que refazer o desafio\n");
                status[0] = 100;
            }
        } while (condicao);

        System.out.print("\nAperte ENETER para começar o segundo Deafio");
        sc.nextLine();
        System.out.println(" ");
        
                
        do {
            status = Desafio2_Templo1(status);
            if (status[0] > 0) {
                System.out.println("\nVocê concluiu o segundo desafio!");
                Timer2();
                System.out.println("Parabéns, você ganhou uma Poção!");
                status[1]++;
                Timer2();
                System.out.println("HP: " + status[0]);
                Timer2();
                System.out.println("Poção: " + status[1]);
                Timer();
                System.out.println(" ");

                condicao = false;
            } else {
                System.out.println("Você terá que refazer o desafio\n");
                status[0] = 100;
            }
        } while (condicao);

        System.out.print("\nAperte ENETER para começar o segundo Deafio");
        sc.nextLine();
        System.out.println(" ");
        return status;
    }

    static int[] Desafio1_Templo1(int[] status) {
        //Area para declarar variaveis
        int[] numeroInicial = new int[2];
        String[] opcoes = new String[5];
        String[] testeRespostaErrada = new String[4];
        ArrayList<String> respostaErrada = new ArrayList();

        String respostaCerta;

        //Area para processos
        numeroInicial = DeterminaNumeroInicial_Templo1(); //Determinando o numero A[0] e numero B[1]

        respostaCerta = Integer.toString(-numeroInicial[1] / numeroInicial[0]); //Determinando a resposta certa

        respostaErrada.add(respostaCerta); //Adicinando a resposta certa nas opcoes

        testeRespostaErrada = DeterminaOpcoesErradas_Templo1Teste(respostaCerta);

        for (int i = 0; i < 4; i++) {
            respostaErrada.add(testeRespostaErrada[i]);
            //respostaErrada.add(DeterminaOpcoesErradas_Templo1(numeroInicial, respostaCerta)); //Gerando respostas erradas para o desafio
        }

        Collections.shuffle(respostaErrada); //Deixando de forma aleatoria as opcoes
        Collections.shuffle(respostaErrada);

        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = respostaErrada.get(i); // Adicionando as opcoes em String para fazer o desafio
        }

        System.out.println("***\tWELCOME TO THE FIRST CHALLENGE\t***");
        Timer2();
        if (numeroInicial[1] > 0) {
            System.out.printf("Faça a seguinte conta:\n\n%dx + %d = 0\n\n", numeroInicial[0], numeroInicial[1]);
        } else {
            System.out.printf("Faça a seguinte conta:\n\n%dx + (%d) = 0\n\n", numeroInicial[0], numeroInicial[1]);
        }
        Timer2();
        status = ProcessoAlternativas_Geral(opcoes, status, respostaCerta);

        return status;
    }

    static int[] Desafio2_Templo1(int[] status) {
        //Area para declarar variaveis
        int[] numeroCima = new int[4];
        int[] numeroBaixo = new int[2];
        String[] testeRespostaErrada = new String[4];
        String[] opcoes = new String[5];
        ArrayList<String> respostaErrada = new ArrayList();
        int help1, help2, help3, help4;
        int mmc = 0, aux1 = 0, aux2 = 0, respostaCerta = 0;
        String respostaCertaStr;
        boolean condicao = true;

        //Area para processos
        //Determinar os numeros (ax + b) / y = (cx + d) / z
        do {
            try {
                do {
                    do {
                        numeroCima = DeterminaNumeroCima_Templo1(); // Determinar os numeros de cima
                        numeroBaixo = DeterminaNumBaixo_Templo1(); // Determinar os divisores

                        mmc = DeterminaMMC_Templo1(numeroBaixo[0], numeroBaixo[1]); // Determinar o MMC dos divisores

                        help1 = (numeroCima[0] * mmc) / numeroBaixo[0]; // Fazer o processo de MMC com cada numero
                        help2 = (numeroCima[1] * mmc) / numeroBaixo[0];
                        help3 = (numeroCima[2] * mmc) / numeroBaixo[1];
                        help4 = (numeroCima[3] * mmc) / numeroBaixo[1];

                        aux1 = help1 - help3; // Isolando os numeros
                        aux2 = help4 - help2;

                        respostaCerta = aux2 / aux1; // Obtendo a resposta
                    } while (aux1 == 0);
                } while (aux2 % aux1 != 0);
                if (respostaCerta != 0) {
                    condicao = false;
                }
            } catch (Exception e) {}
        } while (condicao);

        //////////////////////////////////
        //Fazer a parte das opcoes
        
        respostaCertaStr = Integer.toString(respostaCerta);
        
        testeRespostaErrada = DeterminaOpcoesErradas_Templo1Teste(respostaCertaStr);
        
        respostaErrada.add(respostaCertaStr);
        for (int i = 0; i < 4; i++) {
            respostaErrada.add(testeRespostaErrada[i]);
        }
        
        Collections.shuffle(respostaErrada);
        Collections.shuffle(respostaErrada);
        
        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = respostaErrada.get(i);
        }
        
        //////////////////////////////////
        // Enunciado
        System.out.println("***\tWELCOME TO THE 2ND GAME\t***\n");
        Timer2();
        System.out.println("Faca a seguinte conta: \n");
        Timer2();
        System.out.printf("%dx + %d  =  %dx + %d\n----------    ----------\n    %d            %d\n\n", numeroCima[0], numeroCima[1], numeroCima[2], numeroCima[3], numeroBaixo[0], numeroBaixo[1]);
        Timer2();
        
        status = ProcessoAlternativas_Geral(opcoes, status, respostaCertaStr);
        
        return status;
    }
    
    static int[] Desafio3_Templo1(int[] status) {
        
        
        
        
        
        return status;
    }

    static int[] DeterminaNumeroCima_Templo1() {
        int[] num = new int[4];
        int determinaSinal;

        Random dado = new Random();

        ////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < 4; i++) {
            determinaSinal = dado.nextInt(2);

            switch (determinaSinal) {
                case 0:
                    do {
                        num[i] = dado.nextInt(150);
                    } while (Math.abs(num[i]) < 20);
                    break;
                case 1:
                    do {
                        num[i] = dado.nextInt(150) * -1;
                    } while (Math.abs(num[i]) < 20);
                    break;
            }
        }

        return num;
    }

    static int[] DeterminaNumBaixo_Templo1() {
        int[] num = new int[2];

        Random dado = new Random();

        for (int i = 0; i < 2; i++) {
            do {
                num[i] = dado.nextInt(15);
            } while (num[i] <= 1);
        }

        return num;
    }

    static int DeterminaMMC_Templo1(int a, int b) {
        int mmc;

        mmc = Math.max(a, b);

        while (mmc % Math.min(a, b) != 0) {
            mmc = mmc + Math.max(a, b);
        }

        return mmc;
    }

    static int[] DeterminaNumeroInicial_Templo1() {
        //Area para declarar variaveis
        Random dado = new Random();

        double[] numeroInicial = new double[2];
        int[] numeroConv = new int[2];

        int determinaSinal;

        //Area para fazer processos
        do {
            do {
                numeroInicial[0] = dado.nextInt(1000);
                numeroInicial[1] = dado.nextInt(10000);
            } while (numeroInicial[1] % numeroInicial[0] != 0);
        } while (numeroInicial[0] < 10);

        for (int i = 0; i < numeroInicial.length; i++) {
            determinaSinal = dado.nextInt(2);

            switch (determinaSinal) {
                case 0:
                    numeroConv[i] = (int) numeroInicial[i];
                    break;
                case 1:
                    numeroConv[i] = (int) numeroInicial[i] * -1;
                    break;
            }

        }

        return numeroConv;
    }

    static int[] DeterminaNumeroInicial_Desafio2_Templo1() {
        //Area para declarar valores
        double[] numeroInicial = new double[3];
        int[] numeroFinal = new int[3];

        Random dado = new Random();

        int aux;

        //Area para processos
        numeroInicial[0] = dado.nextInt(500);
        numeroInicial[1] = dado.nextInt(600);
        numeroInicial[2] = dado.nextInt(300);

        return numeroFinal;
    }

    static String DeterminaOpcoesErradas_Templo1(String respostaCerta) {
        String respostaErrada;
        int auxiliar = Integer.parseInt(respostaCerta);
        Random dado = new Random();

        do {
            auxiliar = auxiliar + dado.nextInt(15) - 4;

            respostaErrada = Integer.toString(auxiliar);

        } while (respostaErrada.equals(respostaCerta));

        return respostaErrada;
    }

    static String[] DeterminaOpcoesErradas_Templo1Teste(String respostaCerta) {
        String[] respostaErrada = new String[4];
        int[] respostaErradaNum = new int[4];
        int aux1;

        Random dado = new Random();
        ////////////////////////////////////////////////////////////////////////

        aux1 = Integer.parseInt(respostaCerta);

        //Gerando opcoes erradas
        for (int i = 0; i < 4; i++) {
            do {
                respostaErradaNum[i] = aux1 + dado.nextInt(15) - 4;
            } while (respostaErradaNum[i] == aux1);
        }

        try {
            //Checando para ver se nao tem opcao repetida
            for (int i = 0; i < respostaErradaNum.length; i++) {
                for (int j = 0; j < respostaErradaNum.length - 1; j++) {
                    if (respostaErradaNum[j] == respostaErradaNum[j + 1]) {
                        do {
                            //System.out.println("PASSEI AQUI\n");
                            respostaErradaNum[j] = respostaErradaNum[j] + dado.nextInt(3);
                        } while (respostaErradaNum[j] == aux1);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Deu ruim");
        }

        for (int i = 0; i < respostaErradaNum.length; i++) {
            respostaErrada[i] = Integer.toString(respostaErradaNum[i]);
        }

        return respostaErrada;
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
