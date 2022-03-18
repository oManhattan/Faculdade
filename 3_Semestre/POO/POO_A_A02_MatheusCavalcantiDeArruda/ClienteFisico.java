package POO_A_A02_MatheusCavalcantiDeArruda;

public class ClienteFisico extends Cliente{
    
    private String cpf;
    private String rg;

    public ClienteFisico(String nome, String email, double saldo, String cpf, String rg) {
        super(nome, email, saldo);
        this.cpf = cpf;
        this.rg = rg;
    }

    @Override
    public String calculaEmprestimo() {
        return (getSaldo() < 0)? "Não pode pegar empréstimo" : "Você pode pegar um empréstimo de R$" + getSaldo() * 2.3;
    }

    

    @Override
    public String toString() {
        return "Tipo de cliente: Cliente Fisico " + 
        "\nNome: " + getNome() +
        "\nE-mail: " + getEmail() +
        "\nCPF: " + getCpf() + 
        "\nRG: " + getRg() +
        "\nSaldo: " + getSaldo();
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

    public void setRg(String rg) {
        this.rg = rg;
    }
}
