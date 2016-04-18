package AparatyKomorkowe.GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5172173795699678646L;
	String nazwa;

	public Panel(String nazwa) {
		
			this.nazwa = nazwa;
		
			this.setSize(850, 133);
		
			FlowLayout layout = new FlowLayout();
			
			if(nazwa == "TopPanel"){
			
			layout.setVgap(30);
			
			layout.setHgap(5);
			
			}else{

				layout.setVgap(30);
				
				layout.setHgap(20);
					
				
			}
			
			this.setLayout(layout);
		
			
	
		this.setBackground(Color.LIGHT_GRAY);
		
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(this.nazwa == "TopPanel"){
			
			Image bck = new ImageIcon("GUI/TopPanel.jpg").getImage();
			
			g.drawImage(bck, 0, 0, this);
			
		}
		else if(this.nazwa == "MiddlePanel"){
			
			Image bck = new ImageIcon("GUI/MiddlePanel.jpg").getImage();
			
			g.drawImage(bck, 0, 0, this);
			
		}else if(this.nazwa == "BottomPanel"){
			
			Image bck = new ImageIcon("GUI/BottomPanel.jpg").getImage();
			
			g.drawImage(bck, 0, 0, this);
			
		}
		
	}

}