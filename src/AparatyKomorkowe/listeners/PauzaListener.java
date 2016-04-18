package AparatyKomorkowe.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import AparatyKomorkowe.Threads.Licz;

public class PauzaListener implements MouseListener {

	private int count = 0;
	
	private Licz ReferencjaWatku;
	
		
		public PauzaListener(Licz watek)
		{
		
		this.ReferencjaWatku = watek;
		
		}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void mouseClicked(MouseEvent arg0) {
		count ++;
		
		if(count%2 == 1){
			
			ReferencjaWatku.stop();
		}
		if(count %2 == 0)
		{
			
			ReferencjaWatku.start();
		}
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
