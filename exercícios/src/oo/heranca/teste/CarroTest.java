package oo.heranca.teste;
//Aula 155 ,156 - Desafio herança

import desafios.oo.heranca.Carro;
import desafios.oo.heranca.Civic;
import desafios.oo.heranca.Ferrari;

public class CarroTest {
	public static void main(String[] args) {

		Carro civic = new Civic(12);
		Ferrari ferrari = new Ferrari(315);
		System.out.println(civic.toString());
		System.out.println(ferrari.toString());

		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println("Ferrari, "+ferrari.toString());
		
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.acelerar();
		
		System.out.println(civic.toString());
		System.out.println("Ferrari, "+ferrari.toString());
		
		civic.freiar();
		ferrari.freiar();
		ferrari.freiar();
		ferrari.desligarTurbo();
		System.out.println(civic.toString());
		System.out.println("Ferrari, "+ferrari.toString());
		
		
		
		
	}
}
