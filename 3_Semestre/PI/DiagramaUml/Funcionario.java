public class Funcionario extends Usuario {
    
    private String cargo;

    public Funcionario(int id, String name, String email, String senha, String documento, String cargo) {
        super(id, name, email, senha, documento);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
