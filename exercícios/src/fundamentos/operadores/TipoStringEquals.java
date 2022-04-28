package fundamentos.operadores;

import java.util.Scanner;

//53 - Igualdade com Strings 
public class TipoStringEquals {

	public static void main(String[] args ) {
		
		
		//Falsa sensa��o de que todo resultado ser� sempre  verdadeiro
		System.out.println("2" == "2");
		
		//Resultado da falso, embora o conte�do seja verdadeiro, iguais
		String s1 =  new String ("2");
		System.out.println("2" == s1 );
		
		//Equals comapra os conte�dos da string  , agora sim da true 
		System.out.println("2".equals(s1));
		
		Scanner dado = new Scanner(System.in);
		//next line n�o tira os epa�os . o next tira 
		String s2 = dado.next();
		//false
		System.out.println("2" == s2);
		// trim retira os espa�os, por�m continuar� dando falso
		System.out.println("2" == s2.trim());
		//com equals dar� true 
		System.out.println("2".equals(s2));
		dado.close();
		
	}
}
