public class UsaLivro {
    public static void main(String[] args) throws Exception {
        
        // Instanciando os objetos para a atividade.

        Livro livro01 = new Livro(1, "Clóvis de Barros", "Em Busca De Nós Mesmos", 22.69);
        Livro livro02 = new Livro(2, "Rick Warren", "Para Que Estou Na Terra? Uma Vida com Propósitos", 41.90);
        Livro livro03 = new Livro(3, "Charlie Donlea", "Não Confie Em Ninguém", 23.99);
        Livro livro04 = new Livro(4, "Brené Brown", "A Coragem De Ser Imperfeito", 22.41);
        Livro livro05 = new Livro(5, "Jeff Lemire", "Royal City Volume 1 - Segredos Em Família", 17.46);
        Livro livro06 = new Livro(6, "Lewis Carrol", "Alice no País das Maravilhas", 51.23);
        Livro livro07 = new Livro(7, "David Crow", "The Pale-Faced Lie", 10.00);
        Livro livro08 = new Livro(8, "Laura Dave", "The Last Thing He Told Me", 58.42);
        Livro livro09 = new Livro(9, "George S Clason", "O Homem Mais Rico da Babilônia", 16.90);
        Livro livro10 = new Livro(10, "Haemin Sunim", "As Coisas Que Você Só Vê Quando Desacelera", 37.40);

        // Adicionando os objetos ao Array

        Operacoes.inserir(livro01);
        Operacoes.inserir(livro10);
        Operacoes.inserir(livro04);
        Operacoes.inserir(livro05);
        Operacoes.inserir(livro09);
        Operacoes.inserir(livro06);
        Operacoes.inserir(livro07);
        Operacoes.inserir(livro02);
        Operacoes.inserir(livro03);
        Operacoes.inserir(livro08);

        System.out.println("Imprimir o Array no console de forma desorganizada\n");

        Operacoes.mostrar();
        System.out.println("\n");

        System.out.println("Organizando o Array de A - Z e imprimindo\n");

        Operacoes.sortByTitulo();
        Operacoes.mostrar();
        System.out.println("\n");

        System.out.println("Com o array ordenado será feita a  busca do título \"The Last Thing He Told Me\"\n");

        System.out.println(Operacoes.searchTitle("The Last Thing He Told Me"));
        System.out.println("\n");

        System.out.println("E por fim será removido o livro com id 7\n");

        Operacoes.remover(7);
        Operacoes.mostrar();
    }
}
