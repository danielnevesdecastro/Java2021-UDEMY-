package colecoes;

import java.util.LinkedList;
import java.util.Queue;

//Aula 1331 , Queue / Fila 
public class Fila {
	public static void main(String[] args) {
		// Fila , instância
		Queue<String> fila = new LinkedList<>();
		// offer e add - adicionam elementos, diferença é comportamento quando cheio
		fila.add("Ana"); // lançará uma exceção caso a fila esteja cheia.
		fila.offer("Bia"); // retorna falso caso a fila esteja cheia.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// retorna elemento da fila, diferença é o comportamento se vazio
		System.out.println(fila.peek()); // retorna nulo se vazio
		System.out.println(fila.element());// lança execeção se vazio
		
		System.out.println(fila.size());//tamanho da fila 
		System.out.println(fila.isEmpty());//saber se está vazia
		//fila.clear();//limpar fila 
		System.out.println(fila.isEmpty());
		
		System.out.println(fila.poll());//retorna o primeiro da fila removendo-o, se vazia retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.size());//tamanho da fila
		System.out.println(fila.remove());//parecido com pool,lança exceção se lista vazia 
		System.out.println(fila.size());//tamanho da fila
		
	}
}
