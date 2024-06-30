package yyy.karaDeutsch;

import yyy.SActor;
import yyy.SProgramm;

public class Kara {
	private SActor actor;
	
	public Kara(SProgramm program, int x, int y, int direction) {
		actor = new SActor(x, y, direction, program);
	}
		
	public String gibFarbe() {
		return actor.getColor();
	}

	/**
	 * moegliche Farben sind:
	 * "rot", "blau", "gelb", "lila", "grau"
	 */
	public void setzeFarbe(String farbe) {
		actor.setColor(farbe);
//		switch(farbe) {
//			case "rot": actor.setColor("red"); return;
//			case "blau": actor.setColor("blue"); return;
//			case "gelb": actor.setColor("yellow"); return;
//			case "grau": actor.setColor("gray"); return;
//			default: actor.getProgrammContainer().getProgram().show("unbekannte Farbe: "+farbe);
//		}
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

	public void gehe() {
		actor.move();
	}
	
	public void dreheRechts() {
		actor.turnRight();
	}

	public void dreheLinks() {
		actor.turnLeft();
	}
	
	public void legeBlatt() {
		actor.putObjectA();
	}

	public void hebeBlattAuf() {
		actor.removeObjectA();
	}

	public void legePilz() {
		actor.putObjectB();
	}

	public void hebePilzAuf() {
		actor.removeObjectB();
	}

	public boolean aufBlatt() {
		return actor.getProgrammContainer().onObjectA();
	}

	public boolean aufPilz() {
		return actor.getProgrammContainer().onObjectB();
	}

	public boolean baumVorne() {
		return actor.getProgrammContainer().obstacleFront();
	}

	public boolean baumRechts() {
		return actor.getProgrammContainer().obstacleRight();
	}

	public boolean baumLinks() {
		return actor.getProgrammContainer().obstacleLeft();
	}

	@Override
	public String toString() {
		return actor.toString();
	}

}		
