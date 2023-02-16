package oo.abstrato;
//Aula 169 - OO, Classe Abstrata
public class TesteAbstrato {
	public static void main(String[] args) {
		
		Mamifero a = new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.respirar());
		System.out.println(a.mamar());
	}
}
