package POO_A_A03_MatheusCavalcantiDeArruda;

public abstract class Cliente {
    
    private final String firstName;
    private final String lastName;
    private final int id;
    
    public Cliente(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s %s\n%d", getFirstName(), getLastName(), getId());
    }
    
    public abstract String calcularEmprestimo();
}
