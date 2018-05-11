package Assignment_8;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics2D;
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
public class MakingAnAnimatedFace extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1000;
    static final int HEIGHT = 1000;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    
    BasicStroke thickerLine = new BasicStroke(10);

    // YOUR GAME VARIABLES WOULD GO HERE
    Color blackCat = new Color(30, 30, 30);
    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public MakingAnAnimatedFace() {
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
        Graphics2D g2d = (Graphics2D)g;
        
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        AffineTransform old = g2d.getTransform();
        g.setColor(blackCat);
        g.fillOval(50, 200, 500, 350);
        
        g2d.rotate(50, 270, 400);
        int[] triangleX = {70, 145, 199, 320};
        int[] triangleY = {400, 97, 82, 300};
        g.fillPolygon(triangleX, triangleY, 4);
        
        g.fillArc(144, 60, 60, 100, 0, 180);
        g.setColor(Color.BLACK);
        g2d.setStroke(thickerLine);
        g.drawArc(144, 60, 60, 61, 6, 180);
        g.drawLine(105, 250, 143, 97);
        g.drawLine(257, 200, 204, 82);
        g2d.setTransform(old);

        // g.setColor(Color.BLACK);
        g.setColor(blackCat);
        g2d.rotate(6.5, 300, 300);
        int[] triangleX1 = {300, 421, 475, 550};
        int[] triangleY1 = {300, 82, 97, 400};  
        g.fillPolygon(triangleX1, triangleY1, 4);
        
        g.fillArc(416, 60, 60, 100, 0, 180);
        g2d.setTransform(old);

        g.setColor(Color.BLACK);
        g2d.setStroke(thickerLine);
        g.drawOval(50, 200, 500, 350);

        g.setColor(Color.CYAN);
        g.fillOval(165, 300, 50, 50);
        
        g.setColor(Color.YELLOW);
        g.fillOval(385, 300, 50, 50);
        
        g.setColor(Color.BLACK);
        int[] triangleX2 = {270, 265, 289, 312, 335, 331};
        int[] triangleY2 = {341, 364, 384, 384, 364, 341};  
        g.fillPolygon(triangleX2, triangleY2, 6);
        
        g.fillArc(258, 340, 25, 25, 90, 180);
        g.fillArc(318, 340, 25, 25, 270, 180);
        g.fillArc(287, 364, 27, 25, 180, 180);

        
        g2d.setStroke(thickerLine);
        g.drawArc(300, 358, 80, 50, 180, 180);
        g.drawArc(220, 358, 80, 50, 180, 180);
        
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
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
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
        MakingAnAnimatedFace game = new MakingAnAnimatedFace();
    }
}
