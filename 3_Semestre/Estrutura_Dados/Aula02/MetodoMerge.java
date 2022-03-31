package Aula02;

import java.util.Arrays;

public class MetodoMerge {
    public static void main(String[] args) {
        int[] arrA = { 1, 4, 8, 11, 34 };
        int[] arrB = { 5, 6, 15, 21, 23, 25, 28 };

        System.out.println(Arrays.toString(intercalar(arrA, arrB)));
    }

    public static int[] intercalar(int[] arrA, int[] arrB) {
        int[] arr = new int[arrA.length + arrB.length];

        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        while (indexA < arrA.length && indexB < arrB.length) {

            if (arrA[indexA] < arrB[indexB]) {
                arr[indexC] = arrA[indexA];
                indexC++;
                indexA++;
            } else {
                arr[indexC] = arrB[indexB];
                indexC++;
                indexB++;
            }
        }

        while (indexA < arrA.length) {
            arr[indexC] = arrA[indexA];
            indexA++;
            indexC++;
        }

        while (indexB < arrB.length) {
            arr[indexC] = arrB[indexB];
            indexB++;
            indexC++;
        }

        return arr;
    }
}
