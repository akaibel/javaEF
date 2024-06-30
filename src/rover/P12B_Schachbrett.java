package rover;


import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P12B_Schachbrett extends RoverProgramm {

	private Rover rover;
	
	public P12B_Schachbrett() {
		this.configuration().setCellSize(30);
		rover = new Rover(this, 1, 1, 0);
	}

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P12B_Schachbrett();
	}

	public String[] landkarte(){
		String[] landkarte = {
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
		};
		return landkarte;
	}

	/**
	 * Rover soll ein Schachbrett legen.
	 * Jedes Feld ist 2x2 gross.
	 * Dazu erst die folgenden Methoden programmieren und testen:
	 * public void kleinesQuadrat()
	 * public void zeile()
	 * public void doppelZeile()
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Schachbrett");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
