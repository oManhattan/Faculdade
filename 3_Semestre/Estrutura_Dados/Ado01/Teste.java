public class Teste {
    public static void main(String[] args) {
        String a = "Arthur";
        String b = "Matheus";

        System.out.println("Arthur compara com Matheus:\n" + a.compareTo(b) + "\n");
        System.out.println("Arthur compara com Arthur\n" + a.compareTo(a) + "\n");
        System.out.println("Matheus compara com Arthur\n" + b.compareTo(a) + "\n");

        // Se o valor de início for maior (viear antes no alfabeto) que o parametro, retornará um valor negativo

        // Se o valor de início for igual ao parametro, retornará 0
        
        // Se o valor de início for menor (for depois no alfabeto) que o parametro, retornará um valor positivo

    }
}
