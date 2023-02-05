package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

//Aula 134 - Stack / Pilha
public class Pilha {
	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O pequeno principe");// add retorna nada
		livros.push("Don quixote"); // push retorna booleano
		livros.push("O Hobbit");

		System.out.println(livros.peek());// LIFO
		System.out.println(livros.element());

		// for each pra iterar a estrutura de dadso
		for (String livro : livros) {
			System.out.println(livro);
		}

		System.out.println(livros.size());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());// remove elemnto das pilha
		// System.out.println(livros.pop()); // remove e lança execeção se vazio

	}
}
