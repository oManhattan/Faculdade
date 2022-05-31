package ProvaPOO;

public class ClienteJuridico extends ClienteFisico {
    
    String nomeEmpresa;
    String cnpj;

    // Funções
    
    @Override
    public String chequeEspecial() {
        return String.format("%s, com a sua conta jurídica você pode pegar o cheque especial de até $.2f", getNome(), (getSaldo() * 0.67) + 1000);
    }

    @Override
    public String emprestimo() {
        return String.format("O cliente possui uma possibilidade de empréstimo de até R$$.2f", getSaldo() * 3.6 + 1000);
    }

    // toString
    

    // Construtor
    public ClienteJuridico(int id, String nome, String email, String cpf, String rg, String nomeEmpresa,
            String cnpj) {
        super(id, nome, email, cpf, rg);
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return String.format("%s\n\nEmpresa: %s\nCNPJ:%s", super.toString(), getNomeEmpresa(), getCnpj());
    }

    // Getters & Setters
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
