package exercicio02;

public class Pedido {
    
    private int numeroPedido;
    private PedidoState state;

    public Pedido() {
        
    }

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.state = new SeparacaoState();
    }

    public Pedido(int numeroPedido, PedidoState state) {
        this.numeroPedido = numeroPedido;
        this.state = state;
    }

    public void proxState() {
        this.state.proxState(this);
    }

    public void anteriorState() {
        this.state.anteriorState(this);
    }

    public void atualState() {
        this.state.atualState();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public PedidoState getState() {
        return state;
    }

    public void setState(PedidoState state) {
        this.state = state;
    }
}
