package arrays;

//Aula 122 . For each 
public class Foreach {
	public static void main(String[] args) {
		
		double [] notas = {9.9,8.7,7.2,9.4};
		
		//precorrer o array inteiro passando por todos os elementos 
		//cria variavel : referencia o array
		for (double nota : notas) {
			System.out.print( "["+nota+"] ");
		}
	}
}
