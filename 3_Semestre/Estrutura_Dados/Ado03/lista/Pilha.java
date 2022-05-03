public class Pilha {
    
    private Elemento inicio = null, atual, aux;

    public void push(Object objeto) {
        if (inicio == null) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProximo(atual);
            aux = atual;
        }

        System.out.println("--> Valor adicionado com sucesso\n");
    }

    public void show() {
        
        if (inicio == null) {
            System.out.println("--> Não possui itens para imprimir");
            return;
        }

        Elemento x = atual;

        System.out.print("--> [");
        while (x != null) {
            System.out.print(x.getObjeto());

            if (x == inicio) {
                System.out.print("");
            } else {
                System.out.print(", ");
            }

            x = x.getAnterior();
        }
        System.out.println("]");
    }

    public void pop() {
        
        if (inicio == null) {
            System.out.println("--> Não há itens para remover");
            return;
        }

        if (inicio == aux) {
            inicio = null;
            System.out.println("--> Valor removido com sucesso\n");    
            return;
        }

        aux = atual.getAnterior();
        atual = aux;
        atual.setProximo(null);

        System.out.println("--> Valor removido com sucesso\n");
    }

    public boolean empty() {
        if (inicio == null) {
            return true;
        }

        return false;
    }

    public String top() {

        if (inicio == null) {
            return "A lista não possui itens.";
        }

        return atual.toString();
    }

    public int count() {

        if (inicio == null) {
            return 0;
        }

        Elemento x = inicio;
        int contador = 0;

        while (x != null) {
            contador++;
            x = x.getProximo();
        }

        return contador;
    }

    private class Elemento {

        private Object objeto;
        private Elemento proximo;
        private Elemento anterior;

        @Override
        public String toString() {
            return objeto.toString();
        }

        public Elemento(Object objeto, Pilha.Elemento proximo, Pilha.Elemento anterior) {
            this.objeto = objeto;
            this.proximo = proximo;
            this.anterior = anterior;
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
