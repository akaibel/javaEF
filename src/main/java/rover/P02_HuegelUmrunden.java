package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P02_HuegelUmrunden extends RoverProgramm {

	private Rover rover;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P02_HuegelUmrunden();
	}

	
	public P02_HuegelUmrunden() {
		this.configuration().setCellSize(30);
		rover = new Rover(this, 1, 2, 0);
	}
	
	
	public String[] landkarte(){
		String[] landkarte = {
				"..........................",
				"..........................",
				"....x...x..x.x...x..x..m..",
				"..........................",
				"..........................",
			};
		return landkarte;
	}
	
	/**
	 * Rover soll die Baeume umrunden und auf dem Blatt stehen bleiben.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Huegel umrunden");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
