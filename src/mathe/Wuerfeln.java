package mathe;

import java.util.Random;

import gui.GUI;

public class Wuerfeln {
	
	private Random random = new Random();
	
	/**
	 * gibt eine Zufallszahl zwischen 1 und 6 zurueck.
	 * @return
	 */
	public int wuerfeln() {
		int ergebnis = random.nextInt(6)+1;
		return ergebnis;
	}
	
	/**
	 * Es wird 1000mal gewuerfelt und die Zahlen addiert.
	 * Dabei sollte naeherungsweise 3500 rauskommen.
	 * @return
	 */
	public int summeBei1000Wuerfen() {
		int ergebnis = 0;
		//TODO
		return ergebnis;
	}
	
	/**
	 * welche Wahrscheinlichkeit hat man,
	 * dass man genau 16 wuerfelt, wenn man mit 5 Wuerfeln wuerfelt?
	 * Dafuer wuerfelt man 10000mal mit 5 Wuerfeln.
	 * Und zaehlt dabei in der Variable "treffer", wie oft man genau 16 hat
	 * Das Ergebnis sollte ungefaehr 0.94 sein. 
	 * @return
	 */
	public double wahrscheinlichkeitGenau16() {
		int treffer = 0;
		//TODO
		
		// die Treffer durch 10000 teilen
		// man muss 1.0* davor schreiben, 
		// weil sonst 0 zurueckgegeben wird!
		return 1.0*treffer/100000;
	}
	
	/**
	 * welche Wahrscheinlichkeit hat man, 
	 * dass man mit 5 Wuerfeln
	 * genau 3 gleiche hat?
	 * D.h. z.B. 2,4,2,2,1
	 * Das Ergebnis sollte ca. 0.19 sein.
	 * Auch hier soll 10.000 mal gewuerfelt werden.
	 * @return
	 */
	public double wahrscheinlichkeitGenauDreiGleiche() {
		double treffer = 0;
		//TODO
		return 1.0*treffer/10000;
	}
	
	public static void main(String[] args) {
		new GUI(new Wuerfeln());
	}
}
