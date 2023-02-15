package desafios.oo.encapsulamento;

//aula 164 - Getters e Setters 
public class Pessoa {
	private int idade;
	private String nome;

	// getter - LER
	public int getIdade() {
		return idade;
	}

	// setter - ALTERA
	public void setIdade(int novaidade) {
		this.idade = novaidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return ""+getNome() + " tem " + getIdade() + " anos.";
	}
}
