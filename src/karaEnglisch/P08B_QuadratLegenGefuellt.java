package karaEnglisch;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

public class P08B_QuadratLegenGefuellt extends KaraProgramm {

	private Kara kara;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P08B_QuadratLegenGefuellt();
	}

	public P08B_QuadratLegenGefuellt() {
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
		print("meinProgramm: gefuelltes Quadrat legen");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
