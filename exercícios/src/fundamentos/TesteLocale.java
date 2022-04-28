package fundamentos;

import java.util.Locale;

//Comando para exibir como o locale padrão do meu java


public class TesteLocale {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		System.out.println(Locale.getDefault(Locale.Category.FORMAT));
	}
}

/* criação do novo objeto Locale
final var localeAmericano = new Locale("en", "US");
	
//nextDouble usará o Locale criado graças ao método useLocale
RAIO = entrada.useLocale(localeAmericano).nextDouble(); 
*/