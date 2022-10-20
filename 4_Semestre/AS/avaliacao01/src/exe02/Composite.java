package exe02;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    
    private String nome;
    private List<Component> produtos = new ArrayList<>();

    public Composite(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionar(Component p) {
        this.produtos.add(p);
    }

    @Override
    public float getPreco() {
        float total = 0;
        for (Component p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

}
