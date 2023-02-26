package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

//208 - Reduce 
public class Reduce3 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno, Double> getNota = a -> a.nota;
		//Reduce
		BiFunction<Media, Double, Media> calcularMedia =
				(media , nota ) -> media.adicionar(nota) ;
		
		BinaryOperator<Media> combinarmedia = 
				(m1, m2) -> Media.combinar(m1, m2);
		
		//pipeline
		Media media =alunos.parallelStream()
			.filter(aprovados)
			.map(getNota)
			.reduce(new Media(), calcularMedia, combinarmedia)
			;
			
		System.out.println("Media dos aprovados:"+media.getValor());
	}
}
