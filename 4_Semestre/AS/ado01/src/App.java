import Exercicio02.Calculadora;
import Exercicio02.Orcamento;
import Exercicio03.Organizador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(("=-=-= Exercício 02 =-=-=\n"));
        testeExercicio02();
        System.out.println(("\n=-=-= Exercício 03 =-=-=\n"));
        testeExercicio03();
        System.out.println("\nFim da execução");
    }

    public static void testeExercicio02() {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarServico(150.0);
        orcamento.adicionarServico(75.50);
        orcamento.adicionarServico(37.99);
        System.out.println(String.format("Valor total: R$ %.2f", orcamento.getTotalServicos()));
        for (Calculadora c : Calculadora.values()) {
            double resultado = c.getImposto().calcular(orcamento);
            System.out.println(String.format("Imposto %s valor: R$ %.2f", c.name(), resultado));
        }
    }

    public static void testeExercicio03() {
        int[] array = {5, 1, 2, 10, 9, 8, 4};
        for (Organizador o : Organizador.values()) {
            System.out.printf("Sorter %s -> ", o.name());
            o.getSorter().sort(array);
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        String str = "";
        for (int num : array) {
            str += String.format("%d ", num);
        }
        System.out.printf("%s\n", str.strip());
    }
}
