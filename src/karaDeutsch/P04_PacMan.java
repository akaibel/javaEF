package karaDeutsch;

import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

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
				"...b...bbbbbbb....",
				"...b..bb.....bbb..",
				"...bbbb........b..",
				"........bbb..bbb..",
				"........b.bbbb....",
				"...bbbbbb.........",
				"..................",
			};
		return landkarte;
	}
	
	/**
	 * Kara soll der Blaetterspur bis zu den Baeumen folgen
	 * und dabei jedes Blaetter aufheben.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Pacman");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
