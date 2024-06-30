package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P06_HuegelZaehlen extends RoverProgramm {

	private Rover rover;

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P06_HuegelZaehlen();
	}

	public P06_HuegelZaehlen() {
		rover = new Rover(this, 1, 0, 0);
	}

	public String[] landkarte(){
		String[] landkarte = {
				"..............",
				".xxxxxxxxxxx..",
				"..............",
				"..............",
				"..............",
		};
		return landkarte;
	}

	/**
	 * Rover soll die Huegel zaehlen.
	 * Die Anzahl der Huegel soll am Schluss angezeigt werden.
	 * 
	 * Erweiterung:
	 * Dann soll Rover drei Zeilen runter gehen
	 * und jeweils unter den Baeumen Markierungen ablegen.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Huegel zaehlen");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
