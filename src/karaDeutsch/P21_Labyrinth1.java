package karaDeutsch;

import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

public class P21_Labyrinth1 extends KaraProgramm {

	private Kara kara;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P21_Labyrinth1();
	}

	public P21_Labyrinth1() {
		kara = new Kara(this, 9, 7, 0);
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
				"xxxxxxxxxxxxxxxxxxxpxxxxxx",
		};
		return landkarte;
	}

	/**
	 * Kara soll das Labyrinth durchlaufen und auf dem Pilz stehen bleiben.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Labyrinth1");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
