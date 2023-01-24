package classe;

//94 , Classe - Desafio Data
public class DataTeste {
	public static void main(String[] args) {

		// instanciando classe
		//Construtor default
		Data d1 = new Data();
		d1.ano = 2021;
		// instanciando por inferência
		//Construtor Explicito
		var d2 = new Data(20, 1 ,2023);
		
		/* usando os valores explicitos do Construtor default acima
		d1.dia = 17;
		d1.mes = 8;
		d1.ano = 1994;
		*/
		
		/* usando Construtor Explicito acima
		d2.dia = 20;
		d2.mes = 1;
		d2.ano = 2023;
		 */
		System.out.printf("Data 1 : %d , de %d de %d \n", d1.dia, d1.mes, d1.ano);
		System.out.printf("Data 2 : %d , de %d de %d \n", d2.dia, d2.mes, d2.ano);
	
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		System.out.println(d1.dataExtenso());
		System.out.println(d2.dataExtenso());
		d1.imprimirDataFormat();
		d2.imprimirDataFormat();
	}

} 