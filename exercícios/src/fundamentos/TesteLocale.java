package fundamentos;

import java.util.Locale;

//Comando para exibir como o locale padr�o do meu java


public class TesteLocale {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		System.out.println(Locale.getDefault(Locale.Category.FORMAT));
	}
}

/* cria��o do novo objeto Locale
final var localeAmericano = new Locale("en", "US");
	
//nextDouble usar� o Locale criado gra�as ao m�todo useLocale
RAIO = entrada.useLocale(localeAmericano).nextDouble(); 
*/