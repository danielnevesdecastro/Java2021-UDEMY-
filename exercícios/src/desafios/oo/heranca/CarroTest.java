package desafios.oo.heranca;
//Aula 155 ,156 - Desafio heran�a

public class CarroTest {
	public static void main(String[] args) {

		Carro civic = new Civic();
		Carro ferrari = new Ferrari();
		
		System.out.println(civic.toString());
		System.out.println(ferrari.toString());

		civic.acelerar();
		civic.acelerar();
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
