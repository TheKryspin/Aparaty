package AparatyKomorkowe.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import AparatyKomorkowe.DataStorage;
import AparatyKomorkowe.GUI.GuiBuilder;
import AparatyKomorkowe.Threads.Licz;

public class LiczenieListener implements MouseListener {

	private GuiBuilder builder;
	
	private Licz ReferencjaWatku;
	
	public LiczenieListener(GuiBuilder tmp)
	{
		this.builder = tmp;
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		DataStorage.Regula = Integer.parseInt(builder.getTextField("regula").getText());
		
		DataStorage.Times = Integer.parseInt(builder.getTextField("timestep").getText());
		
		DataStorage.TimeMS = Double.parseDouble(builder.getTextField("timeanim").getText());
		
		builder.getButton("zero").setEnabled(false);
		
		builder.getButton("one").setEnabled(false);
		
		ReferencjaWatku = new Licz(builder);
		
		ReferencjaWatku.start();
	}

	public Licz getThread()
	{
		return ReferencjaWatku;
		
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
