package controle;

//Aula 62, IF   
import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a M�dia: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7) {
			System.out.println("Parab�ns");
			System.out.println("Aprovado");
		}

		if (media < 7 && media >= 4.5) {
			System.out.println("Recupera��o!!!");
		}

		if (media < 4.5 && media >= 0) {
			System.out.println("REPROVADO...");
		}
		// salvando express�o booleana em uma vari�vel
		boolean aprova = media > 6.9 && media <= 10;
		// caso a espress�o seja extensa , para organiza��o
		if (aprova) {
			System.out.println("PASSOU !!! ");
		}

		entrada.close();
	}

}
