package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double casting Double (wrappers)
		conjunto.add(true);// wrappers
		conjunto.add("Teste");
		// conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');

		// size = tamanho do conjunto
		System.out.println("Tamanho �: " + conjunto.size());

		// remove = remover elementos do conjuntos, retorna true or false
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho �: " + conjunto.size());

		// contains , encontrar se determinado elemento est� condito no conjunto
		//  retorna boolean
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false)); 
		
		//variavel do tipo set ,a tribuindo hashset
		//POO ??
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//imprimindo valores 
		System.out.println(conjunto);
		System.out.println(nums);
		
		
		//conjunto.addAll(nums);//uni�o conjuntos
		conjunto.retainAll(nums);//interse��o dos valores entre conjuntos (conj iguais)
		System.out.println(conjunto);
		
		conjunto.clear();// limpar conjunto
		System.out.println(conjunto);
		
	}
}
