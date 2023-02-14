package desafios.oo.heranca;
//Aula 155 ,156 - Desafio herança

public class Carro {
	int velocidadeAtual ; 
	
	void acelerar() {
		
		this.velocidadeAtual += 5;
	}
	
	void freiar() {
		if (this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		}else {
			this.velocidadeAtual = 0;
		}
	}
	public String toString() {
		return "Velocidade atual: "+this.velocidadeAtual+" Km/h"; 
	}
}


