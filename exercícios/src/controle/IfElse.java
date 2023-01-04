package controle;

import javax.swing.JOptionPane;

//Aula 65, Else
public class IfElse {
	public static void main(String[] args) {
		// Exibir painel na recepção de valor com mensagem
		String valor = JOptionPane.showInputDialog("Informe o número");

		int numero = Integer.parseInt(valor);
		// definir se o número par ou impar
		if (numero % 2 == 0) {
			System.out.println("Nº Par ! ");
		}

		if (numero % 2 == 1) {
			System.out.println("Nº Impar ! ");
		}

		// Com else
		if (numero % 2 == 0) {
			System.out.println("Nº Par!!");
		} else {
			System.out.println("Nº Impar!!");
		}

	}
}
