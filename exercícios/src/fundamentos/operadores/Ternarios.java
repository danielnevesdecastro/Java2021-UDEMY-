package fundamentos.operadores;
//52 - Operadores ten�rios
import java.util.Scanner;

public class Ternarios {

	public static void main(String[] args ) {
		
		Scanner dado = new Scanner (System.in);
		
		Double med = dado.nextDouble();
		// opera��o ternaria , ? separa a express�o de verdadeiro ou falso, dos valores a serem atribuidos ;
		// express�o de true  : express�o se false; 
		String provaFinal = med <= 5 ?  " REPROVADO " :" EM PROVA FINAL  " ;
		String resultado = med >= 7.0 ? "Aprovado" : provaFinal;
		String ex = "!!!";
		
		System.out.println("O Aluno tirou " + med +", est� "+ resultado + ex );
	
		
		dado.close();
	}
	
}
