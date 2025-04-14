package rover;

import yyy.rover.Rover;
import yyy.rover.RoverProgramm;

public class P21_Labyrinth1 extends RoverProgramm {

	private Rover Rover;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P21_Labyrinth1();
	}

	public P21_Labyrinth1() {
		this.configuration().setCellSize(30);
		Rover = new Rover(this, 9, 7, 0);
	}

	public String[] landkarte(){
		String[] landkarte = {
				"xxxxxxxxxxxxxxxxxxxxxxxxxx",
				"x...x.x....x.x...........x",
				"x.x.x...x....x.xxxxxxxxxxx",
				"x.x.xxxxxxxx.x...........x",
				"x.x.....x....x.xxxxxxxxx.x",
				"x.xxxxx.x..x...x.........x",
				"x....x..x..xxxxx.xxx.xxx.x",
				"xxxx..x....x...x..x...x..x",
				"x...x.xxxxxxxx.xxxxxx..x.x",
				"x.x.............xx...xxxxx",
				"x.xxxxxxxxx..x.xx..x.....x",
				"x.x..x...x...x....xxx..x.x",
				"x....x.x...x.x......x..x.x",
				"xxx....xxxxxxxxxxx..xxxx.x",
				"x...x...xx.....xxxx......x",
				"xxx.x.xxx..xxx....xxxxxx.x",
				"x...x.x....x....x........x",
				"xxxxxxxxxxxxxxxxxxxbxxxxxx",
		};
		return landkarte;
	}

	/**
	 * Rover zum Pilz kommen.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Labyrinth1");
		// TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
