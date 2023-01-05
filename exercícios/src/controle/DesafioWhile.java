package controle;

import java.util.Scanner;

//Aula 73,74, Desafio while 
public class DesafioWhile {
	public static void main(String[] args) {
		/*
		 * media das notas dos alunoas de uma turma; ( sem saber quantidade de ntoas
		 * inseridas user digita nota valida ( de 0>= && a <=10 ) armazenar valor da
		 * nota na var total var total ( armazeno soma de todas as notas ) var notasqtd
		 * = quantas notas válidas foram digitadas final mostra a media total / notasqtd
		 * para sair digitar -1 e depois calcular média
		 */
		Scanner scan = new Scanner(System.in);
		double nota = 0;
		double total = 0;
		int qtdNotas = 0;

		while (nota != -1) {

			System.out.println("Insira uma nota: ");
			nota = scan.nextDouble();
			if (nota >= 0 && nota <= 10) {
				total += nota;
				qtdNotas++;
			} else if (nota != -1) {
				System.out.println("Nota inválida !! ");
			} else {
				System.out.println("Notas informadas: " + qtdNotas);
			}

		}

		double media = total / qtdNotas;
		System.out.printf("Média %,.1f", media);

		scan.close();

	}
}
