public class OrdemServico extends AcaoGenerica{
    
    private Servico[] servico;
    private String anotacoes;

    public OrdemServico(Cliente cliente, Usuario usuario, int id, double precoTotal, Servico[] servico,
            String anotacoes) {
        super(cliente, usuario, id, precoTotal);
        this.servico = servico;
        this.anotacoes = anotacoes;
    }

    public Servico[] getServico() {
        return servico;
    }

    public void setServico(Servico[] servico) {
        this.servico = servico;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
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
