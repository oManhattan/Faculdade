package Exercicio03;

import java.util.Random;

public class ArrayUtils {
    public static int[] createArray(int min, int max, int size) {
        if (min > max) throw new RuntimeException("O valor mínimo é maior que o valor máximo.");
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        return array;
    }

    public static String toString(int[] array) {
        String str = "";
        for (int num : array) {
            str += String.format("%d ", num);
        }
        return String.format("%s", str.strip());
    }
}
