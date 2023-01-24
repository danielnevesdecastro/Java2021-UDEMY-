package classe;

//94 , Classe - Desafio Data
public class Data {

	int dia ,mes , ano;
	
	//Construtor Default, sendo declarado para fazer uso de ambos
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	//Construtor Explicito (par�metros)
	Data(int diaI,int mesI,int anoI){
		dia = diaI;
		mes = mesI;
		ano = anoI;
	}

	String dataFormatada() {

		return String.format("Data: %d, de %d de %d.  ", dia, mes, ano);
	}

	// Minha inve��o a nivel de Desafio , resolveu ;)
	String dataExtenso() {
		String dataEx = "Data: " + dia + ", de " + mes + " de " + ano;

		return dataEx;

	}

	// void , ausen�a de retorno
	void imprimirDataFormat() {

		System.out.printf("\nData: %d, de %d de %d.\n", dia, mes , ano);
		System.out.println(dataFormatada());
	}
}
