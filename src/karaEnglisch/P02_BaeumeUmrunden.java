package karaEnglisch;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

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
				"....x...x..x.x...x..x..l..",
				"..........................",
				"..........................",
			};
		return landkarte;
	}
	
	/**
	 * Kara soll die Baeume umrunden und auf dem Blatt stehen bleiben.
	 */
	public void meinProgramm() {
		print("meinProgramm: Baeume umrunden");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
