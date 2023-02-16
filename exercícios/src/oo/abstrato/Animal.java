package oo.abstrato;
//Aula 169 - OO, Classe Abstrata
public abstract class Animal {//classe abstrata
	
	
	protected String respirar() {
		return "C02";		
	}

	public abstract String mover();//método abstrato, bem genérico, sem corpo
}
