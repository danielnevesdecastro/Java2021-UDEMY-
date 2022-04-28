package fundamentos.operadores;
//49 - Operadores Relacionais 
public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';// vai associar o código da tabela acascII do caractere
		
		boolean valor = a == b ;
		
		System.out.println(valor);	
		System.out.println('\u0061'); // imprimir o caractere em hexadecimal 
		
		System.out.println(3>4);
		System.out.println(3>=3);
		System.out.println(3<4);
		System.out.println(3<=4);
		System.out.println(3!=4);
		
		double nota = 7.3D;
		boolean bomAluno = false;
		boolean passou = nota >= 7;
		
		boolean desconto = bomAluno && passou ;
		//boolean desconto = bomAluno && nota <=7 ; poderia ser assim tbm
		
		System.out.println("Tem desconto ?" + desconto);
	}
}
