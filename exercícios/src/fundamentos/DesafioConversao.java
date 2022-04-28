package fundamentos;
/*DESAFIO
*1 scanner , 3 strings (converter para int ) , receber os ultimos 3 salarios de uma pessoa , exibir a m�dia
*somar 3 salarios / 3 e da a media 
*salario deve reconhecer a divis�o de casas decimais tanto com , quanto . */

//biblioteca para uso da classe Scanner
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		
		//Classe para receber valores externo (n�o literais)
		Scanner dado = new Scanner (System.in);
		
		System.out.println ("Informe os 3 ultimos SALARIOS:");
		//Recebendo valores usu�rio , e convertendo caso o usu�rio use , para .
		String s1 = dado.nextLine().replace(",", ".");
		String s2 = dado.nextLine().replace(",", ".");
		String s3 = dado.nextLine().replace(",", ".");
		
		//Convertendo String para int, vari�vel do tipo pretendido receve o tipo string convertido (string)
		double v1 = Double.parseDouble(s1);
		double v2 = Double.parseDouble(s2);
		double v3 = Double.parseDouble(s3);
		
		//Somando valores e dividindo por 3 
		double soma = (v1+v2+v3) / 3.0 ;
		
		System.out.printf ("Sua m�dia salarial � de %.2f",soma);
		
		
		//encerrando classe scanner
		dado.close();
	}
}
