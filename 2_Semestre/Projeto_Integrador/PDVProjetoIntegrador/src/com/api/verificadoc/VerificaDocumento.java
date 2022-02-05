package com.api.verificadoc;

import javax.swing.JOptionPane;

public class VerificaDocumento {
    private static String docStr;
    
    public static String mask(String input) {
        if (input.length() == 11) {
            return input.substring(0, 3) + "." + input.substring(3, 6) + "." + input.substring(6, 9) + "-" + input.substring(9);
        } else {
            return input.substring(0, 2) + "." + input.substring(2, 5) + "." + input.substring(5, 8) + "/" + input.substring(8, 12) + "-" + input.substring(12);
        }
    }
    
    public static String limpar(String input) {
        if (input.length() == 14) {
            return input.substring(0, 3) + input.substring(4, 7) + input.substring(8, 11) + input.substring(12);
        } else {
            return input.substring(0, 2) + input.substring(3, 6) + input.substring(7, 10) + input.substring(11, 15) + input.substring(16);
        }
    }

    public static boolean verificar(String input) {
        docStr = input;

        if (docStr.length() == 14) {
            docStr = docStr.substring(0, 3) + docStr.substring(4, 7) + docStr.substring(8, 11) + docStr.substring(12);
            return verificaCPF();
        } else {
            docStr = docStr.substring(0, 2) + docStr.substring(3, 6) + docStr.substring(7, 10) + docStr.substring(11, 15) + docStr.substring(16);
            return verificaCNPJ();
        }
    }

    private static boolean verificaCPF() {
        String[] doc = docStr.split("");

        if (FiltroCPF() == false) {
            // JOptionPane.showMessageDialog(null, "CPF " + docStr + " inválido");
            return false;
        }

        for (int i = 0; i < 2; i++) {

            int verificador = 0;

            for (int j = 0; j <= 8 + i; j++) {
                verificador += Integer.parseInt(doc[j]) * ((10 + i) - j);
            }

            verificador = (verificador * 10) % 11;
            verificador = (verificador == 10) ? 0 : verificador;

            if (verificador != Integer.parseInt(doc[9 + i])) {
                // JOptionPane.showMessageDialog(null, "CPF " + docStr + " inválido");
                return false;
            }
        }

        return true;
    }

    private static boolean FiltroCPF() {
        switch (docStr) {
        case "00000000000":
        case "11111111111":
        case "22222222222":
        case "33333333333":
        case "44444444444":
        case "55555555555":
        case "66666666666":
        case "77777777777":
        case "88888888888":
        case "99999999999":
            return false;
        }

        return true;
    }

    private static boolean verificaCNPJ() {
        String[] doc = docStr.split("");

        if (FiltroCNPJ() == false) {
            return false;
        }

        for (int i = 0; i < 2; i++) {

            int verificador = 0;
            int peso = 2;

            for (int j = 0; j <= 11 + i; j++) {
                verificador += (Integer.parseInt(doc[11 + i - j])) * peso;
                peso = (peso >= 9) ? 2 : peso + 1;
            }

            verificador = verificador % 11;

            verificador = (verificador <= 1) ? 0 : 11 - verificador;

            if (verificador != Integer.parseInt(doc[12 + i])) {
                return false;
            }
        }

        return true;
    }

    private static boolean FiltroCNPJ() {
        switch (docStr) {
        case "00000000000000":
        case "11111111111111":
        case "22222222222222":
        case "33333333333333":
        case "44444444444444":
        case "55555555555555":
        case "66666666666666":
        case "77777777777777":
        case "88888888888888":
        case "99999999999999":
            return false;
        }

        return true;
    }
}
