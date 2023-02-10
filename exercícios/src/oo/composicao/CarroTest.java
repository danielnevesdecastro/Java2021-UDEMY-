package oo.composicao;

//Aula 140,141 -Composi��o, 1 pra 1
public class CarroTest {
	public static void main(String[] args) {

		Carro c1 = new Carro();

		System.out.println("CARRO Ligado ? :" + c1.estaLigado());
		c1.ligar();
		System.out.println("CARRO Ligado ? :" + c1.estaLigado());

		System.out.println(c1.motor.giros());
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
		boolean porta = c1.portaCarro.portaAberta();
		System.out.println("A Porta est� Aberta ? " + porta);
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		System.out.println(c1.motor.giros());
		// c1.motor.fatorInjecao = -30; Falta encapsulamento!

	}
}
