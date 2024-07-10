package arrays;

import java.util.Random;
import yyy.array.ArrayViewer;
import yyy.oop.GUI;


public class Sortieren {
	public int[] zahlen = {5, 7, 8, 7, 4, 4, 1, 4, 2};
	
	
	public void bubblesort() {
		System.out.println("bubblesort");
		ArrayViewer.zeigeArray(zahlen, 0, "unsortiert");
		//TODO
		ArrayViewer.zeigeArray(zahlen, 1, "sortiert");
		
		return;
	}

	public int[] sortiereDurchEinfuegen() {
		System.out.println("sortiereDurchEinfuegen");
		ArrayViewer.zeigeArray(zahlen, 0, "unsortiert");
		int[] ergebnis = new int[zahlen.length];
		//TODO
		ArrayViewer.zeigeArray(ergebnis, 1, "sortiert");
		return ergebnis;
	}

	public int[] sortiereDurchAuswaehlen() {
		System.out.println("sortiereDurchEinfuegen");
		ArrayViewer.zeigeArray(zahlen, 0, "unsortiert");
		int[] ergebnis = new int[zahlen.length];
		//TODO
		ArrayViewer.zeigeArray(ergebnis, 1, "sortiert");
		return ergebnis;
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
		Sortieren at = new Sortieren();
		new GUI(at);
	}

}
