package karaDeutsch;

import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

public class P06_BaeumeZaehlen extends KaraProgramm {

	private Kara kara;

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P06_BaeumeZaehlen();
	}

	public P06_BaeumeZaehlen() {
		kara = new Kara(this, 1, 0, 0);
	}

	public String[] landkarte(){
		String[] landkarte = {
				"..............",
				".xxxxxxxxxxx..",
				"..............",
				"..............",
				"..............",
		};
		return landkarte;
	}

	/**
	 * Kara soll die Baeume zaehlen.
	 * Die Anzahl der Baeume soll am Schluss angezeigt werden.
	 * 
	 * Erweiterung:
	 * Dann soll Kara drei Zeilen runter gehen
	 * und jeweils unter den Baeumen Blaetter ablegen.
	 * D.h. so viele Blaetter wie es Baeume gibt.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Baeume zaehlen");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
