package Aula01;

import java.util.Random;

public class exercicio02 {
    public static void main(String[] args) {
        int[] vetor = new int[20];

        gerarValores(vetor, 0, 100);
        imprimirPares(vetor);
    }

    public static void gerarValores(int[] vetor, int min, int max) {
        Random rd = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(max - min) + min;
        }
    }

    public static void imprimirPares(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
