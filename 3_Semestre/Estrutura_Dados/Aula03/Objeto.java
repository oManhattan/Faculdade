package Aula03;

public class Objeto {
    public static void main(String[] args) {

        Objeto o1 = new Objeto();
        Objeto o2 = new Objeto();
        Objeto o3;

        o3 = o1 = o2;

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }
}