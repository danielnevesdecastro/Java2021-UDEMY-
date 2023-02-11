package desafios.oo.composicao;
//Desafio 144 - Composição

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<>();
	
	
	//Adiciona item com produto cadastrado
	void adicionarItem(Produto p, int qtd) {// METODO PRA SIMPLIFICAR
		this.itens.add(new Item(p , qtd));//collections add
	}
	
	//adiciona item e cadastra produto
	//Sobrecarga de metodos
	void adicionarItem(String nome,double preco, int qtd ) { 
		//this.itens.add(new Item (new Produto(nome, preco),qtd));//instanciei produto dentro da instancia item
		var produto = new Produto (nome, preco); // divid a instancia acima 
		this.itens.add(new Item (produto , qtd));
	}
	
	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total+= item.qtd * item.produto.preco;
		}
		return total;
	}
}
