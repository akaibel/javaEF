package oop;

import yyy.oop.*;

// Klassendeklaration
public class Baum
{
	//main-Methode: NICHT AENDERN!
	public static void main(String[] args) {
		new GUI(new Baum());
	}

	// Attribute
	private Quadrat stamm;
	private Kreis krone;
	private boolean istRot;

	// Konstruktor
	public Baum()
	{
		stamm = new Quadrat();
		stamm.groesseAendern(30);
		stamm.bewegeZuPosition(30,80);
		stamm.farbeAendern("schwarz");

		krone = new Kreis();
		krone.bewegeZuPosition(30,50);
		krone.groesseAendern(50);
		krone.farbeAendern("gruen");
		
		istRot = false;

		sichtbarMachen();
	}

	// Methoden
	public void sichtbarMachen()
	{
		stamm.sichtbarMachen();
		krone.sichtbarMachen();
	}

	public void horizontalBewegen(int distanz)
	{
		stamm.horizontalBewegen(distanz);
		krone.horizontalBewegen(distanz);
	}

	public void herbst()
	{
		krone.farbeAendern("rot");
		istRot = true;
	}

	public void fruehling()
	{
		krone.farbeAendern("gruen");
		istRot = false;
	}

	public boolean hatGrueneBlaetter()
	{
		boolean ergebnis = true;
		if(istRot == true)
		{
			ergebnis = false;
		}
		return ergebnis;
	}
	
}	// Ende der Klasse. HIER NICHTS MEHR DRUNTER SCHREIBEN