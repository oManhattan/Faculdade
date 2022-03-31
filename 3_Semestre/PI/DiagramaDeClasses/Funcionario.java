public class Funcionario extends UsuarioGenerico {
    
    private String cargo;
    private String senha;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario(int id, String nome, String email, String documento, String cargo, String senha) {
        super(id, nome, email, documento);
        this.cargo = cargo;
        this.senha = senha;
    }

    /**
     * 
     * @return
     */
    private String criptografarSenha() {

        return null;
    }

    public void postFuncionario(Funcionario novoFuncionario) {

    }

    public void putFuncionario(Funcionario funcionarioAtualizado) {

    }

    public Funcionario getFuncionario() {

        return null;
    }

    public void deleteFuncionario() {

    }
}
