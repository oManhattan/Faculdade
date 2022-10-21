package exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Agencia implements Subject {

    List<Observer> assinantes = new ArrayList<>();
    List<String> vagas = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.assinantes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.assinantes.remove(observer);
    }

    @Override
    public void addVaga(String vaga) {
        this.vagas.add(vaga);
        updateAll();
    }

    @Override
    public void removeVaga(String vaga) {
        this.vagas.remove(vaga);
    }

    @Override
    public void updateAll() {
        for (Observer o : this.assinantes) {
            o.update(vagas.get(vagas.size() - 1));
        }
    }
}
