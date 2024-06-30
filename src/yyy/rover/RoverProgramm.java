package yyy.rover;

import yyy.SProgramm;

public abstract class RoverProgramm extends SProgramm {
	
	public RoverProgramm() {
		super(new RoverConfiguration());
	}
	

	/**
	 * zeigt eine Zahl in einem Message-Dialog.
	 * @param text
	 */
	protected void anzeigen(int zahl) {
		getProgrammContainer().show(zahl);
	}

	/**
	 * zeigt eine Zahl in einem Message-Dialog.
	 * @param text
	 */
	protected void anzeigen(double zahl) {
		getProgrammContainer().show(zahl);
	}
	
	/**
	 * zeigt einen Text und eine Zahl in einem Message-Dialog.
	 * @param text
	 * @param zahl
	 */
	protected void anzeigen(String text, int zahl) {
		getProgrammContainer().show(text, zahl);
	}
	
	/**
	 * zeigt einen Text und eine Zahl in einem Message-Dialog.
	 * @param text
	 * @param zahl
	 */
	protected void anzeigen(String text, double zahl) {
		getProgrammContainer().show(text, zahl);
	}
	
	/**
	 * gibt einen Text an die Konsole aus.
	 * @param text
	 */
	protected void ausgeben(String text) {
		getProgrammContainer().print(text);
	}
	
	/**
	 * gibt eine Zahl an die Konsole aus.
	 * @param text
	 */
	protected void ausgeben(int zahl) {
		ausgeben(""+zahl);
	}
	
	/**
	 * gibt eine Zahl an die Konsole aus.
	 * @param text
	 */
	protected void ausgeben(double zahl) {
		ausgeben(""+zahl);
	}
	
	/**
	 * gibt einen Text und eine an die Konsole aus.
	 * @param text
	 */
	protected void ausgeben(String text, int zahl) {
		ausgeben(text+" "+zahl);
	}

	/**
	 * gibt einen Text und eine an die Konsole aus.
	 * @param text
	 */
	protected void ausgeben(String text, double zahl) {
		ausgeben(text+" "+zahl);
	}

	

}
