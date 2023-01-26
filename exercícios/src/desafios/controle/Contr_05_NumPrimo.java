package desafios.controle;

import java.util.Scanner;

//Desafio 86
public class Contr_05_NumPrimo {
	public static void main(String[] args) {
		// verificar se o numero e primo
		Scanner scan = new Scanner(System.in);
		int contDiv = 0;
		String primo = "";

		System.out.println("Número : ");
		int num = scan.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contDiv++;
			}
		}

		switch (contDiv) {
		case 0:
			primo = "Número Primo";
			break;
		default:
			primo = "Não é número Primo!";
		}
		System.out.println(primo);
		scan.close();
	}
}