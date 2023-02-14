package oo.heranca;
//Aula 153,154 - OO , Herança
public class Monstro extends Jogador {

	Monstro(){//construtor padrão chamando o construtor dessa clase
		this(0 , 0);
	}
	
	Monstro (int x ,int y){// construtor explicito
		super( x , y);
	}
}
