import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class O_Jogo {

	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-VARIAVÉIS GLOBAIS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
	public static Scanner entrada = new Scanner(System.in);
	public static String opcao = "";
	public static int dificuldade = 0;
	public static String nomeJogador = "";
	public static int thread1 = 50;
	public static int thread2 = 100;
	public static int thread3 = 100;
	public static int[] status = { 100, 0 };
	public static int frases = 0;

	// CORES DO TEXTO
	public static final String RESET = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String MAGENTA = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";
	
	// NEGRITO DO TEXTO 
	public static final String RESET_BOLD = "\u001B[0m";
	public static final String BOLD = "\u001B[1m";
	public static final String SUB = "\u001B[4m";
	
	// CORES DO FUNDO DO TEXTO
	public static final String RESET_BACKGROUND = "\u001B[0m";
	public static final String BLACK_BACKGROUND = "\u001B[40m";
	public static final String RED_BACKGROUND = "\u001B[41m";
	public static final String GREEN_BACKGROUND = "\u001B[42m";
	public static final String YELLOW_BACKGROUND = "\u001B[43m";
	public static final String BLUE_BACKGROUND = "\u001B[44m";
	public static final String PURPLE_BACKGROUND = "\u001B[45m";
	public static final String CYAN_BACKGROUND = "\u001B[46m";
	public static final String WHITE_BACKGROUND = "\u001B[47m";

	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-MAIN-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
	public static void main(String[] args) {

		boolean cond = true;
		

		do {

			System.out.print(Tabula1(6, "---Menu---\n\n"));
			System.out.print(Tabula2(2, "[1] Intruções", 6, "[2] Jogar\n"));
			System.out.print(Tabula2(2, "[3] Créditos", 6, "[4] Sair\n"));

			String opcao_Menu = Option();

			switch (opcao_Menu) {

			case "1":
				Instruções();
				break;

			case "2":

				Jogar();
				Hist_1();
				ExecutaTemplo1(status);
				Hist_2();
				ExecutaTemplo2();
				Hist_3();
				ExecutaTemplo3(status);
				Hist_4();
				ExecutaFinalBoss(status);
				Hist_5();
				Créditos();
				
				
				break;

			case "3":
				Créditos();
				break;

			case "4":

				cond = false;
				break;

			default:

				System.out.print(RED + Tabula1(6, "Opção não é válida!\n\n") + RESET);

			}

		} while (cond);

	}

	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-JOGO-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// PROCEDIMENTO PARA ARMAZENAR AS INFORMAÇÕES DAS INTRUÇÕES
	public static void Instruções() {

		System.out.print("\n");
		Texto_Formatado(Tabula1(6, "---Instruções---\n")+"\nO objetivo do jogo é auxiliar o jogador em alguns conhecimentos da matemática."
				+ " Ao longo da jornada, serão apresentados conteúdos sobre a matéria em questão e "
				+ "apresentadas perguntas ao jogador. O mesmo deverá selecionar as opções válidas para que ele possa"
				+ " avançar no jogo e a cada questão, o jogador sofrerá um dano se errar, diminuindo assim sua vida."
				+ " O objetivo final do jogador, é avançar por todos os templos para derrotar o último chefe, sem perder toda a sua vida.");
		System.out.print("\n");
		Sair();

	}

	// PROCEDIMENTO PARA FAZER A 1º CHAMADA DO JOGO, PARA COLETAR AS INFORMAÇÕES DO
	// NOME DO JOGADOR, A DIFICULDADE DO JOGO E A HISTÓRIA INICIAL
	public static void Jogar() {

		Texto_Formatado(Tabula1(4, "---Escolha a sua dificuldade de jogo---\n\n")
				+ Tabula3(1, "[1] Fácil", 3, "[2] Normal", 3, "[3] Difícil"));

		boolean cond = true;

		do {

			String opcao_Menu = Option();
			switch (opcao_Menu) {

			case "1":
				dificuldade = 1;
				cond = false;
				break;

			case "2":
				dificuldade = 2;
				cond = false;
				break;

			case "3":
				dificuldade = 3;
				cond = false;
				break;

			default:
				System.out.print(RED + Tabula1(6, "Opção não é válida!\n\n") + RESET);

			}
		} while (cond);

		Texto_Formatado(Tabula1(4, "   ---Escolha o nome do seu jogador---"));
		nomeJogador = Option();

		boolean cond2 = true;
		do {

			Texto_Formatado(Tabula1(4,
					"---Você deseja que o nome do seu jogador seja " + RED + nomeJogador + RESET + " ?---\n\n")
					+ Tabula2(4, GREEN + "[S]" + RESET, 6, RED + "[N]" + RESET));
			String opcao_Menu = Option();

			switch (opcao_Menu.toUpperCase()) {
			case "S":
				cond2 = false;
				break;
			case "N":
				Texto_Formatado(Tabula1(4, "---Escolha o nome do seu jogador---"));
				nomeJogador = Option();
				break;
			default:
				System.out.print(RED + Tabula1(6, "Opção não é válida!\n\n") + RESET);
			}
		} while (cond2);

	}

	// PROCEDIMENTO PARA ARMAZENAR AS INFORMAÇÕES DOS CRÉDITOS
	public static void Créditos() {

		System.out.print("\n");
		Texto_Formatado(Tabula1(6, "---Créditos---\n")+Tabula3(2,"\n\t\tGustavo Tozeti",3,"Matheus Cavalcanti",2,"Renan Kesper\n\nAgradecimentos:\nGustavo Takeo\nMarcio Welker"));
		System.out.print("\n");
		Sair();

	}

	
	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-HISTÓRIA-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
	
	// PRIMEIRA NARRATIVA DO JOGO
	public static void Hist_1(){

		System.out.print("\n");
		
		Texto_Formatado(
				
				
				Dialogo("Narrador",WHITE) + "\n - Aos escombros, uma leve página, parecida de um diário, pousa sobre o rosto de "+ nomeJogador +". Aos sustos, " + nomeJogador +" acorda e começa a ler a página." +
				
				Dialogo(nomeJogador,WHITE)+ GREEN
				+ "\n - \"Reza a lenda que Ariandre era um lugar próspero, cheio de magia e encanto, onde todos os seres viviam em harmonia e em paz. Um lugar tão belo,"					
				+ " que a matemática era a base de força para grandes magos. Mas isso é claro, antes do grande acontecimento. . .Ninguém sabe ao certo, nem ao menos como,"				
				+ " mas naquela tarde esse lugar tão calmo e pleno, foi reduzido a cinzas e escombros, uma enorme escuridão pairou pelos céus e tomou Ariandre por inteiro "			
				+ "e com um simples clarão. . .tudo foi destruído. Após momentos agoniantes, enfim o motivo disso tudo. . . sim, ele que era apenas uma fábula de centenas de "			
				+ "anos, de contos muito antigos, enfim ressurgiu. . . Ancelot tinha despertado. O grande rei demônio estava presente novamente, "			
				+ "para aprisionar toda a matemática de Ariandre e ser o detentor de toda a magia. Já se passaram alguns meses depois disso tudo, mas agora espero "					
				+ "ter forças para enfrentá-lo, mas a cada dia que se passa nessas catedrais do abismo perco mais e mais da minha sanidade. Talvez eu seja a última esperança "			
				+ "de Ariandre, mas caso alguém esteja lendo isso, significa que Ancelot venceu e Ariandre para sempre estará sob o seu domínio.\"" 									
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Mas. . . mas como? Meses? Estava tudo certo, ele estava em minhas mãos, como foi tudo isso desmoronar. Minha "					
				+ "cabeça dói, são memórias que me vem, mas o que será que aconteceu? Por que eu estou nas catedrais e porque Ariandre está destruída? Será isso um sonho?"
				+ " Eu preciso descobrir o que aconteceu, mas me sinto estranho. Parece que não tenho mais meus poderes. Será que eu consigo canalizar algo??"
				
				+ Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+ " tenta utilizar, uma de suas magias vinda através dos poderes da matemática, mas sem sucesso! "
				+ "E como em um turbilhão de memórias, "+nomeJogador+" começa a se lembrar daquele fatídico dia.\n\n"
						
				+Tabula1(4,"Alguns meses antes...") 
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Finalmente, depois de anos de estudos e cálculos, finalmente irei despertar Ancelot e enfim obter o seu"
				+ " poder supremo."
				
				+ Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+ " por mais que fosse extremamente forte, jamais saberia que o terrível Ancelot portava de uma maldição, que "
				+ "quem o invoca-se traria destruição ao seu mundo. Ao passo em que o ritual de invocação se iniciava, um grande portal cheio de trevas se abriu no chão e dele "
				+ "saía o fim dos tempos."
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Finalmente livre!!"	
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Jamais Ancelot, eu "+ nomeJogador +" sou o ser mais supremo de toda Ariandre, você não é pareo para os meus poderes. Apenas te "
				+ "invoquei para obter toda sua fonte de poder e assim te derrotá-lo para sempre. "
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Tolo, você não é a primeira pessoa a tentar isso. Vocês todos tentam, mas todos esquecem da maldição!!"	
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Maldição? Que maldição?!"
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Pelo visto, você não está preparado HAHAHAHAH. Mas talvez o que eu faça aqui, sirva de lição para você."
				
				+ Dialogo("Narrador",WHITE) + "\n - E com uma enorme força e magia, que surpreendia até "+nomeJogador+", Ancelot conseguiu drenar todos os seus poderes. Com vários feixes de luz, "
				+ nomeJogador+" via seus poderes se esvaindo ao longo de si."
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - "+nomeJogador+", você me parece interessante. Irei espalhar esses seus poderes nas mais profundas terras de Ariandre e caso você sobreviva, terá seus "
				+ "poderes de volta para me enfrentar."
				
				+ Dialogo("Narrador",WHITE) + "\n - Com um imenso clarão, tudo ficou em silêncio. Até agora...\n\n"
				
				+Tabula1(4,"Atualmente...")
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Droga! Preciso recuperar meus poderes e derrotar Ancelot. Mas onde estou?"
				
				+ Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" olha em volta e se depara com escombros e ruínas. Mas começa a perceber que existem símbolos escritos nas paredes que são familiares. "
				+ "Estes símbolos remetem a algumas descrições dos templos da perdição das catedrais. É de grande espanto, pois "+nomeJogador+" ao reconhecer às escritas, lembrou que os templos eram mitos da terra "
				+ "antiga e que eram locais responsáveis por um grande armazenamento de magia."
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Se ele disse que meus poderes estão nas mais profundas terras de Ariandre, então só podem estar espalhados entre os três templos daqui. "
				+ "Preciso ir em frente!"
				
				+Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+ " adentra no templo das "+BOLD+"Equações de 1º Grau"+RESET_BOLD+", um lugar que lhe faz relembrar dos seus inícios de treinamento de mago. "
				+ "Tanto é, que esse conhecimento era a base dos seus grandiosos poderes."
						
				+ Dialogo("Narrador",WHITE) + "\n - Os templos possuem feitiços incríveis e fazem com quem adentrar ao local tenha a sabedoria para conquistar o poder armazenado nele. E não foi diferente com esse templo."
				+ nomeJogador+" após passar por um portal mágico do templo, teve uma viagem mística até onde estavam os desafios para recuperar seu poder. Dentro dessa viagem, uma voz desconhecida lhe passou os seguintes "
				+ "ensinamentos..."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Olá "+ nomeJogador+", que bom te ver aqui!!"
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Mas quem é você?"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Não se preocupe, sou apenas um ajudante de Ariandre e estou aqui para ajudar em sua jornada. Não temos muito tempo a frente então serei o mais rápido possível, "
				+ "isso lhe guiará nos seus próximos desafios daqui para frente."
				
				+ Dialogo("Narrador",WHITE) + "\n - E parecendo uma voz familiar, "+ nomeJogador+" escutou os ensinamentos que a voz desconhecida tinha a oferecer."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - O poder deste templo são às"+BOLD(" Equações de 1º Grau",CYAN)+", elas serão a base para sua fonte de poder. Para derrotar os desafios à frente, você irá precisar dos "
				+ "conhecimentos básicos a fim de quebrar os feitiços que serão lançados a ti. Então preste muita atenção..."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - As equações de primeiro grau são sentenças matemáticas que estabelecem relações de igualdade entre termos conhecidos e desconhecidos, "
				+ "representadas sob a forma: "+BOLD("ax+b = 0",CYAN)+". Donde "+BOLD("a",CYAN)+" e "+BOLD("b",CYAN)+" são números reais, sendo "+BOLD("a",CYAN)+" um valor diferente de zero "+BOLD("(a != 0)",CYAN)+" e "+BOLD("x ",CYAN)+ "representa o "
				+ "valor desconhecido. O valor desconhecido é chamado de "+BOLD("incógnita",CYAN)+" que significa \"termo a determinar\". As equações do 1º grau podem apresentar "+BOLD("uma",CYAN)+" ou "+BOLD("mais",CYAN)+" incógnitas."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - O objetivo de resolver uma equação de primeiro grau é "+BOLD("descobrir o valor desconhecido",CYAN)+", ou seja, encontrar o valor da incógnita que "+BOLD("torna a igualdade verdadeira",CYAN)+". Para isso, "
				+ "deve-se "+BOLD("isolar os elementos desconhecidos em um dos lados do sinal de igual e os valores constantes do outro lado",CYAN)+". Contudo, é importante observar que a mudança de posição desses elementos "+BOLD("deve ser feita de forma que a igualdade "
				+ "continue sendo verdadeira",CYAN)+". Quando um termo da equação mudar de lado do sinal de igual, devemos inverter a operação. Assim, se tiver multiplicando, passará dividindo, se tiver somando, passará subtraindo e vice-versa."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Agora você está pronto para o caminho em frente. Espero te ver logo, adeus..."
				
				+ Dialogo("Narrador",WHITE) + "\n - E com essa despedida, "+ nomeJogador+" saiu de sua viagem mística e já estava em apuros."
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Parece que você sobreviveu depois de tudo aquilo e ainda conseguiu chegar até aqui. Você não terá seu poder de volta tão fácil HAHAHHA. Veremos se você é realmente capaz de enfrentar meus 3 feitiços.");
				
								
				
				
		
		System.out.print("\n");

	}

	public static void Hist_2(){
		
		System.out.print("\n");
		
		Texto_Formatado(
				
				Dialogo("Ancelot",WHITE) +  RED + "\n - Impossível, como você conseguiu ? Isso ainda não acabou, nós iremos nos encontrar novamente."
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Onde você estiver, eu estarei lá para te derrotar!"
				
				+ Dialogo("Narrador",WHITE) + "\n - E diante de um clarão Ancelot, desapareceu... Mas no local da batalha grandiosa, uma enorme chama, surgia no meio da arena. Era o poder perdido de "+nomeJogador+",  que ao se aproximar, pode absorver novamente seu poder."
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Como é bom ter meus poderes de volta!"
				
				+ Dialogo("Narrador",WHITE) + "\n - Com a grande primeira batalha travada, "+nomeJogador+" continuou em sua jornada para o próximo templo adentrando no próximo portal."
						
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Olá "+ nomeJogador+", que bom que você sobreviveu!!"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Precisamos continuar sua batalha."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - O poder deste templo são às"+BOLD(" Equações de 2º Grau",CYAN)+", elas serão o fortalecimento do seu poder. Para derrotar os desafios à frente, você irá precisar dos "
				+ "conhecimentos básicos a fim de quebrar os feitiços que serão lançados a ti. Então preste muita atenção..."									
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - As equações de segundo grau são caracterizadas por um "+BOLD("polinômio de grau 2",CYAN)+", ou seja, um polinômio do tipo "+BOLD("ax² + bx + c",CYAN)+", em que a, b e c "+BOLD("são números reais",CYAN)+". Ao resolvermos uma equação de grau 2, estamos "
				+ "interessados em "+BOLD("encontrar valores para a incógnita x",CYAN)+" que torne o "+BOLD("valor da expressão igual a 0",CYAN)+", que são chamadas de raízes, isto é, "+BOLD("ax² + bx + c = 0",CYAN)+"."
						
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - A equação do 2º grau é classificada como "+BOLD("completa",CYAN)+" quando todos os coeficientes são diferentes de 0, ou seja, a != 0, b != 0 e c != 0. A equação do 2º grau é classificada como "+BOLD("incompleta",CYAN)+" quando o valor dos coeficientes b ou c são iguais a 0, isto é, b = 0 ou c = 0."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - "+BOLD("Para solucionar equações do tipo ax² + c = 0",CYAN)+", o método para determinar a solução de equações incompletas que possuem b=0 consiste em isolar a incógnita x."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - "+BOLD("Para solucionar equações do tipo ax² + bx = 0",CYAN)+", o método para determinar as possíveis soluções de uma equação com c =0, consiste em utilizar a fatoração por evidência."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - "+BOLD("Para solucionar equações completas",CYAN)+", o método conhecido como método de Bhaskara ou fórmula de Bhaskara aponta que as raízes de uma equação do 2º grau do tipo ax² + bx + c = 0 é dada pela seguinte relação:"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Raíz 1 = "+BOLD(" (-b + (Raiz Quadrada(Delta)) / 2.a | Delta = b² - 4.a.c",CYAN) 
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Raíz 2 = "+BOLD(" (-b - (Raiz Quadrada(Delta)) / 2.a | Delta = b² - 4.a.c",CYAN) 
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Quando o "+BOLD("Delta for positivo",CYAN)+": existem duas soluções para a equação. Quando o "+BOLD("Delta for igual a zero",CYAN)+": as soluções da equação são repetidas."
				+ " Quando o "+BOLD("Delta for negativo",CYAN)+": não admite solução real."
										
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Agora você está pronto para o caminho em frente. Espero que consiga vencer novamente!"
				
				+ Dialogo("Narrador",WHITE) + "\n - E com essa despedida, "+ nomeJogador+" saiu de sua viagem mística e já estava em apuros de novo."
							
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Eu me descuidei da primeira vez, mas dessa vez será diferente. Você será derrotado através desses meus novos 3 feitiços."
				
				
				
				
				);
		
		System.out.print("\n");
	
	}	
	
	public static void Hist_3(){
		
		System.out.print("\n");
		
		Texto_Formatado(
				
				Dialogo("Ancelot",WHITE) +  RED + "\n - Como pôde derrotar os meus três feitiços? Eu pensei que você estava fraco! Mas este não é o fim.... Eu irei preparar desafios maiores...Me aguarde!"
				
				+ Dialogo("Narrador",WHITE) + "\n - Ancelot deixa o templo após mandar alguns de seus lacaios distrair " + nomeJogador + " por alguns instantes."
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Mas que droga! Da próxima ele não escapa..."
				
				+ Dialogo("Narrador",WHITE) + "\n - Com mais incentivo para derrotar Ancelot, "+nomeJogador+" segue para o último templo a fim de recuperar todo seu poder."
						
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - "+ nomeJogador+", foi uma jornada em tanto!"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Precisamos te preparar para sua próxima batalha."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - O poder deste templo são às"+BOLD(" Conversões de Base",CYAN)+", elas serão a agilidade do seu poder. Para derrotar os desafios à frente, você irá precisar dos "
				+ "conhecimentos básicos a fim de quebrar os feitiços que serão lançados a ti. Então preste muita atenção..."									
				
				
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Conversão de base numérica é a passagem da "+BOLD("representação de um número de uma base numérica para outra",CYAN)+", alterando a simbologia para se adequar à nova base. "
				+ "A base que normalmente usamos é a "+BOLD("decimal ou base dez",CYAN)+", pois contém dez algarismos "+BOLD("(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)",CYAN)+". Por exemplo, o número inteiro representado em base decimal como "
				+ BOLD("10",CYAN)+", pode ser escrito como "+ BOLD("'1010' em base binária",CYAN)+" ou "+ BOLD("'A' em base hexadecimal",CYAN)+"."
						
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - A técnica de "+BOLD("divisões sucessivas",CYAN)+" é utilizada para conversão de números inteiros do sistema "+BOLD("decimal para qualquer outra base",CYAN)
				+ ". Esta técnica consiste em "+BOLD("dividir o número original pela base 'X'",CYAN)+", o resto da divisão será um dígito e o resultado da divisão é novamente dividido por X. Esta última etapa se repete até que o resultado da "
				+ "divisão não seja mais divisível."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Por exemplo, vamos converter o número "+BOLD("47 na base (10) em binário que é a base (2)",CYAN)
				
				+ Dialogo("Voz Desconhecida",WHITE) + RESET + "\n\n47|"+SUB+" 2 "+RESET_BOLD+"\n "+BLUE+"1"+RESET+"  23|"+SUB+" 2 "+RESET_BOLD+"\n     1  11|"+SUB+" 2 "+RESET_BOLD
				+ "		\n         1  5 |"+SUB+" 2 "+RESET_BOLD+"\n            1   2 |"+SUB+" 2 "+RESET_BOLD+"\n                0   "+RED+"1 "+RESET 
						
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - O número em vermelho representa nosso "+BOLD("MSB - Bit mais significativo (Most Significant Bit)",CYAN)+". Já o número em azul representa nosso "+BOLD("LSB - Bit menos "
				+ "significativo (Least Significant Bit)",CYAN)
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Assim o número 47 em decimal, corresponde a "+BOLD("‘101111’ em binário",CYAN)
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Agora, para a conversão de qualquer base para números decimais é realizada da seguinte forma: É realizada uma somatória dos algarismos da base da direita para a esquerda, onde cada "
				+ "termo da somatória é multiplicado pelo número da base "+BOLD("(2 - Caso Binário / 8 - Caso Octal / 16 - Caso Hexadecimal)",CYAN)+", elevado a um número sequencial iniciado em 0."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Por exemplo, vamos converter o número "+BOLD("101111 na base (2) em decimal que é a base (10)",CYAN)

				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n\n"+RESET_BOLD+RED+"  5|  4|  3|  2|  1|  0|"+RESET+SUB+BLUE+"\n 2 | 2 | 2 | 2 | 2 | 2 |"+RESET+
				"\n 1   0   1   1   1   1  "+RESET+GREEN+"\n\n 32 + 0 + 8 + 4 + 2 + 1 "+RESET+RESET_BOLD+GREEN+"\n\t   47"+RESET
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Os nossos números em vermelho, representam nossas potências no qual o número da base será elevado."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Os nossos números em azul representam o número da base, no qual será transformado para decimal, neste caso a base binária o número 2."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Os nossos números em verde representam o resultado entre a multiplicação de cada elemento do número da base elevado aos expoentes, com cada termo do número em que se deseja converter, que nesse caso é o 101111."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Ao final, somando-se os resultados é obtido o valor convertido em decimal."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Lembre-se que para cada base, temos uma quantidade de algarismos, e a cada “estouro” da base, devemos seguir a sequência adicionando uma casa à esquerda e repetindo o processo!"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Base Decimal (10) - (0,1,2,3,4,5,6,7,8,9)"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Base Binária (2) - (0,1)"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Base Octal (8) - (0,1,2,3,4,5,6,7)"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Base Hexadecimal (16) - (0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F)"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Agora você está pronto para o caminho em frente. Espero que triunfe!"
				
				+ Dialogo("Narrador",WHITE) + "\n - E com essa despedida, "+ nomeJogador+" saiu de sua viagem mística e já estava em apuros novamente."
							
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Parece que você conseguiu chegar até o último templo, mas dessa vez você não escapa! "
				+ "Eu peguei três desafios de um dos livros de matemática mais obscuros somente para você HAHAHAHAHA! Vamos ver se você sairá dessas."
					
				
				);
		System.out.print("\n");
	}
	
	public static void Hist_4(){
		
System.out.print("\n");
		
		Texto_Formatado(
				
				Dialogo("Narrador",WHITE) + "\n - Após "+ nomeJogador +" terminar os três desafios e recuperar seus poderes por completo, Ancelot pareceu um pouco preocupado."
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Não é possível! Com você derrotando esses desafios você ficou até mais forte que antes! Mas não vai "
				+ "ficar assim, eu tenho uma carta na manga ainda!"
				
				+ Dialogo("Narrador",WHITE) + "\n - Ancelot puxa um livro com uma aura pesada e começa a falar palavras sem sentido em outra língua, parecendo uma magia oculta. "
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - O que está acontecendo!?!?"
				
				+ Dialogo("Narrador",WHITE) + "\n - Ancelot então começa a perder controle dos poderes que estava tentando usar e acaba causando uma grande explosão de magia, "
				+ "fazendo com que o templo comece a desmoronar."
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Eu vou ter que sair do templo da forma mais rápida possível e derrotar Ancelot o quanto antes!"
				
				+ Dialogo("Narrador",WHITE) + "\n - Após conseguir sair do templo com os poderes recuperados " + nomeJogador +" se depara com Ancelot lançando um desafio denso em sua direção"
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Vou ter que usar todos meus poderes para conseguir passar dessa!" 
				
				+ Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" concluiu o Templo das Conversões. Agora estava próximo do momento para o final"
				
				
				);
		
		System.out.print("\n");
		
	}

	public static void Hist_5(){
		
		System.out.print("\n");
		
		Texto_Formatado(
				
				
				Dialogo("Ancelot",WHITE) +  RED + "\n - Naaaaaaaão, você conseguiu me derrotar até mesmo com os poderes do Livro Oculto de Matemática."
						
				+ Dialogo("Narrador",WHITE) + "\n - Ancelot começa a perder seu poder e a ficar cada vez mais fraco."
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - " + nomeJogador + ", você conseguiu me derrotar... mas... tenha certeza que... eu farei de tudo para conseguir retornar..."
				
				+ Dialogo("Narrador",WHITE) + "\n - Aproveitando o enfraquecimento de Ancelot, "+nomeJogador+" não deixa seu inimigo falar mais nada e joga um feitiço de aprisionamento, deixando Ancelot selado."
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Você foi um bom inimigo, Ancelot... Mas eu não deixarei que você saia desta prisão pelo resto da eternidade."
				
				+ Dialogo("Narrador",WHITE) + "\n - E mais uma vez na história, Ancelot foi selado por alguém ganancioso que buscou sua redenção. Mas será que ele irá retornar novamente ?."

				
				);

				
	}
	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-FERRAMENTAS DE TEXTO-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// PROCEDIMENTO CRIADO PARA FORMATAR QUALQUER TEXTO, PARA PADRONIZAR O LAYOUT DA
	// MENSAGEM COM BASE EM UM VALOR PRÉ DETERMINADO
	public static void Texto_Formatado(String frase) {

		String texto = frase;
		String[] palavras = texto.split(" ");

		int contadorQntLetras = 0;
		int limiteLinha = 170;
		

		for (int i = 0; i < limiteLinha; i++) {
			System.out.print(RED + "=" + RESET);
		}
		System.out.print("\n");

		for (String palavra : palavras) {

			if (contadorQntLetras + palavra.length() >= limiteLinha) {
				contadorQntLetras = 0;
				System.out.print("\n");
			}

			System.out.print(palavra + " ");
			Timer2();
			if (palavra.length()>18){
				contadorQntLetras = 0;
			}
			else {
			contadorQntLetras += palavra.length() + 1;
			
			
			}
			
			}
		System.out.println("\n");

		for (int i = 0; i < limiteLinha; i++) {
			System.out.print(RED + "=" + RESET);
		}
		System.out.println("\n");

	}

	// PROCEDIMENTOS CRIADOS PARA TABULAR QUALQUER TEXTO, PARA PADRONIZAR O LAYOUT DA
	// MENSAGEM
	public static String Tabula1(int t, String s) {

		String tab = "\t";
		String frase = "";
		for (int i = 0; i <= t; i++) {
			frase += tab;
		}
		frase += s;

		return frase;
	}

	public static String Tabula2(int t, String s, int tt, String ss) {

		String tab = "\t";
		String frase = "";

		for (int i = 0; i <= t; i++) {
			frase += tab;
		}
		frase += s;
		for (int i = 0; i <= tt; i++) {
			frase += tab;
		}
		frase += ss;
		return frase;
	}

	public static String Tabula3(int t, String s, int tt, String ss, int ttt, String sss) {

		String tab = "\t";
		String frase = "";

		for (int i = 0; i <= t; i++) {
			frase += tab;
		}
		frase += s;
		for (int i = 0; i <= tt; i++) {
			frase += tab;
		}
		frase += ss;
		for (int i = 0; i <= ttt; i++) {
			frase += tab;
		}
		frase += sss;
		return frase;
	}

	// PROCEDIMENTOS CRIADO PARA PADRONIZAR OS DIÁLOGOS
	public static String Dialogo(String Nome, String Cor) {
		String texto = "\n\n" + BLACK_BACKGROUND + Cor +Nome+ RESET + RESET_BACKGROUND;
		return texto;
		}
	
	public static String BOLD(String frase, String Cor) {
		String texto = RESET + BOLD + frase + RESET_BOLD + Cor;
		return texto;
	}
	
	// PROCEDIMENTOS CRIADO PARA PRINTAR A MENSAGEM ANTES DO BOSS
	static void FormataTexto1(String frase) {

		String[] palavra = frase.split(" ");

		for (String each : palavra) {
			System.out.print(each + " ");
			Timer2();
		}
	}

	// PROCEDIMENTOS CRIADO PARA PRINTAR A MENSAGEM DE GAME OVER
	static void FormataTexto2(String frase) {

		String[] palavra = frase.split(" ");

		for (String each : palavra) {
			System.out.print(each);
			Timer2();
		}

		System.out.print(" ");
	}
	
	// PROCEDIMENTOS CRIADO PARA ARMAZENAR A COLEÇÃO DE FRASES PARA ACERTOS
	static void Vitoria_Frase () {
		
		ArrayList<String> vitoria = new ArrayList();
		vitoria.add("Acertou novamente, droga droga droga...\n");
		vitoria.add("Vejo que acertou mais uma...\n");
		vitoria.add("TUDO QUE EU JOGO PARA VOCÊ, ESTÁ CONSEGUINDO RESOLVER... Bom...você é bom, faz tempo que não uso todo o meu poder," 
		+ "\nagora você conhecerá a minha fúria, dúvido que irá conseguir responder as próximas questões...\n");
		vitoria.add("Aaaah, sim, vejo que você foi capaz de passar pelo meu desafio! Maravilhoso, vamos apimentar um pouco mais as coisas\n");
		
		Collections.shuffle(vitoria);
		Collections.shuffle(vitoria);
		Collections.shuffle(vitoria);
		
		
		System.out.print(Dialogo("Ancelot",WHITE) +  RED + " - " + vitoria.get(0) + RESET + Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" concluiu mais um desafio! E por uma benção divina recebeu mais uma potion!!\n");
		
	}
	
	// PROCEDIMENTOS CRIADO PARA ARMAZENAR A COLEÇÃO DE FRASES PARA ERROS
	static void Derrota_Frase () {
		
		ArrayList<String> derrota = new ArrayList();
		derrota.add("Você não conseguirá prosseguir nem que tente mil vezes.\n");
		derrota.add("Você não é capaz de seguir em frente\n");
		
		Collections.shuffle(derrota);
		Collections.shuffle(derrota);
		
		System.out.println(Dialogo("Ancelot",WHITE) +  RED + " - " + derrota.get(0) + RESET);
	}

	// FUNÇÃO CRIADA PARA ARMAZENAR A COLEÇÃO DE FRASES PARA DESAFIOS
	static String Desafio_Frase () {
			
			ArrayList<String> desafio = new ArrayList();
			desafio.add("rationem esse accelerationis");
			desafio.add("processus arithmetica");
			desafio.add("mindsets parallel");
			desafio.add("periculi sensus");
			desafio.add("sensus motus");
			desafio.add("ignis magicae");
			desafio.add("ventum magicae");
			desafio.add("impulsum resistentiam");
			desafio.add("viribus");
			desafio.add("title heros");
			
			String frase =  RED + desafio.get(frases) + RESET;
			
			Texto_Formatado(Tabula1(6,frase)+"\n" + Dialogo("Narrador",WHITE) + "\n - Você recebe essa magia. Com o seu conhecimento, é capaz"
			+ " de absorvê-la e consegue revidar caso acerte o encanto!");
			
			return frase;
		}
	
	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-FERRAMENTAS DE INPUT-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// FUNÇÃO CRIADA PARA RETONAR UMA OPÇÃO DESEJADA DO USUÁRIO
	public static String Option() {
		System.out.print(BLACK_BACKGROUND + WHITE + "\n***Digite sua opção:" + RESET + RESET_BACKGROUND + " ");
		opcao = entrada.nextLine();
		System.out.print("\n");
		return opcao;
	}

	// PROCEDIMENTO CRIADO PARA SAIR DE UMA OPÇÃO DE UM MENU
	public static void Sair() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nPressione a tecla ENTER para voltar!\n");
		sc.nextLine();
		System.out.println(" ");
	}

	
	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-FERRAMENTAS DO JOGO-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// FUNÇÃO CRIADA PARA CALCULAR O DANO
	static int DanoRespostaErrada(int healthPoints) {
		Random dado = new Random();
		int jogada;
		
		int vida  = healthPoints;
		String frase_A = "";
		
		jogada = dado.nextInt(20) + 1;
		String jogada_ = String.valueOf(jogada);
		
		if (jogada <= 5) {
			
			String frase =  Dialogo("Narrador",WHITE) + "\n - Parece que o feitiço era fraco e "+nomeJogador+" conseguiu se esquivar do dano.\n";
			Texto_Formatado(frase);
			
		}
		else 
		{
			
			if (jogada > 5 && jogada <= 10) {
			frase_A = "\nSorte que o feitiço não acertou em cheio, mas acertou de raspão.\n";
			healthPoints = healthPoints - (10 + (5 * dificuldade));
		} else if (jogada > 10 && jogada <= 17) {
			frase_A = "\nEsse feitiço era forte, mas não muito poderoso.\n";
			healthPoints = healthPoints - (20 + (5 * dificuldade));
		}
		else {
			frase_A = "\nEsse feitiço tinha acertado em cheio!!.\n";
			healthPoints = healthPoints - (30 + (5 * dificuldade));
		}
			
			if (healthPoints > 0) {
			vida = vida - healthPoints;
			String vida_ = String.valueOf(vida);
			
			String frase =  Dialogo("Narrador",WHITE) + "\n - A resposta estava...\n...\n...\n\n"+RED + "Errada :(\n" + RESET + "\n**\t"+nomeJogador+
			" tinha recebido "+vida_+" de dano\t **\n\n"+frase_A+"";
			
				
			Texto_Formatado(frase);

				
			Derrota_Frase();
			}
			
		}
		
		
		
		return healthPoints;
	}

	// PROCEDIMENTOS CRIADO PARA MOSTRAR MENSAGEM DE ACORDO COM A VIDA 
	// DO PERSONAGEM
	static void AcertouResposta(int healthPoints) {
			
			frases++;
			String frase_A = "";
			
			if (healthPoints >= 30 && healthPoints < 65) {
				frase_A = "\nParecia que tinha sido um grande desafio para "+nomeJogador+".";
			}
			if (healthPoints < 30) {
				frase_A = "\nTinha sido por pouco, mas "+nomeJogador+" conseguiu passar!";
			}
			
			String frase =  Dialogo("Narrador",WHITE) + "\n - A resposta estava...\n...\n...\n\n"+GREEN + "Certa :D\n" + RESET + frase_A ;
			Texto_Formatado(frase);
		
			if (frases != 3 && frases != 6 && frases != 9 && frases != 10 ) {
				Vitoria_Frase();

				}

			
		}
	
	// PROCEDIMENTO CRIADO PARA DAR GAME-OVER AO JOGO
	static void GameOver() {
		System.out.println("Seu HP chegou a 0");
		frases = 0;

		String game = "G A M E";
		String over = "O V E R";

		FormataTexto2(game);
		FormataTexto2(over);

		System.out.println("\n");
	}

	// FUNÇÃO CRIADA PARA USAR POTIONS
	static int[] UsePotion(int healthPoints, int qntPotions) {

		boolean condicao = true;
		char opcao = 0;
		int[] status = new int[2];

		do {

			Texto_Formatado(Tabula1(5,"Você tem certeza que quer usar uma potion?\n")+"\n" +Tabula3(4,GREEN + "[S]" + RESET,3 ," ou ",2, RED + "[N]\n" + RESET));

			opcao = Option().toUpperCase().charAt(0);

			switch (opcao) {
			case 'S':
				healthPoints = healthPoints + 10;
				qntPotions--;

				if (healthPoints > 100) {
					do {
						healthPoints--;
					} while (healthPoints != 100);
				}

				condicao = false;
				break;
			case 'N':

				condicao = false;
				break;

			default:
				System.out.print(RED + Tabula1(6, "Opção não é válida!\n\n") + RESET);
			}

		} while (condicao);

		status[0] = healthPoints;
		status[1] = qntPotions;
		
		O_Jogo.status[0] = status[0] ;
		O_Jogo.status[1] =status[1] ;

		return status;
	}

	// PROCEDIMENTOS DE TEMPO PARA IMPRIMIR MENSAGENS
	static void Timer() {
		try {
			Thread.sleep(thread1);
		} catch (Exception e) {

		}
	}

	static void Timer2() {
		try {
			Thread.sleep(thread2);
		} catch (Exception e) {

		}
	}

	static void Timer3() {
		try {
			Thread.sleep(thread3);
		} catch (Exception e) {

		}
	}

	// FUNÇÃO CRIADA PARA GERAR AS PERGUNTAS AO JOGADOR
	static int[] ProcessoAlternativas_Geral(String[] opcoes, int[] status, String respostaCerta, String enunciado) {
		// Area para declarar variaveis
		Scanner sc = new Scanner(System.in);
		String resposta;
		boolean condicao = true;

		

		////////////////////////////////////////////////////////////////////////
		// Area para processo de alternativas
		do {

			
			if (status[0] <= 0) {
				GameOver();
				condicao = false;
			}
			
			else {
				
				Desafio_Frase();
				
				
				System.out.printf(enunciado+"\n");
				Timer2();
				System.out.printf("[ A ] %S\n", opcoes[0]);
				Timer2();
				System.out.printf("[ B ] %S\n", opcoes[1]);
				Timer2();
				System.out.printf("[ C ] %S\n", opcoes[2]);
				Timer2();
				System.out.printf("[ D ] %S\n", opcoes[3]);
				Timer2();
				System.out.printf("[ E ] %S\n\n", opcoes[4]);
				Timer2();
				System.out.printf("[ P ] Caso queira utilizar uma potion.\n\nHP atual: "+GREEN+"%d"+RESET+"\t| Potions: "+RED+"%d\n"+RESET, status[0],status[1]);
				Timer2();
				// Takeo, se você estiver com preguiça de fazer a conta basta tirar o comentário da linha abaixo :D 
				//System.out.println("Resposta certa: " + respostaCerta.toUpperCase());
				//Timer2();
				resposta = Option().toUpperCase();

			switch (resposta.charAt(0)) {
			case 'A':
				if (opcoes[0].equals(respostaCerta)) {
					AcertouResposta(status[0]);
					condicao = false;
				} else {
					status[0] = DanoRespostaErrada(status[0]);
					if (status[0] <= 0) {
						GameOver();
						condicao = false;
					}
				}
				break;
			case 'B':
				if (opcoes[1].equals(respostaCerta)) {
					AcertouResposta(status[0]);
					condicao = false;
				} else {
					status[0] = DanoRespostaErrada(status[0]);
					if (status[0] <= 0) {
						GameOver();
						condicao = false;
					}
				}
				break;

			case 'C':
				if (opcoes[2].equals(respostaCerta)) {
					AcertouResposta(status[0]);
					condicao = false;
				} else {
					status[0] = DanoRespostaErrada(status[0]);
					if (status[0] <= 0) {
						GameOver();
						condicao = false;
					}
				}
				break;
			case 'D':
				if (opcoes[3].equals(respostaCerta)) {
					AcertouResposta(status[0]);
					condicao = false;
				} else {
					status[0] = DanoRespostaErrada(status[0]);
					if (status[0] <= 0) {
						GameOver();
						condicao = false;
					}
				}
				break;
			case 'E':
				if (opcoes[4].equals(respostaCerta)) {
					AcertouResposta(status[0]);
					condicao = false;
				} else {
					status[0] = DanoRespostaErrada(status[0]);
					if (status[0] <= 0) {
						GameOver();
						condicao = false;
					}
				}
				
				break;
			case 'P':
				
				if ( status[1] == 0 ) {
					
					System.out.print(RED + Tabula1(7, "Você não tem potions!\n\n") + RESET);
									
				}
				
				else{
					status = UsePotion(status[0], status[1]);
				}
				
					break;
				
			default:
				System.out.print(RED + Tabula1(6, "Opção não é válida!\n\n") + RESET);
			}
			}
		} while (condicao);

		return status;
	}

		
// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-TEMPLOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// TEMPLO 3
	static int[] ExecutaTemplo3(int[] status) {
		Scanner sc = new Scanner(System.in);
		boolean condicao = true,condicao2 = true;
do {
		frases = 6;
		do {
			status = Desafio1_Templo3(status);
			
			if (status[0] > 0) {
										
						
				status[1]++;			

			} else {
				Texto_Formatado(Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" infelizmente foi derrotado!! Mas através de um feitiço, é capaz de recomeçar o desafio");
				status[0] = 100;
				break;
			}	
		
		System.out.print("\nAperte ENTER para começar o próximo Desafio");
		sc.nextLine();
		System.out.println(" ");

		
			status = Desafio2_Templo3(status);
			
			
			if (status[0] > 0) {
				
				
				status[1]++;			

			} else {
				Texto_Formatado(Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" infelizmente foi derrotado!! Mas através de um feitiço, é capaz de recomeçar o desafio");
				status[0] = 100;
				break;
			}
		

		System.out.print("\nAperte ENTER para começar o último Desafio");
		sc.nextLine();
		System.out.println(" ");

	
			status = Desafio3_Templo3(status);
			
			if (status[0] > 0) {
				
				
				status[1]++;

				condicao = false;
				condicao2 = false;
				
			} else {
				
				Texto_Formatado(Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" infelizmente foi derrotado!! Mas através de um feitiço, é capaz de recomeçar o desafio");
				status[0] = 100;
				break;
			
			}
		} while (condicao);
	}while (condicao2);

		
		
		FormataTexto1("Você está preparado para o ");
		FormataTexto2("F I N A L ");
		FormataTexto2("B O S S ");
		FormataTexto2("? ? ?");
		System.out.println("\n");
		return status;
	}

	// DESAFIO É CONVERTER UM NÚMERO QUE ESTÁ EM UMA BASE PARA OUTRA
	static int[] Desafio1_Templo3(int[] status) {
		int baseInicial, baseConversao;
		String respostaCerta;

		String[] numeroInicial = new String[1];
		String[] opcoes = new String[5];
		ArrayList<String> respostaErrada = new ArrayList();

		////////////////////////////////////////////////////////////////////////
		// Area para preparar os numeros
		baseInicial = DeterminaBase_Templo3(); // Determinando a base standard

		do {
			baseConversao = DeterminaBase_Templo3(); // Determinando a base de conversao
		} while (baseConversao == baseInicial);

		numeroInicial[0] = DeterminaNumero_Templo3(baseInicial); // Determinando o numero standard

		respostaCerta = DeterminaNumeroConv_Templo3(numeroInicial, baseInicial, baseConversao); // Determinando o numero
																								// de conversao (certo)

		respostaErrada.add(respostaCerta); // Adicionando a resposta certa nas opcoes

		for (int i = 0; i < 4; i++) {
			respostaErrada.add(DeterminaOpcoes(baseConversao, respostaCerta)); // Adicionando opcoes erradas
		}

		Collections.shuffle(respostaErrada); // Embaralhando as opcoes para que haja uma aleatoriedade
		Collections.shuffle(respostaErrada);

		for (int i = 0; i < opcoes.length; i++) {
			opcoes[i] = respostaErrada.get(i); // Transferindo as opcoes do ArrayList para uma String[]
		}

		////////////////////////////////////////////////////////////////////////
		// Area de logica do game
		

		String enunciado = String.valueOf("\nConverta o numero "+numeroInicial[0]+" que esta na base "+baseInicial+" para a base "+baseConversao+"\n\n");
		
		//  System.out.printf("\nConverta o numero %S que esta na base %d para a base %d\n\n", numeroInicial[0],
		//	baseInicial, baseConversao);
		//  Timer2();

		status = ProcessoAlternativas_Geral(opcoes, status, respostaCerta,enunciado);

		return status;
	}

	// DESAFIO É SOMAR DOIS NÚMEROS QUE ESTÃO EM UMA BASE E CONVERTER PARA OUTRO
	static int[] Desafio2_Templo3(int[] status) {
		// Area para inicializar variaveis
		int baseInicial, baseConversao;
		String respostaCerta;

		String[] numeroInicial = new String[2];
		String[] opcoes = new String[5];
		ArrayList<String> respostaErrada = new ArrayList();
		////////////////////////////////////////////////////////////////////////
		// Area para declarar os numeros

		baseInicial = DeterminaBase_Templo3(); // Gerar a base standard

		do {
			baseConversao = DeterminaBase_Templo3(); // Gerar a base para conversao
		} while (baseConversao == baseInicial);

		numeroInicial[0] = DeterminaNumero_Templo3(baseInicial); // Gerar o numero standard A
		numeroInicial[1] = DeterminaNumero_Templo3(baseInicial); // Gerar o numero standard B

		respostaCerta = DeterminaNumeroConv_Templo3(numeroInicial, baseInicial, baseConversao); // Gerar a resposta
																								// certa

		respostaErrada.add(respostaCerta); // Adicionando a resposta certa no ArrayList

		for (int i = 0; i <= 3; i++) {
			respostaErrada.add(DeterminaOpcoes(baseConversao, respostaCerta)); // Criando respostas erradas para o
																				// ArrayList
		}

		Collections.shuffle(respostaErrada); // Embaralhando as opcoes
		Collections.shuffle(respostaErrada);

		for (int i = 0; i < opcoes.length; i++) {
			opcoes[i] = respostaErrada.get(i); // Adicionando as opcoes embaralhadas numa String para fazer o desafio
		}

		
		String enunciado = String.valueOf("\nFaça a seguinte conversão:\n"+numeroInicial[0]+" + "+numeroInicial[1]+" (na base "+baseInicial +") = X (na base "+baseConversao+")\n\n" );
		
		//		System.out.printf("\nFaça a seguinte conversão:\n%S + %S (na base %d) = X (na base %d)\n\n", numeroInicial[0],
		//		numeroInicial[1], baseInicial, baseConversao);
		//		Timer2();

		ProcessoAlternativas_Geral(opcoes, status, respostaCerta,enunciado);

		return status;
	}

	// DESAFIO É MULTIPLICAR DOIS NÚMEROS QUE ESTÃO EM UMA BASE E CONVERTER PARA OUTRO
	static int[] Desafio3_Templo3(int[] status) {
		// Area para declarar variaveis
		int baseInicial, baseConversao, aux;
		String respostaCerta;

		String[] numeroInicial = new String[2];
		String[] opcoes = new String[5];
		ArrayList<String> respostaErrada = new ArrayList();
		////////////////////////////////////////////////////////////////////////
		// Area para iniciar variaveis
		baseInicial = DeterminaBase_Templo3(); // Gerar a base inicial

		do {
			baseConversao = DeterminaBase_Templo3(); // Gerar a base para conversao
		} while (baseConversao == baseInicial);

		numeroInicial[0] = DeterminaNumero_Templo3(baseInicial); // Gerar numero standard A
		numeroInicial[1] = DeterminaNumero_Templo3(baseInicial); // Gerar numero standard B

		aux = (Integer.parseInt(numeroInicial[0], baseInicial)) * (Integer.parseInt(numeroInicial[1], baseInicial)); // Convertendo
																														// o
																														// produto
																														// dos
																														// numeros
																														// standard
																														// para
																														// int

		respostaCerta = Integer.toString(aux, baseConversao); // Convertendo o produto dos numeros standard para a base
																// de conversao

		respostaErrada.add(respostaCerta); // Adicionando a resposta certa nas opcoes

		for (int i = 0; i <= 3; i++) {
			respostaErrada.add(DeterminaOpcoes(baseConversao, respostaCerta)); // Adicionando as opcoes erradas
		}

		Collections.shuffle(respostaErrada); // Embaralhando as opcoes
		Collections.shuffle(respostaErrada);

		for (int i = 0; i < opcoes.length; i++) {
			opcoes[i] = respostaErrada.get(i);// Adicionando as opcoes em String para fazer o desafio
		}

		
		String enunciado = String.valueOf("\nFaça a seguinte conversão:\n"+numeroInicial[0]+" * "+numeroInicial[1]+" (na base "+baseInicial +") = X (na base "+baseConversao+")\n\n" );
		

		//			System.out.printf("\nFaça a seguinte conversão:\n%S * %S (na base %d) = X (na base %d)\n\n", numeroInicial[0],
		//			numeroInicial[1], baseInicial, baseConversao);
		//			Timer2();

		ProcessoAlternativas_Geral(opcoes, status, respostaCerta,enunciado);

		return status;
	}

	// FUNÇÕES DO TEMPLO 3
	static int DeterminaBase_Templo3() {

		ArrayList<Integer> bases = new ArrayList();

		bases.add(2);
		bases.add(8);
		bases.add(10);
		bases.add(16);

		Collections.shuffle(bases);
		Collections.shuffle(bases);

		return bases.get(0);
	}

	static String DeterminaNumero_Templo3(int baseInicial) {

		Random dado = new Random();
		int numRandom;
		String baseAconv = null;

		do {
			numRandom = dado.nextInt(500);
		} while (numRandom <= 50);

		switch (baseInicial) {
		case 2:
			baseAconv = Integer.toBinaryString(numRandom);
			break;
		case 8:
			baseAconv = Integer.toOctalString(numRandom);
			break;
		case 10:
			baseAconv = Integer.toString(numRandom);
			break;
		case 16:
			baseAconv = Integer.toHexString(numRandom);
			break;
		}

		return baseAconv;
	}

	static String DeterminaOpcoes(int baseConversao, String respostaCerta) {
		Random dado = new Random();
		int aux = Integer.parseInt(respostaCerta, baseConversao);
		String opcoesFalsas;

		do {
			aux = aux + dado.nextInt(30);
			aux = aux - 15;
			opcoesFalsas = Integer.toString(aux, baseConversao);
		} while (opcoesFalsas.equals(respostaCerta));

		return opcoesFalsas;
	}

	static String DeterminaNumeroConv_Templo3(String[] numeroInicial, int baseInicial, int baseConversao) {
		int aux = 0;
		String respostaConversao;

		for (int i = 0; i < numeroInicial.length; i++) {
			aux = aux + Integer.parseInt(numeroInicial[i], baseInicial);
		}

		respostaConversao = Integer.toString(aux, baseConversao);

		return respostaConversao;
	}

	// TEMPLO 2
	static void ExecutaTemplo2(){
	
	
		Scanner sc = new Scanner(System.in);
		boolean condicao = true, condicao2 = true;

		do {

			frases = 3;
			do {

				Desafio1_Templo2();

				if (status[0] > 0) {

					status[1]++;

				} else {
					Texto_Formatado(Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!! Mas através de um feitiço, é capaz de recomeçar o desafio");
					status[0] = 100;
					break;
				}

				System.out.print("\nAperte ENTER para começar o próximo Desafio");
				sc.nextLine();
				System.out.println(" ");

				Desafio2_Templo2();

				if (status[0] > 0) {

					status[1]++;

				} else {
					Texto_Formatado(Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!! Mas através de um feitiço, é capaz de recomeçar o desafio");
					status[0] = 100;
					break;
				}

				System.out.print("\nAperte ENTER para começar o próximo Desafio");
				sc.nextLine();
				System.out.println(" ");

				Desafio3_Templo2();

				if (status[0] > 0) {

					status[1]++;
					condicao = false;
					condicao2 = false;

				} else {
					Texto_Formatado(Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!! Mas através de um feitiço, é capaz de recomeçar o desafio");
					status[0] = 100;
					break;
				}
			} while (condicao);
		} while (condicao2);
	
}
	
	// FUNÇÕES DO TEMPLO 2
	static void Desafio1_Templo2() {
		//variáveis
		int r;
		Random rng = new Random();
		String enunciado;
		String[] opcoes = new String[5];
				
		//Questão
				
		//RANDOMIZANDO A QUESTÃO E REPETINDO ATÉ O ACERTO OU VIDA = 0
		
		
			r = rng.nextInt(3);
		switch(r) {
		//RECEBENDO A QUESTÃO RANDOMIZADA E RESOLVENDO A QUESTÃO.
			case 0:
				
				enunciado = "\nQuais são os coeficiêntes dessa equação de segundo grau. 2x² + x – 3 = 0\n";
				
						
				
				opcoes[0] = "a = -2  |  b = 0  |  c = -3";
				opcoes[1] = "a =  2  |  b = 1  |  c =  3";
				opcoes[2] = "a =  2  |  b = 1  |  c = -3";
				opcoes[3] = "a =  2  |  b = 0  |  c = -3";
				opcoes[4] = "a =  1  |  b = 0  |  c = -3";
				
				ProcessoAlternativas_Geral(opcoes,status,"a =  2  |  b = 1  |  c = -3",enunciado);
				
				break;
				
			case 1:
				
				enunciado = "\nQuais são os coeficiêntes dessa equação de segundo grau. –3x² + 18x – 15 = 0\n";
				
				
				
				
				opcoes[0] = "a = -3  |  b = -18  |  c = -15";
				opcoes[1] = "a =  3  |  b =  18  |  c = -15";
				opcoes[2] = "a = -3  |  b =  18  |  c =  15";
				opcoes[3] = "a = -3  |  b =  18  |  c = -15";
				opcoes[4] = "a =  3  |  b =  18  |  c =   0";
				
				
				
				ProcessoAlternativas_Geral(opcoes,status,"a = -3  |  b =  18  |  c = -15",enunciado);
				
				
				break;
				
			case 2:
				
				enunciado = "\nQuais são os coeficiêntes dessa equação de segundo grau. 3x² – x – 1 = 0\n";
			
				
				
				opcoes[0] = "a = -3  |  b =  -1  |  c = -1";
				opcoes[1] = "a =  3  |  b =  -1  |  c = -1";
				opcoes[2] = "a = -3  |  b =   0  |  c =  1";
				opcoes[3] = "a =  3  |  b =  -1  |  c =  1";
				opcoes[4] = "a =  1  |  b =   0  |  c = -3";
				
				ProcessoAlternativas_Geral(opcoes,status,"a =  3  |  b =  -1  |  c = -1",enunciado);
				
				break;
		}
		
	
		}
	
	static void Desafio2_Templo2() {
		//variáveis
		int r;
		Random rng = new Random();
		String enunciado;
		String[] opcoes = new String[5];
		
		//Enunciado
		
		//Randomizando a questão
		
		
		//RECEBENDO A QUESTÃO RANDOMIZADA E RESOLVENDO A QUESTÃO.
	
			r = rng.nextInt(3);
		switch(r) {
		case 0:
			
			enunciado = "\nQual é a maior raiz da equação -2x² + 3x + 5 = 0?\n";
			
			
			opcoes[0] = "-1";
			opcoes[1] = "-2,5";
			opcoes[2] = "2";
			opcoes[3] = "2,5";
			opcoes[4] = "1";
			
			ProcessoAlternativas_Geral(opcoes,status,"2,5",enunciado);
			
			
		
			break;
		case 1:
			
			enunciado = "\nQual é a menor raiz da equação 2x² + 7x + 5 = 0\n";
			
			
			opcoes[0] = "-1";
			opcoes[1] = "1";
			opcoes[2] = "-5/2";
			opcoes[3] = "-2";
			opcoes[4] = "-2/5";
			
			ProcessoAlternativas_Geral(opcoes,status,"-5/2",enunciado);
			
			break;
			
		case 2:
			
			enunciado = "\nQuais são as duas raízes da equação 3x² – x – 2 = 0\n";
			
			
			opcoes[0] = "x1 =  2/3 | x2 =  1";
			opcoes[1] = "x1 = -2/3 | x2 = -1";
			opcoes[2] = "x1 = -2/3 | x2 =  1";
			opcoes[3] = "x1 =  -1  | x2 = 2/3";
			opcoes[4] = "x1 =  -1  | x2 = -2/3";
			
			ProcessoAlternativas_Geral(opcoes,status,"x1 = -2/3 | x2 =  1",enunciado);
			
			break;
			
		}
			
	
	}
	
	static void Desafio3_Templo2() {
		//Variaveis
		int r;
		Random rng = new Random();
		String enunciado;
		String[] opcoes = new String[5];
		
		//Enunciado
		
			r = rng.nextInt(3);
		switch(r) {
		case 0:
			
			enunciado = "\nQual é a resolução da seguinte equação do segundo grau x² – 4x – 5 = 0?\n";
			
			
			opcoes[0] = "x1 =  1  | x2 =  5";
			opcoes[1] = "x1 = -1  | x2 =  5";
			opcoes[2] = "x1 = -1  | x2 = -5";
			opcoes[3] = "x1 = -5  | x2 =  1";
			opcoes[4] = "x1 = -3  | x2 =  5";
			
			ProcessoAlternativas_Geral(opcoes,status,"x1 = -1  | x2 =  5",enunciado);
			
			
			break;
		case 1:
			
			enunciado = "\nTemos na equação 10x² – 1000 = 0, duas raízes reais e distintas, a e b, que podem ser encontradas. Determine a² + b²\n";
			
			
			opcoes[0] = "100";
			opcoes[1] = "50";
			opcoes[2] = "250";
			opcoes[3] = "200";
			opcoes[4] = "1000";
			
			ProcessoAlternativas_Geral(opcoes,status,"200",enunciado);
				
			break;
		case 2:
			
			enunciado = "\nQual será o resultado do produto das duas raízes da equação 5x² - 125 = 0\n";
			
			
			opcoes[0] = "-25";
			opcoes[1] = "20";
			opcoes[2] = "25";
			opcoes[3] = "30";
			opcoes[4] = "125";
			
			ProcessoAlternativas_Geral(opcoes,status,"-25",enunciado);
			
			
			break;
			
		}
	
		
		
	}
	
	// TEMPLO 1
	static int[] ExecutaTemplo1(int[] status) {
		Scanner sc = new Scanner(System.in);
		boolean condicao = true, condicao2 = true;

		do {
			frases = 0;
			do {
				status = Desafio1_Templo1(status);
				if (status[0] > 0) {

					status[1]++;

				} else {
					Texto_Formatado(
							Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!! Mas através de um feitiço, é capaz de recomeçar o desafio");
					status[0] = 100;
					break;
				}
				System.out.print("\nAperte ENTER para começar o próximo Desafio");
				sc.nextLine();
				System.out.println(" ");

				status = Desafio2_Templo1(status);

				if (status[0] > 0) {

					status[1]++;

				} else {
					Texto_Formatado(
							Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!! Mas através de um feitiço, é capaz de recomeçar o desafio");
					status[0] = 100;
					break;
				}

				System.out.print("\nAperte ENTER para começar o último Desafio");
				sc.nextLine();
				System.out.println(" ");

				status = Desafio3_Templo1(status);
				if (status[0] > 0) {

					status[1]++;

					condicao = false;
					condicao2 = false;

				} else {

					Texto_Formatado(
							Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!! Mas através de um feitiço, é capaz de recomeçar o desafio");
					status[0] = 100;
					break;

				}
			} while (condicao);
		} while (condicao2);
		return status;
	}

    static int[] Desafio1_Templo1(int[] status) {
        //Area para declarar variaveis
        int[] numeroInicial = new int[2];
        String[] opcoes = new String[5];
        String[] testeRespostaErrada = new String[4];
        ArrayList<String> respostaErrada = new ArrayList();

        String respostaCerta;

        //Area para processos
        numeroInicial = DeterminaNumeroInicial_Templo1(); //Determinando o numero A[0] e numero B[1]

        respostaCerta = Integer.toString(-numeroInicial[1] / numeroInicial[0]); //Determinando a resposta certa

        respostaErrada.add(respostaCerta); //Adicinando a resposta certa nas opcoes

        testeRespostaErrada = DeterminaOpcoesErradas_Templo1Teste(respostaCerta);

        for (int i = 0; i < 4; i++) {
            respostaErrada.add(testeRespostaErrada[i]);
            //respostaErrada.add(DeterminaOpcoesErradas_Templo1(numeroInicial, respostaCerta)); //Gerando respostas erradas para o desafio
        }

        Collections.shuffle(respostaErrada); //Deixando de forma aleatoria as opcoes
        Collections.shuffle(respostaErrada);

        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = respostaErrada.get(i); // Adicionando as opcoes em String para fazer o desafio
        }

        String enunciado = "";
       
        if (numeroInicial[1] > 0) {
          
            enunciado = String.valueOf("\nFaça a seguinte conta:\n\n"+numeroInicial[0]+"x + "+numeroInicial[1]+" = 0\n\n");
        } else 
        {
            
            enunciado = String.valueOf("\nFaça a seguinte conta:\n\n"+numeroInicial[0]+"x + ("+numeroInicial[1]+") = 0\n\n");
        }
        
        
        
        status = ProcessoAlternativas_Geral(opcoes, status, respostaCerta,enunciado);

        return status;
    }

    static int[] Desafio2_Templo1(int[] status) {
        //Area para declarar variaveis
        int[] numeroCima = new int[4];
        int[] numeroBaixo = new int[2];
        String[] testeRespostaErrada = new String[4];
        String[] opcoes = new String[5];
        ArrayList<String> respostaErrada = new ArrayList();
        int help1, help2, help3, help4;
        int mmc = 0, aux1 = 0, aux2 = 0, respostaCerta = 0;
        String respostaCertaStr;
        boolean condicao = true;

        //Area para processos
        //Determinar os numeros (ax + b) / y = (cx + d) / z
        do {
            try {
                do {
                    do {
                        numeroCima = DeterminaNumeroCima_Templo1(); // Determinar os numeros de cima
                        numeroBaixo = DeterminaNumBaixo_Templo1(); // Determinar os divisores

                        mmc = DeterminaMMC_Templo1(numeroBaixo[0], numeroBaixo[1]); // Determinar o MMC dos divisores

                        help1 = (numeroCima[0] * mmc) / numeroBaixo[0]; // Fazer o processo de MMC com cada numero
                        help2 = (numeroCima[1] * mmc) / numeroBaixo[0];
                        help3 = (numeroCima[2] * mmc) / numeroBaixo[1];
                        help4 = (numeroCima[3] * mmc) / numeroBaixo[1];

                        aux1 = help1 - help3; // Isolando os numeros
                        aux2 = help4 - help2;

                        respostaCerta = aux2 / aux1; // Obtendo a resposta
                    } while (aux1 == 0);
                } while (aux2 % aux1 != 0);
                if (respostaCerta != 0) {
                    condicao = false;
                }
            } catch (Exception e) {
            }
        } while (condicao);

        //////////////////////////////////
        //Fazer a parte das opcoes
        respostaCertaStr = Integer.toString(respostaCerta);

        testeRespostaErrada = DeterminaOpcoesErradas_Templo1Teste(respostaCertaStr);

        respostaErrada.add(respostaCertaStr);
        for (int i = 0; i < 4; i++) {
            respostaErrada.add(testeRespostaErrada[i]);
        }

        Collections.shuffle(respostaErrada);
        Collections.shuffle(respostaErrada);

        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = respostaErrada.get(i);
        }

        //////////////////////////////////
        // Enunciado
        
        String enunciado = String.valueOf("\nFaca a seguinte conta: \n"+numeroCima[0]+"x + "+numeroCima[1]+"  =  "+numeroCima[2]+"x + "+numeroCima[3]+"\n----------    ----------\n    "+numeroBaixo[0]+"            "+numeroBaixo[1]+"\n\n");  		
       
        // System.out.println("***\tWELCOME TO THE 2ND GAME\t***\n");
       // Timer2();
       // System.out.println("Faca a seguinte conta: \n");
       // Timer2();
       // System.out.printf("%dx + %d  =  %dx + %d\n----------    ----------\n    %d            %d\n\n", numeroCima[0], numeroCima[1], numeroCima[2], numeroCima[3], numeroBaixo[0], numeroBaixo[1]);
       // Timer2();

        status = ProcessoAlternativas_Geral(opcoes, status, respostaCertaStr,enunciado);

        return status;
    }

    static int[] Desafio3_Templo1(int[] status) {
        int[] numMultiplicador = new int[4];
        int[] numDivisor = new int[4];
        int[] numAcompanha = new int[4];
        int[] numSoma = new int[4];

        int[] aux = new int[16];

        int mmc;
        boolean condicao = true;

        ArrayList<String> respostaErrada = new ArrayList();

        String[] respostaErradaTeste = new String[4];
        String[] opcoes = new String[5];
        String respostaCertaStr;
        ////////////////////////////////////////////////////////////////////////
        //Fazendo a resolucao do problema
        //Parte feita para evitar que os numeros sejam divididos por zero e tambem para que o resultado seja != 0 e maior que 1
        do {
            try {
                do {
                    do {
                        numMultiplicador = DeterminaNumeroDesafio3_Templo1(1);
                        numAcompanha = DeterminaNumeroDesafio3_Templo1(2);
                        numSoma = DeterminaNumeroDesafio3_Templo1(3);
                        numDivisor = DeterminaNumeroDesafio3_Templo1(4);

                        mmc = DeterminaMMC_Desafio3_Templo1(numDivisor);

                        aux[0] = ((numMultiplicador[0] * numAcompanha[0]) * mmc) / numDivisor[0]; // numero com X
                        aux[1] = ((numMultiplicador[0] * numSoma[0]) * mmc) / numDivisor[0]; // numero sem X - passa para o outro lado

                        aux[2] = ((numMultiplicador[1] * numAcompanha[1]) * mmc) / numDivisor[1]; // numero com X
                        aux[3] = ((numMultiplicador[1] * numSoma[1]) * mmc) / numDivisor[1]; // numero sem X - passa para o outro lado

                        aux[4] = ((numMultiplicador[2] * numAcompanha[2]) * mmc) / numDivisor[2]; // numero com X - passa para o outro lado 
                        aux[5] = ((numMultiplicador[2] * numSoma[2]) * mmc) / numDivisor[2]; // numero sem X

                        aux[6] = aux[0] + aux[2] - aux[4]; // numero com X
                        aux[7] = aux[5] - (aux[1] + aux[3]); // numero sem X

                    } while (aux[7] % aux[6] != 0);

                    aux[8] = aux[7] / aux[6]; // respostaCerta

                } while (aux[8] <= 1);

                condicao = false;
            } catch (Exception e) {
            }
        } while (condicao);

        ////////////////////////////////////////////////////////////////////////
        //Definir a resposta certa e as opcoes para o desafio
        respostaCertaStr = Integer.toString(aux[8]);

        respostaErradaTeste = DeterminaOpcoesErradas_Templo1Teste(respostaCertaStr);

        for (int i = 0; i < 4; i++) {
            respostaErrada.add(respostaErradaTeste[i]);
        }
        
        respostaErrada.add(respostaCertaStr);
        
        Collections.shuffle(respostaErrada);
        Collections.shuffle(respostaErrada);
        
        for (int i = 0; i < 5; i++) {
            opcoes[i] = respostaErrada.get(i);
        }
       
        String enunciado = String.valueOf("\nResolva a seguinte função: \n"+numMultiplicador[0]+" ("+numAcompanha[0]+"x + "+numSoma[0]+")\t + \t"+numMultiplicador[1]
        		+" ("+numAcompanha[1]+"x + "+ numSoma[1]+")\t = \t"+numMultiplicador[2]+" ("+numAcompanha[2]+"x + "+ numSoma[2]+")\n-------------\t\t-------------\t\t-------------\n"
        	+"\t"+numDivisor[0]+"\t\t      "+numDivisor[1]+"\t\t      "+numDivisor[2]+"     \n\n");
        		
       // System.out.printf("Resolva a seguinte função: \n"
       //        + "%d (%dx + %d)\t + \t%d (%dx + %d)\t = \t%d (%dx + %d)\n"
       //         + "-------------\t\t-------------\t\t-------------\n"
       //        + "\t%d\t\t      %d\t\t      %d     \n ", numMultiplicador[0], numAcompanha[0], numSoma[0], numMultiplicador[1], numAcompanha[1], numSoma[1], numMultiplicador[2], numAcompanha[2], numSoma[2], numDivisor[0], numDivisor[1], numDivisor[2]);
        
       //  System.out.println("\n");
        
        status = ProcessoAlternativas_Geral(opcoes, status, respostaCertaStr,enunciado);
        
        return status;
    }

    // FUNÇÕES DO TEMPLO 1
    static int[] DeterminaNumeroCima_Templo1() {
        int[] num = new int[4];
        int determinaSinal;

        Random dado = new Random();

        ////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < 4; i++) {
            determinaSinal = dado.nextInt(2);

            switch (determinaSinal) {
                case 0:
                    do {
                        num[i] = dado.nextInt(150);
                    } while (Math.abs(num[i]) < 20);
                    break;
                case 1:
                    do {
                        num[i] = dado.nextInt(150) * -1;
                    } while (Math.abs(num[i]) < 20);
                    break;
            }
        }

        return num;
    }

    static int[] DeterminaNumBaixo_Templo1() {
        int[] num = new int[2];

        Random dado = new Random();

        for (int i = 0; i < 2; i++) {
            do {
                num[i] = dado.nextInt(15);
            } while (num[i] <= 1);
        }

        return num;
    }

    static int DeterminaMMC_Templo1(int a, int b) {
        int mmc;

        mmc = Math.max(a, b);

        while (mmc % Math.min(a, b) != 0) {
            mmc = mmc + Math.max(a, b);
        }

        return mmc;
    }

    static int[] DeterminaNumeroInicial_Templo1() {
        //Area para declarar variaveis
        Random dado = new Random();

        double[] numeroInicial = new double[2];
        int[] numeroConv = new int[2];

        int determinaSinal;

        //Area para fazer processos
        do {
            do {
                numeroInicial[0] = dado.nextInt(1000);
                numeroInicial[1] = dado.nextInt(10000);
            } while (numeroInicial[1] % numeroInicial[0] != 0);
        } while (numeroInicial[0] < 10);

        for (int i = 0; i < numeroInicial.length; i++) {
            determinaSinal = dado.nextInt(2);

            switch (determinaSinal) {
                case 0:
                    numeroConv[i] = (int) numeroInicial[i];
                    break;
                case 1:
                    numeroConv[i] = (int) numeroInicial[i] * -1;
                    break;
            }

        }

        return numeroConv;
    }

    static int[] DeterminaNumeroInicial_Desafio2_Templo1() {
        //Area para declarar valores
        double[] numeroInicial = new double[3];
        int[] numeroFinal = new int[3];

        Random dado = new Random();

        int aux;

        //Area para processos
        numeroInicial[0] = dado.nextInt(500);
        numeroInicial[1] = dado.nextInt(600);
        numeroInicial[2] = dado.nextInt(300);

        return numeroFinal;
    }

    static String[] DeterminaOpcoesErradas_Templo1Teste(String respostaCerta) {
        String[] respostaErrada = new String[4];
        int[] respostaErradaNum = new int[4];
        int aux1;

        Random dado = new Random();
        ////////////////////////////////////////////////////////////////////////

        aux1 = Integer.parseInt(respostaCerta);

        //Gerando opcoes erradas
        for (int i = 0; i < 4; i++) {
            do {
                respostaErradaNum[i] = aux1 + dado.nextInt(15) - 4;
            } while (respostaErradaNum[i] == aux1);
        }

        try {
            //Checando para ver se nao tem opcao repetida
            for (int i = 0; i < respostaErradaNum.length; i++) {
                for (int j = 0; j < respostaErradaNum.length - 1; j++) {
                    if (respostaErradaNum[j] == respostaErradaNum[j + 1]) {
                        do {
                            //System.out.println("PASSEI AQUI\n");
                            respostaErradaNum[j] = respostaErradaNum[j] + dado.nextInt(3);
                        } while (respostaErradaNum[j] == aux1);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Deu ruim");
        }

        for (int i = 0; i < respostaErradaNum.length; i++) {
            respostaErrada[i] = Integer.toString(respostaErradaNum[i]);
        }

        return respostaErrada;
    }

    static int DeterminaMMC_Desafio3_Templo1(int[] numDivisor) {
        int mmc, aux;
        boolean condicao = true;

        for (int i = 0; i < numDivisor.length; i++) {
            for (int y = 0; y < numDivisor.length - 1; y++) {
                if (numDivisor[y] < numDivisor[y + 1]) {
                    aux = numDivisor[y];
                    numDivisor[y] = numDivisor[y + 1];
                    numDivisor[y + 1] = aux;
                }
            }
        }

        mmc = numDivisor[0];

        while (condicao) {
            mmc = mmc + numDivisor[0];

            if (mmc % numDivisor[0] == 0) {
                if (mmc % numDivisor[1] == 0) {
                    if (mmc % numDivisor[2] == 0) {
                        condicao = false;
                    }
                }
            }
        }

        return mmc;
    }

    static int[] DeterminaNumeroDesafio3_Templo1(int indice) {
        int[] num = new int[4];
        int determinaSinal;
        Random dado = new Random();

        switch (indice) {
            case 1: // Decidir o multiplicador
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(20);
                    } while (num[i] <= 2);
                }
                break;
            case 2: // indicar o numero que acompanha X
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(50);
                    } while (num[i] <= 1);
                }
                break;
            case 3: // Indicar o numero que faz a soma dentro do parenteses
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(75);
                    } while (num[i] <= 1);
                }
                break;
            case 4: // Indicar o numero que divide a conta
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(15);
                    } while (num[i] <= 2);
                }
                break;
        }

        ////////////////////////////////////////
        for (int i = 0; i < num.length; i++) {
            determinaSinal = dado.nextInt(2);

            if (determinaSinal == 1) {
                num[i] = num[i] * -1;
            }
        }

        return num;
    }

    // BOSS
    static int[] ExecutaFinalBoss(int[] status) {
       
        boolean condicao = true;

        do {
        	
            status = FinalBoss_FinalFase(status);
            if (status[0] > 0) {
                
                condicao = false;
            } else {
            	Texto_Formatado(
						Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!! Mas através de um feitiço, é capaz de recomeçar o desafio");
				
                status[0] = 100;
            }
        } while (condicao);
        return status;
    }

    static int[] FinalBoss_FinalFase(int[] status) {
        int[] num; // sem X
        int[] numX; // com X
        int[] raiz;
        int[] raiz2;
        double[] cima = new double[2];
        double divisor;
        int x2, x, n; // A, B, C
        double delta;

        int[] respostaErradaInt_Raiz1;
        int[] respostaErradaInt_Raiz2;
        int[] baseConversao = new int[5];
        
        String enunciado;
        String respostaCerta;
        String[] respostaErrada;

        String[] opcoes = new String[5];
        ArrayList<String> embaralhador = new ArrayList();
        ////////////////////////////////////////////////////////////////////////
        // Determinando os numeros do exercicio e tambem a resolucao
        do {
            do {
                num = DeterminaNumero_FinalBoss(); // Determinando numeros sem X
                numX = DeterminaNumero_FinalBoss(); // Determinando numeros com X

                // Organizando a equacao
                x2 = (numX[0] * numX[1]) + (numX[2] * numX[3]); // Ax²
                x = (numX[0] * num[1]) + (num[0] * numX[1]) + (numX[2] * num[3]) + (num[2] * numX[3]); //Bx
                n = (num[0] * num[1]) + (num[2] * num[3]); // C
            } while (x2 == 0);
            delta = Math.pow(x, 2) - (4 * x2 * n); // Fazendo delta

        } while (Math.sqrt(delta) % 1 != 0);

        divisor = x2 * 2;
        cima[0] = -x + Math.sqrt(delta);
        cima[1] = -x - Math.sqrt(delta);
        
        // raiz 1
        if (cima[0] % divisor == 0) { // se a divisão for exata, fazer a divisão
            raiz = new int[1];
            raiz[0] = (int) (cima[0] / divisor);

            if (raiz[0] == 0) {
                raiz[0] = Math.abs(raiz[0]);
            }
        } else { // se a divisão não for exata, simplificar a fração
            raiz = SimplificaFracao_FinalBoss(cima[0], divisor);
        }

        // raiz 2
        if (cima[1] % divisor == 0) { // se a divisão for exata, fazer a divisao
            raiz2 = new int[1];
            raiz2[0] = (int) (cima[1] / divisor);

            if (raiz[0] == 0) {
                raiz[0] = Math.abs(raiz[0]);
            }
        } else { // se a divisão não for exata, simplificar a fração
            raiz2 = SimplificaFracao_FinalBoss(cima[1], divisor);
        }

        ////////////////////////////////////////////////////////////////////////
        // Parte para gerar respostas em String e fazer o desafio
        // As respostas estarao convertidas em outras bases para que o player faça a conversão
        //Raiz 1
        respostaErradaInt_Raiz1 = ProduzRespostaErrada_FinalBoss(raiz);

        //Raiz 2
        respostaErradaInt_Raiz2 = ProduzRespostaErrada_FinalBoss(raiz2);

        // Fazendo a conversao de todas as respostas para bases
        for (int i = 0; i < 5; i++) { // Determinar as bases para conversao para cada alternativa
            baseConversao[i] = DeterminaBase_FinalBoss();
        }

        respostaCerta = ProduzRespostaCerta_FinalBoss(raiz, raiz2, baseConversao); // Juntando a resposta certa em uma String e tambem informando a base que a resposta foi convertida
        respostaErrada = ProduzRespostaErradaStr_FinalBoss(respostaErradaInt_Raiz1, respostaErradaInt_Raiz2, baseConversao); // Juntando todas as respostas erradas em Strings parecidas com a resposta certa

        //adicionando as opcoes para embaralhar
        embaralhador.add(respostaCerta);

        for (int i = 0; i < 4; i++) {
            embaralhador.add(respostaErrada[i]);
        }

        Collections.shuffle(embaralhador); // Emabralhando as opcoes
        Collections.shuffle(embaralhador);

        for (int i = 0; i < 5; i++) { // Adicionando todas as opcoes em String depois de embaralhadas para conseguir fazer o desafio
            opcoes[i] = embaralhador.get(i);
        }
        
        enunciado = "Ache as raízes da equação, que estão expostas em outra base\n\n" + "(" + numX[0] + "x + " + num[0] + ") " + "(" + numX[1] + "x + " + num[1] + ")" + " + " + "(" + numX[2] + "x + " + num[2] + ") " + "(" + numX[3] + "x + " + num[3] + ") = 0\n";
        
       // System.out.println(enunciado);
        
        status = ProcessoAlternativas_Geral(opcoes, status, respostaCerta,enunciado);

        return status;
    }

    // FUNÇÕES DO BOSS
    static int[] DeterminaNumero_FinalBoss() {
        Random dado = new Random();
        int[] num = new int[4];
        int determinaSinal;

        for (int i = 0; i < 4; i++) {
            do {
                num[i] = dado.nextInt(35);
            } while (num[i] <= 0);

            determinaSinal = dado.nextInt(2);

            if (determinaSinal == 1) {
                num[i] = num[i] * -1;
            }
        }

        return num;
    }

    static int[] SimplificaFracao_FinalBoss(double a, double b) {
        double auxA = a, auxB = b;
        int determinaSinal = 0;
        int[] resposta = new int[2];

        if ((a < 0 && b < 0)) {
            determinaSinal = 1;
        }

        if (a > 0 && b < 0) {
            determinaSinal = 2;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        switch (determinaSinal) {
            case 1:
            case 2:
                resposta[0] = (int) ((auxA / a) * -1);
                resposta[1] = (int) ((auxB / a) * -1);
                break;
            default:
                resposta[0] = (int) (auxA / a);
                resposta[1] = (int) (auxB / a);
                break;
        }

        return resposta;
    }

    static int[] ProduzRespostaErrada_FinalBoss(int[] raiz) {
        Random dado = new Random();
        int[] respostaErrada = null;

        //gerar resposta para as raizes de forma separada
        switch (raiz.length) {
            case 1:
                respostaErrada = new int[4];

                for (int i = 0; i < 4; i++) {
                    do {
                        respostaErrada[i] = (raiz[0] + dado.nextInt(28)) - 9;
                    } while (respostaErrada[i] == raiz[0]);
                }

                try {
                    //Checando para ver se nao tem opcao repetida
                    for (int i = 0; i < respostaErrada.length; i++) {
                        for (int j = 0; j < respostaErrada.length - 1; j++) {
                            if (respostaErrada[j] == respostaErrada[j + 1]) {
                                do {
                                    //System.out.println("PASSEI AQUI\n");
                                    respostaErrada[j] = respostaErrada[j] + dado.nextInt(3);
                                } while (respostaErrada[j] == raiz[0]);
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Deu ruim");
                }
                break;
            case 2:
                respostaErrada = new int[8];

                for (int i = 0; i < 8; i++) {
                    do {
                        respostaErrada[i] = (raiz[0] + dado.nextInt(28)) - 9;
                    } while (respostaErrada[i] == raiz[0]);
                }

                try {
                    //Checando para ver se nao tem opcao repetida
                    for (int i = 0; i < respostaErrada.length; i++) {
                        for (int j = 0; j < respostaErrada.length - 1; j++) {
                            if (respostaErrada[j] == respostaErrada[j + 1]) {
                                do {
                                    //System.out.println("PASSEI AQUI\n");
                                    respostaErrada[j] = respostaErrada[j] + dado.nextInt(3);
                                } while (respostaErrada[j] == raiz[0]);
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Deu ruim");
                }
                break;
        }
        return respostaErrada;
    }

    static String[] ProduzRespostaErradaStr_FinalBoss(int[] raiz, int[] raiz2, int[] baseConversao) {
        String[] raiz1Errada = new String[4];
        String[] raiz2Errada = new String[4];
        String[] respostaErrada = new String[4];

        switch (raiz.length) {
            case 4:
                for (int i = 0; i < 4; i++) {
                    raiz1Errada[i] = Integer.toString(raiz[i], baseConversao[i + 1]);
                }
                break;
            case 8:
                raiz1Errada[0] = Integer.toString(raiz[0], baseConversao[1]) + " / " + Integer.toString(raiz[1], baseConversao[1]);
                raiz1Errada[1] = Integer.toString(raiz[2], baseConversao[2]) + " / " + Integer.toString(raiz[3], baseConversao[2]);
                raiz1Errada[2] = Integer.toString(raiz[4], baseConversao[3]) + " / " + Integer.toString(raiz[5], baseConversao[3]);
                raiz1Errada[3] = Integer.toString(raiz[6], baseConversao[4]) + " / " + Integer.toString(raiz[7], baseConversao[4]);
                break;
        }

        switch (raiz2.length) {
            case 4:
                for (int i = 0; i < 4; i++) {
                    raiz2Errada[i] = Integer.toString(raiz2[i], baseConversao[i + 1]);
                }
                break;
            case 8:
                raiz2Errada[0] = Integer.toString(raiz2[0], baseConversao[1]) + " / " + Integer.toString(raiz2[1], baseConversao[1]);
                raiz2Errada[1] = Integer.toString(raiz2[2], baseConversao[2]) + " / " + Integer.toString(raiz2[3], baseConversao[2]);
                raiz2Errada[2] = Integer.toString(raiz2[4], baseConversao[3]) + " / " + Integer.toString(raiz2[5], baseConversao[3]);
                raiz2Errada[3] = Integer.toString(raiz2[6], baseConversao[4]) + " / " + Integer.toString(raiz2[7], baseConversao[4]);
                break;
        }
        for (int i = 0; i < 4; i++) {
            respostaErrada[i] = "X1 = " + raiz1Errada[i].toUpperCase() + "\n      X2 = " + raiz2Errada[i].toUpperCase() + "\n     (Na base " + Integer.toString(baseConversao[i + 1]) + ")";
        }
        return respostaErrada;
    }

    static int DeterminaBase_FinalBoss() {

        ArrayList<Integer> bases = new ArrayList();

        bases.add(2);
        bases.add(8);
        bases.add(16);

        Collections.shuffle(bases);
        Collections.shuffle(bases);

        return bases.get(0);
    }

    static String ProduzRespostaCerta_FinalBoss(int[] raiz, int[] raiz2, int[] baseConversao) {
        String raiz1Certa = null, raiz2Certa = null, respostaCerta;

        switch (raiz.length) {
            case 1:
                raiz1Certa = Integer.toString(raiz[0], baseConversao[0]);
                break;
            case 2:
                raiz1Certa = Integer.toString(raiz[0], baseConversao[0]) + " / " + Integer.toString(raiz[1], baseConversao[0]);
                break;
        }

        switch (raiz2.length) {
            case 1:
                raiz2Certa = Integer.toString(raiz2[0], baseConversao[0]);
                break;
            case 2:
                raiz2Certa = Integer.toString(raiz2[0], baseConversao[0]) + " / " + Integer.toString(raiz2[1], baseConversao[0]);
                break;
        }

        respostaCerta = "X1 = " + raiz1Certa.toUpperCase() + "\n      X2 = " + raiz2Certa.toUpperCase() + "\n     (Na base " + Integer.toString(baseConversao[0]) + ")";
        return respostaCerta;
    }
}
