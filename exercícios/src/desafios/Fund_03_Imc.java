package desafios;
// 59, Desafio 3
import java.util.Scanner;

public class Fund_03_Imc {
	/**
	 * 3. Criar um programa que leia o peso e a altura do usu�rio e imprima no
	 * console o IMC.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double peso, altura, imc;
		String tipo;

		System.out.println("Informe\n Peso: ");
		peso = scan.nextDouble();

		System.out.println("Altura: ");
		altura = scan.nextDouble();

		imc = peso / (altura * altura);

		System.out.printf("SEU IMC � DE %.2f\n", imc);

		if (imc <= 18.5) {
			tipo = "Magreza";
		} else if (imc > 18.5 && imc < 25) {
			tipo = "Normal";
		} else if (imc >= 25 && imc < 30) {
			tipo = "Sobrepeso";
		} else if (imc >= 30 && imc < 40) {
			tipo = "Obesidade";
		} else {
			tipo = "OBESIDADE GRAVE !!! ";
		}
		System.out.println("Sua classifica��o � : " + tipo);

		scan.close();

		scan.close();

	}
}
