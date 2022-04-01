public class Servico extends Produto{
    
    private String complemento;

    public Servico(int id, int quantidade, double preco, String nome, String complemento) {
        super(id, quantidade, preco, nome);
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public void atualizar() {
        // TODO Auto-generated method stub
        super.atualizar();
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
