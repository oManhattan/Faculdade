
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public class Implementacao_Templo3_Formatado {

    public static void main(String[] args) {

        //Area para declarar variaveis
        int[] status = {100, 2}; // {Health Points, Quantidade de Potions}

        ExecutaTemplo3(status);

    }

    //Templo 3
    static int[] ExecutaTemplo3(int[] status) {
        Scanner sc = new Scanner(System.in);
        boolean condicao = true;

        do {
            status = Desafio1_Templo3(status);
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
            status = Desafio2_Templo3(status);
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

        System.out.print("\nAperte ENETER para começar o último Deafio");
        sc.nextLine();
        System.out.println(" ");

        do {
            status = Desafio3_Templo3(status);
            if (status[0] > 0) {
                System.out.println("\nVocê concluiu o último desafio!");
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

        Timer();
        System.out.println("Você conseguiu concluiro o Templo das Conversões");
        Timer2();
        FormataTexto1("Você está preparado para o ");
        FormataTexto2("F I N A L ");
        FormataTexto2("B O S S ");
        FormataTexto2("? ? ?");
        System.out.println("\n");
        return status;
    }

    static int[] Desafio1_Templo3(int[] status) { //Desafio é converter um numero que está em uma base para outra
        int baseInicial, baseConversao;
        String respostaCerta;

        String[] numeroInicial = new String[1];
        String[] opcoes = new String[5];
        ArrayList<String> respostaErrada = new ArrayList();
        ////////////////////////////////////////////////////////////////////////
        //Area para preparar os numeros
        baseInicial = DeterminaBase_Templo3(); //Determinando a base standard

        do {
            baseConversao = DeterminaBase_Templo3(); //Determinando a base de conversao
        } while (baseConversao == baseInicial);

        numeroInicial[0] = DeterminaNumero_Templo3(baseInicial); //Determinando o numero standard

        respostaCerta = DeterminaNumeroConv_Templo3(numeroInicial, baseInicial, baseConversao); // Determinando o numero de conversao (certo)

        respostaErrada.add(respostaCerta); //Adicionando a resposta certa nas opcoes

        for (int i = 0; i < 4; i++) {
            respostaErrada.add(DeterminaOpcoes(baseConversao, respostaCerta)); //Adicionando opcoes erradas 
        }

        Collections.shuffle(respostaErrada); // Embaralhando as opcoes para que haja uma aleatoriedade
        Collections.shuffle(respostaErrada);

        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = respostaErrada.get(i); // Transferindo as opcoes do ArrayList para uma String[] 
        }

        ////////////////////////////////////////////////////////////////////////
        //Area de logica do game
        System.out.println("***\tWELCOME TO THE 1ST GAME\t***\n");
        Timer2();
        System.out.printf("Converta o numero %S que esta na base %d para a base %d\n\n", numeroInicial[0], baseInicial, baseConversao);
        Timer2();

        status = ProcessoAlternativas_Geral(opcoes, status, respostaCerta);

        return status;
    }

    static int[] Desafio2_Templo3(int[] status) { //Desafio é somar dois numeros que estão em uma base e converter para outro
        //Area para inicializar variaveis
        int baseInicial, baseConversao;
        String respostaCerta;

        String[] numeroInicial = new String[2];
        String[] opcoes = new String[5];
        ArrayList<String> respostaErrada = new ArrayList();
        ////////////////////////////////////////////////////////////////////////
        //Area para declarar os numeros

        baseInicial = DeterminaBase_Templo3(); //Gerar a base standard

        do {
            baseConversao = DeterminaBase_Templo3(); //Gerar a base para conversao
        } while (baseConversao == baseInicial);

        numeroInicial[0] = DeterminaNumero_Templo3(baseInicial); //Gerar o numero standard A
        numeroInicial[1] = DeterminaNumero_Templo3(baseInicial); //Gerar o numero standard B

        respostaCerta = DeterminaNumeroConv_Templo3(numeroInicial, baseInicial, baseConversao); //Gerar a resposta certa

        respostaErrada.add(respostaCerta); //Adicionando a resposta certa no ArrayList

        for (int i = 0; i <= 3; i++) {
            respostaErrada.add(DeterminaOpcoes(baseConversao, respostaCerta)); //Criando respostas erradas para o ArrayList
        }

        Collections.shuffle(respostaErrada); //Embaralhando as opcoes
        Collections.shuffle(respostaErrada);

        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = respostaErrada.get(i); //Adicionando as opcoes embaralhadas numa String para fazer o desafio
        }

        System.out.println("***\tWELCOME TO THE 2ND GAME\t***\n");
        Timer2();
        System.out.printf("Faça a seguinte conversão:\n%S + %S (na base %d) = X (na base %d)\n\n", numeroInicial[0], numeroInicial[1], baseInicial, baseConversao);
        Timer2();

        ProcessoAlternativas_Geral(opcoes, status, respostaCerta);

        return status;
    }

    static int[] Desafio3_Templo3(int[] status) {
        //Area para declarar variaveis
        int baseInicial, baseConversao, aux;
        String respostaCerta;

        String[] numeroInicial = new String[2];
        String[] opcoes = new String[5];
        ArrayList<String> respostaErrada = new ArrayList();
        ////////////////////////////////////////////////////////////////////////
        //Area para iniciar variaveis
        baseInicial = DeterminaBase_Templo3(); // Gerar a base inicial

        do {
            baseConversao = DeterminaBase_Templo3(); // Gerar a base para conversao
        } while (baseConversao == baseInicial);

        numeroInicial[0] = DeterminaNumero_Templo3(baseInicial); // Gerar numero standard A
        numeroInicial[1] = DeterminaNumero_Templo3(baseInicial); // Gerar numero standard B

        aux = (Integer.parseInt(numeroInicial[0], baseInicial)) * (Integer.parseInt(numeroInicial[1], baseInicial)); // Convertendo o produto dos numeros standard para int

        respostaCerta = Integer.toString(aux, baseConversao); // Convertendo o produto dos numeros standard para a base de conversao

        respostaErrada.add(respostaCerta); // Adicionando a resposta certa nas opcoes

        for (int i = 0; i <= 3; i++) {
            respostaErrada.add(DeterminaOpcoes(baseConversao, respostaCerta)); // Adicionando as opcoes erradas
        }

        Collections.shuffle(respostaErrada); // Embaralhando as opcoes
        Collections.shuffle(respostaErrada);

        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = respostaErrada.get(i);// Adicionando as opcoes em String para fazer o desafio
        }

        System.out.println("***\tWELCOME TO THE 3ND GAME\t***\n");
        Timer2();
        System.out.printf("Faça a seguinte conversão:\n%S * %S (na base %d) = X (na base %d)\n\n", numeroInicial[0], numeroInicial[1], baseInicial, baseConversao);
        Timer2();

        ProcessoAlternativas_Geral(opcoes, status, respostaCerta);

        return status;
    }
    //Funcao Templo 3

    static int DeterminaBase_Templo3() {

        ArrayList<Integer> bases = new ArrayList();

        bases.add(2);
        bases.add(8);
        bases.add(10);
        bases.add(16);

        Collections.shuffle(bases);
        Collections.shuffle(bases);

        return bases.get(0);
    }

    static String DeterminaNumero_Templo3(int baseInicial) {

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

    static String DeterminaOpcoes(int baseConversao, String respostaCerta) {
        Random dado = new Random();
        int aux = Integer.parseInt(respostaCerta, baseConversao);
        String opcoesFalsas;

        do {
            aux = aux + dado.nextInt(30);
            aux = aux - 15;
            opcoesFalsas = Integer.toString(aux, baseConversao);
        } while (opcoesFalsas.equals(respostaCerta));

        return opcoesFalsas;
    }

    static String DeterminaNumeroConv_Templo3(String[] numeroInicial, int baseInicial, int baseConversao) {
        int aux = 0;
        String respostaConversao;

        for (int i = 0; i < numeroInicial.length; i++) {
            aux = aux + Integer.parseInt(numeroInicial[i], baseInicial);
        }

        respostaConversao = Integer.toString(aux, baseConversao);

        return respostaConversao;
    }

    //Funcao Geral
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
    //Cores
    public static final String CYAN = "\u001B[36m";
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
}
