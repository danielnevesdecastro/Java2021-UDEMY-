package classe;

//Aula 92 - 96,Classes
public class Produto {
//Classe tipo produto

	// atributos
	String nome;
	double preco;
	double desconto;

	// m�todo desconto
	double precoDesconto(double descontoGerente) {
		
		return preco * (1 - (desconto + descontoGerente));

	}
}
