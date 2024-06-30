package yyy.karaDeutsch;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

import yyy.Configuration;

public class KaraConfiguration extends Configuration {
	public static String IMAGE_PATH = "images\\kara\\";

	public static final char ACTOR = 'k';
	public static final  char OBSTACLE = 'x';
	public static final  char OBJECT_A = 'b';
	public static final  char OBJECT_B = 'p';
	public static final  char EMPTY = '.';
		
	
    public static final ImageIcon KARA_ICON = new ImageIcon(IMAGE_PATH+"kara.png");
    public static final ImageIcon KARA_ICON_BLUE = new ImageIcon(IMAGE_PATH+"kara_blue.png");
    public static final ImageIcon KARA_ICON_PURPLE = new ImageIcon(IMAGE_PATH+"kara_purple.png");
    public static final ImageIcon KARA_ICON_YELLOW = new ImageIcon(IMAGE_PATH+"kara_yellow.png");
    public static final ImageIcon KARA_ICON_GRAY = new ImageIcon(IMAGE_PATH+"kara_gray.png");
    public static final ImageIcon FIELD_ICON = new ImageIcon(IMAGE_PATH+"field.png");

    public static final Image FIELD_IMAGE = FIELD_ICON.getImage();
    
    private static final String[] KARA_COLORS = {"rot", "blau", "lila", "gelb", "grau"};
    // gray is not a color that should appear in changeColor()
    
    private static final Map<String, Image> KARA_IMAGE_MAP = new HashMap<>();
    static {
    	KARA_IMAGE_MAP.put("rot", KARA_ICON.getImage());
    	KARA_IMAGE_MAP.put("blau", KARA_ICON_BLUE.getImage());
    	KARA_IMAGE_MAP.put("lila", KARA_ICON_PURPLE.getImage());
    	KARA_IMAGE_MAP.put("gelb", KARA_ICON_YELLOW.getImage());
    	KARA_IMAGE_MAP.put("grau", KARA_ICON_GRAY.getImage());
    }

  private static final Map<Character, Image> OBJECT_IMAGE_MAP = new HashMap<>();
  static {
      OBJECT_IMAGE_MAP.put(OBSTACLE, new ImageIcon(IMAGE_PATH+"tree.png").getImage());
      OBJECT_IMAGE_MAP.put(OBJECT_A, new ImageIcon(IMAGE_PATH+"leaf.png").getImage());
      OBJECT_IMAGE_MAP.put(OBJECT_B, new ImageIcon(IMAGE_PATH+"mushroom.png").getImage());
  }
    
    public String programName() {
    	return "Java-Kara";
    }

	@Override
	public String imagePath() {
		return IMAGE_PATH;
	}

	@Override
	public Map<String, Image> actorImageMap() {		
		return KaraConfiguration.KARA_IMAGE_MAP;
	}
	
	@Override
	public String[] actorColors() {
		return KARA_COLORS;
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
		return KARA_ICON;
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
		// doesn't exist in kara
		return 0;
	}

	@Override
	public String objectName(char object) {
		switch(object) {
			case ACTOR: return "Kara";
			case EMPTY: return "Feld";
			case OBJECT_A: return "Blatt";
			case OBJECT_B: return "Pilz";
			case OBSTACLE: return "Baum";
			default: return "Unbekanntes Objekt";
		}
	}


}
