package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// f�rmmula convers�o fahrenheit (�F -32 ) x 5/9 = �C
		final double ajuste = 32;
		final double fator = 5/9.0;
		
		double fahrenheit = 95;		
		double celsius = (fahrenheit - ajuste) * fator  ; // Convers�o de temperaturas 
		
		System.out.println ("A temperatura de " +fahrenheit+ "�F , Equivale a " +celsius+ "�C");
		
		fahrenheit = 0;
		celsius = (fahrenheit - ajuste) * fator  ; 
		
		System.out.println ("A temperatura de " +fahrenheit+ "�F , Equivale a " +celsius+ "�C");
	}
}
