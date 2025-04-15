package karaEnglisch;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

public class P09_LinienLegen extends KaraProgramm {

	private Kara kara;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P09_LinienLegen();
	}

	public P09_LinienLegen() {
		kara = new Kara(this,1,1,0);
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
		};
		return landkarte;
	}

	/**
	 * Kara soll drei Blatt-Linien der Laenge 10, 8, 6 legen.
	 * Dafuer soll die Methode 
	 * public void linieLegen(int anzahl)
	 * programmiert werden
	 * und in der Methode meinProgramm() aufgerufen werden.
	 */
	public void meinProgramm() {
		print("meinProgramm: Linien legen");
		//TODO
	} // Ende meinProgramm()
	
	public void linieLegen(int anzahl) {
		//TODO
		
	} // Ende linieLegen

} // Ende der Klasse
