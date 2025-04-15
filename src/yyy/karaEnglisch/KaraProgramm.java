package yyy.karaEnglisch;

import yyy.SProgramm;

public abstract class KaraProgramm extends SProgramm {
	
	public KaraProgramm() {
		super(new KaraDisplay());
	}
	
	/**
	 * zeigt eine Zahl in einem Message-Dialog.
	 * @param text
	 */
	protected void show(int zahl) {
		getProgrammContainer().show(zahl);
	}

	/**
	 * zeigt eine Zahl in einem Message-Dialog.
	 * @param text
	 */
	protected void show(double zahl) {
		getProgrammContainer().show(zahl);
	}
	
	/**
	 * zeigt einen Text und eine Zahl in einem Message-Dialog.
	 * @param text
	 * @param zahl
	 */
	protected void show(String text, int zahl) {
		getProgrammContainer().show(text, zahl);
	}
	
	/**
	 * zeigt einen Text und eine Zahl in einem Message-Dialog.
	 * @param text
	 * @param zahl
	 */
	protected void show(String text, double zahl) {
		getProgrammContainer().show(text, zahl);
	}
	
	/**
	 * gibt einen Text an die Konsole aus.
	 * @param text
	 */
	protected void print(String text) {
		getProgrammContainer().print(text);
	}
	
	/**
	 * gibt eine Zahl an die Konsole aus.
	 * @param text
	 */
	protected void print(int zahl) {
		print(""+zahl);
	}
	
	/**
	 * gibt eine Zahl an die Konsole aus.
	 * @param text
	 */
	protected void print(double zahl) {
		print(""+zahl);
	}
	
	/**
	 * gibt einen Text und eine an die Konsole aus.
	 * @param text
	 */
	protected void print(String text, int zahl) {
		print(text+" "+zahl);
	}

	/**
	 * gibt einen Text und eine an die Konsole aus.
	 * @param text
	 */
	protected void print(String text, double zahl) {
		print(text+" "+zahl);
	}
	

}
