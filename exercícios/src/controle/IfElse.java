package controle;

import javax.swing.JOptionPane;

//Aula 65, Else
public class IfElse {
	public static void main(String[] args) {
		// Exibir painel na recep��o de valor com mensagem
		String valor = JOptionPane.showInputDialog("Informe o n�mero");

		int numero = Integer.parseInt(valor);
		// definir se o n�mero par ou impar
		if (numero % 2 == 0) {
			System.out.println("N� Par ! ");
		}

		if (numero % 2 == 1) {
			System.out.println("N� Impar ! ");
		}

		// Com else
		if (numero % 2 == 0) {
			System.out.println("N� Par!!");
		} else {
			System.out.println("N� Impar!!");
		}

	}
}
