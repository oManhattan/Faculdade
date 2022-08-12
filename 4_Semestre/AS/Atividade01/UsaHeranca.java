import java.util.ArrayList;
import java.util.List;

public class UsaHeranca {
    public static void main(String[] args) {
        
        List<Pessoa> lista = gerarPessoas();
        lista.forEach((pessoa) -> System.out.println(pessoa.toString()));
    }

    public static List<Pessoa> gerarPessoas() {

        List<Pessoa> lista = new ArrayList<>();

        lista.add(new PessoaFisica("Roberto", 123456789l));
        lista.add(new PessoaJuridica("Cleiton", 987654312l));
        lista.add(new Funcionario("Roberta", 438724129739834l, 157));

        return lista;
    }
}
