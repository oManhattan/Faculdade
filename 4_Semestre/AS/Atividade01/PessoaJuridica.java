public class PessoaJuridica extends Pessoa {

    private long cnpj;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, long cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return String.format("%s\tCNPJ: %d", super.toString(), getCnpj());
    }
}
