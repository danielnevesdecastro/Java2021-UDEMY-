package desafios.controle;

import java.util.Scanner;

//Desafio 86 
public class Contr_07_SomaNumeros {
	public static void main(String[] args) {
		//somar numeros positivos, parar execu��o com negativos 
		Scanner scan = new Scanner(System.in);
		int num;
		int somaNum = 0;
		int cont = 0;

		do {
			System.out.println("Informe um n�mero: (N� negativo para sair ...)");
			num = scan.nextInt();

			if (num >= 0) {
				somaNum += num;
				cont++;
				System.out.println("Soma dos " + cont +
						" n�meros informados: " + somaNum);
			}

		} while (num >= 0);
		System.out.println("N�emro informado: "+num + "\nPrograma encerrado ");
		scan.close();
	}
}
