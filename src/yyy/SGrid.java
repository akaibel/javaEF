package yyy;

import javax.swing.JOptionPane;

/**
 * the class SGrid describes the state of Actors environment.
 * Actor herself is not part of the SGrid!
 * the class SGrid does not provide display functionality, only information and logic.
 * @author akaib
 *
 */
public class SGrid {
	private AbstractDisplay configuration;

	public int size_x;
	public int size_y;
	
	private char[][] objects;
	
	
	public SGrid(String[] landscape, AbstractDisplay configuration) {
		this.configuration = configuration;
		this.setObjects(landscape);
	}
	
	/**
	 * calculates the objects field from the landscape.
	 * @param landscape
	 */
	public void setObjects(String[] landscape) {
		try {
			size_y = landscape.length;
			size_x = landscape[0].length();
			objects = new char[size_y][size_x];
			for (int y = 0; y < size_y; y++) {
				for(int x = 0; x<size_x; x++) {
					objects[y][x] = landscape[y].charAt(x); 
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ungueltige Landkarte\nVermutlich nicht rechteckig");
			System.exit(0);
		}		
	}
		
	/**
	 * get the objects on the field
	 * @return
	 */
	public char[][] getObjects(){
		return objects;
	}
	
	/**
	 * get the object at position
	 * @param position
	 * @return
	 */
	public char getObject(SPosition position) {
		return getObject(position.getX(), position.getY());
	}

	/**
	 * get the object at position (x|y)
	 * @param x
	 * @param y
	 * @return
	 */
	public char getObject(int x, int y) {
		return objects[y][x];
	}

	
	public int getSize_x() {
		return size_x;
	}

	public int getSize_y() {
		return size_y;
	}

	/**
	 * @param x
	 * @param y
	 * @return success
	 */
	public boolean putObjectA(SPosition position) {
		int x = position.getX();
		int y = position.getY();
		if(objects[y][x] == configuration.empty() || objects[y][x] == configuration.actor()) {
			objects[y][x] = configuration.objectA();		
			return true;
		}
		else {
			return false;
		}
	}

	public boolean removeObjectA(SPosition position) {
		int x = position.getX();
		int y = position.getY();
		if(objects[y][x] == configuration.objectA()) {
			objects[y][x] = configuration.empty();		
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * @param x
	 * @param y
	 * @return success
	 */
	public boolean putObjectB(SPosition position) {
		int x = position.getX();
		int y = position.getY();
		if(objects[y][x] == configuration.empty() || objects[y][x] == configuration.actor()) {
			objects[y][x] = configuration.objectB();		
			return true;
		}
		else {
			return false;
		}
	}

	public boolean removeObjectB(SPosition position) {
		int x = position.getX();
		int y = position.getY();
		if(objects[y][x] == configuration.objectB()) {
			objects[y][x] = configuration.empty();		
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * @param x
	 * @param y
	 * @return success
	 */
	public boolean putObjectC(SPosition position) {
		int x = position.getX();
		int y = position.getY();
		if(objects[y][x] == configuration.empty() || objects[y][x] == configuration.actor()) {
			objects[y][x] = configuration.objectC();		
			return true;
		}
		else {
			return false;
		}
	}

	public boolean removeObjectC(SPosition position) {
		int x = position.getX();
		int y = position.getY();
		if(objects[y][x] == configuration.objectC()) {
			objects[y][x] = configuration.empty();		
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		String ergebnis = "";
		for (int y = 0; y < objects.length; y++) {
			for (int x = 0; x < objects[y].length; x++) {
				ergebnis += objects[y][x];
			}
			ergebnis += "\n";
		}
		return ergebnis;
	}	
}
