package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Fragerunde {
	
	private List<Frage> gstellteFragen = new ArrayList<Frage>();
	
	private EinAuslesenFragen eaF = new EinAuslesenFragen("src/res/fragen.ser");
	//private List<Frage> ausgeleseneFragen = eaF.leseFragen("src/res/fragen.ser");	
	
	private Timer t;
	int counter;
	
	
	
	public Frage frageZufaelligAuswaehlen(List<Frage> f) {			
		int zufallszahl = (int) (Math.random() * f.size());
		return f.get(zufallszahl);	
	}
	
	public void zaehleRunden() {
		if(counter == 10) {			
		}
	}
	
	public void punktestandAnpassen() {
		
	}
	

}
