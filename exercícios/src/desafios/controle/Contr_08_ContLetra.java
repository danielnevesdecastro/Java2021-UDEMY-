package desafios.controle;
//Desafio 86
import java.util.Scanner;

public class Contr_08_ContLetra {
	public static void main(String[] args) {
		//Recebe palavra e imprime no console letra pro letra;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a palavra: ");
		String palavra = scanner.nextLine();

		char letras[] = palavra.toCharArray();//to char array converte String em array de caracteres

		for (int i = 0; i < letras.length; i++) {// length diz o tamanho do array
			System.out.println(letras[i]);
		}

		scanner.close();
	}
}
