

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
    public void exibirLista() {
        Elemento x = inicio;

        while (x != null) {
            Aluno a = (Aluno) x.getObjeto();
            System.out.println(a.toString());
            x = x.getProx();
        }
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

    private double getMediaGlobal() {
        int contador = 0;
        double mediaTotal = 0;

        Elemento x = inicio;

        while (x != null) {
            Aluno a = (Aluno) x.getObjeto();
            
            mediaTotal += a.getMedia();
            contador++;

            x = x.getProx();
        }

        return mediaTotal / contador;
    }

    public String mediaGlobal() {
        
        double mediaTotal = getMediaGlobal();

        int acima = 0;
        int abaixo = 0;

        Elemento e = inicio;

        while (e != null) {
            Aluno a = (Aluno) e.getObjeto();

            if (a.getMedia() >= mediaTotal) {
                acima++;
            } else {
                abaixo++;
            }

            e = e.getProx();
        }

        return String.format("Média Global: %.2f\nAlunos igual ou acima: %d\nAlunos abaixo: %d", mediaTotal, acima, abaixo);
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
