package desafios.classe;

public class Pessoa {
	// Atributos
	String nome;
	double peso;

	// construtor default
	Pessoa() {

	}

	// construtor Explitico
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	// M�todo comer , retornma nada
	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
	//M�todo para se apresentar , printar 
	String apresentar() {
		return "ol� eu sou o " + nome + "\ne tenho " + peso + "Kgs";
	}
}