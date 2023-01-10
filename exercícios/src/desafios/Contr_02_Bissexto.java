package desafios;

import java.util.Scanner;

//Desafio 86
public class Contr_02_Bissexto {

	public static void main(String[] args) {
		// ano bissexto ?
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o Ano:");
		int ano = scan.nextInt();
		String bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0) ? "Ano Bissexto!"
				: "Não é ano Bissexto ! ";

		System.out.println(bissexto);
		scan.close();
		// Versão do professor
		/*
		 * boolean bissexto2 = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0); if
		 * (bissexto2 == true) { bissexto = "Ano bissexto!"; } else { bissexto =
		 * "Não é Bissexto!"; } System.out.println(bissexto); scan.close();
		 */
	}

}
