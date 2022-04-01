public class Venda extends AcaoGenerica{
    
    private Produto[] produtos;

    public Venda(Cliente cliente, Usuario usuario, int id, double precoTotal, Produto[] produtos) {
        super(cliente, usuario, id, precoTotal);
        this.produtos = produtos;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    @Override
    public void buscar() {
        // TODO Auto-generated method stub
        super.buscar();
    }

    @Override
    public void deletar() {
        // TODO Auto-generated method stub
        super.deletar();
    }

    @Override
    public void registrar() {
        // TODO Auto-generated method stub
        super.registrar();
    }

}
