package Exercicio02;

public enum Calculadora {
    IP1(new IP1()),
    IP2(new IP2()),
    IP3(new IP3());

    private final Imposto imposto;

    private Calculadora(Imposto imposto) {
        this.imposto = imposto;
    }

    public Imposto getImposto() {
        return imposto;
    }
}
