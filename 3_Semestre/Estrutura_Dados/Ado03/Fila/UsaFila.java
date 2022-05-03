import java.util.Scanner;

public class UsaFila {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Fila fila = new Fila();
        boolean isRunning = true;

        while (isRunning) {

            System.out.println(
                    "[ 1 ] - Enqueue | [ 2 ] - Dequeue | [ 3 ] - Show | [ 4 ] - Front | [ 5 ] - Size | [ 6 ] - Empty \t [ 7 ] - Sair\n");

            System.out.print("Escolha uma opção: ");

            int userInput = 0;

            try {
                userInput = input.nextInt();
            } catch (Exception e) {
                System.out.println("--> Valor inválido");
                continue;
            }

            switch (userInput) {
                case 1:
                    try {
                        System.out.print("Valor para ser inserido: ");
                        int valor = input.nextInt();
                        fila.enqueue(valor);
                        System.out.println("Valor inserido com sucesso.\n");
                    } catch (Exception e) {
                        System.out.println("Valor deve ser um número inteiro.");
                    }
                    break;
                case 2:
                    fila.dequeue();
                    break;
                case 3:
                    fila.show();
                    break;
                case 4:
                    System.out.println("--> Priemrio da fila: " + fila.front());
                    break;
                case 5:
                    System.out.println("--> Tamanho: " + fila.size());
                    break;
                case 6:
                    System.out.println(fila.empty());
                    break;
                case 7:
                    // Alguma coisa
                    break;
                default:
                    System.out.println("--> Opção não existe.");
            }
            System.out.println(" ");
        }

        input.close();
    }

}
