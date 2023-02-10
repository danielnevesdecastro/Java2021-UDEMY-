package oo.composicao;

//Aula 140,141 -Composição 
public class Motor {
	
	final Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;

	Motor (Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if (!ligado ) {
			return 0;
		}
		return (int) Math.round(fatorInjecao * 3000);// casting pra int
	}
}
