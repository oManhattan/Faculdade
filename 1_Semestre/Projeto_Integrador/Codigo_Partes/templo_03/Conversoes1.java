/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesProjeto;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Conversoes1 {
/* Algoritmo feito para entender a lógica de conversão de bases usando o java
*/
    public static void main(String[] args) {
        //Parte de entrada
        System.out.println("Bem-vindo ao conversor de bases");

        Scanner input = new Scanner(System.in);
        boolean condicao = true;
        int selecao;

        do {

            System.out.println("1 - Fazer conversao\n2 - Sair do programa");
            System.out.print("Digite uma opção: ");
            selecao = input.nextInt();

            switch (selecao) {
                case 1:
                    //Fazer convercoes
                    conversoes();
                    break;
                case 2:
                    //Fechar o programa
                    System.out.println("Você fechou o programa.");
                    condicao = false;
                    break;
                default:
                    System.err.println("Caracter inválido. Por favor, tente novamente.");
                    break;
            }
        } while (condicao);

    }

    static void conversoes() {

        boolean condicao = true;
        byte base;
        String numero;
        Scanner input = new Scanner(System.in);

        System.out.print("\nInforme o valor: ");
        numero = input.next();

        do {
            System.out.print("Digite a base do valor (2, 8, 10, 16): ");
            base = input.nextByte();

            System.out.println("\n");

            switch (base) {
                case 2:
                    //Conversao de BIN para ALL
                    binToAll(numero);
                    condicao = false;
                    break;
                case 8:
                    octaToAll(numero);
                    condicao = false;
                    break;
                case 10:
                    //Conversao de DEC para ALL
                    decToAll(numero);
                    condicao = false;
                    break;
                case 16:
                    //Conversao de HEX pra ALL
                    hexToAll(numero);
                    condicao = false;
                    break;
                default:
                    System.err.println("Caracter inválido. Por favor, tente novamente.");
            }
        } while (condicao);
    }

    static void binToAll(String numero) {
        //Fazer conversao para dec e depois converter para os restantes dos valores.

        int decInt = Integer.parseInt(numero, 2); //Converter valor para int e para dec ao mesmo tempo
        String hexStr = Integer.toHexString(decInt); //Convertendo para Hex
        String octaStr = Integer.toOctalString(decInt); //Convertendo para Octa
        
        System.out.printf("Octal: %s\nDecimal: %d/nHexadecimal: %S\n\n", octaStr, decInt, hexStr);

    }

    static void octaToAll(String numero) {
        //Fazer conversao para dec e depois converter para os restantes dos valores
        
        int decInt = Integer.parseInt(numero, 8); //Converter valor para int e para dec ao mesmo tempo
        String binStr = Integer.toBinaryString(decInt); //Conveertendo para Bin
        String hexStr = Integer.toHexString(decInt); //Convertendo para Hex
        
        System.out.printf("Binario: %s\nDecimal: %d\nHexadecimal: %S\n\n", binStr, decInt, hexStr);

    }

    static void decToAll(String numero) {
        //Fazer conversao para todos

        int decInt = Integer.parseInt(numero); //Transformar valor em int

        String hexStr = Integer.toHexString(decInt); //Convertendo para Hex
        String octaStr = Integer.toOctalString(decInt); //Convertendo para Octa
        String binStr = Integer.toBinaryString(decInt); //Conveertendo para Bin

        System.out.printf("Hexadecimal: %S\nOctal: %s\nBinario: %s\n\n", hexStr, octaStr, binStr);
    }

    static void hexToAll(String numero) {
        //Fazer conversao para dec e depois con-verter para o restante dos valores
        
        int decInt = Integer.parseInt(numero, 16); //Converter valor para int e para dec ao mesmo tempo
        String octaStr = Integer.toOctalString(decInt); //Convertendo para Octa
        String binStr = Integer.toBinaryString(decInt); //Conveertendo para Bin
        
        System.out.printf("Binario: %s\nOctal: %s\nDecimal: %d\n\n", binStr, octaStr, decInt);
    }

}
