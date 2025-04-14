package arrays;

import java.util.Random;

import gui.GUI;
import yyy.array.ArrayViewer;


public class ArrayTest {
	public int[] zahlen = {5, 7, 8, 7, 4, 4, 1, 4, 2};
	
	/**
	 * Die Summe der Zahlen soll berechnet und zurueckgegeben werden.
	 * Zur Kontrolle: 42
	 * @return
	 */
	public int summe() {
		// TODO
		return -1;
	}
	
	/**
	 * alle Werte sollen mit System.out.println ausgegeben werden
	 * STRG + Leertaste verwenden!
	 */
	public void ausgeben() {
		//TODO
	}
	
	public int zahlAnIndex(int index) {
		//TODO
		return -1;
	}
	
	public int haeufigkeitVon(int pZahl) {
		//TODO
		return -1;
	}
	
	public int groessteZahl() {
		//TODO
		return -1;
	}
	
	public int haeufigsteZahl() {
		//TODO
		return -1;
	}
	
	/**
	 * Der Wert an der Stelle index soll um 1000 erhoeht werden.
	 * @param index
	 */
	public void erhoeheUm1000(int index) {
		ArrayViewer.zeigeArray(zahlen, 0, "vorher");
		//TODO
		ArrayViewer.zeigeArray(zahlen, 1, "nachher");		
	}
	
	/**
	 * Alle Werte sollen um 1000 erhoeht werden.
	 * @param index
	 */
	public void erhoeheAlleWerteUm1000() {
		ArrayViewer.zeigeArray(zahlen, 0, "vorher");
		//TODO
		ArrayViewer.zeigeArray(zahlen, 1, "nachher");		
	}
	
	/**
	 * Der Wert an der Stelle index soll um erhoehung erhoeht werden.
	 * @param index
	 * @param erhoehung
	 */
	public void erhoeheWertAnIndexUm(int index, int erhoehung) {
		ArrayViewer.zeigeArray(zahlen, 0, "vorher");
		//TODO
		ArrayViewer.zeigeArray(zahlen, 1, "nachher");		
	}
	
	/**
	 * alle Eintraege im Array zahlen sollen um erhoehung erhoeht werden. 
	 * @param erhoehung
	 */
	public void erhoeheAlleWerteUm(int erhoehung) {
		ArrayViewer.zeigeArray(zahlen, 0, "vorher");
		//TODO
		ArrayViewer.zeigeArray(zahlen, 1, "nachher");
	}
	
	/**
	 * definiert zahlen als ein neues Array der Laenge anzahl
	 * und fuellt es mit zufallszahlen von 0 bis max (einschliesslich)
	 * @param anzahl
	 * @param max
	 */
	public void zufallsZahlen(int anzahl, int max) {
        Random random = new Random();
        zahlen = new int[anzahl];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = random.nextInt(max + 1); 
        }		
	}

	
	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		new GUI(at);
	}

}
