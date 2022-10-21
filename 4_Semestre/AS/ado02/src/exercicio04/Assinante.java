package exercicio04;

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
        System.out.printf("%s, temos uma nova nava: %s\n", getNome(), o.toString());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
