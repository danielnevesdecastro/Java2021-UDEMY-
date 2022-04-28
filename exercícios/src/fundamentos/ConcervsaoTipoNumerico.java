package fundamentos;


// Conversão de tipos primitivos numéricos
public class ConcervsaoTipoNumerico {

	public static void main(String[] args) {

		double a = 1 ; //Conversão Implícita , tipo int >> double 
		System.out.println(a);
		
		//Conversão Explicita
		float b = (float) 1.1234589; // letra f no final do numero literal o tornaria float, porém vou fazer um casting
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; // vai truncar o valor , por conta do espaço na memória do byte , que vai até 127
		System.out.printf("%d  %d\n", c , d);
		
		double e = 3;
		int f = (int) e;
		System.out.printf("%.2f  %d", e, f);
		
	}
}
