package desafios;
//59 , Desafio 4
import java.util.Scanner;

public class Fund_04_QuadradoCubo {
	/**
	 * 4. Criar um programa que leia um valor e apresente os resultados ao quadrado
	 * e ao cubo do valor.
	 */
	public static void main(String[] args) {
		double n1, quadrado, cubo;
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe \nN�1: ");
		n1 = scan.nextDouble();

		quadrado = n1 * n1;
		cubo = n1 * n1 * n1;
		/*
		 * poderia ser assim : double quadrado = Math.pow(valor, 2); double cubo =
		 * Math.pow(valor, 3);
		 */
		System.out.println(n1 + " Ao quadrado �:\n " + quadrado + "\ne ao Cubo:\n " + cubo);

		scan.close();

	}
}
