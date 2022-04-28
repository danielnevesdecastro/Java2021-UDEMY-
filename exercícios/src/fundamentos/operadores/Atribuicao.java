package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3 ;
		int b = a ;
		int c = a + b ;
		
		// atribuindo , foramr resumidas de fazer atribuição
		c += b ; //c = c + b ; atribuição aditiva 
		c -= b; // c = c - b ;
		c *= b; // c = c * b;  
		c /= a; // c = c / a;
		c %= 2; // c = c % 2;  0 ou 1 , par ou impar por exemplo.
		
		System.out.println(c);
	}
}
