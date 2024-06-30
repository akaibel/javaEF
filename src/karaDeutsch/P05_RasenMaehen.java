package karaDeutsch;

import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

public class P05_RasenMaehen extends KaraProgramm {

	private Kara kara;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P05_RasenMaehen();
	}

	public P05_RasenMaehen() {
		kara = new Kara(this, 2, 1, 0);
	}
	
	public String[] landkarte(){
		String[] landkarte = {
				"....................",
				"..bbbbbbbbbbbbbbbb..",
				"..bbbbbbbbbbbbbbbb..",
				"..bbbbbbbbbbbbbbbb..",
				"..bbbbbbbbbbbbbbbb..",
				"..bbbbbbbbbbbbbbbb..",
				"..bbbbbbbbbbbbbbbb..",
				"....................",
		};
		return landkarte;
	}

	/**
	 * Kara soll den Rasen maehen.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Rasenmaehen");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
