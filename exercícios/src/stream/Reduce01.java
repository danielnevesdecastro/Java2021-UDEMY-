package stream;
//206 - Reduce
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (ac , n) -> ac + n ;
		//Reduce
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		System.out.println(nums.stream().reduce(soma));// autoral XD
		
		//Reduce com declração de valor inicial 
		Integer total2 = nums.stream().reduce(100, soma);//sem get
		System.out.println(total2);
		
		//reduce ,filter + ifpresent (para impressão) Opcional<Integer>
		nums.stream()
		.filter( n -> n > 5)
		.reduce(soma)
		.ifPresent(System.out::println);// imprime se tiver presente segundo o filter;
	}
}
