package karaDeutsch;

import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

public class P12_Zebrastreifen extends KaraProgramm {

	private Kara kara;
	
	public P12_Zebrastreifen() {
		kara = new Kara(this, 1, 1, 90);
	}

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P12_Zebrastreifen();
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
		};
		return landkarte;
	}

	/**
	 * Kara soll einen Zebrastreifen mit 4 Streifenlegen.
	 * Jeder Streifen ist zwei Blaetter breit und 10 Blaetter lang.
	 * Zwischen den Streifen sollen zwei Felder Abstand sein.
	 * Hilfreich ist es dabei, wenn man erst die Methode linie programmiert,
	 * und zusaetzlich die Methode streifen.
	 * Die Methode linie muss einen Parameter haben, der festlegt, 
	 * wie lang die Linie sein soll.
	 */
	public void meinProgramm() {
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
