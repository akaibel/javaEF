package karaDeutsch;

import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

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
	 * Dafuer soll die Methode linieLegen programmiert 
	 * und in meinProgramm geeignet aufgerufen werden.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Linien legen");
		//TODO
		
	} // Ende meinProgramm()
	
	private void linieLegen(int anzahl) {
		//TODO
		
	} // Ende linieLegen(int anzahl)
	
	
} // Ende der Klasse
