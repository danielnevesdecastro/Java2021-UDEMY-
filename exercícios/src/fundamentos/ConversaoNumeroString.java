package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		//Converter usando Wrapper
		Integer n1 = 10000;//Wrapper inteiro
		System.out.println(n1.toString()); // Converteu inteiro para String , notação . (comportamento do objeto);
		System.out.println(n1.toString().length()+" caracteres");
		
		//Converter num para string 
		int n2 = 20000;
		//usando o Integer diretamente, passando o valor primitivo 
		System.out.println(Integer.toString(n2).length()+ " caracteres");//lenght = tamanho
		
		System.out.println(("número" +n2).length()+ " caracteres " ); // converter Concatenando 
	}
}
