package AparatyKomorkowe.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import AparatyKomorkowe.DataStorage;
import AparatyKomorkowe.Threads.Licz;

public class PauzaListener implements MouseListener {
	
		public PauzaListener()
		{
		
		}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
	DataStorage.referencja.stop();
	
	
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
