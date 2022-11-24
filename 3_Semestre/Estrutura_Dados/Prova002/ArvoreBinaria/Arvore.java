package ArvoreBinaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natanrodrigues
 */

public class Arvore {
    private No raiz = null;
    private Lista lista = new Lista();

    public No getRaiz() {
        return raiz;
    }

    public void inserir(Object objeto) { //vai receber o valor que será inserido 
        No novoNo = new No(objeto, null, null); //instancia o No para ser o primeiro da arvore (raiz) e depois fazer as comparaçoes  
        //(objeto, esquerda nula e direita nula) 
        if (raiz == null) { //se a arvore estiver vazia
            raiz = novoNo; //insere na raiz 
        } else {
            inserir(novoNo, raiz);
        }

    }

    private void inserir(No novoNo, No x) { // x = raiz 
        int valor = (int) novoNo.getObjeto(); //cast
        int atual = (int) x.getObjeto(); //cast (conversao do x para int)
        if (valor < atual) {
            if (x.getEsquerda() == null) { //x é o atual la no No - verifica se a esquerda esta vazia 
                x.setEsquerda(novoNo); //recebe o objeto como parametro e insere na esquerda 
            } else {
                inserir(novoNo, x.getEsquerda()); //vai mais a esquerda para poder inserir o novoNo
            }
        } else {
            if (x.getDireita() == null) { //verifica se a direita esta vazia 
                x.setDireita(novoNo); //insere na direito o novoNo
            } else {
                inserir(novoNo, x.getDireita()); //vai mais a direita para poder inserir o novoNo
            }
        }
    }

    public Lista ordem(No x) { //x = raiz
        if (x != null) {
            ordem(x.getEsquerda()); //percorre a subarvore a esquerda
            // System.out.print(x.getObjeto() + " "); //visita o nó da raiz 
            lista.inserir(x.getObjeto());
            ordem(x.getDireita());
        }

        return lista;
    }

    public void verificaFolha(No x) {
        if (x != null) {
            verificaFolha(x.getEsquerda());
            System.out.println(String.format("O nó %d %s", x.getObjeto(), (isFolha(x)) ? "é folha" : "não é folha"));
            verificaFolha(x.getDireita());
        }
    }

    private boolean isFolha(No x) {
        if (x.getDireita() == null && x.getEsquerda() == null) {
            return true;
        }

        return false;
    }

    public void preOrdem(No x) {
        if (x != null) {
            System.out.print(x.getObjeto() + " "); //visita o nó da raiz 
            preOrdem(x.getEsquerda());
            preOrdem(x.getDireita());
        }
    }

    public void posOrdem(No x) {
        if (x != null) {
            posOrdem(x.getEsquerda());
            posOrdem(x.getDireita());
            System.out.print(x.getObjeto() + " "); //visita o nó da raiz 
        }
    }

    public void percurso(No x, Tipo tipo) {
        if (x != null) {
            if (tipo.equals(Tipo.PRE)) {
                System.out.print(x.getObjeto() + " ");
            }
            percurso(x.getEsquerda(), tipo);
            if (tipo.equals(Tipo.ORDEM)) {
                System.out.print(x.getObjeto() + " ");
            }
            percurso(x.getDireita(), tipo);
            if (tipo.equals(Tipo.POS)) {
                System.out.print(x.getObjeto() + " ");
            }
        }
    }

    public No buscar(int vb, No x) { //recebe o valor de busca e o nó da arvore (x)
        if (x != null) {
            
            int vx = (int) x.getObjeto(); //converte o valor do x   
            if (vb == vx) {
                return x; //retorna a posição do x ATUAL 
            } else {
                if (vb < vx) {  //vai para esquerda
                    return buscar(vb, x.getEsquerda()); //chama o método que vai retornar o endereço do nó  
                } else {  //vai para direita 
                    return buscar(vb, x.getDireita()); //chama o método que vai retornar o endereço do nó  
                }
           }
        }
       return null;
    }
}
