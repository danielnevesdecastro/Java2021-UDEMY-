package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		
		String s = "Bom dia X";
		s = s.toUpperCase(); 
		// String ser� convertida para letra miuscula , colocar a variavel para recebela novamente
		System.out.println(s);
		
		s = s.replace("X", "Senhora"); 
		// Substitui o X por senhora, desde que a vari�vel a receba novamente , caso contr�rio nada modifica 
		System.out.println(s);
		
		s = s.concat("!!!");
		//concatena mais uma palavra a String 
		System.out.println(s);
		
		//Colocar a string j� em maiusculo
		System.out.println(" eae Leo !!".toUpperCase());
		
		//Declara vari�vel j� colocando em maisculo
		String x = "opa Leo".toUpperCase();
		System.out.println(x);
		
		//Usando o ponto para quebrar seten�a de c�digo e usando tolowercase para dexar frase em minusculo
		String y = "Bom dia X "
				.replace("X", "GUI")
				.toLowerCase()
				.concat("!!!");
		System.out.println(y);
	}
}
