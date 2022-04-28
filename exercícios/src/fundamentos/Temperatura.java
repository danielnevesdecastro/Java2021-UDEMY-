package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// fórmmula conversão fahrenheit (ºF -32 ) x 5/9 = ºC
		final double ajuste = 32;
		final double fator = 5/9.0;
		
		double fahrenheit = 95;		
		double celsius = (fahrenheit - ajuste) * fator  ; // Conversão de temperaturas 
		
		System.out.println ("A temperatura de " +fahrenheit+ "ºF , Equivale a " +celsius+ "ºC");
		
		fahrenheit = 0;
		celsius = (fahrenheit - ajuste) * fator  ; 
		
		System.out.println ("A temperatura de " +fahrenheit+ "ºF , Equivale a " +celsius+ "ºC");
	}
}
