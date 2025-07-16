package karaEnglisch;

import gui.GUI;
import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

public class P00_KennenLernen extends KaraProgramm{


	private Kara kara;

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P00_KennenLernen();
	}
	
	public P00_KennenLernen() {
		kara = new Kara(this, 1, 1, 0);
		this.getProgrammContainer().start();
	}
	
	public String[] landkarte(){
		String[] landkarte = {
				"..............",
				"...l..m..ll...",
				"...xxxxxxx.l..",
				".l.x.m.l.x....",
				"..............",
			};
		return landkarte;
	}
	
	/**
	 * Kara soll die Blaetter aufsammeln.
	 */
	public void meinProgramm() {
		print("meinProgramm: KennenLernen");
		new GUI(kara);
		warteEndlos();
		print("fertig!");
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
