package desafios.lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.Produto;

//187,188 - Desafio BinaryOperator
public class lambda {
	public static void main(String[] args) {
		Produto  produto1 = new Produto("Ipad", 3235.89 , 0.13);
		
		Function<Produto, Double> precoDesconto =//preco final com desconto
				 prod-> prod.preco *( 1- prod.desconto );
		 		
		UnaryOperator<Double> impostoMunicipal =//imposto municipal
				precoProd-> precoProd >= 2500 ? precoProd * 1.085 : precoProd;
		
		UnaryOperator<Double> frete =//Frete
				precoProd-> precoProd >=
				3000 ? precoProd + 100 : precoProd + 50 ;
			
		UnaryOperator<Double> arredondar=//Duas casas Decimais	
			precoProd -> Double.parseDouble(String.format("%.2f",precoProd));//convertendo pra double uma string formatada do preco
		
		Function<Double, String> formatar=
				precoProd -> ("R$" + precoProd).replace(".", ","); // pra isso funcionar tive q setar argumentos na jre : -Duser.language=en -Duser.country=USs
				
		//Composição de todas interfaces Funcionais
		String valorFinal = precoDesconto
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto1);
		 
		System.out.println(valorFinal);
		
		;
		
		
		
	}
}
