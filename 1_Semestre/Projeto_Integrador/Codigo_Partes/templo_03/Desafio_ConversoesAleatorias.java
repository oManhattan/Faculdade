/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesProjeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Desafio_ConversoesAleatorias {

    /*
    * Algoritmo para selecionar as bases e o numero de forma aleatoria para que 
    * o jogador faça  a conversao dentro de 4 opções
     */
    public static void main(String[] args) {

        int baseA, baseB, numRandom;
        String baseAconv = null;

        //Selecionando as duas bases de forma aleatoria
        //Definindo baseA
        baseA = valorBases();

        //Definindo baseB, sendo que baseB != baseA
        baseB = 0;
        do {
            baseB = valorBases();
        } while (baseB == baseA);

        //Definindo um número aleatório sendo 0 <= x <= 999
        do {
            numRandom = (int) (Math.random() * 10000);
        } while (numRandom <= 50);

        //Determinando a partir da baseA a conversao para o enunciado
        switch (baseA) {
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

        //Enunciado do Desafio
        System.out.printf("Desafio 1\nVocê precisa converter o valor %S que esta"
                + " na base %d para a base %d\n\n", baseAconv, baseA, baseB);

        //Dando opções para o desafio
        ArrayList<String> respostasD1 = new ArrayList();
        String respostaCerta = Integer.toString(numRandom, baseB);
        String aux, a, b, c, d, e, respostaStr;
        char respostaCh;
        boolean condicao = true;
        int health = 100;
        Scanner input = new Scanner(System.in);

        System.out.println("Resposta certa: " + respostaCerta.toUpperCase()); // Confirmar a resposta
        respostasD1.add(respostaCerta);

        //Colocando outras opcoes de forma randomica
        for (int i = -5; i < -1; i++) {
            do {
                numRandom = (int) (numRandom + (Math.random() * 100) - 60);
                aux = Integer.toString(numRandom, baseB);
            } while (aux.equals(respostaCerta));
            respostasD1.add(aux);
        }

        /*
        for (String i : respostasD1) {
            System.out.println(i.toUpperCase());
        }
         */
        //Embaralhando as opções
        Collections.shuffle(respostasD1);
        Collections.shuffle(respostasD1);

        a = respostasD1.get(0);
        b = respostasD1.get(1);
        c = respostasD1.get(2);
        d = respostasD1.get(3);
        e = respostasD1.get(4);

        System.out.printf("a) %S\n", a);
        System.out.printf("b) %S\n", b);
        System.out.printf("c) %S\n", c);
        System.out.printf("d) %S\n", d);
        System.out.printf("e) %S\n\n", e);

        do {

            System.out.print("Escolha uma alternativa: ");
            respostaStr = input.next();
            respostaStr = respostaStr.toUpperCase();
            respostaCh = respostaStr.charAt(0);

            switch (respostaCh) {
                case 'A':
                    if (a.equals(respostaCerta)) {
                        System.out.println("Resposta certa!");
                        condicao = false;
                    } else {
                        System.out.println("Você errou. -20 de HP\n");
                        health = health - 20;
                        System.out.printf("Quantidade de HP: %d\n", health);
                        
                        if (health == 0) {
                            condicao = false;
                        }
                    }
                    break;
                case 'B':
                    if (b.equals(respostaCerta)) {
                        System.out.println("Resposta certa!");
                        condicao = false;
                    } else {
                        System.out.println("Você errou. -20 de HP\n");
                        health = health - 20;
                        System.out.printf("Quantidade de HP: %d\n", health);
                        
                        if (health == 0) {
                            condicao = false;
                        }
                    }
                    break;
                case 'C':
                    if (c.equals(respostaCerta)) {
                        System.out.println("Resposta certa!");
                        condicao = false;
                    } else {
                        System.out.println("Você errou. -20 de HP\n");
                        health = health - 20;
                        System.out.printf("Quantidade de HP: %d\n", health);
                        
                        if (health == 0) {
                            condicao = false;
                        }
                    }
                    break;
                case 'D':
                    if (d.equals(respostaCerta)) {
                        System.out.println("Resposta certa!");
                        condicao = false;
                    } else {
                        System.out.println("Você errou. -20 de HP\n");
                        health = health - 20;
                        System.out.printf("Quantidade de HP: %d\n", health);
                        
                        if (health == 0) {
                            condicao = false;
                        }
                    }
                    break;
                case 'E':
                    if (e.equals(respostaCerta)) {
                        System.out.println("Resposta certa!");
                        condicao = false;
                    } else {
                        System.out.println("Você errou. -20 de HP\n");
                        health = health - 20;
                        System.out.printf("Quantidade de HP: %d\n", health);
                        
                        if (health == 0) {
                            condicao = false;
                        }
                    }
                    break;
                default:
                    System.err.println("Caracter inválido. Por favor, tente novamente");
            }
        } while (condicao);

        System.out.println("\nVocê concluiu o desafio!");
        System.out.printf("Quantidade de HP: %d\n", health);
    }

    static int valorBases() { //Escolher os valores para as bases

        ArrayList<Integer> bases = new ArrayList();

        bases.add(2);
        bases.add(8);
        bases.add(10);
        bases.add(16);

        Collections.shuffle(bases);
        Collections.shuffle(bases);

        int baseFinal = bases.get(0);

        return baseFinal;
    }
}
