package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//181 - Consumer
public class Consumidor {
	public static void main(String[] args) {

		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		Produto p1 = new Produto("Caneta", 12.34, 0.10);
		// recebe um unico parametro, void
		imprimirNome.accept(p1);

		Produto p2 = new Produto("Notebook", 5000, 0.15);
		Produto p3 = new Produto("PC Xtreme", 6000, 0.10);
		Produto p4 = new Produto("Iphone 14", 7000, 0.80);
		Produto p5 = new Produto("Caneca Mágica", 8000, 0.90);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		//o accept vem implicito por for each ser um consumer 
		produtos.forEach(imprimirNome);
		produtos.forEach(p-> System.out.println(p.preco));
		//println do méthod reference, vai chamar o toString, q foi sobrescrito
		produtos.forEach(System.out::println);
		
	}
}
