package desafios.controle;

import java.util.Scanner;

//Desafio 86
public class Contr_04_NumPrimo {
	public static void main(String[] args) {
		// verificar se o numero e primo

		Scanner scan = new Scanner(System.in);
		int contDiv = 0;
		String primo="";
		
		System.out.println("N�mero : ");
		int num = scan.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contDiv++;
			}
		}
		
		if ( contDiv == 0) {
			primo = "� n�mero PRIMO!!!";
		}else{
			primo = "n�o � n�mero primo !";
		}
		
		System.out.println(primo);
		scan.close();
	}
}
