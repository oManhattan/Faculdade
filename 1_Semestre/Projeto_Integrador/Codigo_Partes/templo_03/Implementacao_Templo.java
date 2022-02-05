/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesProjeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Implementacao_Templo {

    public static void main(String[] args) {
        //Aqui correrao apenas tres laçoes do-while para que caso a pessoa não
        //passe em um desafio ela precise fazê-lo novamente

        boolean condicao = true;
        int[] status = new int[2];
        status[0] = 100; //Health Points
        status[1] = 2; //Quantidade de potions

        do {
            status = Desafio1(status[0], status[1]);

            if (status[0] < 0) {
                System.out.println("Você terá que refazer o desafio.\n\n");
            } else {
                System.out.println("VOCÊ TERMINOU O PRIMEIRO DESAFIO.");
                System.out.println("Você ganhou uma potion!");
                status[1]++;
                System.out.printf("Total HP: %d\nQuantidade de potions: %d\n\n", status[0], status[1]);

                condicao = false;
            }
        } while (condicao);

        Timer();
        status = Desafio2(status[0], status[1]);

        System.out.println("VOCÊ TERMINOU O SEGUNDO DESAFIO.");
        System.out.println("Você ganhou uma potion!");
        status[1]++;
        System.out.printf("Total HP: %d\nQuantidade de potions: %d\n\n", status[0], status[1]);

        Timer();
        status = Desafio3(status[0], status[1]);
        System.out.println("VOCÊ TERMINOU O TERCEIRO DESAFIO.");
        System.out.println("Você ganhou uma potion!");
        status[1]++;
        System.out.printf("Total HP: %d\nQuantidade de potions: %d\n\n", status[0], status[1]);

    }

    static int[] Desafio1(int healthPoints, int qntPotions) {
        System.out.println("Bem-vindo ao primeiro desafio.\n");
        Timer();
        System.out.println("O 'player' precisa passar por este primeiro desafio para"
                + " abrir a porta e conseguir explorar o templo.\n"
                + "Ao se deparar com a porta o 'player' observa que existem alguns"
                + " símbolos em outra linguagem e ele precisa traduzí-los para continuar sua aventura.");

        //**********************************************************************
        int baseInicial, baseConversao, auxNum;
        String numeroInicial, respostaCerta, respostaPlayer = null;
        boolean condicao = true;

        ArrayList<String> respostaErrada = new ArrayList();
        String[] opcoes = new String[5];
        int[] status = new int[2];
        status[0] = healthPoints;
        status[1] = qntPotions;

        Scanner input = new Scanner(System.in);

        //Determinando as bases 
        baseInicial = DeterminaBase();

        do {
            baseConversao = DeterminaBase();
        } while (baseConversao == baseInicial);

        //Determinando o numero para a base inicial
        numeroInicial = DeterminaNumero(baseInicial);

        //Determinar o numero para a baseConversao
        respostaCerta = DeterminaNumeroConv(numeroInicial, baseInicial, baseConversao);

        //Fazer processo das perguntas erradas
        respostaErrada.add(respostaCerta);

        auxNum = Integer.parseInt(numeroInicial, baseInicial);
        for (int i = 0; i <= 3; i++) {
            respostaErrada.add(DeterminaOpcoes(auxNum, baseConversao, respostaCerta));
        }

        Collections.shuffle(respostaErrada);
        Collections.shuffle(respostaErrada);

        for (int i = 0; i < 5; i++) {
            opcoes[i] = respostaErrada.get(i);
        }

        //**********************************************************************
        //Fazer processo de desafio com opcoes
        Timer();
        System.out.printf("\n***\tTexto para começar o primeiro desafio\t***\nConverter o numero %S que está na base %d para a base %d\n\n", numeroInicial, baseInicial, baseConversao);

        System.out.printf("a) %S\nb) %S\nc) %S\nd) %S\ne) %S\n\n", opcoes[0], opcoes[1], opcoes[2], opcoes[3], opcoes[4]);

        System.out.println("Resposta certa: " + respostaCerta.toUpperCase());
        Timer();

        do {
            try {
                System.out.print("\t\t\t\tEscolha uma opção: ");
                respostaPlayer = input.next();
                respostaPlayer = respostaPlayer.toUpperCase();
                System.out.println(" ");
            } catch (Exception e) {
                System.out.println("Digite um caracter válido.\nOu algo deu errado com o codigo");
            }

            switch (respostaPlayer.charAt(0)) {
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
                    int[] aux = UsePotion(status[0], status[1]);

                    status[0] = aux[0];
                    status[1] = aux[1];
            }

        } while (condicao);

        return status;
    }

    static int[] Desafio2(int healthPoints, int qntPotions) {
        int[] status = new int[2];
        status[0] = healthPoints;
        status[1] = qntPotions;
        String[] opcoes = new String[5];

        int baseInicial, baseConversao, auxConv1, auxConv2;
        String numeroInicialA, numeroInicialB, respostaCerta, respostaPlayer = null;
        boolean condicao = true;

        ArrayList<String> respostaErrada = new ArrayList();
        Scanner input = new Scanner(System.in);

        //**************************************************************************
        //Determinando as bases para o desafio
        baseInicial = DeterminaBase(); //A base para os primeiros numeros.

        //Base para conversao
        do {
            baseConversao = DeterminaBase();
        } while (baseConversao == baseInicial);

        //Determinando os numeros para o desafio - Sera mostrada uma soma para o usuario converter e resolver o problema
        numeroInicialA = DeterminaNumero(baseInicial);//Determina o primeiro numero

        //Determinando o segundo numero sendo != do primeiro numero
        do {
            numeroInicialB = DeterminaNumero(baseInicial);
        } while (numeroInicialB.equals(numeroInicialA));

        //Efetuando a soma dos numeros e fazendo a conversao
        auxConv1 = Integer.parseInt(numeroInicialA, baseInicial);
        auxConv2 = Integer.parseInt(numeroInicialB, baseInicial);
        respostaCerta = Integer.toString((auxConv1 + auxConv2), baseConversao);

        //**************************************************************************
        //Criando opcoes para o desafio
        respostaErrada.add(respostaCerta);

        for (int i = 0; i <= 3; i++) {
            respostaErrada.add(DeterminaOpcoes((auxConv1 + auxConv2), baseConversao, respostaCerta));
        }

        Collections.shuffle(respostaErrada);
        Collections.shuffle(respostaErrada);

        //Adicionando as opcoes em String para conseguir fazer a verificação
        for (int i = 0; i <= 4; i++) {
            opcoes[i] = respostaErrada.get(i);
        }

        //**************************************************************************
        //Enunciado para o segundo desafio
        System.out.println("\n***\t É HORA DO SHOW (espaço para um texto melhor) \t***");
        System.out.printf("Faça a soma do numero %S com o numero %S que estão na base %d e converta para a base %d\n\n", numeroInicialA, numeroInicialB, baseInicial, baseConversao);
        System.out.printf("a) %S\nb) %S\nc) %S\nd) %S\ne) %S\n\n", opcoes[0], opcoes[1], opcoes[2], opcoes[3], opcoes[4]);
        System.out.println("\nResposta certa: " + respostaCerta);

        //Processo de entrada do player e escolha do segundo desafio
        do {
            try {
                System.out.print("Escolha uma opção: ");
                respostaPlayer = input.next();
                respostaPlayer = respostaPlayer.toUpperCase();
                System.out.println(" ");
            } catch (Exception e) {
                System.out.println("Digite um caracter válido.\nOu algo deu errado com o codigo");
            }

            switch (respostaPlayer.charAt(0)) {
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
                    int[] aux = UsePotion(status[0], status[1]);

                    status[0] = aux[0];
                    status[1] = aux[1];
            }

        } while (condicao);

        return status;
    }

    static int[] Desafio3(int healthPoints, int qntPotions) {
        //Local para iniciar as variaveis

        int[] status = new int[2];
        status[0] = healthPoints;
        status[1] = qntPotions;

        int[] auxConv = new int[4];

        String[] opcoes = new String[5];

        ArrayList<String> respostaErrada = new ArrayList();

        boolean condicao = true;
        int baseInicial, baseConversao;
        String multiplicadorInicialA, multiplicadorInicialB, divisorInicial, respostaCerta, respostaPlayer = null;

        Scanner input = new Scanner(System.in);
        //**************************************************************************
        //Gerar a base inicial
        baseInicial = DeterminaBase();

        //Gerar a base para conversao
        do {
            baseConversao = DeterminaBase();
        } while (baseConversao == baseInicial);

        //Gerar 3 numeros para a base inicial
        multiplicadorInicialA = DeterminaNumero(baseInicial);
        multiplicadorInicialB = DeterminaNumero(baseInicial);
        divisorInicial = DeterminaNumero(baseInicial);

        //Realizar a conta e fazer a conversao dos valores para gerar uma resposta
        auxConv[0] = Integer.parseInt(multiplicadorInicialA, baseInicial);
        auxConv[1] = Integer.parseInt(multiplicadorInicialB, baseInicial);
        auxConv[2] = Integer.parseInt(divisorInicial, baseInicial);
        auxConv[3] = (auxConv[0] * auxConv[1]);
        auxConv[3] = auxConv[3] / auxConv[2];

        respostaCerta = Integer.toString(auxConv[3], baseConversao);

        //Gerar as outras opcoes para o desafio
        respostaErrada.add(respostaCerta);

        for (int i = 0; i <= 3; i++) {
            respostaErrada.add(DeterminaOpcoes(auxConv[3], baseConversao, respostaCerta));
        }

        Collections.shuffle(respostaErrada);
        Collections.shuffle(respostaErrada);

        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = respostaErrada.get(i);
        }

        //**************************************************************************
        //Iniciar com o texto e a parte visual do desafio
        System.out.println("***\tÚLTIMO DESAFIO DO TERCEIRO TEMPLO\t***\n");
        Timer();
        System.out.printf("Faça a seguinte a seguinte conta com os numeros na base %d e depois converta para a base %d\n", baseInicial, baseConversao);
        Timer();
        System.out.printf("\t%S     *     %S\n\t--------------------\n\t\t%S\n\n", multiplicadorInicialA, multiplicadorInicialB, divisorInicial);
        Timer();
        System.out.printf("a) %S\n", opcoes[0]);
        Timer2();
        System.out.printf("b) %S\n", opcoes[1]);
        Timer2();
        System.out.printf("c) %S\n", opcoes[2]);
        Timer2();
        System.out.printf("d) %S\n", opcoes[3]);
        Timer2();
        System.out.printf("e) %S\n\n", opcoes[4]);
        Timer2();
        System.out.println("Resposta certa: \n" + respostaCerta);
        Timer2();

        //Iniciar parte que o Player interage
        do {
            try {
                System.out.print("Escolha uma opção: ");
                respostaPlayer = input.next();
                respostaPlayer = respostaPlayer.toUpperCase();
                System.out.println(" ");
            } catch (Exception e) {
                System.out.println("Digite um caracter válido.\nOu algo deu errado com o codigo");
            }

            switch (respostaPlayer.charAt(0)) {
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
                    int[] aux = UsePotion(status[0], status[1]);

                    status[0] = aux[0];
                    status[1] = aux[1];
            }

        } while (condicao);

        return status;

    }

    //**************************************************************************
    static int DeterminaBase() {

        ArrayList<Integer> bases = new ArrayList();

        bases.add(2);
        bases.add(8);
        bases.add(10);
        bases.add(16);

        Collections.shuffle(bases);
        Collections.shuffle(bases);

        return bases.get(0);
    }

    static String DeterminaNumero(int baseInicial) {

        Random dado = new Random();
        int numRandom;
        String baseAconv = null;

        do {
            numRandom = dado.nextInt(2000);
        } while (numRandom <= 50);

        switch (baseInicial) {
            case 2:
                baseAconv = Integer.toBinaryString(numRandom);
                break;
            case 8:
                baseAconv = Integer.toOctalString(numRandom);
                break;
            case 10:
                baseAconv = Integer.toString(numRandom);
                break;
            case 16:
                baseAconv = Integer.toHexString(numRandom);
                break;
        }

        return baseAconv;
    }

    static String DeterminaOpcoes(int numeroInicial, int baseConversao, String respostaCerta) {

        Random dado = new Random();
        String opcoesFalsas;

        do {
            numeroInicial = numeroInicial + dado.nextInt(30);
            numeroInicial = numeroInicial - 15;
            opcoesFalsas = Integer.toString(numeroInicial, baseConversao);
        } while (opcoesFalsas.equals(respostaCerta));

        return opcoesFalsas;
    }

    static String DeterminaNumeroConv(String numeroInicial, int baseInicial, int baseConversao) {
        int aux;
        String respostaConversao;

        aux = Integer.parseInt(numeroInicial, baseInicial);
        respostaConversao = Integer.toString(aux, baseConversao);

        return respostaConversao;
    }

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

        System.out.printf("Total HP: %d\n\n", healthPoints);
        return healthPoints;
    }

    static void GameOver() {
        System.out.println("Seu HP chegou a 0");

        System.out.print("G");
        Timer2();
        System.out.print("A");
        Timer2();
        System.out.print("M");
        Timer2();
        System.out.print("E");
        Timer2();
        System.out.print(" ");
        Timer2();
        System.out.print("O");
        Timer2();
        System.out.print("V");
        Timer2();
        System.out.print("E");
        Timer2();
        System.out.print("R\n\n");
        Timer();
    }

    static int[] UsePotion(int healthPoints, int qntPotions) {

        Scanner input = new Scanner(System.in);
        boolean condicao = true;
        char opcao = 0;
        int[] status = new int[2];

        System.out.printf("HP atual: %d\nQuantidade de potions: %d\n\n", healthPoints, qntPotions);

        do {
            try {
                System.out.println("Você tem certeza que quer usar uma potion?\nS / N\n");
                System.out.print("\t\t\t\tEscolha: ");
                opcao = input.next().charAt(0);
            } catch (Exception e) {
                System.out.println("Caracter invalido.");
            }

            if (qntPotions > 0) {
                switch (opcao) {
                    case 'S':
                    case 's':
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
                    case 'n':
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

    static void Timer() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }

    static void Timer2() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {

        }
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
}
