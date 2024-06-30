package karaEnglisch;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

public class P03_RundUmDenWald extends KaraProgramm {

	private Kara kara;

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P03_RundUmDenWald();
	}
	
	public P03_RundUmDenWald() {
		kara = new Kara(this, 3,0,0);
	}

	public String[] landkarte(){
		String[] landkarte = {
				"..l...............",
				"..xxxxx...........",
				"....xxxxxxxxxxxxx.",
				"..xxxxxxx.........",
				"..xxxxxxx.........",
				"..xxxxxxxxx.......",
				"..xx..xx..x.......",
				"..................",
		};
		return landkarte;
	}

	/**
	 * Kara soll den Wald umrunden und auf dem Blatt stehen bleiben.
	 */
	public void meinProgramm() {
		print("meinProgramm: Rund um den Wald");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
