package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Aula 135 - Map
public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		// put adiciona se não existe , e substitui caso exista;
		usuarios.put(1, "Ricardo");
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());// retorna o conjunto de chaves
		System.out.println(usuarios.values()); // retorna os valores
		System.out.println(usuarios.entrySet()); // retorna chaves e valores
		System.out.println(usuarios.containsKey(2)); // verifica se existe a chave
		System.out.println(usuarios.containsValue("Ricardo")); // verifica se contem o valor

		System.out.println(usuarios.get(4));// retorna elemento da chave
		System.out.println("Removido " + usuarios.remove(3));// remover elemento pela chave, retorna o valor da cahve
		System.out.println("Removido " + usuarios.remove(2 , "Ricardo"));// remover elemento chavee/valor , retorna boolean

		// percorrer elementos de um Map

		// Percorrer só chave
		for (Integer key : usuarios.keySet()) { // pode converter o integer pra int pra usar a chave
			System.out.println(key);
		}

		// Percorrer só elementos
		for (String usuario : usuarios.values()) {
			System.out.println(usuario);
		}

		System.out.println("\n\n Percorrendo map todo ");

		// Percorrer map completo
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());

		}

	}
}
