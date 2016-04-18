package AparatyKomorkowe.GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Podpis extends JLabel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5480573726932055478L;

	public Podpis(String text)
	{
		this.setText(text);
		
		this.setForeground(Color.WHITE);
		
		this.setFont(new Font("Verdana",1,15));
		
	}
	
	
}
