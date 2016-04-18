package AparatyKomorkowe.GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class Button extends JButton {
	private static final long serialVersionUID = 8641412472579010968L;

	private String nazwa;
	
	public Button(String nazwa) {
  
    	this.setPreferredSize(new Dimension(65,65));
    	
    	this.nazwa = nazwa;
    	
    	this.setBorder(null);
    
    }
	
	@Override
	public void paintComponent(Graphics g){
		
		
		if(this.nazwa == "1")
		{
			Image bck = new ImageIcon("GUI/One.jpg").getImage();
			
			g.drawImage(bck, 0, 0, this);
			
		}else if(this.nazwa == "0")
		{
			Image bck = new ImageIcon("GUI/Zero.jpg").getImage();
			
			g.drawImage(bck, 0, 0, this);
			
		}else if(this.nazwa == "Pauza")
		{
			Image bck = new ImageIcon("GUI/Pauza.jpg").getImage();
			
			g.drawImage(bck, 0, 0, this);
			
		}else if(this.nazwa == "Count")
		{
			Image bck = new ImageIcon("GUI/Licz.jpg").getImage();
			
			g.drawImage(bck, 0, 0, this);
			
		}
	
		
	}

}

