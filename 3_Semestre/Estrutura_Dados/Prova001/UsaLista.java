public class UsaLista {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Isabella", 10, 10);
        Aluno a2 = new Aluno("Arthur", 8, 9);
        Aluno a3 = new Aluno("Matheus", 6, 7);
        Aluno a4 = new Aluno("Vanessa", 8, 5);

        ListaSimples lista = new ListaSimples();

        lista.inserir(a1);
        lista.inserir(a2);
        lista.inserir(a3);
        lista.inserir(a4);
        
        // lista.exibirLista();

        System.out.println(lista.mediaGlobal());
    }
}
