package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		// exibir informa��o em um painel visual
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero"); 
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero");
		
		System.out.println(valor1+" " +valor2);
	
	
		double n1 = Double.parseDouble(valor1); // Convertendo String para double  
		double n2 = Double.parseDouble(valor2);
		
		double soma = n1+n2 ;
		
		System.out.println("Soma � : "+ soma);
		System.out.println("M�dia � : "+ soma / 2);
		
		
	}
}
