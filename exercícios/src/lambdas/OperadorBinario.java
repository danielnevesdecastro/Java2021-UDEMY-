package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

//186 Binary operator e Bifunction
public class OperadorBinario {
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = //Binary operator
				( n1, n2)-> (n1 + n2)/2 ;//colocar os tipos,ñ obg.
				
		System.out.println(media.apply(9.8, 5.7));
		
		
		BiFunction<Double, Double, String> resultado =//Bi function, receber de dois tipos e retorna tipo diferente
				(n1 , n2)-> (n1+n2)/2 >= 7 ? "Aprovado":"Reprovado" ;
				
		System.out.println(resultado.apply(8.0, 6.0));
		
		
		BiFunction<Double, Double, String> resultado2 =( n1, n2)-> {
				double notaFinal = (n1+n2)/2 ;//forma diferente de retornar, com bloco de código
				return notaFinal >= 7 ?"Aprovado" :"Reprovado";
			};
			
		System.out.println(resultado2.apply(8.0, 4.0));
				
		Function<Double, String> conceito =
				m -> m >= 7 ?"Aprovado" :"Reprovado";
		
		String resultadoConceito = media.andThen(conceito).apply(9.7, 5.1);
		System.out.println(resultadoConceito);
	}
}
