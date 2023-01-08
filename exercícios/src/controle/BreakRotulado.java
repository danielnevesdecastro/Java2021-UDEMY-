package controle;

//Aula 83, Break rotulado
public class BreakRotulado {
	public static void main(String[] args) {
		// evite o uso !!
		externo: for (int i = 0; i < 3; i++) { // externo = nome do laço 
			 for (int j = 0; j < 3; j++) {

				if (i == 1) {
					break externo;
				}
				System.out.printf("%d %d", i, j);
			}
			System.out.println();
		}
		System.out.println("fim");
	}
}
