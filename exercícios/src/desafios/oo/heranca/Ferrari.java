package desafios.oo.heranca;
//Aula 155 ,156 - Desafio herança

public class Ferrari extends Carro {
	@Override
	void acelerar () {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
	
	void freiar () {
		if (super.velocidadeAtual >= 10)
		super.freiar();
		super.freiar();
	}
}
