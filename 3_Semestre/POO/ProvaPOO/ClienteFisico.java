package ProvaPOO;

public class ClienteFisico {
 
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String rg;
    private double saldo;

    // Funções
    public String chequeEspecial() {
        return String.format("%s, com a sua conta física você pode pegar o cheque especial de até R$2.f", getNome(), (getSaldo() * 0.47) + 200);
    }

    private boolean verificarEmprestimo() {
        if (getSaldo() < 2000) {
            return false;
        }

        return true;
    }

    public String emprestimo() {

        if (verificarEmprestimo()) {
            return String.format("O cliente possui a possibilidade de empréstimo de até R$%.2f", getSaldo() * 2.7);
        }

        return "O cliente não possui elegibilidade para empréstimo.";
    } 

    // toString
    @Override
    public String toString() {
        return String.format("Nome: %s\nCPF: %s\nSaldo: %.2f", getNome(), getCpf(), getSaldo());
    }

    // Construtor
    public ClienteFisico(int id, String nome, String email, String cpf, String rg) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
    }

    // Getters & Setters
    
    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String cnpj) {
        this.rg = cnpj;
    }
}
