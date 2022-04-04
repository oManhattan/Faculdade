package POO_A_A03_MatheusCavalcantiDeArruda;

public class ClienteJuridico extends ClienteFisico {
    private String nomeEmpresa;
    private String cnpj;
    
    public ClienteJuridico(String firstName, String lastName, int id, String email, String cpf, double saldo,
            String nomeEmpresa, String cnpj) {
        super(firstName, lastName, id, email, cpf, saldo);
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }

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

    @Override
    public String calcularEmprestimo() {
        return String.format("O valor disponível para empréstimo é: %.2f", (getSaldo() * 1.7));
    }

    @Override
    public String toString() {
        return String.format("id: %d\nnome: %s %s\nnome empresa: %s\nCPF: %s\nCNPJ: %s\nemail: %s\nsaldo: %.2f", getId(), getFirstName(), getLastName(), getNomeEmpresa(), getCpf(), getCnpj(), getEmail(), getSaldo());
    }
}
