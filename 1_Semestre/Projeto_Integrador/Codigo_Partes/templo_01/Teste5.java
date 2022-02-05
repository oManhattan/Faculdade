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
 * (ax +- b) / i = (cx +- d) / j
 */
public class Teste5 {

    public static void main(String[] args) {
        int[] numeroCima = new int[4];
        int[] numeroBaixo = new int[2];

        int mmc = 0, aux1 = 0, aux2 = 0, respostaCerta = 0;
        boolean condicao = true;

        do {
            try {
                do {
                    do {
                        numeroCima = DeterminaNumeroCima(); // Determinar os numeros de cima
                        numeroBaixo = DeterminaNumBaixo(); // Determinar os divisores

                        mmc = DeterminaMMC(numeroBaixo[0], numeroBaixo[1]); // Determinar o MMC dos divisores

                        numeroCima[0] = (numeroCima[0] * mmc) / numeroBaixo[0]; // Fazer o processo de MMC com cada numero
                        numeroCima[1] = (numeroCima[1] * mmc) / numeroBaixo[0];
                        numeroCima[2] = (numeroCima[2] * mmc) / numeroBaixo[1];
                        numeroCima[3] = (numeroCima[3] * mmc) / numeroBaixo[1];

                        aux1 = numeroCima[0] - numeroCima[2]; // Isolando os numeros
                        aux2 = numeroCima[3] - numeroCima[0];

                        respostaCerta = aux2 / aux1; // Obtendo a resposta
                    } while (aux1 == 0);
                } while (aux2 % aux1 != 0);
                if (respostaCerta != 0) {
                    condicao = false;
                }
            } catch (Exception e) {
                System.out.println("DEU RUIM!");
            }
        } while (condicao);

        System.out.println("\naux1 = " + aux1 + "\naux2 = " + aux2 + "\naux2 / aux1 = " + respostaCerta + "\nMMC = " + mmc + "\n");

        for (int i : numeroBaixo) {
            System.out.println(i);
        }
    }

    static int[] DeterminaNumeroCima() {
        int[] num = new int[4];
        int determinaSinal;

        Random dado = new Random();

        ////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < 4; i++) {
            determinaSinal = dado.nextInt(2);

            switch (determinaSinal) {
                case 0:
                    do {
                        num[i] = dado.nextInt(150);
                    } while (Math.abs(num[i]) < 20);
                    break;
                case 1:
                    do {
                        num[i] = dado.nextInt(150) * -1;
                    } while (Math.abs(num[i]) < 20);
                    break;
            }
        }

        return num;
    }

    static int[] DeterminaNumBaixo() {
        int[] num = new int[2];
        int determinaExistencia, aux;

        Random dado = new Random();

        for (int i = 0; i < 2; i++) {
            determinaExistencia = dado.nextInt(2);

            do {
                num[i] = dado.nextInt(15);
            } while (num[i] <= 1);

        }

        return num;
    }

    static int DeterminaMMC(int a, int b) {
        int mmc;

        mmc = Math.max(a, b);

        while (mmc % Math.min(a, b) != 0) {
            mmc = mmc + Math.max(a, b);
        }

        return mmc;
    }
}
