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
public class Asteroids extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
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
    Rectangle spaceship = new Rectangle(WIDTH / 2 - 12, HEIGHT / 2 - 25, 25, 50);
    int spaceshipSpeed = 2;
    boolean isMovingRight = false;
    boolean isMovingLeft = false;
    boolean isMovingForward = false;
    boolean isMovingBackward = false;
    boolean applyInertia = false;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Asteroids() {
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

        g.fillRect(spaceship.x, spaceship.y, spaceship.width, spaceship.height);


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
        moveRocketship();
    }

    private void moveRocketship() {
        if (isMovingRight) {
            spaceship.x += spaceshipSpeed;
        } else {
            if(applyInertia){
                spaceship.x += spaceshipSpeed;
            }

        }
        if (isMovingLeft) {
            spaceship.x -= spaceshipSpeed;
        } else {
            if(applyInertia){
                spaceship.x -= spaceshipSpeed;
            }
        }
        if (isMovingForward) {
            spaceship.y -= spaceshipSpeed;
        } else {
            if(applyInertia){
                spaceship.y -= spaceshipSpeed;
            }
        }
        if (isMovingBackward) {
            spaceship.y += spaceshipSpeed;
        } else {
            if(applyInertia){
                spaceship.y += spaceshipSpeed;
            }
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
                isMovingForward = true;
                applyInertia = false;
            } else if (keyCode == KeyEvent.VK_S) {
                isMovingBackward = true;
                applyInertia = false;
            }
            if (keyCode == KeyEvent.VK_D) {
                isMovingRight = true;
                applyInertia = false;
            } else if (keyCode == KeyEvent.VK_A) {
                isMovingLeft = true;
                applyInertia = false;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            //get keyCode
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_W) {
                isMovingForward = false;
                applyInertia = true;
            } else if (keyCode == KeyEvent.VK_S) {
                isMovingBackward = false;
                applyInertia = true;
            }
            if (keyCode == KeyEvent.VK_D) {
                isMovingRight = false;
                applyInertia = true;
            } else if (keyCode == KeyEvent.VK_A) {
                isMovingLeft = false;
                applyInertia = true;
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
        Asteroids game = new Asteroids();
    }
}
