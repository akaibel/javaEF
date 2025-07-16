package oop.roller;

import gui.GUI;

public class Roller {
	private double tankStand;
	private double kmStand;
	private double maxTank;
	private double verbrauchAuf100;
	
	public Roller(double pMaxTank, double pVerbrauchAuf100) {
		maxTank = pMaxTank;
		verbrauchAuf100 = pVerbrauchAuf100;
		tankStand = 0;
		kmStand = 0;
		new GUI(this);
	}
	
	public boolean tanken(double pMenge) {
		if(tankStand + pMenge > maxTank) {
			return false;
		}
		tankStand += pMenge;
		return true;
	}
	
	public boolean fahren(double pStrecke) {
		double verbrauch = pStrecke/100 * verbrauchAuf100;
		if(verbrauch > tankStand) {
			return false;
		}
		tankStand -= verbrauch;
		kmStand += pStrecke;
		return true;
	}
	
	public double getKmStand() {
		return kmStand;
	}
}
