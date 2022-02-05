/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalBoss;

import java.util.Random;

/**
 *
 * @author Matheus
 */
public class TestePratico_Funcao1 {

    public static void main(String[] args) {
        int[] num; // sem X
        int[] numX; // com X
        int[] raiz;
        int x2, x, n; // A, B, C
        double delta;
        boolean condicao = true;

        ////////////////////////////////////////////////////////////////////////
        // Determinando os numeros do exercicio e tambem a resolucao
        for (int i = 0; i <= 1000; i++) {

            do {
                do {
                    num = DeterminaNumero_FinalBoss(); // Determinando numeros sem X
                    numX = DeterminaNumero_FinalBoss(); // Determinando numeros com X

                    // Organizando a equacao
                    x2 = (numX[0] * numX[1]) + (numX[2] * numX[3]); // Ax²
                    x = (numX[0] * num[1]) + (num[0] * numX[1]) + (numX[2] * num[3]) + (num[2] * numX[3]); //Bx
                    n = (num[0] * num[1]) + (num[2] * num[3]); // C
                } while (x2 == 0);
                delta = Math.pow(x, 2) - (4 * x2 * n);
            } while (Math.sqrt(delta) % 1 == 0);
            
            if (x2 == 0) {
                System.out.println("x2 = 0");
            }
            if (delta % 1 != 0) {
                System.out.println("Delta decimal");
            }
        }
        //raiz = CalculaRaiz(delta, x2, x, n);

        ////////////////////////////////////////////////////////////////////////
        /*
        System.out.printf("(%dx + %d) (%dx + %d) + (%dx + %d) (%dx + %d) = 0\n\n", // Enunciado
                numX[0], num[0], numX[1], num[1], numX[2], num[2], numX[3], num[3]);
        //        1        2       3        4        5       6       7        8

        System.out.printf("%dx² + %dx + %d\n", x2, x, n);

        switch (raiz.length) {
            case 1:
                System.out.printf("\nraiz = %d\n", raiz[0]);
                break;
            case 2:
                System.out.printf("\nraiz 1 = %d\nraiz 2 = %d\n", raiz[0], raiz[1]);
                break;
        }

        System.out.println("\ndelta = " + delta);
        System.out.println("\nraiz delta = " + Math.sqrt(delta));
         */
    }

    static int[] DeterminaNumero_FinalBoss() {
        Random dado = new Random();
        int[] num = new int[4];
        int determinaSinal;

        for (int i = 0; i < 4; i++) {
            do {
                num[i] = dado.nextInt(20);
            } while (num[i] <= 0);

            determinaSinal = dado.nextInt(2);

            if (determinaSinal == 1) {
                num[i] = num[i] * -1;
            }
        }

        return num;
    }

    static int[] CalculaRaiz(double delta, int x2, int x, int n) {
        int[] raiz;

        if (delta == 0) {
            raiz = new int[1];
            raiz[0] = (int) ((-x + Math.sqrt(delta)) / 2 * x2);
            return raiz;
        } else {
            raiz = new int[2];
            raiz[0] = (int) ((-x + Math.sqrt(delta)) / 2 * x2);
            raiz[1] = (int) ((-x - Math.sqrt(delta)) / 2 * x2);
            return raiz;
        }
    }
}
