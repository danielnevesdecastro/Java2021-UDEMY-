package lambdas;

import java.util.function.Function;

//182 - Function
public class Funcao {
	public static void main(String[] args) {
		// function + O.Ternario
		Function<Integer, String> parOuImpar 
		= n1 -> n1 % 2 == 0 ? "Par" : "Impar"; // O ternário

		System.out.println(parOuImpar.apply(5));
		
		Function <String, String> oResultado = 
				valor -> "O resultado é:"+ valor;
		Function <String, String> empolgado =
				valor -> valor + " !!!";
		Function <String, String> duvida =
				valor -> valor + " ?";
		//Composição de função
		String resultadoFinal = parOuImpar.apply(10);		
		System.out.println(resultadoFinal);
		
		String resultadoFinal2 = 
				parOuImpar.andThen(oResultado).apply(32);		
		System.out.println(resultadoFinal2);
		
		String resultadoFinal3 = parOuImpar
				.andThen(oResultado)
				.andThen(empolgado)
				.apply(32);		
		System.out.println(resultadoFinal3);
		
		String resultadoFinal31 = parOuImpar
				.andThen(oResultado)
				.andThen(duvida)
				.apply(32);		
		System.out.println(resultadoFinal31);
		
		//cheguei sozinho nesse resultado
		System.out.println("\n-------------------");
		String meuResultado1 = oResultado.apply(parOuImpar.apply(7));
		System.out.println(meuResultado1);
		
		String meuResultado2 = empolgado.apply(oResultado.apply(parOuImpar.apply(7)));
		System.out.println(meuResultado2);
		
	}
}
