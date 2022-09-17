package Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Diretoria implements Component {
    private String nome;
    private List<Component> departamentos;

    public Diretoria(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public Diretoria() {

    }
    
    public void adicionarDepartamento(Component departamento) {
        this.departamentos.add(departamento);
    }

    public void removerDepartamento(Component departamento) {
        this.departamentos.remove(departamento);
    }

    public void detalharDepartamentos() {
        System.out.printf("Total de departamentos: %d\n\n", departamentos.size());
        for (Component c : departamentos) {
            System.out.printf("%s\n\n=-=-=-=-=-=-=-=-=-=\n\n", c.toString());
        }
        
    }

    @Override
    public double getCusto() {
        double total = 0;
        for (Component c : departamentos) {
            total += c.getCusto();
        }
        return total;
    }

    @Override
    public int getTotalFuncionarios() {
        int total = 0;
        for (Component c : departamentos) {
            total += c.getTotalFuncionarios();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public List<Component> getDepartamentos() {
        return departamentos;
    }
}
