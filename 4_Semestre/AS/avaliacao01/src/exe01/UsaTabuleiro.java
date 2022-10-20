package exe01;

public class UsaTabuleiro extends Thread {

    @Override
    public void run() {
        Tabuleiro t = Tabuleiro.getTabuleiro();
        System.out.println(t);
    }

    public static void teste() {

        UsaTabuleiro t1 = new UsaTabuleiro();
        UsaTabuleiro t2 = new UsaTabuleiro();
        UsaTabuleiro t3 = new UsaTabuleiro();

        t1.start();
        t2.start();
        t3.start();
    }
}
