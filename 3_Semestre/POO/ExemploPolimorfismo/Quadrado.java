package ExemploPolimorfismo;

public class Quadrado extends Forma {
    
    private double lado;

    public Quadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
