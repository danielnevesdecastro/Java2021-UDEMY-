package oo.heranca;

//Aula 152 a 154 - OO - Enum , Herança
public class Jogo {
	public static void main(String[] args) {

		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		Jogador heroi = new Heroi(); // polimorfismo
		heroi.x = 10;
		heroi.y = 11;

		
		System.out.println("Monstro life: "+ monstro.vida);
		System.out.println("Heroi life: "+ heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		System.out.println(monstro.atacar(heroi));
		heroi.atacar(monstro);
		
		System.out.println("Monstro life: "+ monstro.vida);
		System.out.println("Heroi life: "+ heroi.vida);


	}
}
