public class UsaLista {
    public static void main(String[] args) {

        Lista lista = new Lista();
        // Carro c = new Carro("Fiat", "Palio", 2002);

        // lista.inserir(1);
        // lista.inserir("Gerson");
        // lista.inserir(true);
        // lista.inserir(0.0d);
        // lista.inserir(new Carro("VW", "Gol", 1986));
        // lista.inserir(c);

        Carro c1 = new Carro("Fiat", "Palio", 2002, 1);
        Carro c2 = new Carro("VW", "Gol", 2002, 2);
        Carro c3 = new Carro("VW", "Fox", 2013, 3);
        Carro c4 = new Carro("Mercedez", "C1", 2000, 4);
        Carro c5 = new Carro("BMW", "X1", 2009, 5);

        lista.inserir(c1);
        lista.inserir(c2);
        lista.inserir(c3);
        lista.inserir(c4);
        lista.inserir(c5);

        System.out.println("\n" + lista.retornaCarro(4));
        System.out.println("\n");

        lista.exibir();
        System.out.println("\n");

        lista.remover(4);
        lista.exibir();
    }
}
