package fundamentos;

import java.util.Scanner;

public class NextIntNextDouble {
	
	public static void main(String[] args) {
	
		Scanner dado = new Scanner(System.in);
		
		System.out.println("IDADE ? ");
		int idade = dado.nextInt();
		/*nextInt e double , leem os dados junto com o enter (\n), ocupado o espa�o na memoria do proximo input
		Para resolver precisamo pegar o \n que next int ou double nao le:
		*/
		dado.nextLine(); // s� para pegar o \n do teclado inserido pelo usu�rio
		
		System.out.println("NOME ? ");
		String nome = dado.nextLine();
		
		System.out.println("SOBRENOME ?");
		String sobrenome = dado.nextLine();
		
		dado.close();
		
		System.out.printf("Seu nome � %s %s e voc� tem %d anos !!!",nome,sobrenome,idade);
		
	}

}
