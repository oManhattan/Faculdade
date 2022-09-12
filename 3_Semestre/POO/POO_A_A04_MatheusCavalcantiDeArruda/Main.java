import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nPIB POR ESTADO:\n");
        List<Estado> estados = lerEstados();
        calcularPorcentagemPibEstados(estados);
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        List<Regiao> regioes = lerRegioes(estados);
        escreverSaida(regioes);
    }

    public static List<Regiao> lerRegioes(List<Estado> estados) {
        BufferedReader reader = getReader("regioes.txt");
        List<Regiao> regioes = new ArrayList<>();
        String linha = "";
        int contador = 0;
        try {
            while((linha = reader.readLine()) != null) {
                Estado estado = filterEstado(linha, estados);
                if (estado == null && !linha.isEmpty()) {
                    regioes.add(new Regiao(linha));
                } else if (estado != null) {
                    regioes.get(contador).adicionarEstado(estado);
                }
                contador = (linha.isEmpty()) ? contador + 1 : contador;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return regioes;
    }

    public static List<Estado> lerEstados() {
        BufferedReader reader = getReader("pib.txt");
        List<Estado> estados = new ArrayList<>();
        String linha = "";
        try {
            while ((linha = reader.readLine()) != null) {
                String[] aux = linha.split(";");
                estados.add(new Estado(aux[0], Double.parseDouble(aux[1])));
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return estados;
    }

    public static double totalPibEstados(List<Estado> estados) {
        double soma = 0;
        for (Estado estado : estados) {
            soma += estado.getPib();
        }
        return soma;
    }

    public static String calcularPibRegioes(List<Regiao> regioes) {
        String out = "";
        for (Regiao regiao : regioes) {
            out += String.format("--> %s, PIB: %.2f\n", regiao.getNome(), regiao.getTotalPib());
            for (Estado estado : regiao.getEstados()) {
                out += String.format("----> %s, PIB: %.2f\n", estado.getNome(), estado.getPib());
            }
            out += "\n";
        }
        return out;
    }

    public static void calcularPorcentagemPibEstados(List<Estado> estados) {
        double pibTotal = totalPibEstados(estados);
        estados.forEach((estado) -> System.err.println(String.format("%s -> %.2f%%", estado.getNome(), (estado.getPib() * 100 / pibTotal))));
    }

    public static Estado filterEstado(String nome, List<Estado> list) {
        for (Estado estado : list) {
            if (estado.getNome().strip().equals(nome.replace("-", " ").strip())) {
                return estado;
            }
        }
        return null;
    }

    public static void escreverSaida(List<Regiao> regioes) {
        try {
            FileWriter file = new FileWriter("saida.txt");
            BufferedWriter writer = new BufferedWriter(file);
            String conteudo = calcularPibRegioes(regioes);
            writer.write(conteudo);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static BufferedReader getReader(String fileName) {
        File file = new File(fileName);
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return new BufferedReader(fileReader);
    }
}
