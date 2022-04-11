import java.util.ArrayList;

public class ListaSimples {

    private Elemento inicio = null, atual, aux;

    /**
     * Adiciona um Aluno na lista
     */
    public void inserir(Object objeto) {

        if (inicio == null) {
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    /**
     * Retorna um array de objeto com todos os alunos inseridos na lista
     */
    public Object[] exibirLista() {
        Elemento x = inicio;
        ArrayList<Object> lista = new ArrayList<Object>();

        while (x != null) {
            lista.add(x.getObjeto());
            x = x.getProx();
        }

        return lista.toArray();
    }

    /**
     * Retorna o aluno com o RA informado.
     * Caso o RA não seja encontrado uma mensagem de erro é enviada 
     */
    public Object retornaAluno(long ra) {
        Elemento x = inicio;

        while (x != null) {
            Aluno a = (Aluno) x.getObjeto();

            if (a.getRa() == ra) {
                return a;
            }

            x = x.getProx();
        }

        return String.format("O aluno com o RA %d não foi encontrado.", ra);
    }

    private Elemento[] removeSearch(long ra) {
        Elemento x = inicio, auxRem = null;
        Elemento[] v = {x, auxRem};
        Aluno a;

        while (x != null) {
            a = (Aluno) x.getObjeto();

            if (ra == a.getRa()) {
                v[0] = x;
                v[1] = auxRem;
                return v;
            }

            auxRem = x;
            x = x.getProx();
        }

        return null;
    }

    public boolean remover(long ra) {
        Elemento[] arr = removeSearch(ra);

        if (arr != null) {
            Elemento x = arr[0];
            Elemento auxRemove = arr[1];

            if (x == inicio) {
                inicio = x.getProx();
                x.setProx(null);
                return true;
            } else if (x == atual) {
                atual = auxRemove;
                aux = auxRemove;
                auxRemove.setProx(null);
                return true;
            } else {
                auxRemove.setProx(x.getProx());
                x.setProx(null);
                return true;
            }
        }

        return false;
    }

    public String mediaGlobal() {
        int contador = 0;
        int abaixoMedia = 0;
        int acimaMedia = 0;
        double mediaTotal = 0;

        Elemento x = inicio;

        while (x != null) {
            Aluno a = (Aluno) x.getObjeto();

            if (a.getMedia() >= 6) {
                acimaMedia++;
            } else {
                abaixoMedia++;
            }
            
            mediaTotal += a.getMedia();
            contador++;

            x = x.getProx();
        }

        mediaTotal = mediaTotal / contador;

        return String.format("A média global é: %.2f\nAluno abaixo da média: %d\nAlunos acima da média: %d\n", mediaTotal, abaixoMedia, acimaMedia);
    }

    // Classe interna
    private class Elemento {

        private Object objeto;
        private Elemento prox;

        public Elemento(Object objeto, ListaSimples.Elemento prox) {
            this.objeto = objeto;
            this.prox = prox;
        }

        public Object getObjeto() {
            return objeto;
        }

        // public void setObjeto(Object objeto) {
        //     this.objeto = objeto;
        // }

        public Elemento getProx() {
            return prox;
        }

        public void setProx(Elemento prox) {
            this.prox = prox;
        }
    }
}
