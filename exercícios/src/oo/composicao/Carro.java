package oo.composicao;

//Aula 140,141 -Composição 1 pra 1
public class Carro {
	// classe como atributo de uma outra classe
	final Motor motor;
	PortaCarro portaCarro;
	
	Carro(){
		this.motor = new Motor(this);
		this.portaCarro = new PortaCarro(this);
	}

	void acelerar() {
		if(portaCarro.porta == false & motor.fatorInjecao < 2.5) {
		motor.fatorInjecao += 0.4;
		}
		}

	void frear() {
		if (motor.fatorInjecao >= 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
	
}
