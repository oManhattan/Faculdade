package exercicio03;

public class Assinante implements Observer{
    
    private String nome;

    public Assinante() {

    }

    public Assinante(String nome) {
        this.nome = nome;
    }

    public Assinante(String nome, Subject subject) {
        this.nome = nome;
        subject.addObserver(this);
    }

    @Override
    public void update(Object o) {
        System.out.printf("%s, temos uma nova receita: %s\n", getNome(), o.toString());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("%s", getNome());
    }
}

