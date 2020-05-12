package application;



import java.util.Observer;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Spieler implements Observer {
	
	StringProperty name;
	IntegerProperty punktestand;
	Buzzer buzzer;
	
	
	public Spieler(StringProperty name, IntegerProperty punktestand, Buzzer buzzer) {
		super();
		this.name = name;
		this.punktestand = punktestand;
		this.buzzer = buzzer;
	}


	@Override
	public void update(java.util.Observable arg0, Object arg1) {
		System.out.println("Observable: " + arg0 + " geändert zu: " + arg1);
		
	}
	
	


	


	
	
	

}
