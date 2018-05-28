package FINAL_ASSIGNMENT;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.AffineTransform;
import javax.swing.Timer;

/**
 *
 * @author abdeo8431
 */
public class TankFighters extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1000;
    static final int HEIGHT = 800;
    //Title of the window
    String title = "RIGHT THEN";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    Rectangle tank1 = new Rectangle(50, HEIGHT / 2 - 12, 25, 25);
    Rectangle tank2 = new Rectangle(750, HEIGHT / 2 - 12, 25, 25);
    Rectangle bullet1 = new Rectangle(0, 0, WIDTH, 10);
    Rectangle bullet2 = new Rectangle(0, 0, WIDTH, 10);
    Rectangle border1 = new Rectangle(0, 0, WIDTH, 10);
    Rectangle border2 = new Rectangle(0, 0, 10, HEIGHT);
    Rectangle border3 = new Rectangle(0, HEIGHT - 10, WIDTH, 10);
    Rectangle border4 = new Rectangle(WIDTH - 10, 0, 10, HEIGHT);

    int tankSpeed = 2;
    boolean tank1Up = false;
    boolean tank1Down = false;
    boolean tank1Right = false;
    boolean tank1Left = false;
    boolean tank2Up = false;
    boolean tank2Down = false;
    boolean tank2Right = false;
    boolean tank2Left = false;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public TankFighters() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        AffineTransform old = g2d.getTransform();

        g.setColor(Color.RED);
        g.fillRect(tank1.x, tank1.y, tank1.width, tank1.height);
        g.fillRect(tank2.x, tank2.y, tank2.width, tank2.height);
        
        g.setColor(Color.GRAY);
        g.fillRect(border1.x, border1.y, border1.width, border1.height);
        g.fillRect(border2.x, border2.y, border2.width, border2.height);
        g.fillRect(border3.x, border3.y, border3.width, border3.height);
        g.fillRect(border4.x, border4.y, border4.width, border4.height);

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        moveTanks();
        detectACollision();
    }

    private void moveTanks() {
        if (tank1Right) {
            tank1.x += tankSpeed;
        } else if (tank1Left) {
            tank1.x -= tankSpeed;
        }

        if (tank1Up) {
            tank1.y -= tankSpeed;
        } else if (tank1Down) {
            tank1.y += tankSpeed;
        }

        if (tank2Right) {
            tank2.x += tankSpeed;
        } else if (tank2Left) {
            tank2.x -= tankSpeed;
        }

        if (tank2Up) {
            tank2.y -= tankSpeed;
        } else if (tank2Down) {
            tank2.y += tankSpeed;
        }

    }

    private void detectACollision() {
        if (Color.RED.equals(Color.GRAY)){  
            tank1.y = 10;
            tank2.y = 10;
        }
        if(tank1.intersects(border2)) {
            tank1.x = 10;
        } if(tank1.intersects(border3)){ 
            tank1.y = HEIGHT - 35;
        }
        if(tank1.intersects(border4)){
            tank1.x = WIDTH - 35;
        }
        
        if (tank2.intersects(border1)){  
            tank2.y = 10;
        }
        if(tank2.intersects(border2)) {
            tank2.x = 10;
        } if(tank2.intersects(border3)){ 
            tank2.y = HEIGHT - 35;
        }
        if(tank2.intersects(border4)){
            tank2.x = WIDTH - 35;
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            //get keyCode
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_W) {
                tank1Up = true;
            } else if (keyCode == KeyEvent.VK_S) {
                tank1Down = true;
            }
            if (keyCode == KeyEvent.VK_D) {
                tank1Right = true;
            } else if (keyCode == KeyEvent.VK_A) {
                tank1Left = true;
            }
            if (keyCode == KeyEvent.VK_UP) {
                tank2Up = true;
            } else if (keyCode == KeyEvent.VK_DOWN) {
                tank2Down = true;
            }
            if (keyCode == KeyEvent.VK_RIGHT) {
                tank2Right = true;
            } else if (keyCode == KeyEvent.VK_LEFT) {
                tank2Left = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            //get keyCode
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_W) {
                tank1Up = false;
            } else if (keyCode == KeyEvent.VK_S) {
                tank1Down = false;
            }
            if (keyCode == KeyEvent.VK_D) {
                tank1Right = false;
            } else if (keyCode == KeyEvent.VK_A) {
                tank1Left = false;
            }
            if (keyCode == KeyEvent.VK_UP) {
                tank2Up = false;
            } else if (keyCode == KeyEvent.VK_DOWN) {
                tank2Down = false;
            }
            if (keyCode == KeyEvent.VK_RIGHT) {
                tank2Right = false;
            } else if (keyCode == KeyEvent.VK_LEFT) {
                tank2Left = false;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        TankFighters game = new TankFighters();
    }
}
