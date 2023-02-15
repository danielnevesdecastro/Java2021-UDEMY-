package desafios.oo.heranca;
//Aula 155 ,156 - Desafio herança

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	protected int delta = 5;

	protected Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}

	public void freiar() {
		if (this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		} else {
			this.velocidadeAtual = 0;
		}
	}

	public String toString() {
		return "Velocidade atual: " + this.velocidadeAtual + " Km/h";
	}

	protected int getVelocidadeAtual() {
		return velocidadeAtual;
	}
}