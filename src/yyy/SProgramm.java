package yyy;

public abstract class SProgramm {
	private SProgrammContainer sProgrammContainer;
	private Configuration configuration;
	
	public SProgramm(Configuration configuration) {
		this.configuration = configuration;
		sProgrammContainer = new SProgrammContainer(this);
	}
	
	/**
	 * das Programm, das ausgefuehrt werden soll.
	 * muss von Subklassen ueberschrieben werden.
	 */
	public abstract void meinProgramm();

	/**
	 * die Landkarte, auf der das Programm ausgefuehrt werden soll.
	 * @return
	 */
	public abstract String[] landkarte();
		
	public Configuration configuration() {
		return configuration;
	}
	
	/**
	 * zeigt einen Text in einem Message-Dialog.
	 * @param text
	 */
	public void show(String text) {
		sProgrammContainer.show(text);
	}

	public SProgrammContainer getProgrammContainer() {
		return this.sProgrammContainer;
	}

	

}
