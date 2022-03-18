package POO_A_A02_MatheusCavalcantiDeArruda;

public class Cliente {
    
    private String nome;
    private String email;
    private double saldo;

    public Cliente(String nome, String email, double saldo) {
        this.nome = nome;
        this.email = email;
        this.saldo = saldo;
    }

    public String calculaEmprestimo() {
        return "";
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
}
