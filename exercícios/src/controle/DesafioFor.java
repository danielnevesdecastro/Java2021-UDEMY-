package controle;

//Aula 77,78 Desafio For
public class DesafioFor {
	public static void main(String[] args) {
		// Desafio :N�o pode usar valor numerico pra controlar o la�o:
		/* 
		 * String valor = "#";
		 * for (int i = 1; i < 5; i++) 
		 * { System.out.println(valor); valor += "#";
		 * }
		 */
		//Minha vers�o
		String valor = "#";
		for (String i = "a"; i != "b";) {
			System.out.println(valor);
			valor += "#";
			if (valor.equalsIgnoreCase("######") ) {
				i = "b";
			}
		}
		
		//Vers�o professor 
		
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}

}
