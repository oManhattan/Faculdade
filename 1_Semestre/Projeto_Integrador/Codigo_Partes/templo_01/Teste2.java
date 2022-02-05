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
 * 
 * Fazer o processo para de achar a resposta
 */
public class Teste2 {
    public static void main(String[] args) {
        int[] numeroInicial = new int[2];
        String respostaCerta;
        
        numeroInicial = DeterminaNumeros_Templo1();
        
        respostaCerta = DeterminaRespostaCerta_Templo1(numeroInicial);
        
        System.out.println("A: " + numeroInicial[0]);
        System.out.println("B: " + numeroInicial[1]);
        System.out.println("Resposta certa: " + respostaCerta);
    }
    
    static String DeterminaRespostaCerta_Templo1(int[] numeroInicial) {
        String respostaCerta = null;
        int auxiliar;
        
        // Fórmula: x = -b / a
        
        auxiliar = - (numeroInicial[1]) / numeroInicial[0];
        
        respostaCerta = Integer.toString(auxiliar);
        
        return respostaCerta;
    }
    
    static int[] DeterminaNumeros_Templo1() {
        Random dado = new Random();
        int[] numeros = new int[2];
        int detSinal;

        do {
            detSinal = dado.nextInt();
            for (int i = 0; i <= 1; i++) {
                do {
                    if (detSinal % 2 == 0) {
                        numeros[i] = dado.nextInt(2000);
                    } else {
                        numeros[i] = -dado.nextInt(2000);
                    }
                    
                    if (i == 0) {
                        numeros[i] = numeros[i] / 3;
                    }
                } while (numeros[i] == 0);
            }
        } while (numeros[1] % numeros[0] == Math.abs(1));
        
        return numeros;
    }
}
