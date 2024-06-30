package karaEnglisch;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

public class P11_Spirale extends KaraProgramm {

	private Kara kara;
	
	public P11_Spirale() {
		kara = new Kara(this, 1, 1, 0);
	}

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P11_Spirale();
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
	 * Kara soll von der Mitte ausgehend eine Spirale legen.
	 * Hilfreich ist es dabei, wenn man erst die Methode linie programmiert.
	 * Die Methode linie muss einen Parameter haben, der festlegt, 
	 * wie lang die Linie sein soll.
	 */
	public void meinProgramm() {
		print("meinProgramm: Quadrat legen");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
