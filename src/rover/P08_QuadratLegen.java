package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P08_QuadratLegen extends RoverProgramm {

	private Rover rover;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P08_QuadratLegen();
	}

	public P08_QuadratLegen() {
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
	 * Rover soll ein Quadrat mit Seitenlaenge 10 Markierungen legen.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Quadrat legen");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
