package Aula01;

import java.util.Arrays;
import java.util.Random;

public class exercicio01 {

    // Um array unidimensional do tipo inteiro e tamanho igual a 100 deve armazenar
    // valores aleatórios. A saída deve imprimir o maior e o menor valor armazenado.

    public static void main(String[] args) {
        int[] vetor = new int[100];

        gerarValores(vetor, 0, 100);
        imprimirValores(vetor);
    }

    public static void gerarValores(int[] vetor, int min, int max) {
        Random rd = new Random();
        int menor = max;
        int maior = min;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(max - min) + min;

            menor = (menor < vetor[i]) ? menor : vetor[i];
            maior = (maior > vetor[i]) ? maior : vetor[i];
        }

        System.out.println("menor = " + menor);
        System.out.println("maior = " + maior);
    }

    public static void imprimirValores(int[] vetor) {
        System.out.println(Arrays.toString(vetor));
    }
}
