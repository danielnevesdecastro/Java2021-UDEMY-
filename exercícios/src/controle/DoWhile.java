package controle;

import java.util.Scanner;

//Aula 72, do while
public class DoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome = "";

		do {
			System.out.println("Diga : ");
			nome = scan.nextLine();

		} while (!nome.equalsIgnoreCase("sair")); // �nica estrutura de controle que termina com ; e n�o com um bloco.
		System.out.println("SAIU !!!");
		scan.close();

	}
}
