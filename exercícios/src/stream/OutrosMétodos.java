package stream;

import java.util.Arrays;
import java.util.List;

//211 - Métodos Stream
public class OutrosMétodos {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 10);
		Aluno a6 = new Aluno("Pedro", 10);
		Aluno a7 = new Aluno("Gui", 10);
		Aluno a8 = new Aluno("Maria", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct...");
		alunos.stream()
		.distinct()//elementos dinstintos//equals e hashcode implementado
		.forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
		.skip(2)//pula dois elementos
		.limit(2)//e vai ate os dois proximos elementos
		.forEach(System.out::println);
		
		System.out.println("\nTakeWhile");//pegue enquanto , condição
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7.0)
		.forEach(System.out::println);
		
		System.out.println("");
	}
}
