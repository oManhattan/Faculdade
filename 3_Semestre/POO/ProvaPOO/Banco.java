package ProvaPOO;

import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {
        
        ArrayList<ClienteFisico> lista = criarCliente();
        exibirClientes(lista);
    }

    private static ArrayList<ClienteFisico> criarCliente() {
        
        ArrayList<ClienteFisico> lista = new ArrayList<ClienteFisico>();

        lista.add(new ClienteFisico(001, "Bruno", "bruno@email.com", "123.123.123-12", "23.234.234-2"));
        lista.add(new ClienteJuridico(002, "Gustvo", "gustavo@mail.com", "123.123.123-12", "45.456.456-4", "Gustavo Enterprise", "12.123.123/1000-12"));

        return lista;
    }

    private static void exibirClientes(ArrayList<ClienteFisico> list) {

        System.out.println("==================\n");
        for (ClienteFisico c : list) {
            System.out.println(c.toString() + "\n");
            System.out.println("==================\n");
        }
    }
}
