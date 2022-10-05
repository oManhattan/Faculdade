import Exercicio02.Calculadora;
import Exercicio02.Orcamento;
import Exercicio03.ArrayUtils;
import Exercicio03.Organizador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(("=-=-= Exercício 02 =-=-=\n"));
        testeExercicio02();
        System.out.println(("\n=-=-= Exercício 03 =-=-=\n"));
        testeExercicio03();
        System.out.println(("=-=-= Exercício 04 =-=-=\n"));

        System.out.println("Fim da execução");
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
        for (Organizador o : Organizador.values()) {
            int[] array = ArrayUtils.createArray(1, 100, 20);
            System.out.printf("%s\nANTES: %s\n", o.name(), ArrayUtils.toString(array));
            o.getSorter().sort(array);
            System.out.printf("DEPOIS: %s\n\n", ArrayUtils.toString(array));
        }
    }

}
