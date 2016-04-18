package AparatyKomorkowe;


import AparatyKomorkowe.GUI.*;


public class Fasada {


    private GuiBuilder builder;
    public DataStorage storage;
	
    public Fasada() {

    	builder = new GuiBuilder();
    	
    	builder.buildGui();
    	
    }








}