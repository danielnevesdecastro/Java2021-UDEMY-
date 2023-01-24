package classe;

//Aula 92 - 102, Classes 
public class ProdutoTeste {
	public static void main(String[] args) {
		// n�o preciso importar a classe produto por estar no mesmo pacote
		// mesma coisa com o java.lang;

		// Tipo , nome vari�vel ,atribui��o e contrutor : new (instanciar tipo)
		//Construtor Explicito (par�metros)
		Produto p1 = new Produto("Notebook",1000.00); 
		/*Como seria com o construtor padr�o:
		*p1.nome = "Notebook";
		*p1.preco = 4356.89;
		*p1.desconto = 0.25;*/
		
		//Chamando o tipo produto por infer�ncia (var)
		var p2 = new Produto();//inst�ncia com o construtor default 
		//nota��o . pra acessa.r os menbros(atributos) da inst�ncia
		//intancia novos espa�os da memorias com as variaveis de finidas
		p2.nome = "Caneta Touch";
		p2.preco = 10.00;
		//Produto.desconto = 0.;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		
		System.out.println(p1.precoDesconto());
		System.out.println(p2.precoDesconto());
		double mediaCarrinho = (p1.precoDesconto() + p2.precoDesconto()) / 2;

		System.out.printf("M�dia do carrinho R$ %.2f \n", mediaCarrinho);
		// executando metodo Desconto
		System.out.printf("\nPre�o final com desconto %s : R$ %.2f",p1.nome, p1.precoDesconto());
		System.out.printf("\nPre�o final com desconto %s : R$ %.2f",p2.nome, p2.precoDesconto());
		
		
	}
}