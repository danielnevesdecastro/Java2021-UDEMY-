package fundamentos;

public class PrimitivosVsObjetos {

	public static void main(String[] args) {
		
		//String � um a classse
		String a = "ass"; // Valor associado a vari�vel � um objeto 
		// seria uma forma de declara por�m n�o usual:
		//String a = new String("ass")
		// o Objeto a tem atributos e comportamentos
		a.toUpperCase();
		
		// N�o existe comportamento associado a um tipo primitivo, s� carrega dentro dele um valor (sem nota��o .)
		int b = 123;
		System.out.println(b);
		
		//Wrappers,vers�o objeto dos tipo primitivos
	}
}
