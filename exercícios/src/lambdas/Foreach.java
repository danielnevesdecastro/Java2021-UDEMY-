package lambdas;

import java.util.Arrays;
import java.util.List;

//177,178 -  Foreach Funcional 
public class Foreach {
	public static void main(String[] args) {
		List<String > aprovados = Arrays.asList("Ana", "Bia", "Lia","Gui");
		
		//For each com lambda functions
		System.out.println("\nLAMBDA #01");
		aprovados.forEach(alunos ->System.out.println("Aluno: "+alunos));
		
		System.out.println("\nMethod Reference #01");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLAMBDA #02");
		aprovados.forEach(alunos ->meuImprimir(alunos));
		
		System.out.println("\nMethod Reference #02");
		//nome da classe :: método
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	
	static void meuImprimir (String nome) {
		System.out.println("Oi, meu nome é "+ nome);
	}
}
