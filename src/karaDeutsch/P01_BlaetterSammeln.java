package karaDeutsch;

import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

public class P01_BlaetterSammeln extends KaraProgramm{


	private Kara kara;

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P01_BlaetterSammeln();
	}
	
	public P01_BlaetterSammeln() {
		kara = new Kara(this, 1, 1, 0);
	}
	
	public String[] landkarte(){
		String[] landkarte = {
				"..............",
				"x..b.pbp.bb..x",
				"..............",
				"..............",
				"..............",
			};
		return landkarte;
	}
	
	/**
	 * Kara soll die Blaetter aufsammeln.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Blaetter sammeln");
		while(kara.baumVorne() == false) {
			if(kara.aufBlatt() == true) {
				kara.hebeBlattAuf();
			}
			kara.gehe();
		}
		ausgeben("fertig!");
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
