package karaDeutsch;

import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

public class P02_BaeumeUmrunden extends KaraProgramm {

	private Kara kara;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P02_BaeumeUmrunden();
	}

	
	public P02_BaeumeUmrunden() {
		kara = new Kara(this, 1, 2, 0);
	}
	
	
	public String[] landkarte(){
		String[] landkarte = {
				"..........................",
				"..........................",
				"....x...x..x.x...x..x..b..",
				"..........................",
				"..........................",
			};
		return landkarte;
	}
	
	/**
	 * Kara soll die Baeume umrunden und auf dem Blatt stehen bleiben.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Baeume umrunden");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
