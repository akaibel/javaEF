package arrays;

public class Zeitmessung {

    private static long startZeit = 0;
    private static long endZeit = 0;
    private static boolean laeuft = false;

    // Setzt die Zeit auf 0 und startet die Zeitmessung
    public static void start() {
        startZeit = System.currentTimeMillis();
        endZeit = 0;
        laeuft = true;
    }

    // Beendet die Zeitmessung
    public static void stop() {
        if (laeuft) {
            endZeit = System.currentTimeMillis();
            laeuft = false;
        }
    }

    // Gibt die gemessene Zeit in Millisekunden zurück
    public static long zeit() {
        if (laeuft) {
            // Falls noch nicht gestoppt wurde, aktuelle Zwischenzeit berechnen
            return System.currentTimeMillis() - startZeit;
        } else {
            return endZeit - startZeit;
        }
    }

	public static void ausgeben() {
		System.out.println("Verbrauchte Zeit: "+Zeitmessung.zeit()+"ms");
	}
}
