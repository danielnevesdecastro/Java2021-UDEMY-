package colecoes;

import java.util.Objects;

public class Usuario {
	String nome;
	int id;

	// construtor
	Usuario(String nome) {
		this.nome = nome;
	}

	// método para imprimir frase pronta
	public String toString() {
		return "Meu nome é " + this.nome + ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}

}
