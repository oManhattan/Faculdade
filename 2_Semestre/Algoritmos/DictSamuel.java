import java.io.BufferedReader;
import java.io.FileReader;

public class DictSamuel {

	//Criação do vetor do dicionário do Samuel com 1000 posições
	public static String dictSamuel[] = new String[1000];
	
	//Contabilização do total de palavras cadastradas
	public static int totalPalavras = 0;

	public static void main(String[] args) throws Exception {
		
		analiseArquivo("Arquivo.txt");
		
		for (int i = 0; i < totalPalavras; i++) {
			System.out.println(dictSamuel[i]);
		}
		System.out.println("total de palavras diferentes no dicionario = " + totalPalavras);

	}

	// Função para ler as palavras do arquivo "Arquivo.txt"
	public static void analiseArquivo(String nomeArquivo) throws Exception {

		FileReader arquivo = new FileReader(nomeArquivo);
		BufferedReader leitor = new BufferedReader(arquivo);

		boolean cond = true;	//Variavél para controle do total de palavras
		String linha; 			//Variavél para receber cada palavra de uma frase
		String frase[];			//Variavél para receber as frases de cada linha do documento

		//Enquanto o documento não retonar null, o laço lê as linhas disponíveis
		while (cond) {
			linha = leitor.readLine();
			if (linha == null) {
				break;
			}

			frase = linha.toLowerCase().split(" ");

			//Ao armazenar cada palavra da frase de cada linha, se inicia a verificação de cada palavra armazenada no vetor
			for (int i = 0; i < frase.length; i++) {

				//Por conta da ocorrência de gerar palavras vazias com o método split(), foi incluída essa verificação
				if (!frase[i].isEmpty()) {
					
					//Caso não exista nenhuma palavra no dicionário, ela é incluída diretamente
					if (totalPalavras == 0) {
						dictSamuel[totalPalavras] = frase[i];
						totalPalavras++;
					} else {
						
						//Verifica se o total de palavras já foi preenchido
						if (totalPalavras == dictSamuel.length) {
							cond = false;
							break;
						}
						
						//Verificação se a palavra já consta no dicionário, através da busca binária
						if (!verificaDict(frase[i])) {
							
							//Caso a a palavra não conte no dicionário ela é inserida 
							populaDict(dictSamuel, frase[i]);
						}
					}

				}
			}

		}

		leitor.close();

	}

	//Função de busca binária para verificar se a palavra já consta no dicionário
	public static boolean verificaDict(String palavra) {

		int inicio = 0;
		int fim = totalPalavras - 1;
		int meio;
		
		//Manipulação da "setorização" do vetor para encontrar se o elemento está ou não dentro do vetor
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			
			//Para obter um valor númerico para a questão de maior ou menor da String, foi utilizado o método compareTo 
			//para identificar se a String é "maior" ou "menor" que a posição do "meio"
			
			if (palavra.compareTo(dictSamuel[meio]) < 0) {
				fim = meio - 1;
			}
			else if (palavra.compareTo(dictSamuel[meio]) > 0) {
				inicio = meio + 1;
			} else {
				return true;
			}
		}
		return false;
	}

	//Função para fazer a inserção da nova palavra de forma ordenada
	public static void populaDict(String[] v, String frase) {

		//Inserção da nova palavra na última posição
		dictSamuel[totalPalavras] = frase;

			//Reacolocação da nova palavra no posição ordenada
			int j = totalPalavras;
			String x = v[j];
			while (j > 0 && x.compareTo(v[j - 1]) < 0) {
				v[j] = v[j - 1];
				j--;

			}
			v[j] = x;
		
		totalPalavras++;

	}

}
