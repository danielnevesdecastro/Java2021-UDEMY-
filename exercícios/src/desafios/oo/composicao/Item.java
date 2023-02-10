package desafios.oo.composicao;

//Desafio 144 - Composição
public class Item {
	int qtd;
	Produto produto; // = new Produto();//relação com produto, 1 item aponta pra um unico produto

	Item(Produto produto, int qtd) {
		this.qtd = qtd;
		this.produto = produto;
	}

}
