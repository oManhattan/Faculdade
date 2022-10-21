import exercicio02.Pedido;
import exercicio02.SeparacaoState;
import exercicio04.Agencia;
import exercicio04.Assinante;
import exercicio04.Observer;
import exercicio04.Subject;

public class App {
    public static void main(String[] args) {
        // testeState();
        testeObserver();
    }

    public static void testeState() {

        Pedido pedido = new Pedido(1, new SeparacaoState());

        for (int i = 0; i < 4; i++) {
            pedido.atualState();
            pedido.proxState();
        }
        
    }

    public static void testeObserver() {

        Subject agencia = new Agencia();
        Observer assinante1 = new Assinante("Gerson", agencia);
        agencia.addVaga("Desenvolvedor Full Stack");
        agencia.addVaga("Desenvolvedor Python Sênior");
        Observer assinante2 = new Assinante("Tozeti", agencia);
        agencia.addVaga("Desenvolvedor Java Pleno");
        
    }
}
