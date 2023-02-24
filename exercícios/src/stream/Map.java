package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

//197 - Map
public class Map {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String>marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);//map >> letras maiusculas
				
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";//caractere + string vazia = string
		UnaryOperator<String> grito = n -> n + "!!!";
		
		System.out.println("\n-------------------------\n");
		
		System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
	
		System.out.println("\nUsando composição");
		marcas.parallelStream()
		.map(Utilitarios.maiuscula
		.andThen(primeiraLetra)
		.andThen(Utilitarios::grito))//method reference
		.forEach(print);
	}
}
