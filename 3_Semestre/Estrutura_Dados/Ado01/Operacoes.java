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
            for (int i = indice; i < n - 1 ; i++) {
                lista[i] = lista[i + 1];
            }

            n--;
        }
    }

    /**
     * Organiza o array pelo id de cada livro
     */
    public static void sortById() {
        mergeSort(0, lista.length, lista);
    }

    /**
     * Organiza o array em ordem alfabética e por autor
     */
    public static void sortByTitle() {
        mergeString(0, lista.length, lista);
    }

    private static Livro[] alocarNovoArray() {
        Livro[] novaLista = new Livro[lista.length + 4];
        System.arraycopy(lista, 0, novaLista, 0, lista.length);
        return novaLista;
    }

    private static void mergeSort(int inicio, int tamanho, Livro[] vetor) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, vetor);
            mergeSort(meio, tamanho, vetor);
            intercalarString(inicio, meio, tamanho, vetor);
        }
    }

    private static void mergeString(int inicio, int tamanho, Livro[] vetor) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, vetor);
            mergeSort(meio, tamanho, vetor);
            intercalar(inicio, meio, tamanho, vetor);
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

        while(i < meio && j < tamanho) {
            if(vetor[i].getTitulo().compareToIgnoreCase(vetor[j].getTitulo()) <= 0) {
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

    private static void intercalar(int inicio, int meio, int tamanho, Livro[] vetor) {
        int i;
        int j;
        int k;

        Livro[] aux = new Livro[tamanho - inicio];

        i = inicio;
        j = meio;
        k = 0;

        while (i < meio && j < tamanho) {
            if (vetor[i].getId() <= vetor[j].getId()) {
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
