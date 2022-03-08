import java.util.Arrays;
import java.util.Random;

public class MetodoQuick {
    public static void main(String[] args) {

    }

    public static int[] inserirValores(int quantidade) {

        int[] temp = new int[quantidade];
        Random rd = new Random();

        for (int i = 0; i < temp.length; i++) {
            temp[i] = rd.nextInt(100);
        }

        return temp;
    }

    
}
