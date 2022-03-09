public class Operacoes {

    private static Livro[] lista = new Livro[5];
    private static int n = 0;

    /**
     * Insere um objeto Livro() no array de Livro[]
     * 
     * @param livro Objeto Livro()
     */
    public static void inserir(Livro livro) {
        if (n == lista.length) {
            lista = alocarNovoArray();
        }

        lista[n] = new Livro();
        lista[n] = livro;
        n++;
    }

    /**
     * Itera todos os itens no array de Livro[]
     */
    public static void mostrar() {

        for (int i = 0; i < n; i++) {
            System.out.println(lista[i].toString());
        }
    }

    /**
     * Remove o primeiro objeto Livro() encontrado no array Livro()[]
     * 
     * @param id id do Livro()
     */
    public static void remover(int id) {
        int indice = -1;

        for (int i = 0; i < n - 1; i++) {
            if (lista[i].getId() == id) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            for (int i = indice; i < n - 1; i++) {
                lista[i] = lista[i + 1];
            }

            n--;
        }
    }

    private static Livro[] alocarNovoArray() {
        Livro[] novaLista = new Livro[lista.length + 4];
        System.arraycopy(lista, 0, novaLista, 0, lista.length);
        return novaLista;
    }

}
