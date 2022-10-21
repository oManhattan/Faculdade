package exercicio02;

public class SeparacaoState implements PedidoState {

    @Override
    public void proxState(Pedido pedido) {
        pedido.setState(new EnviadoState());
    }

    @Override
    public void anteriorState(Pedido pedido) {
        System.out.println("Separação é o State raiz.");
    }

    @Override
    public void atualState() {
        System.out.println("Pedido está sendo separado.");
    }

}
