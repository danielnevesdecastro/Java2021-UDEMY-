package oo.heranca;

//Aula 152,153 - OO - Enum , Herança
public class Jogador {

	int x;
	int y;

	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		
		case SUL:
			y++;
			break;
		case  LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}

}
