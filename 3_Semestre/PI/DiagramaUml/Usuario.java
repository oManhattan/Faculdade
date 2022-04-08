public abstract class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String documento;
    
    // Construtor

    public Usuario(int id, String name, String email, String senha, String documento) {
        this.id = id;
        this.nome = name;
        this.email = email;
        this.senha = senha;
        this.documento = documento;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    // Funções

    public boolean verificaDocumento() {
        return false;
    }

    public boolean verificaLogin() {
        return false;
    }
 
    public String criptografarSenha() {
        return null;
    }

    public void alterarSenha(String senhaAtual) {

    }

    public void esqueceuSenha(String emailCadastrado) {

    }
}
