package yyy;

public abstract class SProgramm {
	private SProgrammContainer sProgrammContainer;
	private AbstractDisplay configuration;
	
	public SProgramm(AbstractDisplay configuration) {
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
		
	public AbstractDisplay configuration() {
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

    // Method to create a new instance of the same subtype
    public SProgramm createNewInstance() {
        try {
        	SProgramm sProgrammNew = this.getClass().getDeclaredConstructor().newInstance();
        	//sProgrammNew.sProgrammContainer.getDisplay().updateAllCells();
        	return sProgrammNew;
        } catch (Exception e) {
            throw new RuntimeException("SProgramm.createNewInstance(): Cannot create new instance", e);
        }
    }
	
	protected void warteEndlos() {
		while(true) {
			try {
				Thread.sleep(1000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
}
