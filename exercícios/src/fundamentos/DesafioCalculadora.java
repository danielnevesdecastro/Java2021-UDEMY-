package fundamentos;

import java.util.Scanner;

//56 - 57 - DESAFIO DO M?DULO

/*DESAFIO
 * ler o n1
 * ler n2 
 * escolher opera??o , + - * / % 
*/
public class DesafioCalculadora {
	
	public static void main (String[] args ) {
		
		Scanner dado = new Scanner(System.in);
		
		
		System.out.println("Informe N1:");
		double n1 = dado.nextDouble();
		System.out.println("Informe N2:");
		double n2 = dado.nextDouble();
		
		System.out.print("\nEscolha a opera??o: ");
		
		String op = dado.next();
		
		System.out.printf("\n%.2f %s %.2f \n", n1 , op, n2);
		
		//L?gica
		double resultado = "+".equals(op) ? n1+n2 : 0; 
		resultado = "-".equals(op) ? n1-n2 : resultado;
		resultado = "*".equals(op) ? n1*n2 : resultado;
		resultado = "/".equals(op) ? n1/n2 : resultado;
		resultado = "%".equals(op) ? n1%n2 : resultado;
		
			
		System.out.println("= "+resultado);
		
		dado.close();
		
	}
	
	
}
