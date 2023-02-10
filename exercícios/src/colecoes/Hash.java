package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();

		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));

		// verifica se o elementod está correto, atraves do equals e hashcode
		//hashcode = varre estrutura 
		//equasl = compara
		boolean resultado = (usuarios.contains(new Usuario("Guilherme"))); 
		System.out.println(resultado);

	}
}
