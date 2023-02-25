package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//201 - Filter
public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		alunos.stream()
		.filter( a -> a.nota >= 7 )//Filter aluinos aprovados
		.map(a -> "Parabéns "+ a.nome+"! Aprovado !!!" )//map do objeto pra string
		.forEach(System.out::println);//method reference
		
		
		//Refatorando
		System.out.println("\nRefatorado");
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno , String> msg = a ->"Parabéns "+ a.nome+"! Aprovado !!!";
		
		alunos.stream()
		.filter(aprovados)
		.map(msg)
		.forEach(System.out::println);
		
		
		
		
	}
}
