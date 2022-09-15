package Exercicio04;

public class Departamento implements Component {
    
    private String nome;
    private double gastos;
    private int qntFuncionarios;

    public Departamento(String nome, double gastos, int qntFuncionarios) {
        this.nome = nome;
        this.gastos = gastos;
        this.qntFuncionarios = qntFuncionarios;
    }

    public Departamento() {
    }

    @Override
    public double getCusto() {
        return getGastos();
    }

    @Override
    public int getTotalFuncionarios() {
        return getQntFuncionarios();
    }

    public String getNome() {
        return nome;
    }
    
    public double getGastos() {
        return gastos;
    }

    public int getQntFuncionarios() {
        return qntFuncionarios;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nTotal funcionários: %d", getNome(), getQntFuncionarios());
    }
}
