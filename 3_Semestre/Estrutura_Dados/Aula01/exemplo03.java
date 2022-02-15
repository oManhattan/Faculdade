package Aula01;

import java.util.Scanner;

public class exemplo03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Aluno[] listaAlunos = new Aluno[2];

        for (int i = 0; i < listaAlunos.length; i++) {

            listaAlunos[i] = new Aluno();

            System.out.print("Nome: ");
            listaAlunos[i].setNome(sc.nextLine());

            System.out.print("Idade: ");
            listaAlunos[i].setIdade(Integer.parseInt(sc.nextLine()));

            System.out.print("Curso: ");
            listaAlunos[i].setCurso(sc.nextLine());

            System.out.println("");
        }

        sc.close();

        for (Aluno a : listaAlunos) {
            a.imprimirDados();
        }
    }
}
