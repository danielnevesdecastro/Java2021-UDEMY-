package desafios.classe;

import java.util.Scanner;

public class Jantar {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feij�o", 0.300);


		System.out.println("Nome:");
		p1.nome = scan.next();
		System.out.println("Peso");
		p1.peso = scan.nextDouble();

		System.out.println(p1.apresentar());

		p1.comer(c1);
		p1.comer(c1);
		p1.comer(c2);

		System.out.printf("\nDepois de comer estou com com %.3fKG ", p1.peso);

		scan.close();
	}
}
