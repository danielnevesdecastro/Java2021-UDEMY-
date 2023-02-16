package desafios.oo.heranca;
//Aula 155 ,156,167 - Desafio herança, interface

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	// construtor default da calsse que receve o construtor explicito da classe
	// atual
	public Ferrari() {
		this(315);
	}

	// construtor padrão explicito , q receve o construtor da classe pai
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	public void freiar() {
		if (super.getVelocidadeAtual() >= 10)
			super.freiar();
		super.freiar();
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;

	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;

	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	@Override
	//sobrescrevendo método
	protected int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		}else if (ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 30;
		}
	
	}
	
}
