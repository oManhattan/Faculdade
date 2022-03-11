public class Operacoes {

    private static Livro[] lista = new Livro[1];
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

        for (int i = 0; i < n; i++) {
            if (lista[i].getId() == id) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            for (int i = indice; i < n; i++) {
                lista[i] = lista[i + 1];
            }

            n--;
        }
    }

    /**
     * Organiza o array por titulo
     */
    public static void sortByTitulo() {
        mergeString(0, n, lista);
    }

    /**
     * Busca o índice do primeiro título encontrado de forma binária. Portanto é
     * necessário organizar o Array utilizando a função sortByTitle()
     * 
     * @param s título que deseja se encontrado
     * @return retorna uma String concendo o número do índice encontrado ou -1 caso não encontre nenhum
     *         resultado, id, autor, titulo e preco.
     */
    public static String searchTitle(String s) {
        return binarySearch(s, 0, lista.length - 1);
    }

    private static String binarySearch(String s, int low, int high) {
        if (low > high) {
            return "-1";
        }

        int mid = (low + high) / 2;
        
        if (lista[mid].getTitulo().compareToIgnoreCase(s) < 0) {
            return binarySearch(s, mid + 1, high);
        } else if (lista[mid].getTitulo().compareToIgnoreCase(s) > 0) {
            return binarySearch(s, low, mid - 1);
        } else {
            return Integer.toString(mid) + ", " + lista[mid].toString();
        }
    }

    /**
     * Adiciona mais esapaço ao array para adicionar mais Livro()
     * 
     * @return
     */
    private static Livro[] alocarNovoArray() {
        Livro[] novaLista = new Livro[lista.length + 4];
        System.arraycopy(lista, 0, novaLista, 0, lista.length);
        return novaLista;
    }

    private static void mergeString(int inicio, int tamanho, Livro[] vetor) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeString(inicio, meio, vetor);
            mergeString(meio, tamanho, vetor);
            intercalarString(inicio, meio, tamanho, vetor);
        }
    }

    private static void intercalarString(int inicio, int meio, int tamanho, Livro[] vetor) {
        int i;
        int j;
        int k;

        Livro[] aux = new Livro[tamanho - inicio];

        i = inicio;
        j = meio;
        k = 0;

        while (i < meio && j < tamanho) {
            if (vetor[i].getTitulo().compareToIgnoreCase(vetor[j].getTitulo()) <= 0) {
                aux[k] = vetor[i];
                k++;
                i++;
            } else {
                aux[k] = vetor[j];
                k++;
                j++;
            }
        }

        while (i < meio) {
            aux[k] = vetor[i];
            k++;
            i++;
        }

        while (j < tamanho) {
            aux[k] = vetor[j];
            k++;
            j++;
        }

        for (i = inicio; i < tamanho; i++) {
            vetor[i] = aux[i - inicio];
        }
    }

}
