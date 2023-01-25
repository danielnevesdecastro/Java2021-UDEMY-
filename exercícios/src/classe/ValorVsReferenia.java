package classe;
// Aula 107,108 Atribui��o por valor vs refer�ncia 
public class ValorVsReferenia {
	public static void main(String[] args) {
		// Atribui��o por valor (Tipo primitivo)
		double a = 2;
		double b = a;// atri. por valor, b = 2 , c�pia do valor de a
		a++;
		b--;
		System.out.println("Valor de A: " + a + "\nValor de B: " + b);

		// Atribui��o por Referencia (Objeto)
		Data d1 = new Data(25, 01, 2023);
		Data d2 = d1; // Atribui��o por refer�ncia, d2 = endere�o de memoria de d1
		d1.dia = 31;
		d2.mes = 12;

		// mesmo resultado , por conta da atribui��o
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());

		voltaDataValorDefault(d1);
		System.out.println("Default: D1 " + d1.dataFormatada());
		System.out.println("Default: D2 " + d2.dataFormatada());

		int c = 5;
		alterarPrimitivo(c);// n�o altera o valor de C, pq essa atribui��o gera clone do valor
		System.out.println("Valor de C : " + c);

	}

	//M�todo estatico
	//M�todo estatico so consegue acessar outro metodo statico
	//consigo acessar o m�todo (j� instaciado)na classe a partir de um metodo nessa mesma classe 
	static void voltaDataValorDefault(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;

	}

	// m�todo
	static void alterarPrimitivo(int a) {
		a++;
	}

}
