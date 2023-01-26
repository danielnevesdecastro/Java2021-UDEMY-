
package desafios.fundamentos;
//59, Desafio 2
import java.util.Scanner;
/** 2. Criar um programa que leia a temperatura 
 * em  Celsius converta para Fahrenheit. */
public class Fund_02_ConversaoTemperatura {
	
	public static void main(String[] args) {

	Scanner dado = new Scanner(System.in);
	
	System.out.println("Informe os graus Celsius");
		
		double c = dado.nextDouble();
		double cparaF = (c * 9/5) + 32 ;
		dado.nextLine();
		System.out.printf("%.0f ºC são %.0f graus Fahrenheit",c, cparaF);
		
		dado.close();
		
	}
	}
