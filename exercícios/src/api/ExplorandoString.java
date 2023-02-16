package api;

//534 - Api, String
public class ExplorandoString {
	public static void main(String[] args) {
		String nome = "Daniel";
		nome += " Neves";//concatenação
		
		System.out.println(nome);
		
		//Métodos importantes
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(4, 12));
		System.out.println(nome.indexOf('l'));
		System.out.println(nome.charAt(3));
		System.out.println(nome.equalsIgnoreCase("daniel neves"));
		System.out.println(nome.startsWith("Daniel"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" de Castro").concat(" Silva"));
		System.out.println(nome);// o nome continua imutável, só muda com atribuição
	}
}
