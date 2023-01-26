package desafios.controle;

import java.util.Scanner;

//Desafio 86
public class Contr_03_Notas {
	public static void main(String[] args) {
		//Aprovado-reprovado ap�s M�dia 
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, media;
		String status = "";

		System.out.println("Informe a Nota 1 :");
		nota1 = scan.nextDouble();
		System.out.println("Informe a Nota 2 :");
		nota2 = scan.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media >= 7) {
			status = "Aprovado";
		} else if (media < 7 && media > 4) {
			status = "Em Recupera��o";
		} else {
			status = "Reprovado";

		}
		
		System.out.printf("%.1f de m�dia, voc� est� %s !!!",media,status);
		scan.close();
	}
	
}
