package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

//198 - 199 - Desafio map
public class Map {
	
	public static void main(String[] args) {
		
		
		Consumer<Integer> printInt = System.out::println;
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Function<Integer, String> binarioString = b -> Integer.toBinaryString(b);
		UnaryOperator<String> binarioStringInvertido =
				s -> new StringBuilder(s).reverse().toString() ;
		Function<String, Integer> binarioInt = s -> Integer.parseInt(s , 2) ;// 2 = string binaria como valor inteiro
		
		
		//Minha resolução
		nums.stream()
		.map(binarioString
		.andThen(binarioStringInvertido)
		.andThen(binarioInt)
		).forEach(System.out::print);
		
		
		System.out.println("\n\n");
 		//Resolução com method reference, Professor
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(binarioStringInvertido)
		.map(binarioInt)
		.forEach(printInt);
		
		
		
	}
}
