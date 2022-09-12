import java.util.ArrayList;
import java.util.List;

public class Regiao {
    
    private String nome;
    private List<Estado> estados = new ArrayList<>();

    public Regiao(String nome) {
        this.nome = nome;
    }

    public double getTotalPib() {
        double soma = 0;
        for (Estado estado : estados) {
            soma += estado.getPib();
        }
        return soma;
    }

    public void adicionarEstado(Estado estado) {
        this.estados.add(estado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
}
