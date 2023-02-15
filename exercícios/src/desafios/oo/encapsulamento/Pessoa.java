package desafios.oo.encapsulamento;

//aula 164 - Getters e Setters 
public class Pessoa {
	private int idade;
	private String nome;
	private String sobrenome;
	
	
	
	public Pessoa () {
		
	}
	
	public Pessoa (String nome, int idade, String sobrenome) {
		setNome(nome);
		setIdade(idade);
		setSobrenome(sobrenome);
		
	}
	
	
	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


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
	
	//atributo calculado
	public String nomeCompleto() {
		return getNome() + " "+ getSobrenome();
	}

	public String toString() {
		return ""+getNome() + " tem " + getIdade() + " anos.";
	}
}
