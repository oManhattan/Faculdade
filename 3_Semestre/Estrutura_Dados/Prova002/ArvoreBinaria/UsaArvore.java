package ArvoreBinaria;

/**
 *
 * @author natanrodrigues
 */
public class UsaArvore {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        arvore.inserir(12);
        arvore.inserir(3);
        arvore.inserir(45);
        arvore.inserir(6);
        arvore.inserir(17);
        arvore.inserir(11);
        arvore.inserir(22);
        arvore.inserir(9);
        arvore.inserir(0);
        arvore.inserir(36);
        arvore.inserir(48);
        arvore.inserir(11);

        // arvore.verificaFolha(arvore.getRaiz());

        Lista lista = arvore.ordem(arvore.getRaiz());
        lista.imprimirLista();
    }
}
