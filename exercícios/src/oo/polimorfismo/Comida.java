package oo.polimorfismo;
//Aula 166,169 - 00, Polimorfismo, classe abstrata
public abstract class Comida { // Superclasse , classe generica
	private double peso; 
	
	
	public Comida(double peso){
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	// metodo a ser atribuido no polimorfismo
	public void Comer(Comida comida) {
		this.peso += comida.getPeso();
	}
}
