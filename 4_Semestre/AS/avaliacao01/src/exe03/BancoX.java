package exe03;

public class BancoX implements Taxa {

    @Override
    public float calcular(ListaTransferencia lista) {
        float tarifa = 2;
        int quantidade = 2;
        int quantidadeTransferido = lista.getTransferencias().size();

        if (quantidadeTransferido <= quantidade) {
            return 0;
        }

        return (quantidadeTransferido - quantidade) * tarifa;
    }

}
