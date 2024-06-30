package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P04_PacMan extends RoverProgramm {

	private Rover rover;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P04_PacMan();
	}

	public P04_PacMan() {
		rover = new Rover(this, 3, 6, 0);
	}
	

	public String[] landkarte(){
		String[] landkarte = {
				"..xxx.............",
				"...m...mmmmmmm....",
				"...m..mm.....mmm..",
				"...mmmm........m..",
				"........mmm..mmm..",
				"........m.mmmm....",
				"...mmmmmm.........",
				"..................",
			};
		return landkarte;
	}
	
	/**
	 * Rover soll den Markierungen bis zu den Huegeln folgen.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Pacman");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
