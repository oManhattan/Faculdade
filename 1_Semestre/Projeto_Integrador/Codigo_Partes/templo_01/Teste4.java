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
 */
public class Teste4 {

    public static void main(String[] args) {
        Random dado = new Random();
        
        int[] num = new int[3];
        
        int aux, mmc;
        
        ////////////////////////////////////////////////////////////////////////

        for (int i = 0; i < num.length; i++) {
            do {
                num[i] = dado.nextInt(15);
            } while (num[i] <= 2);
        }
        
        System.out.println("BEFORE BUBBLE");
        for (int i : num) {
            System.out.println(i);
        }
        
        for (int i = 0; i < num.length; i++) {
            for (int y = 0; y < num.length - 1; y++) {
                if (num[y] < num[y + 1]) {
                    aux = num[y];
                    num[y] = num[y + 1];
                    num[y + 1] = aux;
                }
            }
        }
        
        System.out.println("AFTER BUBBLE");
        for (int i : num) {
            System.out.println(i);
        }
        
        mmc = num[0];
        
        while (num[0] % num[1] != 0 && num[0] % num[2] != 0) {
            mmc = mmc + num[0];
            System.out.println(mmc);
        }
        
        
        
    }
}
