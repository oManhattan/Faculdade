package exe04;

public class UsaGame {
    
    public static void teste() {
        ControlaAcoes controle = new ControlaAcoes();

        controle.correr();
        controle.esperar();
        for (int i = 0; i < 15; i++) {
            controle.abaixar();
            controle.pular();
        }
        controle.correr();
        controle.correr();
        controle.esperar();
    }

}
