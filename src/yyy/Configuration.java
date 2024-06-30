package yyy;

import java.awt.Image;
import java.util.Map;

import javax.swing.ImageIcon;

public abstract class Configuration {
	private int cellSize = 28;
	
	public abstract String programName();
	
	public abstract String imagePath();
	public abstract Map<String, Image> actorImageMap();
	public abstract String[] actorColors();
	public abstract Map<Character, Image> objectImageMap();
	
	/**
	 * the icon that represents the program, e.g. an image of kara.
	 * @return
	 */
	public abstract ImageIcon programmIcon();
	public abstract Image backgroundImage();
	
	public abstract char empty();
	public abstract char obstacle();
	public abstract char objectA();
	public abstract char objectB();
	public abstract char objectC();
	public abstract char actor();
	
	public abstract String objectName(char object);
	
	public int cellSize() {
		return cellSize;
	}

	public void setCellSize(int cellSize) {
		this.cellSize = cellSize;
	}
	
}
