package desafios.oo.composicao;

//Desafio 144 - Composi��o
public class Item {
	int qtd;
	Produto produto; // = new Produto();//rela��o com produto, 1 item aponta pra um unico produto

	Item(Produto produto, int qtd) {
		this.qtd = qtd;
		this.produto = produto;
	}

}
