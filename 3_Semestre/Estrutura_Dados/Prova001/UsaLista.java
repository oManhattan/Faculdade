public class UsaLista {
    public static void main(String[] args) {

        // Criando alunos
        Aluno a1 = new Aluno("Boseuwel", 10, 8.9);
        Aluno a2 = new Aluno("Xabierpu", 2.7, 3.8);
        Aluno a3 = new Aluno("Wudaguce", 5.9, 1.4);
        Aluno a4 = new Aluno("Ceisusle", 3.5, 8.2);
        Aluno a5 = new Aluno("Puymilyo", 1.6, 3.1);
        Aluno a6 = new Aluno("Feahivor", 5.2, 5.8);
        Aluno a7 = new Aluno("Maylazun", 10, 2.7);
        Aluno a8 = new Aluno("Mufyakou", 2.9, 1.1);
        Aluno a9 = new Aluno("Ravotupa", 8.1, 4.9);
        Aluno a10 = new Aluno("Fiawoier", 4.5, 9.5);

        // Criar a lista encadeada
        ListaSimples lista = new ListaSimples();

        // Adicionando alguns alunos na forma padrão
        // lista.inserir(a1);
        // lista.inserir(a2);
        // lista.inserir(a3);
        // lista.inserir(a4);
        // lista.inserir(a5);
        // lista.inserir(a6);

        // Adicionando o restante na primeira posição
        lista.inserirPrimeiro(a7);
        // lista.inserirPrimeiro(a8);
        // lista.inserirPrimeiro(a9);
        // lista.inserirPrimeiro(a10);

        System.out.println("Imprimindo todos os alunos\n");
        // Imprimindo todos os alunos
        lista.exibirLista();

        // System.out.println("=================\nRemovendo o aluno com RA 2008 e reimprimindo a lista\n");

        // Aluno de RA 2008 foi expulso
        // lista.remover(2008);

        // Exibindo o restante dos alunos
        // lista.exibirLista();

        // System.out.println("=================\nMédia global com o contador de alunos abaixo e acima da própria\n");
        // Relatório estatístico de todos os alunos
        // System.out.println(lista.mediaGlobal());
    }
}
