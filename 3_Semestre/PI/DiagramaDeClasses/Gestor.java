public class Gestor extends Funcionario {
    
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    private boolean isMaster;
    
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public boolean isMaster() {
        return isMaster;
    }
    public void setMaster(boolean isMaster) {
        this.isMaster = isMaster;
    }
    public Gestor(int id, String nome, String email, String documento, String cargo, String senha, String logradouro,
            String numero, String complemento, String cidade, String estado, String cep, boolean isMaster) {
        super(id, nome, email, documento, cargo, senha);
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.isMaster = isMaster;
    }

    @Override
    public void deleteFuncionario() {

    }
    @Override
    public Funcionario getFuncionario() {
        return null;
    }
    @Override
    public void postFuncionario(Funcionario novoFuncionario) {

    }
    @Override
    public void putFuncionario(Funcionario funcionarioAtualizado) {

    }
}
