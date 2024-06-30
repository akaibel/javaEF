package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P07_WasserSammelnUndZaehlen extends RoverProgramm {

	private Rover rover;

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P07_WasserSammelnUndZaehlen();
	}
	
	public P07_WasserSammelnUndZaehlen() {
		rover = new Rover(this, 1, 1, 0);
	}
	
	public String[] landkarte(){
		String[] landkarte = {
				"..............",
				"....b.b..bb.x.",
				"..............",
				"..............",
				"..............",
			};
		return landkarte;
	}
	
	/**
	 * Rover soll die Steine aufsammeln und dabei zaehlen.
	 * Die Anzahl der Steine soll am Schluss angezeigt werden.
	 * Ausserdem soll der Rover messen, wie viel Wasser er damit gewonnen hat.
	 * Auch das soll am Ende angezeigt werden.
	 * 
	 * Erweiterung:
	 * Dann soll Rover wenden und so viele Markierungen legen, 
	 * wie er Steine gesammelt hat. 
	 * (alle hintereinander)
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Wasser sammeln und zaehlen");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
