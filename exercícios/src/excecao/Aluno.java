package excecao;

import java.util.Objects;

//200 - Filter
public class Aluno {
	final String nome;
	final double nota;
	final boolean bomComportamento;
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}

	public Aluno(String nome, double nota, boolean bomComportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	
	public String toString() {
		return nome+" tem Nota " + nota;
				
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
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}
	 
	
}
