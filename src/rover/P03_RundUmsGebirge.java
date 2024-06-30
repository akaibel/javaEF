package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P03_RundUmsGebirge extends RoverProgramm {

	private Rover rover;

	// unveraendert lassen!!
	public static void main(String[] args) {
		new P03_RundUmsGebirge();
	}
	
	public P03_RundUmsGebirge() {
		rover = new Rover(this, 3,0,0);
	}

	public String[] landkarte(){
		String[] landkarte = {
				"..m...............",
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
	 * Rover soll das Gebirge umrunden und auf der Marke stehen bleiben.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Rund ums Gebirge");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
