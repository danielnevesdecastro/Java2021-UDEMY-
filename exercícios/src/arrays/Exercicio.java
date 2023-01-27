package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		// desclarando Array
		double[] notasAlunoA = new double[4];
		//imprime valor default do tipo 
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		String notasA = Arrays.toString(notasAlunoA);
		System.out.println(notasA);
		//Acessar ultima posi��o do array , comprimento - 1 
		System.out.println(notasAlunoA[(notasAlunoA.length -1)]);
		
		
		for (int i = 0; i < notasAlunoA.length ; i++) {//poderia ser i < 3 
			double notas = notasAlunoA[i];
			System.out.println("posi��o "+i+": "+notas);
		}
		//m�dia aluno
		double totalA = 0;
		for (int i= 0; i < notasAlunoA.length ; i++) {
			totalA += notasAlunoA[i];
		}
		
		System.out.println("\n"+totalA/4);
		
		//declarando valores na cria��oi do array
		double [] notasAlunoB = { 6.9, 8.9 , 5.5, 10};
		
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		
		System.out.println(totalB / notasAlunoB.length);
		
	}
}
