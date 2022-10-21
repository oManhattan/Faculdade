package exercicio02;

public class EntregueState implements PedidoState {

    @Override
    public void proxState(Pedido pedido) {
        System.out.println("Pedido já foi entregue.");
    }

    @Override
    public void anteriorState(Pedido pedido) {
        pedido.setState(new RotaState());
    }

    @Override
    public void atualState() {
        System.out.println("Pedido entregue.");
    }
    
}
