package oo.polimorfismo;

//Aula 165,166 - 00, Polimorfismo
public class Pessoa {
	private double peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}

	public void Comer(Comida comer) {
		this.peso += comer.getPeso();
	}
	/*polimorfismo estático , subtituido por polimorfismo dinamico, 
	*com a criação da calsse generica comida
	*
	public void Comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}

	public void Comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	}
	 */
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}
}
