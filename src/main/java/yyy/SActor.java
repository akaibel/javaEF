package yyy;

import javax.swing.JOptionPane;

public class SActor {
	private SPosition position;
	private SPosition position_start;
	private int direction, direction_start;
	private SProgrammContainer programContainer;
	private AbstractDisplay configuration;
	private String color;
	
	public static final int RIGHT = 0;
	public static final int DOWN = 90;
	public static final int LEFT = 180;
	public static final int UP = 270;

	public SActor(int x, int y, int direction, SProgramm program) {
		super();
		this.color = program.configuration().actorColors()[0];
		this.position = new SPosition(x,y);
		this.position_start = new SPosition(x,y);
		this.direction = direction;
		this.direction_start = direction;
		this.programContainer = program.getProgrammContainer();
		if(programContainer != null) {
			this.programContainer.setActor(this);
		}
		this.configuration = program.configuration();
	}
		
	public String getColor() {
		return color;
	}
	
	public void reset() {
		this.position = position_start.copy();
		this.direction = this.direction_start;
	}

	public void setColor(String color) {
		for(String c:configuration.actorColors()) {
			if(c.equals(color)) {
				this.color = color;
				this.programContainer.getDisplay().displayActor(this);
				this.programContainer.getDisplay().waitSomeTime();
				return;
			}
		}
		this.programContainer.getProgram().show("unbekannte Farbe: "+color);
	}
	
	public void changeColor() {
		for(int i=0; i<configuration.actorColors().length-1; i++) {
			String c = configuration.actorColors()[i];
			if(c.equals(this.getColor())) {
				setColor(configuration.actorColors()[i+1]);
				return;
			}
		}
		setColor(configuration.actorColors()[0]);		
	}
	
	public SPosition getPosition() {
		return position;
	}

	public int getDirection() {
		return direction;
	}

	public void move() {
		this.programContainer.waitTillRunning();
		int x = this.position.getX();
		int y = this.position.getY();
		int xNew = this.position.getX();
		int yNew = this.position.getY();
		switch(direction) {
			case UP: yNew = y-1; break;
			case RIGHT: xNew = x+1; break;
			case DOWN: yNew = y+1; break;
			case LEFT: xNew = x-1; break;
			default: JOptionPane.showMessageDialog(programContainer.getDisplay().getFrame(), "ungueltige Richtung fuer "+ configuration.objectName(configuration.actor())+":\ndirection="+direction); System.exit(0);
		}
		if(xNew < 0){
			programContainer.show("ungueltige Position fuer "+ configuration.objectName(configuration.actor())+":\nx="+xNew);
			System.exit(0);
		}
		if(xNew >= programContainer.getGrid().getSize_x()){
			programContainer.show("ungueltige Position fuer "+ configuration.objectName(configuration.actor())+":\nx="+xNew);
			System.exit(0);
		}
		if(yNew < 0){
			programContainer.show("ungueltige Position fuer "+ configuration.objectName(configuration.actor())+":\ny="+yNew);
			System.exit(0);
		}
		if(yNew >= programContainer.getGrid().getSize_y()){
			programContainer.show("ungueltige Position fuer "+ configuration.objectName(configuration.actor())+":\ny="+yNew);
			System.exit(0);
		}
		SPosition position_new = new SPosition(xNew, yNew);
		if(programContainer.getGrid().getObject(position_new) == configuration.obstacle()) {
			programContainer.show(""+ configuration.objectName(configuration.actor())+" kann nicht auf ein "+configuration.objectName(configuration.obstacle())+" gehen!");
			System.exit(0);			
		}
		this.position = position_new;
		this.programContainer.getDisplay().displayActor(this);
		this.programContainer.getDisplay().waitSomeTime();
	}
	
	public void turnRight() {
		this.programContainer.waitTillRunning();
		direction+=90;
		if(direction >= 360) direction -=360;
		this.programContainer.getDisplay().displayActor(this);		
		this.programContainer.getDisplay().waitSomeTime();
	}

	public void turnLeft() {
		this.programContainer.waitTillRunning();
		direction-=90;
		if(direction < 0) direction +=360;
		this.programContainer.getDisplay().displayActor(this);		
		this.programContainer.getDisplay().waitSomeTime();
	}
	
	public void putObjectA() {
		this.programContainer.waitTillRunning();
		boolean success = this.programContainer.getGrid().putObjectA(position);
		if(!success) {
			programContainer.show("Cannot put "+configuration.objectName(configuration.objectA())+" here!");			
			programContainer.getDisplay().reset();
		}
		else {
			this.programContainer.getDisplay().updateCell(position);
		}
		this.programContainer.getDisplay().waitSomeTime();
	}

	public void removeObjectA() {
		this.programContainer.waitTillRunning();
		boolean success = this.programContainer.getGrid().removeObjectA(position);
		if(!success) {
			programContainer.show("Cannot remove "+configuration.objectName(configuration.objectA())+" here!");			
			System.exit(0);
		}
		else {
			this.programContainer.getDisplay().updateCell(position);
		}
		this.programContainer.getDisplay().waitSomeTime();
	}

	public void putObjectB() {
		this.programContainer.waitTillRunning();
		boolean success = this.programContainer.getGrid().putObjectB(position);
		if(!success) {
			programContainer.show("Cannot put "+configuration.objectName(configuration.objectB())+" here!");			
			//System.exit(0);
			programContainer.getDisplay().reset();
		}
		else {
			this.programContainer.getDisplay().updateCell(position);
		}
		this.programContainer.getDisplay().waitSomeTime();
	}

	public void removeObjectB() {
		this.programContainer.waitTillRunning();
		boolean success = this.programContainer.getGrid().removeObjectB(position);
		if(!success) {
			programContainer.show("Cannot remove "+configuration.objectName(configuration.objectB())+" here!");			
			System.exit(0);
		}
		else {
			this.programContainer.getDisplay().updateCell(position);
		}
		this.programContainer.getDisplay().waitSomeTime();
	}

	public void putObjectC() {
		this.programContainer.waitTillRunning();
		boolean success = this.programContainer.getGrid().putObjectC(position);
		if(!success) {
			programContainer.show("Cannot put "+configuration.objectName(configuration.objectC())+" here!");			
			//System.exit(0);
			programContainer.getDisplay().reset();
		}
		else {
			this.programContainer.getDisplay().updateCell(position);
		}
		this.programContainer.getDisplay().waitSomeTime();
	}

	public void removeObjectC() {
		this.programContainer.waitTillRunning();
		boolean success = this.programContainer.getGrid().removeObjectC(position);
		if(!success) {
			programContainer.show("Cannot remove "+configuration.objectName(configuration.objectC())+" here!");			
			System.exit(0);
		}
		else {
			this.programContainer.getDisplay().updateCell(position);
		}
		this.programContainer.getDisplay().waitSomeTime();
	}

	public void setProgrammContainer(SProgrammContainer program) {
		this.programContainer = program;
	}

	public SProgrammContainer getProgrammContainer() {
		return programContainer;
	}

	public int getX() {
		return position.getX();
	}

	public int getY() {
		return position.getY();
	}

	@Override
	public String toString() {
		return configuration.objectName(configuration.actor())+": "+this.position+ ", " + direction+" "+color;
	}

}
