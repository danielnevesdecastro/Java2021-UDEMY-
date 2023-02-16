package api;
//aula 535 - Api, String Builder
public class ExplorandoStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Daniel");
		sb.append(" Neves");
		
		System.out.println(sb);
		System.out.println(sb.reverse());// inverte a String
		System.out.println(sb);// o método reversa mutou a string
		System.out.println(sb.reverse());// voltando ao normal
	
		
		//métodos
		System.out.println(sb.toString());//converte tudo q foi concatenado em uma string
		System.out.println(sb.substring(1, 3));
		
}
}