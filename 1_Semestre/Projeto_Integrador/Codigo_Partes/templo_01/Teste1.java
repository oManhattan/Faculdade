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
public class Teste1 {

    public static void main(String[] args) {

        double contador = 0, contador2 = 0, contador3 = 0;

        for (int y = 0; y <= 1; y++) {
            contador = 0;
            contador2 = 0;
            contador3 = 0;
            for (int i = 0; i <= 1000000000; i++) {
                int[] numeroInicial = DeterminaNumeros_Templo1();
                if (numeroInicial[y] > 0) {
                    contador++;
                } else if (numeroInicial[y] == 0) {
                    contador2++;
                } else {
                    contador3++;
                }
            }
            /*
            if (y == 0) {
                System.out.println("A > 0: " + (contador / 1000000000) * 100 + "%");
                System.out.println("A = 0: " + contador2 + "%");
                System.out.println("A < 0: " + (contador3 / 1000000000) * 100 + "%");
                System.out.println("\n");
            } else if (y == 1) {
                System.out.println("B > 0: " + (contador / 1000000000) * 100 + "%");
                System.out.println("B = 0: " + contador2 + "%");
                System.out.println("B < 0: " + (contador3 / 1000000000) * 100 + "%");
            }
            */        }
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
                } while (numeros[i] == 0);
            }
        } while (numeros[1] % numeros[0] == Math.abs(1));
        
        return numeros;
    }

}
