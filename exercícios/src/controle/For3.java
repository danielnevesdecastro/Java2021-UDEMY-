package controle;
//Aula 76 for dentro do for 
public class For3 {
	public static void main(String[] args) {
		// i contador sendo declarado fora ,
		// para q a vari�vel fique visivel fora do la�o for
		int i;

		for (i = 0; i < 10; i++) {
			System.out.println("N� " + i);

		}
		System.out.println("N� fora " + i);

		int cont = 1;
		for (int j = 0; j < 10; j++) {
			for (int k = 0; k < 10; k++) {
				System.out.printf("\nN�%d %d , %d", cont, j, k);
				cont++;
			}
		}
	}
}
