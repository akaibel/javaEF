package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P01_GesteinAnalysieren extends RoverProgramm{


	private Rover rover;

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P01_GesteinAnalysieren();
	}
	
	public P01_GesteinAnalysieren() {
		rover = new Rover(this, 1, 1, 0);
	}
	
	public String[] landkarte(){
		String[] landkarte = {
				"..............",
				"x..b.rbr.bb..x",
				"..............",
				"..............",
				"..............",
			};
		return landkarte;
	}
	
	/**
	 * Rover soll Gestein analysieren, bis er beim Baum angekommen ist.
	 * Dabei soll der Rover die Gesteine aufheben (Methode analysiereGestein)
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Gestein analysieren");
		while(rover.huegelVorhanden("vorne") == false) {
			if(rover.gesteinVorhanden() == true) {
				rover.analysiereGestein();
				rover.setzeMarke();
			}
			rover.fahre();
		}
	} // Ende meinProgramm()
	
} // Ende der Klasse
