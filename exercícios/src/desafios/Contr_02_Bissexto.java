package desafios;

import java.util.Scanner;

//Desafio 86
public class Contr_02_Bissexto {

	public static void main(String[] args) {
		// ano bissexto ?
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o Ano:");
		int ano = scan.nextInt();
		String bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0) ? 
				"Ano Bissexto!" : "N�o � ano Bissexto ! ";

		System.out.println(bissexto);

		// Vers�o do professor
		/*
		boolean bissexto2 = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);
		if (bissexto2 == true) {
			bissexto = "Ano bissexto!";
		} else {
			bissexto = "N�o � Bissexto!";
		}
		System.out.println(bissexto);
		scan.close();
		*/
	}

}
