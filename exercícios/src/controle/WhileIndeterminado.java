package controle;

import java.util.Scanner;

//Aula71 , While indeterminado;
public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = "";
		
		while(!nome.equalsIgnoreCase("Sair")) { // usando ! pra invester ordem lógica da expressão , começa true 
			System.out.println("Você diz: ");
			nome = scan.next();
		}
		
		
		scan.close();
	}
}
