package desafios.oo.heranca;
//Aula 155 ,156 - Desafio herança

public class Carro {
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	int delta = 5;

	Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerar() {
		if( velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += delta;
		}
	}

	void freiar() {
		if (this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		} else {
			this.velocidadeAtual = 0;
		}
	}

	public String toString() {
		return "Velocidade atual: " + this.velocidadeAtual + " Km/h";
	}
}
