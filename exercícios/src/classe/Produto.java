package classe;

//Aula 92 - 96,Classes
public class Produto {
//Classe tipo produto

	// atributos
	String nome;
	double preco;
	double desconto;

	// Criando Construtor (par�metro expl�cito)
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	// Criando Construtor default (par�metro impl�cito) para q se possa usar os dois contrutores 
	//se o contrutor tiver qualquer retorno , mesmo void , passa a ser um m�todo
	Produto(){
		
	}
	// m�todo desconto
	double precoDesconto(double descontoGerente) {
		
		return preco * (1 - (desconto + descontoGerente));

	}
	
}
