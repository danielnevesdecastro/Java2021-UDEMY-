package fundamentos;

public class PrimitivosVsObjetos {

	public static void main(String[] args) {
		
		//String é um a classse
		String a = "ass"; // Valor associado a variável é um objeto 
		// seria uma forma de declara porém não usual:
		//String a = new String("ass")
		// o Objeto a tem atributos e comportamentos
		a.toUpperCase();
		
		// Não existe comportamento associado a um tipo primitivo, só carrega dentro dele um valor (sem notação .)
		int b = 123;
		System.out.println(b);
		
		//Wrappers,versão objeto dos tipo primitivos
	}
}
