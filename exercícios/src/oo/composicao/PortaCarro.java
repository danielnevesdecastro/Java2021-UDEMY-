package oo.composicao;
//Aula 140,141,142 -Composi��o - 1 pra 1
public class PortaCarro {
	final Carro carro;
	boolean porta;
	
	PortaCarro (Carro carro){
		this.carro = carro;
	}
	
	boolean portaAberta() {
		return this.porta = true;
	}
}



