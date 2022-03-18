package POO_A_A02_MatheusCavalcantiDeArruda;

import java.util.ArrayList;

public class Principal {

    ArrayList<Cliente> clientes;

    public static void main(String[] args) {
    
        Principal p = new Principal();

        p.carregarClientes();
        p.verificarEmprestimos();

    }

    public void carregarClientes() {
        clientes = new ArrayList<Cliente>();

        clientes.add(new ClienteFisico("Claudio", "claudio@email.com", 4000, "123.123.123-12", "12.123.123-1"));
        clientes.add(new ClienteFisico("Roberto", "roberto@email.com", -150, "321.321.321-32", "32.321.321-3"));
        clientes.add(new ClienteJuridico("Felipe", "felipe@email.com", 15000, "45.456.456/0001-45", "InfoPel"));
        clientes.add(new ClienteJuridico("Vitor", "vitor@email.com", 70000, "98.987.987/0001-98", "PixPel"));

        System.out.printf("Clientes carregados: %d", clientes.size());
    }

    public void verificarEmprestimos() {
        for (Cliente c : clientes) {
            System.out.println(c.toString());
            System.out.println(c.calculaEmprestimo());
            System.out.println("");
        }
    }
}
