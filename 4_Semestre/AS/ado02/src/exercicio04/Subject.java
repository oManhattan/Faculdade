package exercicio04;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);

    public void addVaga(String vaga);
    public void removeVaga(String vaga);

    public void updateAll();
}
