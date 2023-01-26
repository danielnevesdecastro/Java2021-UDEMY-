package desafios.controle;

import java.util.Scanner;

//Desafio 86
public class Contr_09_MaiorNumero {
	public static void main(String[] args) {
		//Recebe 10 valores e imprime o maior deles 
		Scanner scan = new Scanner(System.in);
		int maior = 0;
		int num;

		for (int i = 1; i <= 10; ++i) {
			System.out.printf("Informe o N� %d\n", i);
			num = scan.nextInt();

			if (num > maior) {
				maior = num;
			}

		}
		System.out.println("O Maior n�mero � " + maior);
		scan.close();
		
		// Vers�o do professor
		/*
		Scanner scanner = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("\nDigite um numero: ");
			int valor = scanner.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);
		scanner.close();
		*/
	}
}
