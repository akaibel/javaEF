package karaEnglisch;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

public class P04_PacMan extends KaraProgramm {

	private Kara kara;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P04_PacMan();
	}

	public P04_PacMan() {
		kara = new Kara(this, 3, 6, 0);
	}
	

	public String[] landkarte(){
		String[] landkarte = {
				"..xxx.............",
				"...l...lllllll....",
				"...l..ll.....lll..",
				"...llll........l..",
				"........lll..lll..",
				"........l.llll....",
				"...llllll.........",
				"..................",
			};
		return landkarte;
	}
	
	/**
	 * Kara soll der Blaetterspur bis zu den Baeumen folgen
	 * und dabei jedes Blatt aufheben.
	 */
	public void meinProgramm() {
		print("meinProgramm: Pacman");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
