package desafios.oo.heranca;
//Aula 155 ,156 - Desafio herança

public class Ferrari extends Carro {
	
	//construtor default da calsse que receve o construtor explicito da classe atual
	Ferrari (){
		this (315);
	}
	
	//construtor padrão explicito , q receve o construtor da classe pai
	Ferrari (int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 450;
	}
	
	
	void freiar () {
		if (super.velocidadeAtual >= 10)
		super.freiar();
		super.freiar();
	}
}
