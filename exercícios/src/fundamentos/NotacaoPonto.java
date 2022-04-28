package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		
		String s = "Bom dia X";
		s = s.toUpperCase(); 
		// String será convertida para letra miuscula , colocar a variavel para recebela novamente
		System.out.println(s);
		
		s = s.replace("X", "Senhora"); 
		// Substitui o X por senhora, desde que a variável a receba novamente , caso contrário nada modifica 
		System.out.println(s);
		
		s = s.concat("!!!");
		//concatena mais uma palavra a String 
		System.out.println(s);
		
		//Colocar a string já em maiusculo
		System.out.println(" eae Leo !!".toUpperCase());
		
		//Declara variável já colocando em maisculo
		String x = "opa Leo".toUpperCase();
		System.out.println(x);
		
		//Usando o ponto para quebrar setença de código e usando tolowercase para dexar frase em minusculo
		String y = "Bom dia X "
				.replace("X", "GUI")
				.toLowerCase()
				.concat("!!!");
		System.out.println(y);
	}
}
