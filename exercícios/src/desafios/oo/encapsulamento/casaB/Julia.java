package desafios.oo.encapsulamento.casaB;
//Aula 161 - OO , encapsulamento - modificadores de acesso

import desafios.oo.encapsulamento.casaA.Ana;

public class Julia {
	Ana sogra = new Ana();

	void acessoTeste() {
		//System.out.println(esposa.segredo);// privado, só acessivel na mesma classe 
		//System.out.println(esposa.facoDentroDeCasa);// package, mesmo pacote 
		//System.out.println(esposa.formaDeFalar);//protected, por herança
		System.out.println(sogra.todosSabem);// public, todos conseguem ver	}
}
}