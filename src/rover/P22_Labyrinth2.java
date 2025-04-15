package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P22_Labyrinth2 extends RoverProgramm {

	private Rover Rover;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P22_Labyrinth2();
	}

	public P22_Labyrinth2() {
		this.configuration().setCellSize(30);
		Rover = new Rover(this, 12, 9, 0);
	}

	public String[] landkarte(){
		String[] landkarte = {
				"xxxxxxxxxxxxxxxxxxxxxxxxxx",
				"x........................x",
				"x.x..xxxxxxxxxxxxxxx.x.xxx",
				"x.x..x.............x.x...x",
				"x.xx.x.xxxxxxxxxxx.x.xxx.x",
				"x..x.x.x.........x.x.x...x",
				"x..x.x.x.xxx.xxx.x.x.x.x.x",
				"xx.x.x.x.x.....x.x...x.x.x",
				"x....x.x.x.xxx.x.x.x.x.x.x",
				"x.xx.x.x.x...x.x.x.x.x.x.x",
				"x.xx.x.x.x.xxx.x...x.x...x",
				"x.xx.x.x.x.....x.x.x.x.x.x",
				"x....x.x.xxxx.xx.x.x.x.x.x",
				"x.xx.x.x.........x.x.x...x",
				"x....x.xxxxxxxxxxx.x.x.x.x",
				"xxx.....xx...xx....x.xxx.x",
				"x...x.x....x....x........x",
				"xxxxxxxxxxxxxxbxxxxxxxxxxx",
		};
		return landkarte;
	}

	/**
	 * Rover soll zum Pilz kommen.
	 * Dabei kann Rover Markierungen legen, um sich zu merken, wo er schon war.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Labyrinth2");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
