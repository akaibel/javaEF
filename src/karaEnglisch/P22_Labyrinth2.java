package karaEnglisch;

import yyy.karaEnglisch.Kara;
import yyy.karaEnglisch.KaraProgramm;

public class P22_Labyrinth2 extends KaraProgramm {

	private Kara kara;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P22_Labyrinth2();
	}

	public P22_Labyrinth2() {
		kara = new Kara(this, 12, 9, 0);
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
				"xxxxxxxxxxxxxxmxxxxxxxxxxx",
		};
		return landkarte;
	}

	/**
	 * Kara soll das Labyrinth durchlaufen und auf dem Pilz stehen bleiben.
	 * Dabei kann Kara auf jedem Feld, das sie besucht hat, ein Blatt hinlegen.
	 */
	public void meinProgramm() {
		print("meinProgramm: Labyrinth2");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
