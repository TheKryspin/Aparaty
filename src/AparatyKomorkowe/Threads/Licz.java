package AparatyKomorkowe.Threads;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import AparatyKomorkowe.DataStorage;
import AparatyKomorkowe.GUI.GuiBuilder;

/**
 * 
 */
public class Licz extends Thread{

	private GuiBuilder dostep;
	
	private int krok;
	
	private BufferedWriter History;
	
	public Licz(GuiBuilder dostep) {
    
		this.dostep = dostep;
		
		
	}

	@Override
	public void run()
	{
		DataStorage.referencja = this;

		
		this.zamien();
		
		History = new BufferedWriter(this.initializeHistogram());
		
		try {
			
			History.write(this.toSave() + " Krok nr " + Integer.toString(krok));History.newLine();

			} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(krok < DataStorage.Times){
		try {
			int ile = (int) DataStorage.TimeMS*1000;
			Thread.sleep(ile);
			
		} catch (InterruptedException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dostep.getTextField("timeshow").setText(Integer.toString(krok+1));
		
		for(int i = 0; i < 11; i ++)
		{
		 
			
			dostep.getCells()[i].setVar(this.checkVal(i));
			
			dostep.getCells()[i].changeColor();
			
			
		}
		
		for(int i = 0; i < 11; i ++)
		{
			
			DataStorage.Before[i] = dostep.getCells()[i].getVar();
			
			
		}

		
		krok ++;


		try {
			History.write(this.toSave() + " Krok nr " + Integer.toString(krok));	History.newLine(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
		try {
			History.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void zamien(){
		
		int do_zamiany = DataStorage.Regula;
		
		int i = 7;
		
		while(i>=0){
			
			if(do_zamiany % 2 == 1)
			{
				DataStorage.Conditions[i] = 1;
		
				//System.out.println(Integer.toString(DataStorage.Conditions[i]));
			}else
			{
				
				DataStorage.Conditions[i] = 0;
			
				//System.out.println(Integer.toString(DataStorage.Conditions[i]));
			}
		
			do_zamiany = do_zamiany/2;	
			
			i--;
			
		}
		
		
	}
	
	
	private int checkVal(int i)
	{
		
		int middle, left, right;
		
		int wynik = 0;
		
		if(i != 0 && i != 10){
		
		 middle = DataStorage.Before[i];
		
		 left = DataStorage.Before[i-1];
		
		 right = DataStorage.Before[i+1];
		}else if( i == 0)
		{
			middle = DataStorage.Before[i];
			
			left = DataStorage.BC;
			
			right = DataStorage.Before[i+1];
		}else
		{
			middle = DataStorage.Before[i];
			
			left = DataStorage.Before[i-1];
			
			right = DataStorage.BC;
			
			
		}
		
		if(middle == 1)
		{
			if( left == 1 && right == 1)
			{wynik= DataStorage.Conditions[7];}
			else if(left == 1 && right == 0)
			{wynik= DataStorage.Conditions[6];}
			else if(left == 0 && right == 1)
			{wynik = DataStorage.Conditions[3];}
			else if(left == 0 && right == 0)
			{wynik = DataStorage.Conditions[2];}
			
		}else
		{
			if( left == 1 && right == 1)
			{wynik = DataStorage.Conditions[5];}
			else if(left == 1 && right == 0)
			{wynik = DataStorage.Conditions[4];}
			else if(left == 0 && right == 1)
			{wynik = DataStorage.Conditions[1];}
			else if(left == 0 && right == 0)
			{wynik= DataStorage.Conditions[0];}
				
		}
		return wynik;
	}
	
		private FileWriter initializeHistogram()
		{
			
			String nazwa = null;
				
			Calendar Today = Calendar.getInstance();
		
				nazwa = Today.getTime().toString();
				
				nazwa = nazwa.replace(":", "");
			
				nazwa += (" " + Integer.toString(DataStorage.Regula));
				
				nazwa += (" " + Integer.toString(DataStorage.BC));
				
				nazwa += (" " + Integer.toString(DataStorage.Times));
				
				nazwa = "Histogram/"+nazwa+".txt";
				
				System.out.println(nazwa);
				
				try {
						
						FileWriter histogram = new FileWriter(nazwa);
						
						return histogram;
					
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					
						return null;
					}
				
			
			
			
		}

		private String toSave()
		{
			
			String zapis = null;
			
				for(int i =0 ; i < DataStorage.Before.length; i++)
				{
				
					zapis+= " " + Integer.toString(DataStorage.Before[i]);
				
				}
			
			
			return zapis;
		}
}
