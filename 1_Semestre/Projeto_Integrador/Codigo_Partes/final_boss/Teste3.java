/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalBoss;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Teste3 {
    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Raiz = ");
        int a = sc.nextInt();
        System.out.print("\nDivisor = ");
        int b = sc.nextInt();
        
        int auxA = a, auxB = b;
        
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        
        int cima = auxA / a;
        int baixo = auxB / a;
        
        System.out.println("\nSimplificacao:\n\n");
        
        System.out.printf("%d / %d\n", cima, baixo);
        
    }
}
