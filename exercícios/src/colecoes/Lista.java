package colecoes;

import java.util.ArrayList;
import java.util.List;

//Aula 131, Collections - list
public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");
		// adicionando usuário através do construtor
		lista.add(u1);
		// criando usuario e adicionando na lista
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Call"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));

		for (Usuario u : lista) {
			System.out.println(u);
		}

		System.out.println(lista.get(3)+"\n\n");// imprimir pelo indice

		System.out.println("Excluído: "+lista.remove(1));// remover por indice,retorna objeto excluido
		System.out.println(lista.remove(new Usuario("Lia")));//remover por conteudo, retorna boolean pelo equals
		System.out.println("tem o Elemento ? "+lista.contains(new Usuario("Lia")));
		
		for (Usuario u : lista) {
			System.out.println(u);
		}
		
	}

}
