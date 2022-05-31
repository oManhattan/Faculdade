package ArvoreBinaria;

public class Lista {
    
    private Object[] lista = new Object[10];
    private int posicao = 0;

    public void imprimirLista() {
        for (Object o : lista) {
            if (o != null) {
                System.out.println(o);
            }
        }
    }

    public void inserir(Object object) {
        
        if(posicao == lista.length - 1) {
            lista = alocarEspaco();
        }

        lista[posicao] = object;
        posicao++;
    }

    private Object[] alocarEspaco() {
        Object[] aux = new Object[lista.length * 2];
        System.arraycopy(lista, 0, aux, 0, lista.length);
        return aux;
    }
}
