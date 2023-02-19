package lambdas;
//173 - lambdas

public class CalculoTeste2 {
	public static void main(String[] args) {
		//lambda, expressão anonima
		Calculo soma = (x, y) ->{return x + y;};
		System.out.println(soma.executar(3, 5));
		
		soma = (x, y)-> x*y;//sem chaves , retorno implicito
		System.out.println(soma.executar(2, 3));
		
	}	
}