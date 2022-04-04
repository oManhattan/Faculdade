package POO_A_A03_MatheusCavalcantiDeArruda;

public class Principal {
    
    public static Cliente[] preencher() {
        Cliente[] lista = new Cliente[4];

        lista[0] = new ClienteFisico("cliente", "fisico01", 1, "clientefisico01@email.com", "111.111.111-11", 300.00);
        
        lista[1] = new ClienteFisico("cliente", "fisico02", 2, "clientefisico02@email.com", "222.222.222-22", 1700.00);
        
        lista[2] = new ClienteJuridico("cliente", "juridico01", 3, "empresa01@email.com", "333.333.333-33", 5300.00, "empresa01", "33.333.333/0001-33");
        
        lista[3] = new ClienteJuridico("cliente", "juridico02", 4, "empresa02@email.com", "444.444.444-44", 13500.00, "empresa02", "44.444.444/0001-44");

        return lista;
    }

    public static void verificarEmprestimo(Cliente[] lista) {
        for (Cliente i : lista) {
            System.out.println(i.calcularEmprestimo());
        }
    }

    public static void main(String[] args) {
        Cliente[] lista = preencher();
        verificarEmprestimo(lista);
    }
}
