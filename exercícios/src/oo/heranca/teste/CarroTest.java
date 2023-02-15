package oo.heranca.teste;
//Aula 155 ,156 - Desafio herança

import desafios.oo.heranca.Carro;
import desafios.oo.heranca.Civic;
import desafios.oo.heranca.Ferrari;

public class CarroTest {
	public static void main(String[] args) {

		Carro civic = new Civic(12);
		Carro ferrari = new Ferrari();
		System.out.println(civic.toString());
		System.out.println(ferrari.toString());

		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(civic.toString());
		System.out.println(ferrari.toString());
		
		civic.freiar();
		ferrari.freiar();
		ferrari.freiar();
		System.out.println(civic.toString());
		System.out.println(ferrari.toString());
		
		
		
		
	}
}
