 package fundamentos.operadores;
//Aula 46
public class Logicos {

	public static void main(String[] args) {
		
		//Condi��o = Verdadeiro
		boolean cond1 = true;
		//condi��o, 3 � maioo que 7 ? FALSO
		boolean cond2 = 3>7;
		
		//E / and
		System.out.println(cond1 && cond2);
		System.out.println(cond1 && !cond2); //negando a segundo literal 
		//OU / OR
		System.out.println(cond1 || cond2);
		//OU exclusivo / xor 
		System.out.println(cond1 ^ cond2);
		//Nega��o
		System.out.println(!cond1);
		System.out.println(!!cond1);//negou a nega��o 
		System.out.println(!cond2);
	}
}
