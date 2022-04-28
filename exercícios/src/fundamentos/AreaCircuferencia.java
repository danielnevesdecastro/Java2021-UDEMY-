package fundamentos;

public class AreaCircuferencia {
	
	public static void main(String[] args) {
		System.out.println (2+3); // operação direta
		double raio = 3.4; // variavel
		final double PI = 3.14159; // agr é uma constante, não pode ser modificado
		
		double area = PI * raio * raio; // formula calculo area da circuferencia
		
		System.out.println(area);
		
		raio = 10; //atribuindo valor novo, já q não é uma constante
		area = PI * raio * raio;
		
		System.out.println ("NOVO VALOR AREA : " + area + " m²"); //Concatenando texto + Variável 
		
		
	}
	
}
