package oo.heranca;
//Aula 153,154 - OO , Heran�a

//extends = definir heran�a 
public class Heroi extends Jogador { // heroi recebe jogador para reuso
	
	
	public Heroi(int x, int y){//Chamando construtor da classe pai explicito , e atribuindo argumentos
		super (x, y );
	}
	
	@Override
	//Sobreescrita , redifindo comportamento
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
		}
	}

