package desafios;

//59, Desfio 6
import java.util.Scanner;

public class Fund_06_Bhaskara {

	public static void main(String[] args) {
		/*
		 * equa��es do segundo grau (ax2 + bx + c = 0) utilizando a f�rmula de Bhaskara
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("F�rmula de Bhaskara ax� + bx + c = 0");

		System.out.println("Valor de A: ");
		int a = scan.nextInt();

		System.out.println("Valor de B: ");
		int b = scan.nextInt(a);

		System.out.println("Valor de C: ");
		int c = scan.nextInt();

		int delta = (b * b) - (4 * a * c);
		System.out.printf("\nSua equa��o �: %dx� + %dx + %d = 0", a, b, c);

		System.out.println("\nO delta �: " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equa��o �: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equa��o �: %.2f", x2);

		scan.close();
		
	}
}
