package desafios.oo.composicao;

//Desafio 144 - Composição
public class Item {
	final int qtd;
	final Produto produto; // = new Produto();//relação com produto, 1 item aponta pra um unico produto
	
	//Construtor explicito da instancia 
	Item(Produto produto, int qtd) {
		this.qtd = qtd;
		this.produto = produto;
	}

}
