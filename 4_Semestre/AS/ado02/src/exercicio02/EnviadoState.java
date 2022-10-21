package exercicio02;

public class EnviadoState  implements PedidoState {

    @Override
    public void proxState(Pedido pedido) {
        pedido.setState(new RotaState());
    }

    @Override
    public void anteriorState(Pedido pedido) {
        pedido.setState(new SeparacaoState());
    }

    @Override
    public void atualState() {
        System.out.println("Pedido foi enviado.");
    }
    
}
