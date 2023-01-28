package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Aula 125 , Matriz
public class Matriz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("N� de Alunos:");
		int qtdalunos = scan.nextInt();
		System.out.println("Qtd de Notas:");
		int qtdnotas = scan.nextInt();

		// Matriz de 2 dimens�es
		double[][] notasAlunos = new double[qtdalunos][qtdnotas];

		double soma = 0;
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				int indiceAluno = i + 1;
				int indiceNota = j + 1;
				System.out.println(indiceAluno + "� Aluno, Nota" + indiceNota);
				notasAlunos[i][j] = scan.nextDouble();
				soma += notasAlunos[i][j];
			}

		}

		double media = soma / (qtdalunos * qtdnotas);
		System.out.printf("M�dia da  turma � %.1f \n", media);
		for (double[] nota : notasAlunos) {
			System.out.println(Arrays.toString(nota));
			
		}

		scan.close();
	}

}
