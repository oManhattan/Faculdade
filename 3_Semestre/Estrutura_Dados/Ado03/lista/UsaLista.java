import java.util.Scanner;

public class UsaLista {

    public static void main(String[] args) {

        boolean runningProgram = true;
        Pilha lista = new Pilha();

        while (runningProgram) {

            System.out.print("\nEscolha uma opção:  ");
            System.out.print("[ 1 ] - Push |");
            System.out.print(" [ 2 ] - Pop |");
            System.out.print(" [ 3 ] - Empty |");
            System.out.print(" [ 4 ] - Count |");
            System.out.print(" [ 5 ] - Print |");
            System.out.print(" [ 6 ] - Top |");
            System.out.print(" [ 7 ] - End");

            Scanner input = new Scanner(System.in);

            int userInput = 0;

            try {
                System.out.print("\nEntrada: ");
                userInput = input.nextInt();
                System.out.println(" ");
            } catch (Exception e) {
                System.out.println("Valor informado é inválido. Por favor insira um valor inteiro\n");
                continue;
            }

            switch (userInput) {
                case 1:
                    System.out.print("Valor a ser inserido: ");

                    int valor = 0;

                    try {
                        valor = input.nextInt();
                        System.out.println(" ");
                    } catch (Exception e) {
                        System.out.println("--> Valor não inserido por ser inválido\n");
                    }

                    lista.push(valor);
                    break;
                case 2:
                    lista.pop();
                    break;
                case 3:
                    System.out.println("--> " + lista.empty() + "\n");
                    break;
                case 4:
                    System.out.println("--> Count: " + lista.count() + "\n");
                    break;
                case 5:
                    lista.show();
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("--> Top: " + lista.top());
                    break;
                case 7:
                    System.out.println("--> Programa encerrado");
                    runningProgram = false;
                    input.close();
            }
        }
    }
}
