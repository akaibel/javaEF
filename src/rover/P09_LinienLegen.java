package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P09_LinienLegen extends RoverProgramm {

	private Rover rover;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P09_LinienLegen();
	}

	public P09_LinienLegen() {
		rover = new Rover(this,1,1,0);
	}
	
	public String[] landkarte(){
		String[] landkarte = {
				".............",
				".............",
				".............",
				".............",
				".............",
				".............",
				".............",
		};
		return landkarte;
	}

	/**
	 * Rover soll drei Markierungs-Linien der Laenge 10, 8, 6 legen.
	 * dafuer soll er die Methode linieLegen geeignet aufrufen. 
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Linien legen");
		//TODO
		
	} // Ende meinProgramm()
	
	public void linieLegen(int anzahl) {
		//TODO
		
	} // Ende linieLegen(...)
	
}  // Ende der Klasse
