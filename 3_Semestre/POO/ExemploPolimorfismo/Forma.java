package ExemploPolimorfismo;

public class Forma {
    
    private double x;
    private double y;

    public Forma(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println((0.0f));
    }

    public double calcularArea() {
        return 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    
}
