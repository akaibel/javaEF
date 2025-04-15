package karaDeutsch;

import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

public class P08_QuadratLegen extends KaraProgramm {

	private Kara kara;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P08_QuadratLegen();
	}

	public P08_QuadratLegen() {
		kara = new Kara(this, 1, 1, 0);
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
	 * Kara soll ein Quadrat mit Seitenlaenge 10 Blaetter legen.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Quadrat legen");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
