package desafios.oo.heranca;
//Aula 155 ,156 - Desafio herança

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
