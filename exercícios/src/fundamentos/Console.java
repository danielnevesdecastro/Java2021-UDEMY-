package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		//imprimi mensagem na mesma linha 
		System.out.print("Hello");
		// \n pula linha 
		System.out.print("Opa");
		System.out.print("\nBom dia !");
		
		//pula linha ap?s exibir mensagem
		System.out.println("Ol?");
		System.out.println("OII");
		
		// %n = quebra linha no printf
		System.out.printf("Megasena: %d %d %d %d %d %d %n",1, 2,3,4,5,6);
		System.out.printf("Sal?rio %.1f %n", 1234.5678);
		
		/*Receber dados do teclado
		Scanner entrada = new Scanner (System.in);
		entrada.nextLine();
		*/
		
		// solicitar os dados ao usu?rio e armazenar em uma string para exbi??o 
		System.out.println("Digite o seu nome:");
		//Abri scanner 
		Scanner entrada = new Scanner (System.in);
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine(); 
		
		System.out.println("Qual a sua idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("Seu nome ? %s %s ! %s, voc? tem %d anos !",nome,sobrenome,nome,idade);
		
		
		//encerra scanner
	
		entrada.close();
		
	}
}
