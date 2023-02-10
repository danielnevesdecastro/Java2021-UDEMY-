package desafios.oo.composicao;
//Desafio 144 - Composição

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtd) {// METODO PRA SIMPLIFICAR
		this.itens.add(new Item(p , qtd));
	}
	
	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total+= item.qtd * item.produto.preco;
		}
		return total;
	}
}
