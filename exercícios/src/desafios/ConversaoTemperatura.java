package desafios;

import java.util.Scanner;

/* 59 - DESAFIO
 * Desafio 1 : Criar um programa que leia a temperatura em Fahrenheit
e converta para Celsius.*/

public class ConversaoTemperatura {

	public static void main(String[] args) {
		
		//Abri Scanner
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Informe os Fahrenheit:");
		//Pega do usu�rio valor em fahrenheit // f�rmula convers�o de fahrenheit para Celsius
		double f = dado.nextDouble();
		double fparaC = (f - 32 ) * 5/9;
		//pegar \n do teclado inserido pelo usu�rio 
		dado.nextLine();
		
		System.out.printf("%.0f �F s�o %.2f graus Celsius \n" , f , fparaC);	
		
		System.out.println("Informe os graus Celsius");
		
		double c = dado.nextDouble();
		double cparaF = (c * 9/5) + 32 ;
		
		System.out.printf("%.0f �C s�o %.2f graus Fahrenheit",c, cparaF);
		
		dado.close();
	}
}
