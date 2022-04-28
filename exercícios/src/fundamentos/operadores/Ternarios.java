package fundamentos.operadores;
//52 - Operadores tenários
import java.util.Scanner;

public class Ternarios {

	public static void main(String[] args ) {
		
		Scanner dado = new Scanner (System.in);
		
		Double med = dado.nextDouble();
		// operação ternaria , ? separa a expressão de verdadeiro ou falso, dos valores a serem atribuidos ;
		// expressão de true  : expressão se false; 
		String provaFinal = med <= 5 ?  " REPROVADO " :" EM PROVA FINAL  " ;
		String resultado = med >= 7.0 ? "Aprovado" : provaFinal;
		String ex = "!!!";
		
		System.out.println("O Aluno tirou " + med +", está "+ resultado + ex );
	
		
		dado.close();
	}
	
}
