package karaEnglisch;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

public class P07_BlaetterSammelnUndZaehlen extends KaraProgramm {

	private Kara kara;

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P07_BlaetterSammelnUndZaehlen();
	}
	
	public P07_BlaetterSammelnUndZaehlen() {
		kara = new Kara(this, 1, 1, 0);
	}
	
	public String[] landkarte(){
		String[] landkarte = {
				"..............",
				"x..l.mlm.ll..x",
				"..............",
				"..............",
				"..............",
			};
		return landkarte;
	}
	
	/**
	 * Kara soll die Blaetter aufsammeln und dabei zaehlen.
	 * Die Anzahl der Blaetter soll am Schluss angezeigt werden.
	 * 
	 * Erweiterung:
	 * Dann soll Kara wenden und die gezaehlten Blaetter wieder ablegen.
	 * (alle hintereinander)
	 */
	public void meinProgramm() {
		print("meinProgramm: Blaetter sammeln und zaehlen");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
