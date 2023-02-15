package desafios.oo.heranca;
//Aula 155 ,156 - Desafio herança

public class Ferrari extends Carro {
	
	//construtor default da calsse que receve o construtor explicito da classe atual
	 public Ferrari (){
		this (315);
	}
	
	//construtor padrão explicito , q receve o construtor da classe pai
	 public Ferrari (int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 450;
	}
	
	
	public void freiar () {
		if (super.getVelocidadeAtual() >= 10)
		super.freiar();
		super.freiar();
	}
}
