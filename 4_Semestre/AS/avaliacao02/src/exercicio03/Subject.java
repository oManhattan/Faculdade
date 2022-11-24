package exercicio03;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);

    public void addReceita(Component component);
    public void removeReceita(Component component);

    public void updateAll();
}
