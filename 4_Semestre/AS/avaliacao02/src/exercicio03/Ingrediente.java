package exercicio03;

public class Ingrediente implements Component {
    
    private String nome;
    private float preco;

    public Ingrediente() {

    }

    public Ingrediente(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("%s: R$%.2f", getNome(), getPreco());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
