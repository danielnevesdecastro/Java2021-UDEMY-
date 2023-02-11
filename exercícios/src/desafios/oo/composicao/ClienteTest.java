package desafios.oo.composicao;

//Desafio 144 - Composição
public class ClienteTest {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Daniel Neves");
		Cliente cliente2 = new Cliente("Maria Neves");
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		Produto p1 = new Produto("Garapa", 5);
		Produto p2 = new Produto("Goiabada REI", 15);
		
		compra1.adicionarItem("Agua Purificada", 15, 2); // adiocionei item com todas as informações
		compra1.adicionarItem(p1, 3); // peguei informaçoes de produto ja cadastrado
		compra1.adicionarItem(new Produto("Caneta Azul", 2.50), 2); // adicionaie e instancie o cadastro de produtos na lista 
		//cliente1.compras.add(compra1);// associei lista de comrpa ao usuario
		cliente1.adicionarCompra(compra1);// associei lista de compra ao usuario
		
		compra2.adicionarItem(p2, 5); // peguei informaçoes de produto ja cadastrado
		compra2.adicionarItem("Agua mineral",1 , 10); // peguei informaçoes de produto ja cadastrado
		cliente2.compras.add(compra2);
		
		double totalCompra2 = compra2.obterValorTotal();
		System.out.println("Total compra 2 - "+totalCompra2);
		System.out.println("Total compra  cliente: "+cliente2.nome+": "+cliente2.totalCompras());
		
		double totalcompra1 = compra1.obterValorTotal();
		System.out.println("Total compra 2 - "+totalcompra1);
		System.out.println("Total compra  cliente: "+cliente1.nome+": "+cliente1.totalCompras());
		
		
	
		
	}
}
