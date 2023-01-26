package classe;

// Aula 114, Null
public class Valornulo {
	public static void main(String[] args) {

		// objeto criado
		String s1 = "";
		System.out.println(s1.concat("!!!"));

		Data d1 = Math.random() > 0.5 ? new Data() : null;
		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.dataFormatada());
		}
		// String s2 = null; NullPointerException
		
		String s2 = Math.random() >0.5 ? "Eae ?" : null;		
		if (s2 != null) {
		System.out.println(s2.concat("???"));
		}
		}
}
