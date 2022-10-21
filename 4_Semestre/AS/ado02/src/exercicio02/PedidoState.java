package exercicio02;

public interface PedidoState {
    
    public void proxState(Pedido pedido);
    public void anteriorState(Pedido pedido);
    public void atualState();

}
