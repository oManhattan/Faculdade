package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Restaurante implements Subject {

    List<Observer> assinantes = new ArrayList<>();
    List<Component> receitas = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.assinantes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.assinantes.remove(observer);
    }

    @Override
    public void addReceita(Component component) {
        this.receitas.add(component);
        updateAll();
    }

    @Override
    public void removeReceita(Component component) {
        this.receitas.remove(component);
    }

    @Override
    public void updateAll() {
        for (Observer o : this.assinantes) {
            o.update(receitas.get(receitas.size() - 1));
        }
    }
}
