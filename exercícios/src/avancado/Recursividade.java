package avancado;

//Aula 537 - Recursividade
public class Recursividade {

	public static void main(String[] args) {
		System.out.println(fatorialFor(5));
		System.out.println(fatorial(5));
		
		
		
		
	}
	
	//métodos
	//fatorial manual
	private static int fatorialFor(int numero) {
		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
	//recursividade
	private static int fatorial(int numero) {
		if (numero <= 1 ) {
			return 1; // condição de parada , evita stackoverflow
		}
		
		return numero * fatorial(numero - 1);//recursividade
	}
}
