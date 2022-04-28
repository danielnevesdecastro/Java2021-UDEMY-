package fundamentos;


// Convers�o de tipos primitivos num�ricos
public class ConcervsaoTipoNumerico {

	public static void main(String[] args) {

		double a = 1 ; //Convers�o Impl�cita , tipo int >> double 
		System.out.println(a);
		
		//Convers�o Explicita
		float b = (float) 1.1234589; // letra f no final do numero literal o tornaria float, por�m vou fazer um casting
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; // vai truncar o valor , por conta do espa�o na mem�ria do byte , que vai at� 127
		System.out.printf("%d  %d\n", c , d);
		
		double e = 3;
		int f = (int) e;
		System.out.printf("%.2f  %d", e, f);
		
	}
}
