package br.com.cod3er.calc.visao;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.cod3er.calc.model.Memoria;

@SuppressWarnings("serial")
public class Display extends JPanel {
	
	private JLabel label;
	
	
	public Display() {
		setBackground(Color.GRAY);
		 label = new JLabel(Memoria.getInstnacia().getTextoAtual());
		 label.setForeground(Color.WHITE);
		 label.setFont(new Font("courier", Font.BOLD,30));
		 setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 50));
		 add(label);
	}
}
