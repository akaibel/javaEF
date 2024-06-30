package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P05_RasenMaehen extends RoverProgramm {

	private Rover rover;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P05_RasenMaehen();
	}

	public P05_RasenMaehen() {
		this.configuration().setCellSize(30);
		rover = new Rover(this, 2, 1, 0);
	}
	
	public String[] landkarte(){
		String[] landkarte = {
				"....................",
				"..mmmmmmmmmmmmmmmm..",
				"..mmmmmmmmmmmmmmmm..",
				"..mmmmmmmmmmmmmmmm..",
				"..mmmmmmmmmmmmmmmm..",
				"..mmmmmmmmmmmmmmmm..",
				"..mmmmmmmmmmmmmmmm..",
				"....................",
		};
		return landkarte;
	}

	/**
	 * Rover soll den Rasen maehen, 
	 * d.h. alle Markierungen entfernen.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Rasen maehen");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
