package exe02;

public class Leaf implements Component {
    
    private String nome;
    private float preco;

    public Leaf(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
