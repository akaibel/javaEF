package karaEnglisch;

import java.util.Iterator;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

public class P12B_Schachbrett extends KaraProgramm {

	private Kara kara;
	
	public P12B_Schachbrett() {
		kara = new Kara(this, 1, 1, 0);
	}

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P12B_Schachbrett();
	}

	public String[] landkarte(){
		String[] landkarte = {
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
				"..................",
		};
		return landkarte;
	}

	/**
	 * Kara soll ein Schachbrett legen.
	 * Jedes Feld ist 2x2 gross.
	 * Dazu erst die folgenden Methoden programmieren und testen:
	 * public void kleinesQuadrat()
	 * public void zeile()
	 * public void doppelZeile()
	 */	
	public void meinProgramm() {
		print("meinProgramm: Schachbrett");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
