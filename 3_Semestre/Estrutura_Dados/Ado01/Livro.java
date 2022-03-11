public class Livro {

    private int id;
    private String autor;
    private String titulo;
    private double preco;

    public Livro() {

    }

    public Livro(int id, String autor, String titulo, Double preco) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return id + ", " + autor + ", " + titulo + ", " + preco; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}