package Projeto1;
import java.util.Random;
import java.util.Scanner;

public class Templo02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int selecao;
		boolean existe = true;
		do {System.out.println("1 - Resolver equações de segundo grau! \n"
				+ "2 - Sair do programa\n\n"
				+ "Digite uma opção: ");
			selecao = entrada.nextInt();
			
			switch(selecao) {
			case 1:
				//Equação 2º grau
				equacao2();
				existe = false;
			break;
			case 2: 
				System.out.println("Você saiu do programa.");
				existe = false;
			break;
			default:
				System.err.println("Opção inválida, por favor, tente novamente");
			}	
		}while(existe);
	}


	static void equacao2(){
		primeiraquest();
		segundaquest();
		terceiraquest();
}

	static void primeiraquest() {
		//variáveis
		int r;
		Random rng = new Random();
		Scanner entrada = new Scanner(System.in);
		String opcao, enunciado;
		boolean repete = true;
				
		//Enunciado
		System.out.println("Olá! Nesse templo nós teremos três testes relacionados a equações do segundo grau.");
				
		//Questão
				
		//RANDOMIZANDO A QUESTÃO E REPETINDO ATÉ O ACERTO OU VIDA = 0
		
		do{
			r = rng.nextInt(3);
		switch(r) {
		//RECEBENDO A QUESTÃO RANDOMIZADA E RESOLVENDO A QUESTÃO.
			case 0:
				enunciado = "Primeiramente me diga, quais são os coeficiêntes dessa equação de segundo grau. 2x² + x – 3 = 0";
				System.out.println(enunciado);
				System.out.println("a) a = -2 b = 0 c = -3 \n"
						+ "b) a = 2 b = 1 c = 3 \n"
						+ "c) a = 2 b = 1 c = -3 \n"
						+ "d) a = 2 b = 0 c = -3");
				System.out.print("Digite sua resposta: ");
				opcao = entrada.next();
			
				if(opcao.equalsIgnoreCase("c")) {
					System.out.println("A resposta está correta!\n");
					repete = false;
				}else {
					System.out.println("A resposta está incorreta\n");
				}
				break;
				
			case 1:
				enunciado = "Primeiramente me diga, quais são os coeficiêntes dessa equação de segundo grau. –3x² + 18x – 15 = 0.";
				System.out.println(enunciado);
				System.out.println("a) a = -3 b = -18 c = -15 \n"
						+ "b) a = 3 b = 18 c = -15 \n"
						+ "c) a = -3 b = 18 c = 15 \n"
						+ "d) a = -3 b = 18 c = -15");
				System.out.print("Digite sua resposta: ");
				opcao = entrada.next();
				
				if(opcao.equalsIgnoreCase("d")) {
					System.out.println("A resposta está correta!\n");
					repete = false;
				}else {
					System.out.println("A resposta está incorreta\n");
				}
				break;
				
			case 2:
				enunciado = "Primeiramente me diga, quais são os coeficiêntes dessa equação de segundo grau. 3x² – x – 1 = 0.";
				System.out.println(enunciado);
				
				System.out.println("a) a = -3 b = -1 c = -1 \n"
						+ "b) a = 3 b = -1 c = -1 \n"
						+ "c) a = -3 b = 0 c = 1 \n"
						+ "d) a = 3 b = -1 c = 1");
				System.out.print("Digite sua resposta: ");
				opcao = entrada.next();
				
				if(opcao.equalsIgnoreCase("b")) {
					System.out.println("A resposta está correta!\n");
					repete = false;
				}else {
					System.out.println("A resposta está incorreta\n");
				}
				break;
		}
		
	}while(repete);
		}
	static void segundaquest() {
		//variáveis
		int r;
		Random rng = new Random();
		Scanner entrada = new Scanner(System.in);
		String opcao, enunciado;
		boolean repete = true;
		//Enunciado
		System.out.println("Aaaah, sim, vejo que você foi capaz de passar pelo meu primeiro teste! Maravilhoso, vamos apimentar um pouco mais as coisas");
		
		//Randomizando a questão
		
		
		//RECEBENDO A QUESTÃO RANDOMIZADA E RESOLVENDO A QUESTÃO.
		do {
			r = rng.nextInt(3);
		switch(r) {
		case 0:
			enunciado = "Qual é a maior raiz da equação -2x² + 3x + 5 = 0?";
			System.out.println(enunciado);
			System.out.println("a) -1\n"
					+ "b) -2,5\n"
					+ "c)2\n"
					+ "d)2,5\n");
			System.out.print("Qual a sua resposta? ");
			opcao = entrada.next();
			
			if(opcao.equalsIgnoreCase("d")) {
				
				System.out.println("Vejo que acertou mais uma...\n");
				repete = false;
			}else {
				System.out.println("Você não é capaz de seguir em frente\n");
			}
			break;
		case 1:
			enunciado = "Qual é a menor raiz da equação 2x² + 7x + 5 = 0";
			System.out.println(enunciado);
			System.out.println("a) -1 \n"
					+ "b) 1\n"
					+ "c) -5/2\n"
					+ "d) -2");
			System.out.print("Qual a sua resposta?");
			opcao = entrada.next();	
			
			if(opcao.equalsIgnoreCase("c")) {
				System.out.println("Vejo que acertou mais uma...\n");
				repete = false;
				}else {
				System.out.println("Você não é capaz de seguir em frente\n");
				
				}
			break;
		case 2:
			enunciado = "Quais são as duas raízes da equação 3x² – x – 2 = 0";
			System.out.println(enunciado);
			System.out.println("a) x1 = 2/3 x2 = 1\n"
					+ "b) x1 = -2/3 x2 = -1 \n"
					+ "c) x1 = -2/3 x2 = 1 \n"
					+ "d) x1 = -1 x2 = 2/3");
			System.out.print("Qual a sua resposta?");
			opcao = entrada.next();
			if(opcao.equalsIgnoreCase("c")) {
				System.out.println("Vejo que acertou mais uma...\n");
				repete = false;
				}else {
				System.out.println("Você não é capaz de seguir em frente\n");
				
				}
			break;
			
		}
		}while(repete);	
	
	}
	static void terceiraquest() {
		//Variaveis
		int r;
		Random rng = new Random();
		Scanner entrada = new Scanner(System.in);
		String opcao, enunciado;
		boolean repete = true;
		//Enunciado
		System.out.println("TUDO QUE EU JOGO PARA VOCÊ, ESTÁ CONSEGUINDO RESOLVER... Bom...você é bom, faz tempo que não uso todo o meu poder, "
				+ "agora você conhecerá a minha fúria, dúvido que irá conseguir responder as próximas questões...");
		do {
			r = rng.nextInt(3);
		switch(r) {
		case 0:
			enunciado = "Qual é a resolução da seguinte equação do segundo grau x² – 4x – 5 = 0?";
			System.out.println(enunciado);
			System.out.println("a) x1 = 1 x2 = 5"
					+ "b) x1 = -1 x2 = 5\n"
					+ "c) x1 = -1 x2 = -5\n"
					+ "d) x1 = -5 x2 = 1\n");
			System.out.print("Qual a sua resposta? ");
			opcao = entrada.next();
			
			if(opcao.equalsIgnoreCase("b")) {
				
				System.out.println("Acertou novamente, droga droga droga...\n");
				repete = false;
			}else {
				System.out.println("Você não conseguirá prosseguir nem que tente mil vezes.\n");
			}
			break;
		case 1:
			enunciado = "Eu quero que me diga, temos na equação 10x² – 1000 = 0, duas raízes reais e distintas, a e b, que podem ser encontradas. "
					+ "Mostre a mim que sabe! Determine a² + b²";
			System.out.println(enunciado);
			System.out.println("a) 100 \n"
					+ "b) 50 \n"
					+ "c) 250\n"
					+ "d) 200");
			System.out.print("Qual a sua resposta?");
			opcao = entrada.next();	
			
			if(opcao.equalsIgnoreCase("d")) {
				System.out.println("Acertou novamente, droga droga droga...\n");
				repete = false;
				}else {
					System.out.println("Você não conseguirá prosseguir nem que tente mil vezes.\n");
				
				}
			break;
		case 2:
			enunciado = "Quero que me diga qual será o resultado do produto das duas raízes da equação 5x² - 125 = 0";
			System.out.println(enunciado);
			System.out.println("a) -25\n"
					+ "b) x1 = 20 "
					+ "c) x1 = 25"
					+ "d) x1 = 30");
			System.out.print("Qual a sua resposta?");
			opcao = entrada.next();
			if(opcao.equalsIgnoreCase("a")) {
				System.out.println("Acertou novamente, droga droga droga...\n");
				repete = false;
				}else {
					System.out.println("Você não conseguirá prosseguir nem que tente mil vezes.\n");
				
				}
			break;
			
		}
		}while(repete);	
		
		
	}
	
}