/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.utils;

import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class DateUtils {

    public LocalDate date;
    
    // Construtor vazio -> Inicia com a data do dia
    public DateUtils() {
        this.date = LocalDate.now();
    }
    
    // Construtor que vem de um objeto -> Inicia com menos 30 dias a partir do dia
    public DateUtils(DateUtils du) {
        this.date = du.date.minusDays(30);
    }

    //
    public DateUtils(String[] s) {
        this.date = LocalDate.of(Integer.parseInt(s[5]), converteMes(s[1]), Integer.parseInt(s[2]));
    }

    public static boolean condicoes(DateUtils inicio, DateUtils fim) {
        if (inicio.date.compareTo(fim.date) > 0) {
            JOptionPane.showMessageDialog(null, "Data de inicio maior do que a Data final");
            return false;
        }

        if (inicio.date.compareTo(fim.date.minusDays(30)) < 0) {
            JOptionPane.showMessageDialog(null, "Alcance máximo de dias é 30");
            return false;
        }

        return true;
    }

    public Date menosTrinta() {
        this.date = this.date.minusDays(30);
        Date d = new Date(this.date.getYear() - 1900, this.date.getMonthValue() - 1, this.date.getDayOfMonth());

        return d;
    }

    public Date agora() {
        Date d = new Date(this.date.getYear() - 1900, this.date.getMonthValue() - 1, this.date.getDayOfMonth());

        return d;
    }
    
    private int converteMes(String s) {
        switch (s) {
            case "Jan":
                return 1;
            case "Feb":
                return 2;
            case "Mar":
                return 3;
            case "Apr":
                return 4;
            case "May":
                return 5;
            case "Jun":
                return 6;
            case "Jul":
                return 7;
            case "Aug":
                return 8;
            case "Sep":
                return 9;
            case "Oct":
                return 10;
            case "Nov":
                return 11;
            case "Dec":
                return 12;
            default:
                return 1;
        }
    }
}
