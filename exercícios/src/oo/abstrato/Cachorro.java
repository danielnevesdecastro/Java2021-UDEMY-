package oo.abstrato;

public class Cachorro extends Mamifero {

	@Override
	public String mover() {
		// tem que implementar a classe abstrata, nao impçlementada em ammifero herdad de
		// animal

		// TODO Auto-generated method stub
		return "usando as Patas";
	}

	@Override
	public String mamar() { // classe abstrata herdada de mamifero
		// TODO Auto-generated method stub
		return "Leite";
	}

}
