package Exercicio03;

public enum Organizador {
    BUBBLE(new Bubble()),
    INSERTION(new Insertion()),
    SELECTION(new Selection());

    private final Sorter sorter;

    private Organizador(Sorter sorter) {
        this.sorter = sorter;
    }

    public Sorter getSorter() {
        return sorter;
    }
}
