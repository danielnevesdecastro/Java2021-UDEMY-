package desafios;
//59 desafio 5
import java.util.Scanner;

public class Fund_05_Triangulo {
	public static void main(String[] args) {
		/** 4. Criar um programa que leia um valor e
		 * apresente os resultados ao quadrado e ao cubo do valor. */
		double base, altura;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe do Triangulo:\nBase: ");
		base = scan.nextDouble();
		System.out.println("Altura: ");
		altura = scan.nextDouble();
		double area = (base*altura)/2;
		
		System.out.println("�rea do Tri�ngulo �: "+area);
		
		scan.close();
		
		
	}
}
