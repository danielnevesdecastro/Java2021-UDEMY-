package desafios.oo.composicao;

import java.util.ArrayList;
import java.util.List;

//Desafio 144 - Composição
public class Cliente {
	final String nome; // não precisará mudar o nome do cliente 
	final List<Compra> compras = new ArrayList<>();

	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	//retorna valor total da compra associada ao cliente
	double totalCompras() {// retorna valor da compra
		double total = 0;
		for (Compra compra : this.compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}