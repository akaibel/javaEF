package rover;

import gui.GUI;
import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P00_KennenLernen extends RoverProgramm{


	private Rover rover;

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P00_KennenLernen();
	}
	
	public P00_KennenLernen() {
		rover = new Rover(this, 1, 1, 0);
		this.getProgrammContainer().start();
	}
	
	public String[] landkarte(){
		String[] landkarte = {
				"..............",
				"...b..m..rr...",
				"...xxxxxxx.m..",
				".m.x.b.r.x....",
				"..............",
			};
		return landkarte;
	}
	
	/**
	 * Rover soll Gestein analysieren, bis er beim Baum angekommen ist.
	 * Dabei soll der Rover die Gesteine aufheben (Methode analysiereGestein)
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: KennenLernen");
		new GUI(rover);
		warteEndlos();
	} // Ende meinProgramm()
	
} // Ende der Klasse
