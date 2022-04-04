public class Lista {
    private Elemento inicio = null, atual, aux;

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

    public void exibir() {
        Elemento x = inicio;
        while (x != null) {
            System.out.println(x.getObjeto());
            x = x.getProx();
        }
    }

    /**
     * Pesquisa objetos da lista ligada simples
     * 
     * @param id
     * @return Objeto Carro
     */
    public Object retornaCarro(int id) {
        Elemento x = inicio;

        while (x != null) {
            Carro y = (Carro) x.getObjeto();
            if (y.getId() == id) {
                // System.out.println(String.format("\nMarca: %s | Modelo: %s | Ano: %d | ID:
                // %d", y.getMarca(), y.getModelo(), y.getAno(), y.getId()));
                // v = false;
                return y;

            }
            x = x.getProx();
        }
        return String.format("\nO carro com o ID %d não existe", id);
        // System.out.println(String.format("\nO carro com o ID %d não existe", id));
    }

    public boolean remover(int id) {
        Elemento[] v = pesquisarRemove(id);
        if (v != null) { // Verifica se achou o elemento que quer remover
            Elemento x = v[0];
            Elemento auxRemove = v[1];
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
        } else {
            return false;
        }

    }

    private Elemento[] pesquisarRemove(int id) {
        Elemento x = inicio, auxRem = null;
        Elemento[] v = { x, auxRem };
        Carro c;
        while (x != null) {
            c = (Carro) x.getObjeto();
            if (id == c.getId()) {
                v[0] = x;
                v[1] = auxRem;
                return v;
            }
            auxRem = x;
            x = x.getProx();
        }
        return null;
    }

    // Inner Class
    private class Elemento {

        private Object objeto;
        private Elemento prox;

        public Elemento(Object objeto, Elemento prox) {
            this.objeto = objeto;
            this.prox = prox;
        }

        public Object getObjeto() {
            return objeto;
        }

        public void setObjeto(Object objeto) {
            this.objeto = objeto;
        }

        public Elemento getProx() {
            return prox;
        }

        public void setProx(Elemento prox) {
            this.prox = prox;
        }

        @Override
        public String toString() {
            return "Elemento [objeto=" + objeto + ", prox=" + prox + "]";
        }

    }
}
