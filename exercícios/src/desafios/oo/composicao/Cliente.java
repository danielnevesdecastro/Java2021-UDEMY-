package desafios.oo.composicao;

import java.util.ArrayList;
import java.util.List;

//Desafio 144 - Composição
public class Cliente {
	String nome;
	List <Compra> compras = new ArrayList<>();
	
	
	double totalCompras(){// retorna valor da compra
		double total=0;
		for (Compra compras : this.compras){
			//total += compras.adicionarItem(item);
	}
		return total;
}
}