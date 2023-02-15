package desafios.oo.encapsulamento.casaB;

import desafios.oo.encapsulamento.casaA.Ana;

//Aula 161 - OO , encapsulamento - modificadores de acesso
public class Pedro extends Ana {

	// Ana mae = new Ana(); não preciso declara pq herdo de ana;
	// usar super pra usar os menbros

	void testeAcessos() {
		// System.out.println(esposa.segredo);//privado,só acessivel na mesma classe
		// System.out.println(esposa.facoDentroDeCasa);//package,só acessivel no mesmo pacote
		System.out.println(formaDeFalar);// protected, passado pro herança
		//acessando por uma nova ana , o membro da classe ana 
		System.out.println(new Ana ().todosSabem);// public, todos conseguem ver
	}
}
