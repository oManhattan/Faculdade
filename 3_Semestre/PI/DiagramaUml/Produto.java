public class Produto {
    
    private int id;
    private int quantidade;
    private double preco;
    private String nome;
    
    public Produto(int id, int quantidade, double preco, String nome) {
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }
     
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void registrar() {

    }

    public void buscar() {

    }

    public void atualizar() {

    }

    public void deletar() {
        
    }
}
