package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		//Localizar letra do indice 0 = n do indice 
		System.out.println("ol? pessoal ".charAt(0));
		
		//Concatena String
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		//Concatenando usando + 
		System.out.println(s+"!!!");
		//Verificar se o valor ? verdadeiro dentro da string s
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("opa"));
		//Quantidade de caracteres da string 
		System.out.println(s.length());
		//Colocar em minusculo e verificar caractere do come?o 
		System.out.println(s.toLowerCase().startsWith("boa"));
		//Colocar em maisculo e verificar caractere no final
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		//A string termina com quais caracteres 
		System.out.println(s.endsWith("Tarde"));
		//Compara??o de igualdade
		System.out.println(s.equals("Boa Tarde"));
		//Compara??o de igualdade ignorando maiuscula e minuscula
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		//Procura se String contem a palavra
		System.out.println("Boa Noite".contains("Boa"));
		//Define onde come?a a impress?o da frase, pelo numero de indice setado;(onde come?a, onde acaba)
		System.out.println("Boa Noite".substring(5,8));
		
		
		// \n = quebra linha 
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987D;
		//Concatena??o feia e trabalhosa
		System.out.println("\nNOME: " + nome + "\nSOBRENOME: " + sobrenome + "\nIdade: "+ idade);
		
		//printf permite formata??o
		System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d",nome,sobrenome,idade);
		
		System.out.printf("\n\nO senhor %s %s, tem %d e ganha %.2f ", nome,sobrenome,idade,salario);
		
		//Colocando frase formatada dentro de uma vari?vel String
		String frase = String.format("\n\nO SENHOR %s %s, tem %d e ganha %.2f ", nome,sobrenome,idade,salario);
		System.out.println(frase);
		
		
	}
}
