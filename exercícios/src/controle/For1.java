package controle;

//Aula 70, For 
public class For1 {
	public static void main(String[] args) {

		for (int cont = 1; cont <= 10; cont++) {
			System.out.printf("Bom dia N� %d\n", cont);
		}
		// apenas a express�o , sem inicializa��o, sem incrementa��o
		int x = 2;
		for (; x < 10;) {
			System.out.println("x = " + x);
			x++;

		}
		// La�o infinito
		for (;;) {// ou usar true , para repetir ininitamente;
			System.out.println("fim !!!");
		}
		
		}
		
	}
}
