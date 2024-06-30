package oop;

import yyy.oop.*;

/**
 * Aus der Kaffeemaschine kann man entweder Kaffee oder Espresso zapfen – 
 * beides wird mit 20g Espressopulver gebraut, 
 * aber der Kaffee hat 150ml Wasser, der Espresso nur 50ml. 
 * In die Kaffeemaschine kann man Wasser und Kaffee nachfüllen; 
 * die Maschine fasst maximal 2000ml Wasser und 600g Espressopulver. 
 *
 */
public class Kaffeemaschine
{
	//main-Methode: NICHT AENDERN!
	public static void main(String[] args) {
		new GUI(new Kaffeemaschine());
	}

	
}	// Ende der Klasse. HIER NICHTS MEHR DRUNTER SCHREIBEN