package yyy.rover;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

import yyy.AbstractDisplay;

public class RoverDisplay extends AbstractDisplay {
	public static String IMAGE_PATH = "resources\\images\\rover\\";

	public static final char ACTOR = 'a';
	public static final char OBSTACLE = 'x';  // Huegel
	public static final char OBJECT_A = 'm';  // Markierung 
	public static final char OBJECT_B = 'b';  // blaues Gestein 
	public static final char OBJECT_C = 'r';  // rotes Gestein
	public static final char EMPTY = '.';
		
	
    public static final ImageIcon ROVER_ICON = new ImageIcon(IMAGE_PATH+"rover.png");
    public static final ImageIcon ROVER_ICON_GRAU = new ImageIcon(IMAGE_PATH+"roverGrau.png");
    public static final ImageIcon FIELD_ICON = new ImageIcon(IMAGE_PATH+"boden.png");

    public static final Image FIELD_IMAGE = FIELD_ICON.getImage();
    
    
    private static final String[] ROVER_COLORS = {"blau","grau"};
    
    private static final Map<String, Image> ROVER_IMAGE_MAP = new HashMap<>();
    static {
    	ROVER_IMAGE_MAP.put("blau", ROVER_ICON.getImage());
    	ROVER_IMAGE_MAP.put("grau", ROVER_ICON_GRAU.getImage());
    }

  private static final Map<Character, Image> OBJECT_IMAGE_MAP = new HashMap<>();
  static {
      OBJECT_IMAGE_MAP.put(OBSTACLE, new ImageIcon(IMAGE_PATH+"huegel.png").getImage());
      OBJECT_IMAGE_MAP.put(OBJECT_A, new ImageIcon(IMAGE_PATH+"marke.png").getImage());
      OBJECT_IMAGE_MAP.put(OBJECT_B, new ImageIcon(IMAGE_PATH+"gesteinBlau.png").getImage());
      OBJECT_IMAGE_MAP.put(OBJECT_C, new ImageIcon(IMAGE_PATH+"gesteinRot.png").getImage());
  }
    
  	public RoverDisplay() {
  		super.setCellSize(50);
  	}
  
    public String programName() {
    	return "Mars-Rover";
    }

	@Override
	public String imagePath() {
		return IMAGE_PATH;
	}

	@Override
	public String[] actorColors() {
		return ROVER_COLORS;
	}

	@Override
	public Map<String, Image> actorImageMap() {		
		return ROVER_IMAGE_MAP;
	}

	@Override
	public Map<Character, Image> objectImageMap() {
		return OBJECT_IMAGE_MAP;
	}

	
	@Override
	public Image backgroundImage() {
		return FIELD_IMAGE;
	}

	@Override
	public ImageIcon programmIcon() {
		return ROVER_ICON;
	}

	@Override
	public char empty() {
		return EMPTY;
	}

	@Override
	public char obstacle() {
		return OBSTACLE;
	}

	@Override
	public char objectA() {
		return OBJECT_A;
	}

	@Override
	public char objectB() {
		return OBJECT_B;
	}

	@Override
	public char actor() {
		return ACTOR;
	}

	@Override
	public char objectC() {
		return OBJECT_C;
	}

	@Override
	public String objectName(char object) {
		switch(object) {
			case ACTOR: return "Rover";
			case EMPTY: return "Boden";
			case OBJECT_A: return "Marke";
			case OBJECT_B: return "blaues Gestein";
			case OBJECT_C: return "rotes Gestein";
			case OBSTACLE: return "Huegel";
			default: return "unbekanntes Objekt";
		}
	}

}
