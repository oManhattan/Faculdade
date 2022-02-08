package Aula01;

import java.util.Arrays;
import java.util.Random;

// Considere uma matriz bidimensional de ordem igual a cinco com valores reais de simples precisão.
// Leia a matriz, via teclado, e na saída imprima todos os valores da diagonal principal.

public class exercicio03 {
    public static void main(String[] args) {
        int[][] vetor = new int[5][5];

        gerarNum(vetor, 0, 100);
        imprimirVetor(vetor);
    }

    public static void gerarNum(int[][] vetor, int min, int max) {
        Random rd = new Random();

        for(int i = 0; i < vetor.length; i++) {
            for(int j = 0; j < vetor[i].length; j++) {
                vetor[i][j] = rd.nextInt(max - min) + min;
            }
        }
    }

    public static void imprimirVetor(int[][] vetor) {
        int temp = 0;
        
        System.out.println("Array: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(Arrays.toString(vetor[i]));
            for(int j = 0; j < vetor[i].length; j++) {
                if (i == j) {
                    temp += vetor[i][j];
                }
            }
        }

        System.out.println("Soma diagonal principal: " + temp);
    }
}
