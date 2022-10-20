package exe03;

public class BancoY implements Taxa {
    
    @Override
    public float calcular(ListaTransferencia lista) {
        float tarifa = 5;
        int quantidade = 3;
        int quantidadeTransferido = lista.getTransferencias().size();
        
        if (quantidadeTransferido <= quantidade) {
            return 0;
        }

        return (quantidadeTransferido - quantidade) * tarifa;
    }
}
