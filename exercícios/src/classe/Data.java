package classe;

//94 , Classe - Desafio Data
public class Data {

	int dia, mes, ano;

	String dataFormatada() {
		

		return String.format("Data: %d, de %d de %d.  ", dia, mes , ano);
	}

	// Minha inve��o a nivel de Desafio , resolveu ;)
	String dataExtenso() {
		String dataEx ="Data: "+ dia + ", de " + mes +" de "+ ano ;

		return dataEx;

	}
}
