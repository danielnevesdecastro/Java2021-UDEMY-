package oo.heranca;
//Aula 153,154 - OO , Heran�a
public class Monstro extends Jogador {

	Monstro(){//construtor padr�o chamando o construtor dessa clase
		this(0 , 0);
	}
	
	Monstro (int x ,int y){// construtor explicito
		super( x , y);
	}
}
