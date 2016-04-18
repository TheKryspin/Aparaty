package AparatyKomorkowe.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

import AparatyKomorkowe.DataStorage;

/**
 * Spróbować zamienić inta na byte'a jak już zadziała. Dla optymalizacji ;)
 */
public class Cell extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 186962973799288708L;
	private int var;
    private int index;
    
	public Cell(int i) {
		this.setPreferredSize(new Dimension(66, 66));
	
		this.var = 0;
		
		index = i;
		
		this.changeColor();
		
		this.addMouseListener(new Clicked(this));
	
		
	}
	
	public int getIndex(){   return this.index;   }
	
	
	public int getVar() {
    
		return this.var;
    
	}
	

    public void setVar(int var) {
    
    	this.var = var;
    	
    }
    public void sendMyVar() {

    	DataStorage.Before[this.index] = this.var;
    
    }
    
    public void changeColor(){
    	
    	if(this.var == 0){this.setBackground(Color.WHITE); this.repaint(); }
    	else if(this.var == 1){this.setBackground(Color.BLACK); this.repaint(); }
    	
    }
}

class Clicked implements MouseListener
{

	Cell tmp;
	
	public Clicked(Cell tmp){this.tmp = tmp;}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		if(DataStorage.Running == false){
		
			if(tmp.getVar() == 0) { tmp.setVar(1); DataStorage.Before[tmp.getIndex()]=tmp.getVar(); tmp.changeColor(); }
			else if(tmp.getVar() == 1) { tmp.setVar(0); DataStorage.Before[tmp.getIndex()]=tmp.getVar(); tmp.changeColor(); }
		
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}