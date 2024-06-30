package karaEnglisch;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

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
				"x..l.mlm.ll.x.",
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
		print("meinProgramm: Blaetter sammeln");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
