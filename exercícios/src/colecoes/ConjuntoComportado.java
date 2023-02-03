package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//lista obrigatoriamente vai ser do tipo objeto <> String - generics
		//lista homogenea 
		Set<String> listaAprovados = new HashSet<String>();
		//s� consigo declarar o tipo declarado entre < > (String no caso)
		listaAprovados.add("Ana");
		listaAprovados.add("Carlo");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		
		for (String cadidato : listaAprovados ){
			System.out.println(cadidato);//n�o tem ordena��o 
		}
		
		//Tree sett, imprimi a lista ordenada 
		SortedSet<Integer> listaAprovados2 = new TreeSet<>();
		listaAprovados2.add(1);
		listaAprovados2.add(2);
		listaAprovados2.add(3);
		listaAprovados2.add(4);
		
		for (int cadidato : listaAprovados2 ){
			System.out.println(cadidato);//n�o tem ordena��o 
		}
		
	}
}
