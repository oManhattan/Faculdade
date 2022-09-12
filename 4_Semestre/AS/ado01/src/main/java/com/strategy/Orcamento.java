package com.strategy;

import java.util.List;
import java.util.ArrayList;

public class Orcamento {

    private List<Double> valores = new ArrayList<>();

    public Orcamento(List<Double> valores) {
        this.valores = valores;
    }

    public List<Double> getValores() {
        return this.valores;
    }

    public void setValores(List<Double> valores) {
        this.valores = valores;
    }

    public double somarValores() {
        double soma = 0.0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma;
    }
}
