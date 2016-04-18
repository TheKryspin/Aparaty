package AparatyKomorkowe.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;


import javax.swing.*;

public class TextField extends JTextField {

 	private static final long serialVersionUID = -8153446369368414718L;

	public TextField() {

    	this.setPreferredSize(new Dimension(80,65));
    	
    	this.setBorder(null);
    	
    		Font VerdanaWhite = new Font("Verdana", 1, 22); 
    	
    		this.setCaretColor(Color.WHITE);
    		
    		this.setForeground(Color.WHITE);
    		
    		this.setFont(VerdanaWhite);
    	
    		this.setHorizontalAlignment(CENTER);
    	
    	
    			Color violet = new Color(121,41,72);
    	
    			this.setBackground(violet);
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
	}
			
	


}