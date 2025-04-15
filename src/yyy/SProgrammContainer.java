package yyy;

import javax.swing.JOptionPane;


public class SProgrammContainer {
	/**
	 * stores whether the program is running.
	 */
	private boolean isRunning;
	
	private SDisplay display;
	private SGrid grid;
	private SActor actor;
	
	private SProgramm sProgramm;
	
	private AbstractDisplay configuration;
	
	public SProgrammContainer(SProgramm sprogramm) {
		this.sProgramm = sprogramm;
		this.configuration = sprogramm.configuration();
		display = new SDisplay(this);
	}

	public SGrid getGrid() {
		return grid;
	}
	
	public SActor getActor() {
		return actor;
	}

	/**
	 * stops the program execution.
	 */
	public void stop() {
		isRunning = false;
	}

	/**
	 * starts the program execution.
	 */
	public void start() {
		isRunning = true;
	}
	
	public SDisplay getDisplay() {
		return display;
	}
	
	/**
	 * sets Display Grid and actor
	 * @param grid
	 */
	public void setGrid(SGrid grid) {
		this.grid = grid;
		this.stop();

	}
	
	
	
	/**
	 * Das Programm, das ausgefuehrt werden soll.
	 */
	public void meinProgramm() {
		sProgramm.meinProgramm();
	}
	
	/**
	 * die Landkarte, auf der das Programm ausgefuehrt werden soll.
	 * @return
	 */
	public String[] landkarte() {
		return sProgramm.landkarte();
	}

