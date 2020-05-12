package application;

import java.util.Observable;


public class Buzzer extends Observable {
	
	private int buzzer1;
	private int buzzer2;
	private int buzzer3;	
	
	
	public Buzzer(int buzzer1, int buzzer2, int buzzer3) {
		super();
		this.buzzer1 = buzzer1;
		this.buzzer2 = buzzer2;
		this.buzzer3 = buzzer3;
	}

	public int uebermittelterWert() {
		return 0;		
	}

	public void setBuzzer1(int buzzer1) {
		this.buzzer1 = buzzer1;
		this.notifyObservers();
	}

	public void setBuzzer2(int buzzer2) {
		this.buzzer2 = buzzer2;
		this.notifyObservers();
	}

	public void setBuzzer3(int buzzer3) {
		this.buzzer3 = buzzer3;
		this.notifyObservers();
	}

	
	
	
	

	

}
