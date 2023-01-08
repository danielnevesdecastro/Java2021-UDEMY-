package controle;

//Aula 82 , Continue
public class Continue {
	public static void main(String[] args) {
		//forma ineficiente para imprimir números pares, teste
		for (int i = 0; i< 10; i ++) {
			if( i % 2 == 1 ) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}
