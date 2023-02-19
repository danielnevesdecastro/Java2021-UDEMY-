package lambdas;
//173 a175  - lambdas, interface funcional

@FunctionalInterface //explicita uma interface funcional, para usar com lambdas
public interface Calculo {
	//public abstract ja vem implicitamente nos metodos da interface
	public abstract double executar (double a , double b );
	
	//default, desobrigda implementação
	default String legal() {
		return "legal";
	}
	//pertece a interface , desobriga a implementação na classe que der implements
	static String muitoLegal() {
		return "muito legal";
	}
}
