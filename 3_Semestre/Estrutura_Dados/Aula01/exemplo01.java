package Aula01;

import java.util.Random;

public class exemplo01 {

    // Arrays com valores aleatórios

    public static void main(String[] args) {
        int[] vetor = new int[10];

        gerarValores(vetor);
        imprimirValores(vetor);
    }

    public static void gerarValores(int[] vetor) {
        Random gerador = new Random();
        
        int valorInicial = 0;
        int valorFinal = 100;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = valorInicial + gerador.nextInt(valorFinal - valorInicial);
        }
    }

    public static void imprimirValores(int[] vetor) {
        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
