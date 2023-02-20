package lambdas;

import java.util.function.Predicate;

//183 - Predicado composto
public class PredicadoComposicao {
	public static void main(String[] args) {
		//Predicaete + lambda com Ternario
		Predicate<Integer> isPar = n -> n %2 ==0;
		Predicate<Integer> is3Digitos=
				n -> n >= 100 && n <=999;
		
		System.out.println("é Par ? "+isPar.test(115));
		System.out.println("3 digitos ? "+is3Digitos.test(115));
		//composição de predicate
		System.out.println(isPar.and(is3Digitos).test(127));//&&
		System.out.println(isPar.and(is3Digitos).negate().test(127));//NEGANDO
		System.out.println(isPar.or(is3Digitos).test(127));//or
		
	}
}
