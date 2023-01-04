package controle;

import java.util.Scanner;

//Aula 67,68  Desafio 
public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o dia da semana: ");
		String dia = scan.next();

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if ("segunda".equalsIgnoreCase(dia)) { // outra forma de declara a fun��o equals
			System.out.println("2");
		} else if ("ter�a".equalsIgnoreCase(dia)) {
			System.out.println("3");
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("5");
		} else if ("sexta".equals(dia.toLowerCase())) { // mais uma forma , . to lower case converte o valor pra letrtas
			System.out.println("6");					// minusculas para comparaR
		} else {
			System.out.println("Op��o invalida ! ");
		}

		scan.close();
	}
}
