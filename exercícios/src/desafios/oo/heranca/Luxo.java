package desafios.oo.heranca;
//Aula 167 - OO - interface
public interface Luxo {
	void ligarAr();
	void desligarAr();
	default int nivelDoAR() {// torna desobrigatorio implementar esse método da interface
		return 1;
	}
}
