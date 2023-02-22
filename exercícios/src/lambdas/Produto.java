package lambdas;
//180 - Predicate
public class Produto extends Object{//object extend por padrão em todas as clases java, implicito
	public final String nome;
	public final double preco;
	public final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		super();//implicito, construtor super referencia Object
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1- desconto);
		return nome + ", Preço: "+preco+
				", com Desconto:  "+precoFinal;
	}
}
