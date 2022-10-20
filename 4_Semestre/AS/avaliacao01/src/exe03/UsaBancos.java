package exe03;

public class UsaBancos {
    
    public static void teste() {
        ListaTransferencia lista = new ListaTransferencia();

        lista.adicionarTransferencia(new TED(150));
        lista.adicionarTransferencia(new TED(49.5f));
        lista.adicionarTransferencia(new TED(367.89f));
        lista.adicionarTransferencia(new TED(6));

        System.out.printf("Total de transferências no dia: %d\n", lista.getTransferencias().size());
        System.out.printf("Valor total transferido: R$%.2f\n\n", lista.getTotalTransferido());

        for (CalculadoraTaxa c : CalculadoraTaxa.values()) {
            double resultado = c.getBanco().calcular(lista);
            System.out.printf("Seria cobrado o valor de R$%.2f do banco %s\n", resultado, c.name());
        }
    }

}
