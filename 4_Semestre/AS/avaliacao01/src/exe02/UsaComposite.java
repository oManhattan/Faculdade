package exe02;

public class UsaComposite {
    
    public static void teste() {

        Composite container = new Composite("Container");

        Composite caixa1 = new Composite("Caixa 01");
        Composite caixa2 = new Composite("Caixa 02");

        Component produto01 = new Leaf("Suco de Mimosa", 19.9f);
        Component produto02 = new Leaf("Chocalho", 5.4f);
        Component produto03 = new Leaf("Peão", 7.5f);
        Component produto04 = new Leaf("Tabuleiro", 49.0f);
        Component produto05 = new Leaf("Xiaomi MiBand 6 Delux Ultra", 2500.0f);
        Component produto06 = new Leaf("Bacon", 2.5f);

        caixa1.adicionar(produto01);
        caixa1.adicionar(produto02);
        caixa1.adicionar(produto03);

        caixa2.adicionar(produto04);
        caixa2.adicionar(produto05);
        caixa2.adicionar(produto06);

        container.adicionar(caixa1);
        container.adicionar(caixa2);

        System.out.printf("Preço total caixa 1: R$%.2f\n", caixa1.getPreco());
        System.out.printf("Preço total caixa 2: R$%.2f\n", caixa2.getPreco());
        System.out.printf("Preço total do container: R$%.2f\n", container.getPreco());
    }
}
