package desafios.oo.encapsulamento.casaA;

//Aula 161 - OO , encapsulamento - modificadores de acesso
public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {
		//System.out.println(esposa.segredo);// privado, só acessivel na mesma classe 
		System.out.println(esposa.facoDentroDeCasa);// package, mesmo pacote 
		System.out.println(esposa.formaDeFalar);//protected, dentro do mesmo pacote
		System.out.println(esposa.todosSabem);// public, todos conseguem ver 
		
	}
}
