public class Funcionario extends PessoaFisica {

    private int matricula;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, long cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return String.format("%s\tMatrícula: %d", super.toString(), getMatricula());
    }
}
