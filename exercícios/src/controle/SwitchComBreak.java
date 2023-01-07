package controle;

import java.util.Scanner;

//Aula 80 , Switch case 
public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String conceito = "";

		System.out.println("Informe a Nota");
		int nota = scan.nextInt();

		switch (nota) {

		case 10: case 9:
			conceito = "A";
			break;//para no bloco de código caso seja true
		case 8: case 7:
			conceito = "B";
			break;
		case 6:
			conceito = "C";
			break;
			default:
			conceito = "Inválido !!!";
		}
		
		System.out.println("Sua nota "+nota+"\nÉ Conceito "+conceito);
		scan.close();
	}
}
