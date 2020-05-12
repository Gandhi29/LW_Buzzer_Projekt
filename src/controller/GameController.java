package controller;

import java.util.ArrayList;
import java.util.List;

import application.Antwort;
import application.Buzzer;
import application.EinAuslesenFragen;
import application.Frage;
import application.Fragerunde;
import application.Spieler;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import view.MainViewController;

public class GameController extends Application {
	
	/*private List<Buzzer> buzzers = new ArrayList<Buzzer>();
	private List<Spieler> spieler = new ArrayList<Spieler>();*/
	
	//private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(
					GameController.class.getResource("../view/MainView.fxml")
					);
			Parent parent = loader.load();
			Scene scene = new Scene(parent);
			
			//MainViewController controller = loader.getController();
			primaryStage.setScene(scene);
			primaryStage.setTitle("Buzzer Game");
			primaryStage.show();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			Platform.exit();
		}
	}
	
	public static void main(String[] args) {
		EinAuslesenFragen eaF = new EinAuslesenFragen("src/res/fragen.ser");
		
		ArrayList<Antwort> antworten1 = new ArrayList<Antwort>();
		ArrayList<Antwort> antworten2 = new ArrayList<Antwort>();
		ArrayList<Antwort> antworten3 = new ArrayList<Antwort>();
		
		ArrayList<Frage> fragen = new ArrayList<Frage>();
		
		
		Antwort antwort1_2 = new Antwort("Relationship Authorisation Manager", false);
		antworten1.add(antwort1_2);
		Antwort antwort1_3 = new Antwort("Remote Access Module", false);
		antworten1.add(antwort1_3);
		Antwort antwort1_1 = new Antwort("Random Access Memory", true);
		antworten1.add(antwort1_1);
		Frage fragen1 = new Frage("Was heisst RAM?", antworten1);
		fragen.add(fragen1);
		
		Antwort antwort2_2 = new Antwort("Operating System", true);
		antworten2.add(antwort2_2);
		Antwort antwort2_3 = new Antwort("Office Simulation", false);
		antworten2.add(antwort2_3);
		Antwort antwort2_1 = new Antwort("Open Software", false);
		antworten2.add(antwort2_1);
		Frage fragen2 = new Frage("Für was steht OS?", antworten2);
		fragen.add(fragen2);
		
		Antwort antwort3_2 = new Antwort("USB-Stick", false);
		antworten3.add(antwort3_2);
		Antwort antwort3_3 = new Antwort("Datenbank", true);
		antworten3.add(antwort3_3);
		Antwort antwort3_1 = new Antwort("Externe Festplatte", false);
		antworten3.add(antwort3_1);
		Frage fragen3 = new Frage("Wo werden grosse Mengen an Daten gespeichert?", antworten3);
		fragen.add(fragen3);
		
		eaF.writeInFile(fragen);
		
		List<Frage> zurueckGelesen = eaF.leseFragen("src/res/fragen.ser");
		
		//Ausgabe aller Fragen inkl Antwort und BuzzerNr
		//zurueckGelesen.forEach(x -> {
			//System.out.println(x.getFrage());
			/*x.getAntworten().forEach(y -> {
				System.out.println(y.getAntwort());
			});*/			
			//System.out.println(x.korrekteAntwort());
			//System.out.println("BuzzerNr " + x.korrekteAntwortInt() + " muss gedrückt werden");
			//System.out.println("");
		//});
		
		Fragerunde fr = new Fragerunde();
		
		
		Frage f = fr.frageZufaelligAuswaehlen(zurueckGelesen);
		System.out.println(f.getFrage());
		System.out.println(f.korrekteAntwort());
		
		//Spieler s = new Spieler(new StringProperty("Spieler 1"), new IntegerProperty(0), new Buzzer(1, 2, 3));
		
		//launch(args);
		
	}
	
	public void spielrundeStarten() {
		
	}
	
	public void fragenInRundeLaden() {
		
	}

}
