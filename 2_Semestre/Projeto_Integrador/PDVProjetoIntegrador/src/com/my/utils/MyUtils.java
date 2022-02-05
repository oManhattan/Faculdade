/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.utils;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class MyUtils {

    //Função para validar as informações dos campos
    public static boolean campo(String frase) {

        String palavra = frase.strip();
        return (palavra.isBlank() || palavra.isEmpty());
    }

    // VERIFICA SE O VALOR SELECIONADO JÁ ESTÁ NA LISTA: SEM SIM É SOMADA A QUANTIDADE DE ITENS COM O VALOR QUE JÁ ESTÁ NA LISTA, SE NÃO O VALOR É ADICIONADO NA LISTA
    public static  void verificaLista(ArrayList<String[]> l, String[] s) {

        boolean condicao = true;

        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < s.length; j++) {
                String[] aux = l.get(i);

                if (s[0].equals(aux[0]) && s[2].equals(aux[2]) && s[4].equals(aux[4])) {
                    int temp = 0;

                    temp += Integer.parseInt(aux[3]);
                    System.out.println(temp);
                    temp += Integer.parseInt(s[3]);
                    System.out.println(temp);

                    aux[3] = Integer.toString(temp);

                    condicao = false;
                    break;
                }
            }
        }

        if (condicao) {
            l.add(s);
        }
    }

    // REMOVE O ITEM SELECIONADO DA LIST 
    public static void removeItem(ArrayList<String[]> l, String[] s) {

        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < s.length; j++) {
                String[] aux = l.get(i);

                if (s[0].equals(aux[0]) && s[1].equals(aux[1]) && s[3].equals(aux[3])) {
                   
                    l.remove(l.get(i));
                    break;
                }
            }
        }
    }
}
