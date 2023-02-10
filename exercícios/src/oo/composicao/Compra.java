package oo.composicao;

import java.util.ArrayList;
//Aula 142 - OO - 1 pra N
public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList <Item>();//generics, definir tipo da coleção
	
	double ObterValorTotal () {
		double total = 0;
		for (Item item : itens) {
			total += (item.qtd *item.preco);
		}
		return total;
	}
}
