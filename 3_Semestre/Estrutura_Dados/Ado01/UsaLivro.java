public class UsaLivro {
    public static void main(String[] args) throws Exception {
        Livro livro01 = new Livro(15, "Matheus Arruda", "O Brabo", 15.90);
        Livro livro02 = new Livro(20, "Arthur Arruda", "O Irmao", 19.90);
        Livro livro03 = new Livro(25, "Gustavo Tozeti", "O Parca", 10.00);
        Livro livro04 = new Livro(30, "Fabiane Sanches", "A Mae", 33.30);
        Livro livro05 = new Livro(35, "Isabella Maria", "Minha Muie", 40.00);
        
        Operacoes.inserir(livro01);
        Operacoes.inserir(livro02);
        Operacoes.inserir(livro03);
        Operacoes.inserir(livro04);
        Operacoes.inserir(livro05);

        Operacoes.mostrar();

        System.out.println("\n\n");
        Operacoes.remover(30);
        Operacoes.mostrar();

        System.out.println("\n\n");
        Operacoes.remover(15);
        Operacoes.mostrar();
    }
}
