package mathe;

import gui.GUI;

public class Rechner {

	// Attribute
	    private double pi = 3.1415927;

	    // Konstruktor
	    public Rechner()
	    {
	        System.out.println("Rechner bereit");
	    }
	    
	    // Methoden
	    public double kreisUmfang(double radius)
	    {
	    	double ergebnis = 2*pi*radius;
	        return ergebnis;
	    }
	    
	    public double kreisFlaeche(double radius) {
	    	//TODO
	    	return -1;
	    }

	    public int addieren(int a, int b)
	    {
	        //TODO
	        return -1;
	    }
	    
	    public int maximum(int a, int b) {
	    	//TODO
	    	return -1;
	    }
	    
	    public int maximum4(int a, int b, int c, int d) {
	    	//TODO
	    	// die Methode maximum geschickt aufrufen!
	    	// dann braucht man nur 3 Zeilen
	    	return -1;
	    }
	    
	    /**
	     * die Methode soll die erste Zahl der 17er-Reihe zurueckgeben
	     * die groesser als 1000 ist.
	     * Kontrollergebnis: 1003
	     * @return
	     */
	    public int erste17erZahlGroesserAls1000() {
	    	int zahl = 17;
	    	//TODO
	    	return zahl;
	    }

	    /**
	     * addiere alle Zahlen bis n.
	     * z.B. addiereAlleZahlenBis(4) ist 1+2+3+4 = 10.
	     * @param n
	     * @return
	     */
	    public int addiereAlleZahlenBis(int n) {
	    	int ergebnis = 0;
	    	//TODO
	    	return ergebnis;
	    }

	    /**
	     * fakultaet multipliziert alle Zahlen bis n.
	     * z.B. fakultaet(4) ist 1*2*3*4 = 24.
	     * @param n
	     * @return
	     */
	    public int fakultaet(int n) {
	    	int ergebnis = 1;
	    	//TODO
	    	return ergebnis;
	    }
	    
	    /**
	     * wie oft muss man verdoppeln, 
	     * bis man die Grenze ueberschritten hat?
	     * Beispiel: fuer Grenze = 10 muss man 4 mal verdoppeln: 
	     * 1*2*2*2*2 = 16
	     * @param grenze
	     * @return
	     */
	    public int wieOftVerdoppelnBis(int grenze) {
	    	int zahl = 1;
	    	int ergebnis = 0;
	    	//TODO
	    	return ergebnis;
	    }
	    
	    /**
	     * berechnet naeherungsweise die Flaeche unter der Funktion f(x) = x^2
	     * von x1 = 0 bis x1 = 1
	     * Zur Kontrolle: Es sollte naeherungsweise 0.333333 rauskommen.
	     * @return
	     */
	    public double flaecheUnterXhoch2() {
	    	double ergebnis = 0;
	    	//TODO
	    	return ergebnis;
	    }
	    
	    /**
	     * die Fibonacci-Zahlen sind so definiert:
	     * fibonacci(0) = 0
	     * fibonacci(1) = 1
	     * fuer n > 1: fibonacci(n) = die beiden vorhergehenden zusammenaddiert.
	     * z.B.:
	     * fibonacci(2) = 0+1 = 1
	     * fibonacci(3) = 1+1 = 2
	     * fibonacci(4) = 1+2 = 3
	     * fibonacci(5) = 2+3 = 5
	     * fibonacci(6) = 3+5 = 8
	     * @param n
	     * @return
	     */
	    public int fibonacci(int n) {
	    	int ergebnis = 0;
	    	//TODO
	    	return ergebnis;
	    }
	    
	    public static void main(String[] args) {
			new GUI(new Rechner());
		}

}