	/**
	 * sorgt dafuer, dass das Programm erst ausgefuehrt wird, wenn der Start Button gedrueckt wurde.
	 */
	void waitTillRunning() {
		while(!isRunning) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.err.print(e.getStackTrace());;
			}
		}		
	}
	
	/**
	 * bewegt actor um einen Schritt.
	 */	
	public void move() {
		waitTillRunning();
		actor.move();
		display.waitSomeTime();
	}
	
	/**
	 * dreht actor nach rechts.
	 */
	public void turnRight() {
		waitTillRunning();
		actor.turnRight();
		display.waitSomeTime();
	}

	/**
	 * dreht actor nach links.
	 */
	public void turnLeft() {
		waitTillRunning();
		actor.turnLeft();
		display.waitSomeTime();
	}
	
	/**
	 * legt an Actors Position ein ObjectA ab.
	 */
	public void putObjectA() {
		waitTillRunning();
		actor.putObjectA();
		display.waitSomeTime();
	}

	/**
	 * entfernt das ObjectA, auf dem Actor steht.
	 */
	public void removeObjectA() {
		waitTillRunning();
		actor.removeObjectA();
		display.waitSomeTime();
	}

	/**
	 * prueft, ob Actor auf einem ObjectA steht.
	 * @return
	 */
	public boolean onObjectA() {
		boolean result = grid.getObject(actor.getX(), actor.getY()) == configuration.objectA();
		return result;
	}
	
	/**
	 * legt an Actors Position ein ObjectB ab.
	 */
	public void putObjectB() {
		waitTillRunning();
		actor.putObjectB();
		display.waitSomeTime();
	}

	/**
	 * entfernt das ObjectB, auf dem Actor steht.
	 */
	public void removeObjectB() {
		waitTillRunning();
		actor.removeObjectB();
		display.waitSomeTime();
	}

	/**
	 * prueft, ob Actor auf einem ObjectB steht.
	 * @return
	 */
	public boolean onObjectB() {
		boolean result = grid.getObject(actor.getX(), actor.getY()) == configuration.objectB();
		return result;
	}
	
	/**
	 * legt an Actors Position ein ObjectC ab.
	 */
	public void putObjectC() {
		waitTillRunning();
		actor.putObjectC();
		display.waitSomeTime();
	}

	/**
	 * entfernt das ObjectC, auf dem Actor steht.
	 */
	public void removeObjectC() {
		waitTillRunning();
		actor.removeObjectC();
		display.waitSomeTime();
	}

	/**
	 * prueft, ob Actor auf einem ObjectC steht.
	 * @return
	 */
	public boolean onObjectC() {
		boolean result = grid.getObject(actor.getX(), actor.getY()) == configuration.objectC();
		return result;
	}
	
	/**
	 * prueft, ob ein Hindernis vor Actor ist.
	 * @return
	 */
	public boolean obstacleFront() {
		try {
			switch(actor.getDirection()){
				case SActor.RIGHT: return grid.getObject(actor.getX()+1, actor.getY()) == configuration.obstacle();
				case SActor.LEFT: return grid.getObject(actor.getX()-1, actor.getY()) == configuration.obstacle();
				case SActor.UP: return grid.getObject(actor.getX(), actor.getY()-1) == configuration.obstacle();
				case SActor.DOWN: return grid.getObject(actor.getX(), actor.getY()+1) == configuration.obstacle();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// if the position that is checked, is out of the grid
			// then there is no tree in front.
			return false;
		}
		return false;
	}
	
	/**
	 * prueft, ob ein Hindernis auf der rechten Seite von Actor ist.
	 * @return
	 */
	public boolean obstacleRight() {
		try {
			switch(actor.getDirection()){
				case SActor.RIGHT: return grid.getObject(actor.getX(), actor.getY()+1) == configuration.obstacle();
				case SActor.LEFT: return grid.getObject(actor.getX(), actor.getY()-1) == configuration.obstacle();
				case SActor.UP: return grid.getObject(actor.getX()+1, actor.getY()) == configuration.obstacle();
				case SActor.DOWN: return grid.getObject(actor.getX()-1, actor.getY()) == configuration.obstacle();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// if the position that is checked, is out of the grid
			// then there is no tree in front.
			return false;
		}
		return false;
	}
	
	/**
	 * prueft, ob ein Hindernis auf der linken Seite von Actor ist.
	 * @return
	 */
	public boolean obstacleLeft() {
		try {
			switch(actor.getDirection()){
				case SActor.RIGHT: return grid.getObject(actor.getX(), actor.getY()-1) == configuration.obstacle();
				case SActor.LEFT: return grid.getObject(actor.getX(), actor.getY()+1) == configuration.obstacle();
				case SActor.UP: return grid.getObject(actor.getX()-1, actor.getY()) == configuration.obstacle();
				case SActor.DOWN: return grid.getObject(actor.getX()+1, actor.getY()) == configuration.obstacle();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// if the position that is checked, is out of the grid
			// then there is no tree in front.
			return false;
		}
		return false;
	}
	
	/**
	 * zeigt einen Text in einem Message-Dialog.
	 * @param text
	 */
	public void show(String text) {
        JOptionPane.showMessageDialog(this.getDisplay().getFrame(), text,"", JOptionPane.INFORMATION_MESSAGE, this.sProgramm.configuration().programmIcon());
	}

	/**
	 * zeigt eine Zahl in einem Message-Dialog.
	 * @param text
	 */
	public void show(int zahl) {
		show(""+zahl);
	}

	/**
	 * zeigt eine Zahl in einem Message-Dialog.
	 * @param text
	 */
	public void show(double zahl) {
		show(roundTwoDigits(zahl));
	}
	
	/**
	 * zeigt einen Text und eine Zahl in einem Message-Dialog.
	 * @param text
	 * @param zahl
	 */
	public void show(String text, int zahl) {
		show(text+" "+zahl);
	}
	
	/**
	 * zeigt einen Text und eine Zahl in einem Message-Dialog.
	 * @param text
	 * @param zahl
	 */
	public void show(String text, double zahl) {
		show(text+" "+roundTwoDigits(zahl));
	}
	
	private String roundTwoDigits(double number) {
		double roundedNumber = 1.0*Math.round(number*100)/100;
		String roundedNumberString = ""+roundedNumber;
		int indexOfPoint = roundedNumberString.indexOf(".");
		String ergebnis = roundedNumberString;
		if(indexOfPoint == -1) ergebnis = roundedNumberString;
		else if(indexOfPoint >= roundedNumberString.length()-3) ergebnis = roundedNumberString;
		else roundedNumberString.substring(0,indexOfPoint+3);
		return ergebnis;
	}
	
	/**
	 * gibt einen Text an die Konsole aus.
	 * @param text
	 */
	public void print(String text) {
		System.out.println(text);
	}
	
	/**
	 * gibt eine Zahl an die Konsole aus.
	 * @param text
	 */
	public void print(int zahl) {
		print(""+zahl);
	}
	
	/**
	 * gibt eine Zahl an die Konsole aus.
	 * @param text
	 */
	public void print(double zahl) {
		print(""+roundTwoDigits(zahl));
	}
	
	/**
	 * gibt einen Text und eine an die Konsole aus.
	 * @param text
	 */
	public void print(String text, int zahl) {
		print(text+" "+zahl);
	}

	/**
	 * gibt einen Text und eine an die Konsole aus.
	 * @param text
	 */
	public void print(String text, double zahl) {
		print(text+" "+roundTwoDigits(zahl));
	}


	/**
	 * gibt zurueck, ob das Programm gerade ausgefuehrt wird.
	 * oder pausiert.
	 */
	public boolean isRunning() {
		return isRunning;
	}

	/**
	 * legt das Display fest.
	 * @param display
	 */
	public void setDisplay(SDisplay display) {
		this.display = display;
		
	}

	public void setActor(SActor sActor) {
		this.actor = sActor;
		this.display.displayActor(sActor);
		
	}
	
	public SProgramm getProgram() {
		return this.sProgramm;
	}

}
