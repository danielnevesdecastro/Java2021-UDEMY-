package fundamentos.operadores;
//51 - Operadores Un�rios
public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		a++;// a = a + 1 , 2
		a--;// a = a - 1 , 1

		++b; // b = b + 1 , 3
		--b; // b = b - 1 , 2

		System.out.println("Desafio");
		System.out.println(++a == b--); //Preced�ncia ,o  operador un�rio de b e posfixado ,
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
