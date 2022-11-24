package ArvoreBinaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natanrodrigues
 */

public class No {
    private Object objeto; //objeto generico // valor do nó
    private No esquerda, direita; //apontará coisas do tipo No // uma lista
    // chave do nó

    public No(Object objeto, No esquerda, No direita) {
        this.objeto = objeto;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

//    @Override
//    public String toString() {
//        return "No{" + "objeto=" + objeto + ", esquerda=" + esquerda + ", direita=" + direita + '}';
//    }
//    
}
