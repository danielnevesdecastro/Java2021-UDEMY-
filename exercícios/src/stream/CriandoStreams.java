package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

//195 - Built, criando stream
public class CriandoStreams {
	public static void main(String[] args) {

		Consumer<String> print = System.out::print;// interface consumer para printar
		Consumer<Integer> printInt = System.out::println;// interface consumer para printar
		// Declarando Stream
		Stream<String> langs = Stream.of("Java ", "Spring ", "JS \n");// método estático
		langs.forEach(print);

		//Declarando com função estática
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		Stream.of(maisLangs).forEach(print);// encadeamento de métodos

		// Declarando Stream com arrays
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 0, 2).forEach(print);// elementos por indice,do indice até o anterior ao ultimo indice
		
		System.out.println("\n---------------------------\n");
		
		//Declarando Stream com collections
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin \n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		// Stream.generate(()-> "a").forEach(print);//stream potencialmente infinita sem ordenação
		Stream.iterate(0, n -> n +1  ).forEach(printInt);;//stream potencialmente infinita com ordenação
		
	}
}
