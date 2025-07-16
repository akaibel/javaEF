package karaDeutsch;

import gui.GUI;
import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

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
				"...b..p..bb...",
				"...xxxxxxx.b..",
				".b.x.p.b.x....",
				"..............",
			};
		return landkarte;
	}
	
	/**
	 * Kara soll die Blaetter aufsammeln.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: KennenLernen");
		new GUI(kara);
		warteEndlos();
		ausgeben("fertig!");
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
