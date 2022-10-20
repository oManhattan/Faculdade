package exe03;

public class BancoZ implements Taxa {
    
    @Override
    public float calcular(ListaTransferencia lista) {
        float tarifa = 2.5f;
        int quantidade = 1;
        int quantidadeTransferido = lista.getTransferencias().size();

        if (quantidadeTransferido <= 1) {
            return 0;
        }

        return (quantidadeTransferido - quantidade) * tarifa;
    }
}
