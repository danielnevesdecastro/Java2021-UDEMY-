package br.com.cod3er.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {
	
	
	public Botao(String texto, Color cor ) {
		setText(texto);
		setFont(new Font("courier", Font.BOLD,30));
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	
}
