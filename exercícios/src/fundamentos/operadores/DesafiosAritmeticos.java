package fundamentos.operadores;
//44 Desafio Operadores Aritiméticos



public class DesafiosAritmeticos {
	
	public static void main (String[] args) {
		
		//numeradores , usando potencia da classe Math.pow
		//Denominadores
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3*2; 

		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
	
		double supA = numA / denA ;
		double supB = Math.pow(numB / denB, 2);
				
		double superior = Math.pow(supA - supB, 3) ;
		double inferior = Math.pow(10 , 3);
		
		double resultado = superior / inferior ;
		
		System.out.println(resultado);
	}
}
