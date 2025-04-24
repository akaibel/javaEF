package yyy;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;


public class SDisplay {
	private AbstractDisplay configuration;
	    
    /**
     * here the images of each cell are stored.
     */
    private ImageLabel[][] imageLabelGrid;
    
    /**
     * the program (written by the user) that will executed.
     */
    private SProgrammContainer programContainer;

    /**
     * this thread is responsible for running the program (written by the user)
     */
	private ProgramThread programThread;
	
	/**
	 * time that elapses between each step of the program written by the user.
	 */
	private int waitingTime;
	
    
    /**
     * the objects that are displayed
     * t: tree; m: mushroom; l: leaf
     */
    private char[][] objects;

	
    
    private JFrame frame;
	
    /**
     * this latch will be released as soon as the display GUI is ready.
     */
    private CountDownLatch initGuiLatch;
	
	
	private Map<SActor,SPosition> actor_position_map;

	private JButton startButton;

	private JButton stopButton;

	private JButton resetButton;
	
	private static Point FRAME_LOCATION = null;
	
    
    public SDisplay(SProgrammContainer programmContainer) {
    	this.configuration = programmContainer.getProgram().configuration();
    	programmContainer.setDisplay(this);
    	initLogic(programmContainer);
    	initGUI();
        showActor();
        startNewProgramThread();
    }
    
    /**
     * initializes the logic: actor, the grid
     * @param programmContainer
     */
    public void initLogic(SProgrammContainer programmContainer) {
    	//System.out.println("initLogic");
    	this.actor_position_map = new HashMap<>();
    	this.programContainer = programmContainer;
		SGrid grid = new SGrid(programmContainer.landkarte(),programmContainer.getProgram().configuration());
		if(programmContainer.getActor() != null) {
			programmContainer.getActor().reset();	
			this.actor_position_map.put(programmContainer.getActor(), programmContainer.getActor().getPosition().copy());
		}
		programmContainer.setGrid(grid);
    	this.objects = programmContainer.getGrid().getObjects();
		int gridWidth = programmContainer.landkarte()[0].length();
		for (int i = 0; i < programmContainer.landkarte().length-1; i++) {
			if(programmContainer.landkarte()[i].length()!= gridWidth) {
		        JOptionPane.showMessageDialog(null,"Die Landkarte ist nicht rechteckig.");
		        return;
			}
		}
    }

