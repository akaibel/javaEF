package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P08B_QuadratLegenGefuellt extends RoverProgramm {

	private Rover rover;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P08B_QuadratLegenGefuellt();
	}

	public P08B_QuadratLegenGefuellt() {
		this.configuration().setCellSize(30);
		rover = new Rover(this, 1, 1, 0);
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
	 * Rover soll ein gefuelltes Quadrat mit Seitenlaenge 10 Blaetter legen.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: gefuelltes Quadrat legen");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
