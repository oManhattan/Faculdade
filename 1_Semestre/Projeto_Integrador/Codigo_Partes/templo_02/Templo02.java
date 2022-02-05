package Projeto1;
import java.util.Random;
import java.util.Scanner;

public class Templo02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int selecao;
		boolean existe = true;
		do {System.out.println("1 - Resolver equa��es de segundo grau! \n"
				+ "2 - Sair do programa\n\n"
				+ "Digite uma op��o: ");
			selecao = entrada.nextInt();
			
			switch(selecao) {
			case 1:
				//Equa��o 2� grau
				equacao2();
				existe = false;
			break;
			case 2: 
				System.out.println("Voc� saiu do programa.");
				existe = false;
			break;
			default:
				System.err.println("Op��o inv�lida, por favor, tente novamente");
			}	
		}while(existe);
	}


	static void equacao2(){
		primeiraquest();
		segundaquest();
		terceiraquest();
}

	static void primeiraquest() {
		//vari�veis
		int r;
		Random rng = new Random();
		Scanner entrada = new Scanner(System.in);
		String opcao, enunciado;
		boolean repete = true;
				
		//Enunciado
		System.out.println("Ol�! Nesse templo n�s teremos tr�s testes relacionados a equa��es do segundo grau.");
				
		//Quest�o
				
		//RANDOMIZANDO A QUEST�O E REPETINDO AT� O ACERTO OU VIDA = 0
		
		do{
			r = rng.nextInt(3);
		switch(r) {
		//RECEBENDO A QUEST�O RANDOMIZADA E RESOLVENDO A QUEST�O.
			case 0:
				enunciado = "Primeiramente me diga, quais s�o os coefici�ntes dessa equa��o de segundo grau. 2x� + x � 3 = 0";
				System.out.println(enunciado);
				System.out.println("a) a = -2 b = 0 c = -3 \n"
						+ "b) a = 2 b = 1 c = 3 \n"
						+ "c) a = 2 b = 1 c = -3 \n"
						+ "d) a = 2 b = 0 c = -3");
				System.out.print("Digite sua resposta: ");
				opcao = entrada.next();
			
				if(opcao.equalsIgnoreCase("c")) {
					System.out.println("A resposta est� correta!\n");
					repete = false;
				}else {
					System.out.println("A resposta est� incorreta\n");
				}
				break;
				
			case 1:
				enunciado = "Primeiramente me diga, quais s�o os coefici�ntes dessa equa��o de segundo grau. �3x� + 18x � 15 = 0.";
				System.out.println(enunciado);
				System.out.println("a) a = -3 b = -18 c = -15 \n"
						+ "b) a = 3 b = 18 c = -15 \n"
						+ "c) a = -3 b = 18 c = 15 \n"
						+ "d) a = -3 b = 18 c = -15");
				System.out.print("Digite sua resposta: ");
				opcao = entrada.next();
				
				if(opcao.equalsIgnoreCase("d")) {
					System.out.println("A resposta est� correta!\n");
					repete = false;
				}else {
					System.out.println("A resposta est� incorreta\n");
				}
				break;
				
			case 2:
				enunciado = "Primeiramente me diga, quais s�o os coefici�ntes dessa equa��o de segundo grau. 3x� � x � 1 = 0.";
				System.out.println(enunciado);
				
				System.out.println("a) a = -3 b = -1 c = -1 \n"
						+ "b) a = 3 b = -1 c = -1 \n"
						+ "c) a = -3 b = 0 c = 1 \n"
						+ "d) a = 3 b = -1 c = 1");
				System.out.print("Digite sua resposta: ");
				opcao = entrada.next();
				
				if(opcao.equalsIgnoreCase("b")) {
					System.out.println("A resposta est� correta!\n");
					repete = false;
				}else {
					System.out.println("A resposta est� incorreta\n");
				}
				break;
		}
		
	}while(repete);
		}
	static void segundaquest() {
		//vari�veis
		int r;
		Random rng = new Random();
		Scanner entrada = new Scanner(System.in);
		String opcao, enunciado;
		boolean repete = true;
		//Enunciado
		System.out.println("Aaaah, sim, vejo que voc� foi capaz de passar pelo meu primeiro teste! Maravilhoso, vamos apimentar um pouco mais as coisas");
		
		//Randomizando a quest�o
		
		
		//RECEBENDO A QUEST�O RANDOMIZADA E RESOLVENDO A QUEST�O.
		do {
			r = rng.nextInt(3);
		switch(r) {
		case 0:
			enunciado = "Qual � a maior raiz da equa��o -2x� + 3x + 5 = 0?";
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
				System.out.println("Voc� n�o � capaz de seguir em frente\n");
			}
			break;
		case 1:
			enunciado = "Qual � a menor raiz da equa��o 2x� + 7x + 5 = 0";
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
				System.out.println("Voc� n�o � capaz de seguir em frente\n");
				
				}
			break;
		case 2:
			enunciado = "Quais s�o as duas ra�zes da equa��o 3x� � x � 2 = 0";
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
				System.out.println("Voc� n�o � capaz de seguir em frente\n");
				
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
		System.out.println("TUDO QUE EU JOGO PARA VOC�, EST� CONSEGUINDO RESOLVER... Bom...voc� � bom, faz tempo que n�o uso todo o meu poder, "
				+ "agora voc� conhecer� a minha f�ria, d�vido que ir� conseguir responder as pr�ximas quest�es...");
		do {
			r = rng.nextInt(3);
		switch(r) {
		case 0:
			enunciado = "Qual � a resolu��o da seguinte equa��o do segundo grau x� � 4x � 5 = 0?";
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
				System.out.println("Voc� n�o conseguir� prosseguir nem que tente mil vezes.\n");
			}
			break;
		case 1:
			enunciado = "Eu quero que me diga, temos na equa��o 10x� � 1000 = 0, duas ra�zes reais e distintas, a e b, que podem ser encontradas. "
					+ "Mostre a mim que sabe! Determine a� + b�";
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
					System.out.println("Voc� n�o conseguir� prosseguir nem que tente mil vezes.\n");
				
				}
			break;
		case 2:
			enunciado = "Quero que me diga qual ser� o resultado do produto das duas ra�zes da equa��o 5x� - 125 = 0";
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
					System.out.println("Voc� n�o conseguir� prosseguir nem que tente mil vezes.\n");
				
				}
			break;
			
		}
		}while(repete);	
		
		
	}
	
}