package classe;

//Aula 104 , Menbros de Classe vs Objeto
public class AreaCirc {

	double raio;
	// menbro associado a classe , constante
	// static = valor do atributo pertence a classe 
	// final = modificador pra definir constante
	// PI = conven��o da nomeclatura da constante MAIUSCULO,
	static final double PI = 3.1415;

	// Construtor Default
	AreaCirc() {
	}

	// Construtor Expl�cito (com parametros)
	AreaCirc(double raioInicial) {
		// pi = 3.14;
		raio = raioInicial;
	}

	// M�todo
	double area() {
		// pi x raio�
		// return pi * raio * raio; forma manual
		return PI * Math.pow(raio, 2);

	}
	//M�todo Statico, pertence a claase 
	//mesmo nome por�m com assinatura diferente (nome + tipo)
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

}
