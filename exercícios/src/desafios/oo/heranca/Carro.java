package desafios.oo.heranca;
//Aula 155 ,156 - Desafio herança

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	protected int getDelta() {
		return delta;
	}
	
	protected void setDelta(int delta) {
		this.delta = delta;
	}
	
	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
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
		return "Velocidade atual: " + velocidadeAtual + " Km/h";
	}

	protected int getVelocidadeAtual() {
		return velocidadeAtual;
	}
}