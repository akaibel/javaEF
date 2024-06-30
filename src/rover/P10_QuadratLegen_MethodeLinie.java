package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P10_QuadratLegen_MethodeLinie extends RoverProgramm {

	private Rover rover;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P10_QuadratLegen_MethodeLinie();
	}

	public P10_QuadratLegen_MethodeLinie() {
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
	 * Hier soll zuerst eine Methode linieLegen programmiert werden,
	 * die eine Linie von Blaettern legt.
	 * Im Parameter soll festgelegt werden, wie lang die Linie sein soll.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Quadrat legen");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
