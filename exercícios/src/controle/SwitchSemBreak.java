package controle;

//Aula 79, Switch
public class SwitchSemBreak {
	public static void main(String[] args) {
		// if ( bool )
		// While ( bool)
		// for (bool)
		// switch (valor)
		String faixa = "marrom";
		// Sem break;
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian  Ghodan");
			break; // para o op��o escolhida
		default: // op��o de sa�da caso nenhuma condi��o satisfa�a a execu��o do bloco
			System.out.println("n�o sei nada");
		}

		int idade = 3;
		switch (idade) {
		case 3:
			System.out.println("sabe falar");
		case 2:
			System.out.println("sabe Andar");
		case 1:
			System.out.println("sabe Respirar");

		}
	}
}