package karaDeutsch;

import yyy.karaDeutsch.Kara;
import yyy.karaDeutsch.KaraProgramm;

public class P10_QuadratLegen_MethodeLinie extends KaraProgramm {

	private Kara kara;
	
	// unveraendert lassen!!
	public static void main(String[] args) {
		new P10_QuadratLegen_MethodeLinie();
	}

	public P10_QuadratLegen_MethodeLinie() {
		kara = new Kara(this, 1, 1, 0);
	}

	public String[] landkarte(){
		String[] landkarte = {
				".............",
				".............",
				".............",
				".............",
				".............",
				".............",
				".............",
				".............",
				".............",
				".............",
				".............",
				".............",
				".............",
		};
		return landkarte;
	}

	/**
	 * Kara soll ein Quadrat mit Seitenlaenge 10 Blaetter legen.
	 * Hier soll zuerst eine Methode linie programmiert werden,
	 * die eine Linie von Blaettern legt.
	 * Im Parameter soll festgelegt werden, wie lang die Linie sein soll.
	 */
	public void meinProgramm() {
		ausgeben("meinProgramm: Quadrat legen");
		//TODO
		
	} // Ende meinProgramm()
	
} // Ende der Klasse
