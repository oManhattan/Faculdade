public class Impar extends Thread {
    
    @Override
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(String.format("%d é ímpar.", i));
        }
        
        System.out.println("Fim dos ímpares.");
    }
}
