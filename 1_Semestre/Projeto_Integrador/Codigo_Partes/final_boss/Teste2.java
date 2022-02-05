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
public class Teste2 {

    public static void main(String[] args) {
        int[] num; // sem X
        int[] numX; // com X
        double[] raiz;
        double[] raiz2;
        double[] cima = new double[2];
        double divisor;
        int x2, x, n; // A, B, C
        double delta;

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

        System.out.printf("%dx² + %dx + %d = 0\n\n", x2, x, n);
        
        
        
        if (delta == 0) { // Se delta == 0, a resposta é apenas uma raiz
            if (cima[0] % divisor == 0) {
                raiz = new double[1];
                raiz[0] = cima[0] / divisor;
                
                System.out.printf("Raiz = %.2f\n", raiz[0]);
            } else {
                raiz = SimplificaFracao_FinalBoss(cima[0], divisor);
                
                System.out.printf("Raiz = %.2f / %.2f\n", raiz[0], raiz[1]);
            }
            
        } else { // Se delta > 0, a resposta serão duas raízes
            // raiz 1
            if (cima[0] % divisor == 0) { // se a divisão for exata, fazer a divisão
                raiz = new double[1];
                raiz[0] = cima[0] / divisor;
                
                System.out.printf("Raiz 1 = %.2f\n", raiz[0]);
            } else { // se a divisão não for exata, simplificar a fração
                raiz = SimplificaFracao_FinalBoss(cima[0], divisor);
                
                System.out.printf("Raiz 1 = %.2f / %.2f\n", raiz[0], raiz[1]);
            }
            
            // raiz 2
            if (cima[1] % divisor == 0) { // se a divisão for exata, fazer a divisao
                raiz2 = new double[1];
                raiz2[0] = cima[1] / divisor;
                
                System.out.printf("Raiz 2 = %.2f\n", raiz2[0]);
            } else { // se a divisão não for exata, simplificar a fração
                raiz2 = SimplificaFracao_FinalBoss(cima[1], divisor);
                
                System.out.printf("Raiz 2 = %.2f / %.2f\n", raiz2[0], raiz2[1]);
            }
        }
        
        

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

    static double[] SimplificaFracao_FinalBoss(double a, double b) {
        double auxA = a, auxB = b;
        
        System.out.println("PASSEI NA FRACAO");
        
        while (a != b) {
            int contador = 1;
            
            System.out.println("Socorro! n - " + contador);
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            contador++;
            
        }
        
        System.out.println("PASSEI DEPOIS DA SIMPLIFICACAO");
        
        double[] resposta = {auxA / a, auxB / a};
        
        return resposta;
    }
}
