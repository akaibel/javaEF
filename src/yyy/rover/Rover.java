package yyy.rover;

import yyy.SActor;
import yyy.SProgramm;

public class Rover {
	private SActor actor;
	
	public Rover(SProgramm program, int x, int y, int direction) {
		actor = new SActor(x, y, direction, program);
	}
		
	public String gibFarbe() {
		return actor.getColor();
	}

	/**
	 * moegliche Farben sind:
	 * "blau" "grau"
	 */
	public void setzeFarbe(String farbe) {
		switch(farbe) {
			case "blau": actor.setColor("blau"); return;
			case "grau": actor.setColor("grau"); return;
			default: return;
		}
	}
	
	public void aendereFarbe() {
		actor.changeColor();
	}

	public int gibX() {
		return actor.getPosition().getX();
	}

	public int gibY() {
		return actor.getPosition().getY();
	}

	public int gibRichtung() {
		return actor.getDirection();
	}

	public void fahre() {
		actor.move();
	}
	
	/**
	 * moegliche Richtungen: "rechts", "links"
	 * @param richtung
	 */
	public void drehe(String richtung) {
		if(richtung.equalsIgnoreCase("rechts")) {
			actor.turnRight();
		}
		else if(richtung.equalsIgnoreCase("links")) {
			actor.turnLeft();			
		}
		else {
			actor.getProgrammContainer().getProgram().show("unbekannte Drehrichtung: "+richtung);
		}
	}

	public void setzeMarke() {
		actor.putObjectA();
	}

	public void entferneMarke() {
		actor.removeObjectA();
	}
	
	public double analysiereGestein() {
		if(actor.getProgrammContainer().onObjectB()) {
			actor.removeObjectB();
			// zwischen 5% und 25%
			double prozent = (Math.random()*0.2 + 0.05)*100;
			return 1.0*Math.round(prozent)/100;
		}
		else if(actor.getProgrammContainer().onObjectC()) {
			actor.removeObjectC();
			// zwischen 2% und 10%
			double prozent = (Math.random()*0.08 + 0.02)*100;
			return 1.0*Math.round(prozent)/100;
		}
		else {
			this.actor.getProgrammContainer().getProgram().show("Hier ist kein Gestein!");
			return 0;
		}
	}

	
	public boolean huegelVorhanden(String richtung) {
		if(richtung.equalsIgnoreCase("vorne")) {
			return actor.getProgrammContainer().obstacleFront();
		}
		else if(richtung.equalsIgnoreCase("rechts")) {
			return actor.getProgrammContainer().obstacleRight();
		}
		else if(richtung.equalsIgnoreCase("links")) {
			return actor.getProgrammContainer().obstacleLeft();
		}
		else {
			actor.getProgrammContainer().getProgram().show("unbekannte Huegelrichtung: "+richtung);
			return false;
		}
		
	}

	public boolean markeVorhanden() {
		return actor.getProgrammContainer().onObjectA();
	}
	

	public boolean gesteinVorhanden() {
		return actor.getProgrammContainer().onObjectB() || actor.getProgrammContainer().onObjectC() ;
	}

	@Override
	public String toString() {
		return actor.toString();
	}

}		
