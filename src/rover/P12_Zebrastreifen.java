package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P12_Zebrastreifen extends RoverProgramm {

	private Rover rover;
	
	public P12_Zebrastreifen() {
		this.configuration().setCellSize(30);
		rover = new Rover(this, 1, 1, 90);
	}

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P12_Zebrastreifen();
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
		};
		return landkarte;
	}

	/**
	 * Rover soll einen Zebrastreifen mit 4 Streifenlegen.
	 * Jeder Streifen ist zwei Markierungen breit und 10 Markierungen lang.
	 * Zwischen den Streifen sollen zwei Felder Abstand sein.
	 * Hilfreich ist es dabei, wenn man erst die Methode linieLegen programmiert,
	 * und zusaetzlich die Methode streifen.
	 * Die Methode linieLegen muss einen Parameter haben, der festlegt, 
	 * wie lang die Linie sein soll.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Zebrastreifen");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
