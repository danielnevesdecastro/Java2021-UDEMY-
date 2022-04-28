package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {

		Scanner dado = new Scanner(System.in);

		// byte
		Byte b = 100;
		// short
		Short s = 1000;
		// int - convertendo string pra inteiro recebendo do usuário
		Integer i = Integer.parseInt(dado.nextLine());
		// long
		Long l = 10000000L;
		// boolean
		Boolean bo = Boolean.parseBoolean("true");
		//char
		Character c = '*'; 
		//float
		Float f = 123.10F;
		//double
		Double d = 1234.5678;

		System.out.println(b.byteValue());
		System.out.println(s.toString()); // transformando em string;
		System.out.println(i * 2);
		
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		System.out.println(c+l);
		System.out.println(f);
		System.out.println(d);
		
		dado.close();

	}
}
