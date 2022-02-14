package Aula01;

import java.util.Arrays;
import java.util.Random;

public class exemplo02 {
    public static void main(String[] args) {
        float[][] matriz = new float[4][4];

        gerarNum(matriz, 0, 100);
        imprimirMatriz(matriz);
    }

    public static void gerarNum(float[][] m, int min, int max) {
        Random rd = new Random();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rd.nextFloat() * (max - min);
            }
        }
    }

    public static void imprimirMatriz(float[][] m) {
        for (float[] i : m) {
            System.out.println(Arrays.toString(i));
        }
    }
}
