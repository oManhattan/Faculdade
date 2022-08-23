public class Par extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(String.format("%d é par.", i));
        }
        
        System.out.println("Fim dos pares.");
    }

}