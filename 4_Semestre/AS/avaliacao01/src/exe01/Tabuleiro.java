package exe01;

public class Tabuleiro {
    
    private static Tabuleiro tabuleiro;

    private Tabuleiro() {
        
    }

    public synchronized static Tabuleiro getTabuleiro() {
        if (tabuleiro == null) {
            tabuleiro = new Tabuleiro();
            System.out.println("Tabuleiro pronto.");
        }
        return tabuleiro;
    }
}
