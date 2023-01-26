package classe;

//94 - 102 , Classe - Desafio Data
public class Data {

	int dia ,mes , ano;
	
	//Construtor Default, sendo declarado para fazer uso de ambos
	Data(){
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		//chamando metodo construtor dentro do construtor
		this(1, 1 ,1970);
	}
	//Construtor Explicito (par�metros)
	//this = referenciar a variavel da classe 
	Data(int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
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
		//usando this como objeto
		System.out.println(this.dataFormatada());
		
		
	}

}
