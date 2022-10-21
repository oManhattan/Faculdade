package exercicio02;

public class RotaState implements PedidoState {

    @Override
    public void proxState(Pedido pedido) {
        pedido.setState(new EntregueState());
    }

    @Override
    public void anteriorState(Pedido pedido) {
        pedido.setState(new EnviadoState());
    }

    @Override
    public void atualState() {
        System.out.println("Pedido em rota de entrega.");
    }
    
}
