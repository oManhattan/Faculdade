public class UsaLivro {
    public static void main(String[] args) throws Exception {
        
        Livro livro03 = new Livro(25, "Gustavo Tozeti", "A", 10.00);
        Livro livro04 = new Livro(30, "Fabiane Sanches", "B", 33.30);
        Livro livro01 = new Livro(15, "Matheus Arruda", "C", 15.90);
        Livro livro02 = new Livro(20, "Arthur Arruda", "D", 19.90);
        Livro livro05 = new Livro(35, "Isabella Maria", "E", 40.00);
        
        Operacoes.inserir(livro01);
        Operacoes.inserir(livro04);
        Operacoes.inserir(livro02);
        Operacoes.inserir(livro05);
        Operacoes.inserir(livro03);


        Operacoes.mostrar();
        System.out.println("\n\n");

        Operacoes.sortByTitulo();
        Operacoes.mostrar();
    }
}
