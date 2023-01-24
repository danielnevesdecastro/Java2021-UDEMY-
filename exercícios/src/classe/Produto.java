package classe;

//Aula 92 - 102,Classes
public class Produto {
//Classe tipo produto

	// atributos
	String nome;
	double preco;
	static double desconto = 0.25;

	// Criando Construtor (par�metro expl�cito)
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	// Criando Construtor default (par�metro impl�cito) para q se possa usar os dois contrutores 
	//se o contrutor tiver qualquer retorno , mesmo void , passa a ser um m�todo
	Produto(){
		
	}
	// m�todo desconto
	double precoDesconto() {
		
		return preco * (1 - desconto );

	}
	
}
