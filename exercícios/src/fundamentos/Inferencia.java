package fundamentos;
/**
 * Fun��o a Partir do Java 10
 * @author Neves
 *
 */
public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 5.4; //Infer�ncia, agora o java vai inferir qual � o tipo da vari�vel, atrav�s do valor;
		System.out.println(b);
		
		var oi = "opa";//inferencia
		System.out.println(oi);
		
		oi = "eae";//inferencia
		System.out.println(oi);
		
		
	}
}
