package oo.abstrato;
//Aula 169 - OO, Classe Abstrata
public abstract class Animal {//classe abstrata
	
	
	protected String respirar() {
		return "C02";		
	}

	public abstract String mover();//m�todo abstrato, bem gen�rico, sem corpo
}
