package exercicio02;

@FunctionalInterface
public interface Ordenador<T> {
    
    public void ordenar(T[] array);

    public default void mostrar(T[] array) {
        String out = "";
        for (T t : array) {
            out += t + " ";
        }
        System.out.println(out);
    }
}
