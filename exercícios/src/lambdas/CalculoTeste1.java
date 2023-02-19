package lambdas;
//173 - lambdas

public class CalculoTeste1 {
	public static void main(String[] args) {
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(3, 5));
		
		
		calculo = new Multiplicar();//polimorfismo, instancias diferentes
		System.out.println(calculo.executar(3, 5));
	}
}
