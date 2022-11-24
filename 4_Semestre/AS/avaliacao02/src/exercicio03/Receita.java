package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Receita implements Component {
    
    private String nome;
    private List<Component> ingredientes = new ArrayList<>();

    public Receita() {

    }

    public Receita(String nome, List<Component> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public void adicionarIngrediente(Component c) {
        this.ingredientes.add(c);
    }

    public void removerIngrediente(Component c) {
        this.ingredientes.remove(c);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public float getPreco() {
        float total = 0;
        for (Component component : ingredientes) {
            total += component.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return String.format("%s, total: R$%.2f\nIngredientes: %s", getNome(), getPreco(), this.ingredientes.toString());
    }
}
