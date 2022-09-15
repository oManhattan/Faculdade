package Exercicio02;

public class IP3 implements Imposto {
    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getTotalServicos() * 0.25;
    }
}
