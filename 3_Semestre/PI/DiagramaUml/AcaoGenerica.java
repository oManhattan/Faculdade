public abstract class AcaoGenerica {
    
    private Cliente cliente;
    private Usuario usuario;
    private int id;
    private double precoTotal;
    
    public AcaoGenerica(Cliente cliente, Usuario usuario, int id, double precoTotal) {
        this.cliente = cliente;
        this.usuario = usuario;
        this.id = id;
        this.precoTotal = precoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void registrar() {

    }

    public void buscar() {

    }

    public void deletar() {

    }
}
