package exe03;

import java.util.ArrayList;
import java.util.List;

public class ListaTransferencia {
    
    private List<TED> transferencias = new ArrayList<>();


    public ListaTransferencia() {

    }

    public void adicionarTransferencia(TED ted) {
        transferencias.add(ted);
    }

    public float getTotalTransferido() {
        float total = 0;
        for (TED ted : transferencias) {
            total += ted.getValor();
        }
        return total;
    }

    public List<TED> getTransferencias() {
        return transferencias;
    }
}
