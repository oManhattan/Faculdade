package Exercicio01;

public class Singleton {
    
    private static Singleton singleton = new Singleton();

    public Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }
}