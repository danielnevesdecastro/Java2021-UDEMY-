package oo.polimorfismo;
//Aula 165 - 00, Polimorfismo

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz a1 = new Arroz(0.2);
		Feijao f1 = new Feijao(0.1);
		Sorvete s1 = new Sorvete(0.4);
		
		System.out.println(convidado.getPeso());
		
		convidado.Comer(a1);
		convidado.Comer(f1);
		System.out.println(convidado.getPeso());
		
		convidado.Comer(s1);
		System.out.println(convidado.getPeso());
	}
}
