package desafios.controle;

import java.util.Scanner;

//Desafio 86
public class Contr_06_AdvinhacaoNumeros {
	public static void main(String[] args) {
		// Advinhar o n�mero
		Scanner entrada = new Scanner(System.in);
		int numAdv = 89;
		int tentativas;
		String advinhacao = "";
		
		
		
		for (tentativas = 9; tentativas >= 0; tentativas--) {
			System.out.println("Advinhe o n�mero:");
			int num = entrada.nextInt();

			if (num > numAdv) {
				advinhacao = " N�mero Maior";
			} else if (num < numAdv) {
				advinhacao = "N�mero Menor";
			} else if (num == numAdv) {
				advinhacao = "\n*** Voc� Acertou !!! ***";
			}

			if (num != numAdv) {
				if (tentativas == 0) {
					System.out.println("\nVoc� n�o conseguiu, o n�mero era: " + numAdv);
					entrada.close();
					break;
				} else {
					System.out.println("Restam " + tentativas + "Tentativas");
					System.out.println(advinhacao);
				}
			} else {
				System.out.println(advinhacao);
				entrada.close(); // encerrar o scanner caso o break seja utilizado (elminei erro)
				break;
			}
		}
		entrada.close();
		
	}
	/*
	 * Corre��o professor: Scanner scanner = new Scanner(System.in); int continuar;
	 * int numeroSorteado; int tentativas; int numero;
	 * 
	 * do { System.out.println("Sorteando numero entre 0 e 100...\n"); Random
	 * numeroAleatorio = new Random(); numeroSorteado =
	 * numeroAleatorio.nextInt(101);
	 * 
	 * System.out.println("Come�ou o jogo! Sera que consegue me vencer?");
	 * tentativas = 0;
	 * 
	 * do { tentativas++; System.out.printf("Tentativa %d: ", tentativas); numero =
	 * scanner.nextInt();
	 * 
	 * if (numero > numeroSorteado) {
	 * 
	 * System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);
	 * 
	 * } else if (numero < numeroSorteado) {
	 * 
	 * System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);
	 * 
	 * } else {
	 * 
	 * System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n",
	 * tentativas); break; }
	 * 
	 * } while (tentativas != 10);
	 * 
	 * System.out.
	 * println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
	 * continuar = scanner.nextInt();
	 * 
	 * } while (continuar != 0);
	 * 
	 * scanner.close(); } }
	 * 
	 * 
	 */
}
