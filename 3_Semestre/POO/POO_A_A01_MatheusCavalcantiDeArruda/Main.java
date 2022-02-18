package POO_A_A01_MatheusCavalcantiDeArruda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Main {

    /*
     * Class Description:
     * 
     * Exercício:
     * Deseja-se um aplicativo capaz de tomar os dados em um arquivo de texto
     * contendo os PIBs por estado do Brasil (pib.txt) carregá-los na memória e
     * executar os seguintes itens:
     * 
     * a-) Imprimir na tela a lista de PIB por estado em percentual em relação ao
     * total.
     * 
     * b-) Gerar um arquivo de saída (saida.txt) sumarizando (somando) o PIB por
     * regiões. Será fornecida uma lista de estados por regiões que deve ser lida do
     * arquivo regioes.txt
     * 
     * O aluno deve compilar, testar, empacotar e enviar para o instrutor nos
     * devidos
     * formatos.
     *
     * @author: Matheus Cavalcanti de Arruda
     * 
     * @version: 1.0
     * 
     * Date: 18/02/2022
     */

    public static void main(String[] args) {

        ArrayList<String> listaPibEstado = lerArquivo("pib.txt");
        ArrayList<String> listaRegioes = lerArquivo("regioes.txt");

        calculaParticipacaoPib(listaPibEstado);

        String[] listaPibRegioes = calculaPibRegiao(listaPibEstado, listaRegioes);
        escreverPibRegioes(listaPibRegioes);
    }

    public static ArrayList<String> lerArquivo(String nomeArquivo) {

        ArrayList<String> lista = new ArrayList<String>();

        try {
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha = null;

            while ((linha = bufferedReader.readLine()) != null) {
                lista.add(linha);
            }

            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return lista;
    }

    public static String[] calculaPibRegiao(ArrayList<String> pibEstado, ArrayList<String> listaRegioes) {

        int count = 0;
        int index = 0;
        String[] regioes = new String[5];
        float[] pibRegioes = new float[5];

        for (int i = 0; i < listaRegioes.size(); i++) {

            if (listaRegioes.get(i).isEmpty()) {
                count = 0;
            } else if (count == 0) {
                regioes[index] = listaRegioes.get(i);
                index++;
                count++;
            } else {
                count++;
            }

            for (int j = 0; j < pibEstado.size(); j++) {
                String[] temp = pibEstado.get(j).split(";");

                if (listaRegioes.get(i).equals(temp[0])) {
                    pibRegioes[index - 1] += Float.parseFloat(temp[1]);
                    break;
                }
            }
        }

        for (int i = 0; i < regioes.length; i++) {
            regioes[i] = "pib da regiao " + regioes[i] + " = " + pibRegioes[i];
        }

        return regioes;
    }

    public static void escreverPibRegioes(String[] listaPib) {

        try {
            FileWriter fileWriter = new FileWriter("saida.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String item : listaPib) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (Exception e) {

        }
    }

    public static void calculaParticipacaoPib(ArrayList<String> lista) {
        float valorTotal = 0;

        for (String item : lista) {

            String[] aux = item.split(";");
            valorTotal += Float.parseFloat(aux[1]);
        }

        System.out.printf("PIB total: %.2f\n\n", valorTotal);

        for (String item : lista) {

            String[] aux = item.split(";");
            System.out.printf("Estado: %s\nParticipação PIB: %.2f%%\n-------------\n", aux[0],
                    ((Float.parseFloat(aux[1]) / valorTotal) * 100));
        }
    }
}
