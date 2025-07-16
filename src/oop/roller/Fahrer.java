package oop.roller;

import gui.GUI;

public class Fahrer {
	private String name;
	private double geldStand;
	private Tankstelle meineTankstelle;
	private Roller meinRoller;
	
	public Fahrer(String pName, double pGeld) {
		name = pName;
		geldStand = pGeld;
		new GUI(this);
	}
	
	public void geldErhoehen(double pBetrag) {
		geldStand += pBetrag;
	}
	
	public double getGeldStand() {
		return geldStand;
	}
	
	public boolean tanken(double pLiter) {
		//TODO
		return false;
	}
	
	public boolean fahren(double pStrecke) {
		//TODO
		return false;
	}
	
	public void setTankstelle(Tankstelle pTankstelle) {
		meineTankstelle = pTankstelle;
	}
	
	public void setRoller(Roller pRoller) {
		meinRoller = pRoller;
	}
	
}