    /**
     * initializes the graphical user interface
     */
    public void initGUI() {
		this.waitingTime = 500;
    	_config.Configuration.READ_AND_START_UPDATING_CONFIGURATION();
    	FRAME_LOCATION = new Point(_config.Configuration.KARA_ROVER_WINDOW_POS_X,_config.Configuration.KARA_ROVER_WINDOW_POS_Y);
		// initGuiLatch will be released, 
		// as soon as the GUI is ready.
        initGuiLatch = new CountDownLatch(1); 

        SwingUtilities.invokeLater(() -> {   	
	        frame = new JFrame(configuration.programName());
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	        // create the buttons and add them to the frame
	        JPanel buttonPanel = new JPanel();
	
	        startButton = new JButton("Start");
	        stopButton = new JButton("Stop");
	        resetButton = new JButton("Reset");
	        
	        startButton.addActionListener(e -> start());
	        stopButton.addActionListener(e -> stop());
	        resetButton.addActionListener(e -> reset());
	
	        buttonPanel.add(startButton);
	        buttonPanel.add(stopButton);
	        buttonPanel.add(resetButton);
	
	        frame.add(buttonPanel, BorderLayout.NORTH);
	
	        // Create the grid panel and add it to the frame
	        JPanel gridPanel = createGridPanel(objects);
	        frame.add(gridPanel, BorderLayout.CENTER);
	
	        // Add a slider at the bottom
	        JSlider speedSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
	        speedSlider.setMajorTickSpacing(10);
	        speedSlider.setMinorTickSpacing(1);
	        speedSlider.setPaintTicks(false);
	        speedSlider.setPaintLabels(false);
	        speedSlider.addChangeListener(e -> speedChanged(speedSlider.getValue()));
	    	int speed = _config.Configuration.SPEED;
	    	speedSlider.setValue(speed);
	        JPanel sliderPanel = new JPanel();
	        sliderPanel.add(speedSlider);	
	        frame.add(sliderPanel, BorderLayout.SOUTH);
	
	        // Pack the frame to set its size based on the preferred size of its components
	        frame.pack();
	
	        // Calculate the size of the frame including insets (borders, title bar, and menu bar)
	        Insets insets = frame.getInsets();
	        Dimension contentSize = gridPanel.getPreferredSize();
	        int frameWidth = contentSize.width + insets.left + insets.right;
	        int frameHeight = contentSize.height + insets.top + insets.bottom + buttonPanel.getHeight() + sliderPanel.getHeight()+28;
	
	        // Set the frame size
	        frame.setSize(new Dimension(frameWidth, frameHeight));

	        if(FRAME_LOCATION != null) {
	        	frame.setLocation(FRAME_LOCATION);
	        }
	        else {
	        	// Center the frame on the screen
	        	frame.setLocationRelativeTo(null);
	        }

	        // Make the frame visible
	        frame.setVisible(true);
	        frame.setResizable(false);

	        
	        frame.addComponentListener(new ComponentAdapter() {
	            @Override
	            public void componentMoved(ComponentEvent e) {
	                FRAME_LOCATION = frame.getLocation();
	                _config.Configuration.KARA_ROVER_WINDOW_POS_X = FRAME_LOCATION.x;
	                _config.Configuration.KARA_ROVER_WINDOW_POS_Y = FRAME_LOCATION.y;
	            }
	        });	        
	        // needed to handle deiconifying the window.
	        frame.addWindowStateListener(new WindowStateListener() {
	            @Override
	            public void windowStateChanged(WindowEvent e) {
	                if ((e.getNewState() & JFrame.ICONIFIED) == JFrame.ICONIFIED) {
	                	programContainer.stop();
	                }
	                if ((e.getNewState() & JFrame.NORMAL) == JFrame.NORMAL) {
	                    new Thread(new Runnable() {
	                        @Override
	                        public void run() {
	                            	try {
	                            		// sleep(1000) is necessary, otherwise actor will not be displayed.
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
	                            	displayActor(programContainer.getActor());
	                        }
	                    }).start();	                    
	                }

	            }
	        });
	        
	        initGuiLatch.countDown();
        });
    }
    
    private void showActor() {
        // as soon as the frame is ready, display Actor.
        new Thread(() -> {
            try {
                // Wait till display frame is ready
                initGuiLatch.await();
                // set latch for program to be started
                initGuiLatch = new CountDownLatch(1);
                if(programContainer.getActor() == null) {
                	return;
                }
                int x = programContainer.getActor().getPosition().getX();
                int y = programContainer.getActor().getPosition().getY();
    	    	if (isValidCoordinate(x, y)) {
    	    		this.actor_position_map.put(programContainer.getActor(), programContainer.getActor().getPosition().copy());
    	    		SwingUtilities.invokeLater(() -> { 
    	    			imageLabelGrid[y][x].displayActor(programContainer.getActor().getDirection());
    	    		});
    	        }
    	    	else {
    	    		JOptionPane.showMessageDialog(frame, "unmoegliche Position fuer Actor:\n"+x+","+y);
    	    		System.exit(0);
    	    	}                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();        
    }
  
    /**
     * stops the thread that provides running the program by the user
     * and starts a new thread doing so.
     */
    public void startNewProgramThread(){
    	//System.out.println("startNewProgramThread");
    	if(programThread != null) {
    		System.out.println("SDisplay.startNewProgramThread(): \nprogramThread is not null!\n that should not be!!");
    	}
		programThread = new ProgramThread();
		programThread.start();
    }

    /**
     * creates a JPanel containing a grid of ImageLabels
     * and initializes the ImageLabels according to objects
     * @param objects the objects to be displayed in the grid
     * @return
     */
    private JPanel createGridPanel(char[][] objects) {
        int rows = objects.length;
        int cols = objects[0].length;

        JPanel panel = new JPanel(new GridLayout(rows, cols));
        panel.setPreferredSize(new Dimension(cols * configuration.cellSize(), rows * configuration.cellSize()));

        imageLabelGrid = new ImageLabel[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char obj = objects[row][col];
                Image overlayImage = configuration.objectImageMap().get(obj);
                ImageLabel label = new ImageLabel(configuration.backgroundImage(), overlayImage);
                imageLabelGrid[row][col] = label;
                panel.add(label);
            }
        }
        return panel;
    }
    
    /**
     * this class provides functionality for displaying one cell.
     * there are three layers:
     * - background
     * - overlay (for tree or leaf)
     * - ActorImage (for the display of Actor)
     * @author akaib
     */
    class ImageLabel extends JLabel {
    	
    	private Image background;
        private Image overlay;
        private Image actorImage;
 
        
        /**
         * the rotation of Actor.
         * if rotation is -1, Actor will not be displayed.
         */
        private int rotation;

        /**
         * creates a new ImageLabel for displaying one cell.
         * Actor is not displayed.
         * @param backgroundPath the path of the background image
         * @param overlayPath the path of the overlay image (tree or leaf)
         */
        public ImageLabel(Image backgroundImage, Image overlayImage) {
            try {
                this.background = backgroundImage;
                this.overlay = overlayImage;
            } catch (Exception e) {
                e.printStackTrace();
            }
            setPreferredSize(new Dimension(configuration.cellSize(), configuration.cellSize()));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (background != null) {
                g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            }
            if (overlay != null) {
                g.drawImage(overlay, 0, 0, getWidth(), getHeight(), this);
            }
            // display Actor only in case rotation is not -1.
            if (rotation != -1 && programContainer.getActor() != null) {
                this.actorImage = configuration.actorImageMap().get(programContainer.getActor().getColor());
                if(this.actorImage == null) {
                	System.out.println("actorImage is null");
                }
                Graphics2D g2d = (Graphics2D) g.create();
                //System.out.println("paintComponent: Actor "+this.getX()+","+this.getY()+"):"+rotation);
                int cx = getWidth() / 2;
                int cy = getHeight() / 2;
                AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(rotation), cx, cy);
                g2d.setTransform(at);
                // offsetXY ist der Abstand von der oberen linken Ecke 
                int offsetXY = configuration.cellSize()/10;
                g2d.drawImage(actorImage, offsetXY, offsetXY, getWidth()+offsetXY, getHeight()+offsetXY, this);
                g2d.dispose();
            }
        }

        /**
         * displays Actor with the rotation
         * rotation can be 0, 90, 180, 270
         * @param rotation
         */
        public void displayActor(int rotation) {
            this.rotation = rotation;
            repaint();
        }

        /**
         * removes display of Actor from the cell.
         */
        public void removeActor() {
        	// with rotation -1, Actor will not be displayed.
            this.rotation = -1;
            repaint();
        }

        /**
         * updates the overlay.
         * @param overlayImage thenew overlay image.
         * @param showActor whether Actor should be shown.
         */
		public void updateOverlay(Image overlayImage, boolean showActor) {
			//Actor is not displayed, when rotation is -1
			if(showActor == false) {
				rotation = -1;
			}
			else if(rotation == -1) {
				rotation = 0;
			}
			if(overlayImage != null) {
				this.overlay = overlayImage;
			}
			else {
				this.overlay = null;
			}
			repaint();
			
		}
    }
    

    /**
     * Display Actor at the specified location with the specified direction
     * @param SActor
     */
    public void displayActor(SActor actor) {
//    	System.out.println("displayActor");
    	if(imageLabelGrid == null) {
    		return;
    	}
    	int x = actor.getPosition().getX();
    	int y = actor.getPosition().getY();
    	int direction = actor.getDirection();
        Thread thread = new Thread(new Runnable() {
			public void run() {
		    	if (isValidCoordinate(x, y)) {
		    		removeActor(actor_position_map.get(actor));
		    		actor_position_map.put(actor, new SPosition(x,y));
		            imageLabelGrid[y][x].displayActor(direction);
		            //System.out.println("make frame visible");

		        }
		    	else {
		    		JOptionPane.showMessageDialog(frame, "unmoegliche Position fuer Actor:\n"+x+","+y);
		    		System.exit(0);
		    	}
			}
        	
        });
        thread.start();    	
    }
    
    /**
     * removes Actor from the display of the grid.
     */
    public void removeActor(SActor actor) {
    	this.removeActor(this.actor_position_map.get(actor));
    }

    /**
     * removes Actor from the given location in the grid.
     * @param x horizontal
     * @param y vertical
     */
    private void removeActor(SPosition position) {
    	//System.out.println("removeActor("+x+","+y+")");
        try {
			int x = position.getX();
			int y = position.getY();
			if (isValidCoordinate(x, y)) {
			    imageLabelGrid[y][x].removeActor();
			}
		} catch (Exception e) {
			System.out.println("NullpointerException in SDisplay.removeActor(SPosition position).");
		}
    }

    /**
     * checks whether (x|y) is a valid coordinate in the grid.
     * @param x horizontal
     * @param y vertical
     * @return
     */
    private boolean isValidCoordinate(int x, int y) {
        return x >= 0 && x < imageLabelGrid[0].length && y >= 0 && y < imageLabelGrid.length;
    }
    
    /**
     * updates the display of the cell.
     * @param x horizontal
     * @param y vertical
     */
    public void updateCell(SPosition position) {
    	int x = position.getX();
    	int y = position.getY();
    	int row = y;
    	int col = x;
    	char obj = this.objects[y][x];
    	Image overlayImage = null;
    	if(obj != configuration.empty()) {
    		overlayImage = configuration.objectImageMap().get(obj);   
    	}
    	boolean showActor = (programContainer.getActor().getPosition().equals(position));
    	imageLabelGrid[row][col].updateOverlay(overlayImage, showActor);
    }
    
    /**
     * updates the display of all cells.
     */
    public void updateAllCells() {
    	for (int y = 0; y < objects.length; y++) {
			for (int x = 0; x < objects[y].length; x++) {
				updateCell(new SPosition(x,y));
			}
		}
    }
    
    /**
     * halts the execution for waitingTime milliseconds.
     */
	public void waitSomeTime() {
		try {
			Thread.sleep(waitingTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}

    /**
     * called when start-Button is pressed.
     */
    private void start() {
    		programContainer.start();
    }

    /**
     * called when stop-Button is pressed.
     */
    private void stop() {
    		programContainer.stop();
    }
    
    public void setButtonsEnabled(boolean value) {
    	this.startButton.setEnabled(value);
    	this.stopButton.setEnabled(value);
    	this.resetButton.setEnabled(value);   	
    }
    
    /**
     * called when reset-Button is pressed.
     */
    public void reset() {
    	programContainer.stop();
    	this.getFrame().setVisible(false);
    	SProgramm newProgram = this.programContainer.getProgram().createNewInstance();
    	//Display the actor - must be done in a seperate Thread
    	Thread displayActorThread = new Thread(() -> {
            try {
            	//TODO improve this! the actor should be displayed as soon as everything is ready.
            	Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	newProgram.getProgrammContainer().getDisplay().displayActor(newProgram.getProgrammContainer().getActor());
        });
        displayActorThread.start();
    }

    /**
     * called, when the speed slider is moved.
     * @param value value of the speed slider (between 0 and 100)
     */
    private void speedChanged(int value) {
        //value is in the interval 0..100
		//waitingtime should be in the interval 10..1000
		waitingTime = (int)(1000-value*9.9);		
		_config.Configuration.SPEED = value;
    }

	public JFrame getFrame() {
		return frame;
	}
	
	private class ProgramThread extends Thread{
		
		public ProgramThread() {
		}
		
		public void run() {
			try {
				initGuiLatch.await();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			while(!programContainer.isRunning()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	        programContainer.meinProgramm();
	        programContainer.show("Das Programm ist fertig!");   
		}			
		
	}
}
