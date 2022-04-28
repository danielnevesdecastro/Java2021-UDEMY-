 package fundamentos.operadores;
//Aula 46
public class Logicos {

	public static void main(String[] args) {
		
		//Condição = Verdadeiro
		boolean cond1 = true;
		//condição, 3 é maioo que 7 ? FALSO
		boolean cond2 = 3>7;
		
		//E / and
		System.out.println(cond1 && cond2);
		System.out.println(cond1 && !cond2); //negando a segundo literal 
		//OU / OR
		System.out.println(cond1 || cond2);
		//OU exclusivo / xor 
		System.out.println(cond1 ^ cond2);
		//Negação
		System.out.println(!cond1);
		System.out.println(!!cond1);//negou a negação 
		System.out.println(!cond2);
	}
}
