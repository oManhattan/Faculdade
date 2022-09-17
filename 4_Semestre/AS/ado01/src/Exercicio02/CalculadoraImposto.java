package Exercicio02;

public class CalculadoraImposto {
    public static void calcularImposto(Orcamento orcamento, Imposto imposto) {
        double resultado = imposto.calcular(orcamento);
        System.out.println(String.format("Imposto total: %.2f", resultado));
    }
}
