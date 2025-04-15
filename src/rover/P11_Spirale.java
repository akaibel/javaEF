package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P11_Spirale extends RoverProgramm {

	private Rover rover;
	
	public P11_Spirale() {
		this.configuration().setCellSize(30);
		rover = new Rover(this, 1, 1, 0);
	}

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P11_Spirale();
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
	 * Rover soll von der Mitte ausgehend eine Spirale legen.
	 * Hilfreich ist es dabei, wenn man erst die Methode linieLegen programmiert.
	 * Die Methode linieLegen muss einen Parameter haben, der festlegt, 
	 * wie lang die Linie sein soll.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Quadrat legen");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
