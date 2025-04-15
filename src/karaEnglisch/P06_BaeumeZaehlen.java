package karaEnglisch;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

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
	 * Die Anzahl der Baeume soll am Schluss mit der Methode show gezeigt werden.
	 * 
	 * Erweiterung:
	 * Dann soll Kara drei Zeilen runter gehen
	 * und jeweils unter den Baeumen Blaetter ablegen.
	 */
	public void meinProgramm() {
		print("meinProgramm: Baeume zaehlen");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
