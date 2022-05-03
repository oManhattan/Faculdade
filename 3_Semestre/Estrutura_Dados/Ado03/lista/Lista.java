public class Lista {

    private Elemento inicio = null, atual, aux;

    public void inserir(Object objeto) {
        if (inicio == null) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
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

    // public boolean remover(int id) {
    //     Object[] array = pesquisar(id);
    //     if (array != null) {
    //         Elemento rem = (Elemento) array[0];
    //         if (rem == inicio) {
    //             inicio=rem.getProx();
    //             rem.setProx(null);
    //             inicio.setAnt(null);
    //             //rem=null O elemento fica sem referência
    //         } else if (rem == atual) {
    //            atual=rem.getAnt();
    //            atual.setProx(null);
    //            rem.setAnt(null);
    //         } else {
    //            rem.getAnt().setProx(rem.getProx());
    //            rem.getProx().setAnt(rem.getAnt());
    //            rem.setProx(null);
    //            rem.setAnt(null);
    //         }
    //         return true;
    //     }
    //     return false;
    // }

    //Inner class
    private class Elemento {

        private Object objeto;
        private Elemento prox;
        private Elemento ant;

        public Elemento(Object objeto, Elemento prox, Elemento ant) {
            this.objeto = objeto;
            this.prox = prox;
            this.ant = ant;
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

        public Elemento getAnt() {
            return ant;
        }

        public void setAnt(Elemento ant) {
            this.ant = ant;
        }
    }

}
