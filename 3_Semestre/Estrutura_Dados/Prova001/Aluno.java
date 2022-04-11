public class Aluno {

    private static long ura;

    private final String name;
    private double nota1;
    private double nota2;
    private double media;
    private final long ra;
    
    public Aluno(String name, double nota1, double nota2) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;

        this.ra = 2000 + ura++;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nRA: %d\nNota 1: %.2f\nNota 2: %.2f\nMedia: %.2f\n", getName(), getRa(), getNota1(), getNota2(), getMedia());
    }

    public String getName() {
        return name;
    }

    public double getNota1() {
        return nota1;
    }

    public long getRa() {
        return ra;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    private void setMedia() {
        this.media = (this.getNota1() * 0.3) + (this.getNota2() * 0.7);
    }

    public double getMedia() {
        setMedia();
        return media;
    }
}