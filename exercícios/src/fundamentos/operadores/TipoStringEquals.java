package fundamentos.operadores;

import java.util.Scanner;

//53 - Igualdade com Strings 
public class TipoStringEquals {

	public static void main(String[] args ) {
		
		
		//Falsa sensação de que todo resultado será sempre  verdadeiro
		System.out.println("2" == "2");
		
		//Resultado da falso, embora o conteúdo seja verdadeiro, iguais
		String s1 =  new String ("2");
		System.out.println("2" == s1 );
		
		//Equals comapra os conteúdos da string  , agora sim da true 
		System.out.println("2".equals(s1));
		
		Scanner dado = new Scanner(System.in);
		//next line não tira os epaços . o next tira 
		String s2 = dado.next();
		//false
		System.out.println("2" == s2);
		// trim retira os espaços, porém continuará dando falso
		System.out.println("2" == s2.trim());
		//com equals dará true 
		System.out.println("2".equals(s2));
		dado.close();
		
	}
}
