package fundamentos;

public class AreaCircuferencia {
	
	public static void main(String[] args) {
		System.out.println (2+3); // opera��o direta
		double raio = 3.4; // variavel
		final double PI = 3.14159; // agr � uma constante, n�o pode ser modificado
		
		double area = PI * raio * raio; // formula calculo area da circuferencia
		
		System.out.println(area);
		
		raio = 10; //atribuindo valor novo, j� q n�o � uma constante
		area = PI * raio * raio;
		
		System.out.println ("NOVO VALOR AREA : " + area + " m�"); //Concatenando texto + Vari�vel 
		
		
	}
	
}
