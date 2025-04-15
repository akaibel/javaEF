package yyy.karaEnglisch;

import yyy.SActor;
import yyy.SProgramm;

public class Kara {
	private SActor actor;
	
	public Kara(SProgramm program, int x, int y, int direction) {
		actor = new SActor(x, y, direction, program);
	}
		
	public String getColor() {
		return actor.getColor();
	}

	/**
	 * moegliche Farben sind:
	 * "red", "blue", "yellow", "gray"
	 */
	public void setColor(String color) {
		actor.setColor(color);;
	}
	
	public void changeColor() {
		actor.changeColor();
	}

	public int getX() {
		return actor.getPosition().getX();
	}

	public int getY() {
		return actor.getPosition().getY();
	}

	public int getDirection() {
		return actor.getDirection();
	}

	public void move() {
		actor.move();
	}
	
	public void turnRight() {
		actor.turnRight();
	}

	public void turnLeft() {
		actor.turnLeft();
	}
	
	public void putLeaf() {
		actor.putObjectA();
	}

	public void removeLeaf() {
		actor.removeObjectA();
	}

	public void putMushroom() {
		actor.putObjectB();
	}

	public void removeMushroom() {
		actor.removeObjectB();
	}

	public boolean onLeaf() {
		return actor.getProgrammContainer().onObjectA();
	}

	public boolean onMushroom() {
		return actor.getProgrammContainer().onObjectB();
	}

	public boolean treeFront() {
		return actor.getProgrammContainer().obstacleFront();
	}

	public boolean treeRight() {
		return actor.getProgrammContainer().obstacleRight();
	}

	public boolean treeLeft() {
		return actor.getProgrammContainer().obstacleLeft();
	}

	@Override
	public String toString() {
		return actor.toString();
	}

}		
