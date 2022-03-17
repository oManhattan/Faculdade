package ExemploPolimorfismo;

import java.util.ArrayList;

public class CustoPintura {

    private ArrayList<Forma> formas;

    public static void main(String[] args) {
        CustoPintura cp = new CustoPintura();

        cp.carregar();
        cp.calcular();
    }

    public void carregar() {
        formas = new ArrayList<Forma>();

        formas.add(new Quadrado(10, 10, 1));
        formas.add(new Quadrado(10, 10, 2));
        formas.add(new Circulo(0, 0, 4));
        formas.add(new Circulo(100, 100, 3));

        System.out.printf("carregamos %d formas\n", formas.size());
    }

    public void calcular() {
        double areaTotal = 0;

        for (Forma f : formas) {
            areaTotal += f.calcularArea();
        }

        System.out.printf("A area total é: %.2f\n", areaTotal);
    }
}
