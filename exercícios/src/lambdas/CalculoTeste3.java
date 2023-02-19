package lambdas;

import java.util.function.BinaryOperator;

//176 - Interface Funcional

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		//interface pronta, que permiti opra��o de dois operadores  do mesmo tipo
		BinaryOperator<Double> calc = (x, y) ->{return x + y;};//lambda, express�o anonima
		System.out.println(calc.apply(3.0, 5.0));
		
		calc = (x, y)-> x*y;//sem chaves , retorno implicito
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) ->{return x + y;};
		System.out.println(calc2.apply(3, 5));
		
		calc2 = (x, y)-> x*y;//sem chaves , retorno implicito
		System.out.println(calc2.apply(2, 3));
	}	
}