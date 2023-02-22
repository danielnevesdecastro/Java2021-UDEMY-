package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

//193 - List, Interator, Stream. 
public class ImprimirObjetos {
	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("ForEach");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nIterator");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()){//tem proximo ? 
			System.out.println(iterator.next());
		}
		
		System.out.println("\nStream");
		Stream<String> stream =  aprovados.stream();
			stream.forEach(System.out::println);//composição de funções ocm lambda
	}
}
