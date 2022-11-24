package exercicio01;

public class Livro {
 
    private String titulo;
    private String autor;
    private double preco;
    private int numeroPaginas;

    public Livro() {

    }

    public Livro(String titulo, String autor, double preco, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Preço: R$%.2f | Páginas: %d", getTitulo(), getAutor(), getPreco(), getNumeroPaginas());
    }
}
