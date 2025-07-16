package oop.roller;

import gui.GUI;

public class Tankstelle {
	private double preisProLiter;
	
	public Tankstelle(double pPreisProLiter) {
		preisProLiter = pPreisProLiter;
		new GUI(this);
	}
	
	public void preisAendern(double pPreisNeu) {
		preisProLiter = pPreisNeu;
	}
	
	/**
	 * berechnet, wie viel man fuers Tanken zahlen muss
	 * @param pLiter
	 * @return den zu zahlenden Preis
	 */
	public double tanken(double pLiter) {
		double zuZahlen = preisProLiter * pLiter;
		return zuZahlen;
	}
	
	public double getPreis() {
		return preisProLiter;
	}
}
