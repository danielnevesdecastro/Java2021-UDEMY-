package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// fï¿½rmmula conversï¿½o fahrenheit (ï¿½F -32 ) x 5/9 = ï¿½C
		final double ajuste = 32;
		final double fator = 5/9.0;
		
		double fahrenheit = 95;		
		double celsius = (fahrenheit - ajuste) * fator  ; // Conversï¿½o de temperaturas 
		
		System.out.println ("A temperatura de " +fahrenheit+ "F , Equivale a " +celsius+ "C");
		
		fahrenheit = 32;
		celsius = (fahrenheit - ajuste) * fator  ; 
		
		System.out.println ("A temperatura de " +fahrenheit+ "ºF , Equivale a " +celsius+ "C");
	}
}
