package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//202 - Desafio filter
public class EstacionamentoMain {
	public static void main(String[] args) {
	
		Estacionamento e1 = new Estacionamento(1,3.0);
		Estacionamento e2 = new Estacionamento(2,3.5);
		Estacionamento e3 = new Estacionamento(3,6.0);
		Estacionamento e4 = new Estacionamento(4,7.0);
		Estacionamento e5 = new Estacionamento(5,2.0);
		
		List<Estacionamento> vaga = Arrays.asList(e1,e2,e3,e4,e5);
		
		//Interfaces funcionais para Filters
		Predicate<Estacionamento> par =  v -> v.numVaga%2 == 0;
		Predicate<Estacionamento> semFranquia =  v -> v.qtdHoras >= 2.0;
		
		//Interfaces funcionais para map
		Function<Estacionamento, String> msg =
				v -> "VAGA: "+v.numVaga+",É PAR está fora da Franquia, Paga: "+(v.totalValor=v.valorHora*v.qtdHoras);
		
		vaga.stream()
		.filter(par)
		.filter(semFranquia)
		.map(msg)
		.forEach(System.out::println);
		
			
		
		
}
}
