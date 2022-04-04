package POO_A_A03_MatheusCavalcantiDeArruda;

public class ClienteFisico extends Cliente {
    
    private String email;
    private String cpf;
    private double saldo;
    
    public ClienteFisico(String firstName, String lastName, int id, String email, String cpf, double saldo) {
        super(firstName, lastName, id);
        this.email = email;
        this.cpf = cpf;
        this.saldo = saldo;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String calcularEmprestimo() {
        
        return String.format("O valor disponível para empréstimo é: %.2f", (getSaldo() * 1.3));
    }

    @Override
    public String toString() {
        return String.format("id: %d\nnome: %s %s\nCPF: %s\nemail: %s\nsaldo: %.2f", getId(), getFirstName(), getLastName(), getCpf(), getEmail(), getSaldo());
    }
}
