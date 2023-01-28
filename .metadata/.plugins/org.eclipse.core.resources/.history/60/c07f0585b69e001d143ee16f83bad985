package arrays;
//Aula 123-124 , Desafio Array

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas Notas são :");
		int qtd = scan.nextInt();

		double[] notasAlunos = new double[qtd];

		for (int i = 0; i < notasAlunos.length; i++) {
			int indice = i + 1;
			System.out.println(indice + "ª Nota: ");
			notasAlunos[i] = scan.nextDouble();

		}
		
		double soma = 0;
		for (double nota: notasAlunos) {
			soma += nota;
		}
		double media = soma / notasAlunos.length;
		
		System.out.printf("\nForam informadas %d Notas e a \nMédia é:%.1f "
				,notasAlunos.length,media );
		scan.close();

	}

}
