package oop;

import gui.GUI;
import yyy.oop.*;

/**
 * Ein Haus besteht aus einem Dach (Dreieck), einer Wand (Quadrat) und einem Fenster (Quadrat)
 * Man kann das Haus horizontal und vertikal bewegen.
 * Man kann das Licht anschalten (Fenster wird gelb) und ausschalten (Fenster wird schwarz).
 * 
 * Very advanced: 
 * Man kann das Haus vergroessern und verkleinern (um einen Faktor). 
 */
public class Haus
{
	//main-Methode: NICHT AENDERN!
	public static void main(String[] args) {
		new GUI(new Haus());
	}

	
}	// Ende der Klasse. HIER NICHTS MEHR DRUNTER SCHREIBEN