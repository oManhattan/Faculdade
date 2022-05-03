public class Fila {
    
    private Elemento inicio = null, atual, aux;

    public void enqueue(Object objeto) {

        if (inicio == null) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
            atual = inicio;
            System.out.println("--> Valor adicionado com sucesso.");
            return;
        }

        atual = new Elemento(objeto, null, aux);
        aux.setProximo(atual);
        aux = atual;
        System.out.println("--> Valor adicionado com sucesso.");
    }

    public void show() {
        if (inicio == null) {
            System.out.println("--> Não possui itens para imprimir.");
            return;
        }

        Elemento x = inicio;

        System.out.print("--> [");
        while (x != null) { 

            System.out.print(x.getObjeto());

            if (x != atual) {
                System.out.print(", ");
            }

            x = x.getProximo();
        }
        System.out.println("]");
    }

    public void dequeue() {
        if (inicio == null) {
            System.out.println("--> Não há itens para remover.");
            return;
        }

        if (inicio == atual) {
            inicio = null;
            System.out.println("--> Valor removido com sucesso.");
            return;
        }

        inicio = inicio.getProximo();
        inicio.setAnterior(null);
        System.out.println("--> Valor removido com sucesso.");
    }

    public boolean empty() {
        if (inicio == null) {
            return true;
        }

        return false;
    }

    public String front() {
        if (inicio == null) {
            return "--> A fila não possui itens.";
        }

        return inicio.toString();
    }

    public int size() {

        if (inicio == null) {
            return 0;
        }

        Elemento x = inicio;
        int count = 0;

        while (x != null) {
            count++;
            x = x.getProximo();
        }

        return count;
    }

    private class Elemento {
        private Object objeto;
        private Elemento proximo;
        private Elemento anterior;
        
        public Elemento(Object objeto, Fila.Elemento proximo, Fila.Elemento anterior) {
            this.objeto = objeto;
            this.proximo = proximo;
            this.anterior = anterior;
        }

        @Override
        public String toString() {
            return objeto.toString();
        }

        public Object getObjeto() {
            return objeto;
        }

        public void setObjeto(Object objeto) {
            this.objeto = objeto;
        }

        public Elemento getProximo() {
            return proximo;
        }

        public void setProximo(Elemento proximo) {
            this.proximo = proximo;
        }

        public Elemento getAnterior() {
            return anterior;
        }

        public void setAnterior(Elemento anterior) {
            this.anterior = anterior;
        }
    }
}
