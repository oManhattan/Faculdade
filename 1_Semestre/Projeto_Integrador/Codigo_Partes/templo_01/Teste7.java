/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste_Templo1;

import java.util.Random;

/**
 *
 * @author Matheus
 */
public class Teste7 {

    public static void main(String[] args) {
        int[] numMultiplicador = new int[4];
        int[] numDivisor = new int[4];
        int[] numAcompanha = new int[4];
        int[] numSoma = new int[4];
        
        numMultiplicador = DeterminaNumeroDesafio3_Templo1(1);
        numAcompanha = DeterminaNumeroDesafio3_Templo1(2);
        numSoma = DeterminaNumeroDesafio3_Templo1(3);
        numDivisor = DeterminaNumeroDesafio3_Templo1(4);
        
        System.out.printf("Resolva a seguinte função: \n"
                        + "%d (%dx + %d)\t + \t%d (%dx + %d)\t = \t%d (%dx + %d)\n"
                        + "-------------\t\t-------------\t\t-------------\n"
                        + "\t%d\t\t      %d\t\t      %d     \n ", numMultiplicador[0], numAcompanha[0], numSoma[0], numMultiplicador[1], numAcompanha[1], numSoma[1], numMultiplicador[2], numAcompanha[2], numSoma[2], numDivisor[0], numDivisor[1], numDivisor[2]);
        
        
        
        
        
    }

    static int[] DeterminaNumeroDesafio3_Templo1(int indice) {
        int[] num = new int[4];
        int determinaSinal;
        Random dado = new Random();

        switch (indice) {
            case 1: // Decidir o multiplicador
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(20);
                    } while (num[i] <= 2);
                }
                break;
            case 2: // indicar o numero que acompanha X
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(50);
                    } while (num[i] <= 1);
                }
                break;
            case 3: // Indicar o numero que faz a soma dentro do parenteses
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(75);
                    } while (num[i] <= 1);
                }
                break;
            case 4: // Indicar o numero que divide a conta
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(15);
                    } while (num[i] <= 2);
                }
                break;
        }
        
        ////////////////////////////////////////
        
        
        for (int i = 0; i < num.length; i++) {
            determinaSinal = dado.nextInt(2);
            
            if (determinaSinal == 1) {
                num[i] = num[i] * -1;
            }
        }

        return num;
    }
}
