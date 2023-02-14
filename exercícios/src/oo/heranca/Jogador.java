package oo.heranca;

//Aula 152 a 154 - OO - Enum , Herança
public class Jogador {
	int vida = 100;
	int x;
	int y;

	boolean atacar(Jogador oponente) {
		int deltax = Math.abs(this.x - oponente.x);
		int deltay = Math.abs(this.y - oponente.y);

		if (deltax == 0 && deltay == 1) {
			oponente.vida -= 10;
			return true;
		} else if (deltax == 1 && deltay == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}

	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;

		case SUL:
			y++;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}

}
