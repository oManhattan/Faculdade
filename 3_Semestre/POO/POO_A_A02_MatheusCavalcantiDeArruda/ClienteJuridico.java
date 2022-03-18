package POO_A_A02_MatheusCavalcantiDeArruda;

public class ClienteJuridico extends Cliente{
    
    private String cnpj;
    private String nomeEmpresa;

    public ClienteJuridico(String nome, String email, double saldo, String cnpj, String nomeEmpresa) {
        super(nome, email, saldo);
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public String calculaEmprestimo() {
        return (getSaldo() < 0)? "Não pode pegar empréstimo" : "Você pode pegar um empréstimo de R$" + getSaldo() * 4.5;
    }

    @Override
    public String toString() {
        return "Tipo de cliente: Cliente Juridico" + 
        "\nNome: " + getNome() + 
        "\nE-mail: " + getEmail() + 
        "\nCNPJ: " + getCnpj() + 
        "\nNome Empresa: " + getNomeEmpresa() +
        "\nSaldo: R$" + getSaldo();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}
