package fundamentos.operadores;
//Aula42 - Operadores Aritim�ticos 
public class Aritmeticos {

	public static void main (String[] args) {
		
		System.out.println(2+3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y+"\n");
		
		int a = 8;
		int d = 3;
		
		System.out.println(a + d);
		System.out.println(a - d);
		System.out.println(a * d);
		//Casting de int para double, divis�o com precis�o
		System.out.println(a / (double)d);
		//m�dulo, resto da divis�o 
		System.out.println(a %  d);
		
		
	}
}
