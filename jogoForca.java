import java.util.Scanner;

import ed.linear.seq.*;

public class jogoForca{
	
	public static void main(String[] args) {
		
		//armazena menu de opção
		Lista lista = new Lista(3);
		
		Scanner entrada = new Scanner(System.in);
		
		//armazena numero da opção escolhida
		int opcao;
		

		do {	
			System.out.println(" ");
			System.out.println("Bem vindo(a) ao jogo!");
			System.out.println(" ");
			System.out.println("---------------------");
			System.out.println("Qual nível de dificuldade? ");
			System.out.println(" ");
			System.out.println("0 - fácil");
			System.out.println("1 - médio");
			System.out.println("2 - difícil");
			System.out.println(" ");
			System.out.print("Informe apenas o número: ");
			opcao = entrada.nextInt();
			
		
		} while(opcao > 2); //não existe opção maior que 2
			
		// preenche lista
		lista.adicionar("facil");
		lista.adicionar("medio");
		lista.adicionar("dificil");
		
		//armazena a palavra chave
		String palavra = null;
				
		//verifica
		if(lista.elemento(opcao) == "facil") {
			palavra = NivelFacil();
		} else if(lista.elemento(opcao) == "medio") {
			palavra = NivelMedio();
		} else {
			palavra = NivelDificil();
		}
		
		//chama metodo que acontece o jogo
		jogo(palavra);
		
	}


	private static void jogo(String palavra) {
		
		char letra; //armazena letra digitada
		String palavraResultado; //armazena palavra digitada no final
		int contadorChances = 0; //conta as chances
		int contadorAcerto = 0; //aux no controle de letras repetidas
		int letraRepetida = 0; //verifica se tem repetição
		
		Scanner entrada = new Scanner(System.in);
		
		//armazena chances
		Fila fila = new Fila(5);
		
		//armazena letras acertadas
		Pilha pilha = new Pilha();
		
		fila.adicionar(1);
		fila.adicionar(2);
		fila.adicionar(3);
		fila.adicionar(4);
		fila.adicionar(5);
		
		System.out.println(" ");
		System.out.println("Total de chances: " + fila.comprimento());
		System.out.println(" ");
		
		do {

	
		System.out.print("Digite uma letra: ");
		letra = entrada.next().charAt(0);
		System.out.println(" ");
		
		//inicializa sempre com zero, evitando restos
		contadorAcerto = 0;
		letraRepetida = 0;
		
			
		for(int i=0; i< palavra.length(); i++) {
			if(palavra.charAt(i) == letra) { //palavra possui letra digitada
				
				for(int l=0; l < pilha.comprimento(); l++) { //verifica repetição
					
					if((Character)pilha.elemento(l) == letra) {
						letraRepetida++;
					}
				}
				
				if (letraRepetida == 0) {
					pilha.adicionar(letra);
					contadorAcerto++;
				} else {
					System.out.println("Letra já foi citada!");
					contadorAcerto++;
				}
					
				
			}
		}
		
		if(contadorAcerto == 0){
			System.out.println("Letra não encontrada");
			fila.remover();
			System.out.println("Total de chances: " + fila.comprimento());
		}else {
			System.out.println("Palavra possui as letras: " + pilha);
		}
		
		} while (contadorChances < fila.comprimento() && pilha.comprimento() < palavra.length());
		
		System.out.println("E ai, qual a palavra?");
		palavraResultado = entrada.next();
		
		
		if(palavra.equals(palavraResultado)) {
			System.out.println("Parabéns! Você ganhou.");
		} else {
			System.out.println("Perdeu hahaha!");
		}
		
	}


	private static String NivelFacil() {
		String palavra = "bola";
		return palavra;
	}
	
	private static String NivelMedio() {
		String palavra = "teclado";
		return palavra;
	}

	
	private static String NivelDificil() {
		String palavra = "python";
		return palavra;
	}
		
	
}
