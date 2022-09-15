package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private List<Double> servicos = new ArrayList<>();

    public Orcamento() {

    }

    public void adicionarServico(double servico) {
        this.servicos.add(servico);
    }

    public double getTotalServicos() {
        double total = 0;
        for (double servico : servicos) {
            total += servico;
        }
        return total;
    }
}