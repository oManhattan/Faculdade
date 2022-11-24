import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exercicio01.Livro;
import exercicio03.Assinante;
import exercicio03.Ingrediente;
import exercicio03.Receita;
import exercicio03.Restaurante;

public class App {
    public static void main(String[] args) throws Exception {

        exercicio01();

    }

    public static void exercicio01() {

        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("In Search of Lost Time", "Marcel Proust", 123.45, 468));
        livros.add(new Livro("Ulysses", "James Joyce", 233.43, 736));
        livros.add(new Livro("Don Quixote", "Miguel de Cervantes", 124.98, 1072));
        livros.add(new Livro("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 98.3, 417));
        livros.add(new Livro("The Great Gatsby", "F. Scott Fitzgerald", 198.98, 180));
        livros.add(new Livro("Moby Dick ", "Herman Melville", 102.34, 544));

        System.out.println("Não ordenado:");
        livros.forEach((livro) -> System.out.println(livro.toString()));

        Collections.sort((ArrayList<Livro>) livros, (livro1, livro2) -> livro1.getAutor().compareTo(livro2.getAutor()));

        System.out.println("\nDepois de ordenar:");
        livros.forEach((livro) -> System.out.println(livro.toString()));

        int index = Collections.binarySearch(livros, new Livro("alguma coisa", "James Joyce", 0, 0), (livro1, livro2) -> livro1.getAutor().compareTo(livro2.getAutor()));

        if (index >= 0) {
            System.out.println(String.format("\nLivro encontrado no index %d", index ));
        } else {
            System.out.println("\nlivro não encontrado");
        }
    }

    public static void exercicio02() {
        Restaurante restaurante = new Restaurante();

        restaurante.addObserver(new Assinante("Tozeti"));

        restaurante.addReceita(new Receita("Ovo frito", List.of(
                new Ingrediente("ovo", 0.5f),
                new Ingrediente("óleo", 10.0f))));

        restaurante.addReceita(new Receita("Bolo de chocolate fofinho", List.of(
                new Ingrediente("chocolate", 5.0f),
                new Ingrediente("farinha  de trigro", 7.0f),
                new Ingrediente("ovo", 1.5f),
                new Ingrediente("fermento", 5.0f))));

        restaurante.addObserver(new Assinante("Manhattan"));

        restaurante.addReceita(new Receita("Bolinho de chuva", List.of(
                new Ingrediente("farinha de trigro", 7.0f),
                new Ingrediente("óleo", 10.0f),
                new Ingrediente("fermento", 5.0f),
                new Ingrediente("canela", 9.0f),
                new Ingrediente("açúcar", 4.5f),
                new Ingrediente("essência de baunilha", 15.0f))));
    }
}
