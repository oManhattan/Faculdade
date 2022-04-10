public class Produto {
    
    private int id;
    private double preco;
    private String marca;
    private String categoria;
    
    public Produto(int id, double preco, String marca, String categoria) {
        this.id = id;
        this.preco = preco;
        this.marca = marca;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}
