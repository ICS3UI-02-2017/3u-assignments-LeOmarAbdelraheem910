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
    static final int WIDTH = 1350;
    static final int HEIGHT = 750;
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
    

    // YOUR GAME VARIABLES WOULD GO HERE
    BasicStroke thickerLine = new BasicStroke(10);
    BasicStroke slightlyThickerLine = new BasicStroke(5);
    BasicStroke evenSlighterThickerLine = new BasicStroke(2);
    Color blackCat = new Color(30, 30, 30);
    Color softGreen = new Color(76, 234, 58);
    Color aPurple = new Color(134, 100, 186);
    Color fishyOrange = new Color(209, 112, 8);
    Color skyBlueBackground = new Color(77, 139, 193);
    
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
        
        g.setColor(skyBlueBackground);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        g.setColor(softGreen);
        g.fillArc(860, 420, 440, 205, 250, 180);
        g.setColor(skyBlueBackground);
        g.fillArc(958, 460, 300, 125, 250, 184);
        g.setColor(softGreen);
        g.fillArc(200, 350, 950, 100, 0, 360);
        g.fillArc(200, 295, 951, 250, 180, 180);
        g.fillArc(200, 120, 950, 575, 180, 180);
        g.fillArc(425, 585, 500, 145, 180, 180);
        
        g.setColor(aPurple);
        g.fillArc(250, 375, 850, 75, 0, 360);
        g.fillArc(211, 196, 927, 500, 180, 180);

        g.setColor(Color.BLACK);
        g2d.setStroke(thickerLine);
        g.drawArc(250, 375, 850, 75, 0, 360);
        g.drawArc(200, 350, 950, 100, 0, 180);
       
        g.setColor(blackCat);
        g.fillOval(425, 150, 500, 350);
        
        g2d.rotate(50, 645, 350);
        int[] triangleX = {445, 520, 574, 695};
        int[] triangleY = {350, 47, 32, 250};
        g.fillPolygon(triangleX, triangleY, 4);
        
        g.fillArc(518, 10, 60, 100, 0, 180);
        g.setColor(Color.BLACK);
        g2d.setStroke(thickerLine);
        g.drawArc(518, 10, 60, 61, 6, 180);
        g.drawLine(480, 200, 517, 44);
        g.drawLine(632, 150, 577, 32);
        g2d.setTransform(old);

        g.setColor(blackCat);
        g2d.rotate(6.5, 680, 250);
        int[] triangleX1 = {680, 801, 864, 930};
        int[] triangleY1 = {250, 32, 47, 350};  
        g.fillPolygon(triangleX1, triangleY1, 4);
        
        g.fillArc(804, 10, 60, 100, 0, 180);
        g.setColor(Color.BLACK);
        g.drawArc(804, 10, 60, 61, -6, 180);
        g.drawLine(747, 140, 804, 32);
        g.drawLine(895, 200, 865, 43);
        g2d.setTransform(old);

        g.setColor(Color.BLACK);
        g.drawOval(425, 150, 500, 350);

        g.setColor(Color.CYAN);
        g.fillOval(540, 250, 50, 50);
        
        g.setColor(Color.YELLOW);
        g.fillOval(760, 250, 50, 50);
        
        g.setColor(Color.BLACK);
        int[] triangleX2 = {645, 640, 664, 687, 710, 706};
        int[] triangleY2 = {291, 314, 334, 334, 314, 291};  
        g.fillPolygon(triangleX2, triangleY2, 6);
        
        g.fillArc(633, 290, 25, 25, 90, 180);
        g.fillArc(693, 290, 25, 25, 270, 180);
        g.fillArc(662, 314, 27, 25, 180, 180);

        g.drawArc(675, 308, 80, 50, 180, 180);
        g.drawArc(595, 308, 80, 50, 180, 180);
        
        g.setColor(softGreen);
        g.fillArc(218, 354, 915, 185, 180, 180);
        
        g.setColor(Color.BLACK);
        g.drawArc(250, 375, 850, 75, 0, -234);
        g.drawArc(200, 122, 950, 575, 180, 180);
        g.drawArc(425, 585, 500, 145, 180, 180);
        g.drawArc(860, 420, 440, 205, 250, 180);
        g.drawArc(958, 460, 300, 125, 250, 184);
        g.drawArc(200, 295, 951, 250, 180, 180);
        
        g.setColor(blackCat);
        g.fillOval(425, 400, 200, 100);
        g.fillOval(725, 400, 200, 100);
        
        g.setColor(Color.BLACK);
        g.drawOval(425, 400, 200, 100);
        g.drawOval(725, 400, 200, 100);
        
        g2d.rotate(-0.1, 700, 600);
        g2d.setStroke(slightlyThickerLine);
        g.drawLine(800, 620, 835, 607);
        g.drawLine(800, 620, 835, 633);
        g.drawLine(845, 610, 845, 630);
        g.drawArc(835, 605, 10, 10, 0, 95);
        g.drawArc(835, 625, 10, 10, 180, 270);
        g.drawOval(700, 600, 120, 40);

        g.setColor(fishyOrange);
        g.fillOval(700, 600, 120, 40);
        int[] pentX = {800, 835, 845, 845, 835};
        int[] pentY = {620, 607, 610, 630, 633};
        g.fillPolygon(pentX, pentY, 5);
        g.fillArc(835, 605, 10, 10, 0, 180);
        g.fillArc(835, 625, 10, 10, 180, 180);
        g.setColor(Color.BLACK);
        g.fillOval(720, 615, 5, 5);
        g2d.setStroke(evenSlighterThickerLine);
        g.drawArc(735, 600, 10, 40, 270, 180);
        g2d.setTransform(old);
        
        g2d.rotate(-0.3, 995, 550);
        g2d.setStroke(slightlyThickerLine);
        g.drawLine(995, 570, 1030, 557);
        g.drawLine(995, 570, 1030, 583);
        g.drawLine(1040, 560, 1040, 580);
        g.drawArc(1030, 555, 10, 10, 0, 95);
        g.drawArc(1030, 575, 10, 10, 180, 270);
        g.drawOval(895, 550, 120, 40);

        g.setColor(fishyOrange);
        g.fillOval(895, 550, 120, 40);
        int[] pentX2 = {995, 1030, 1040, 1040, 1030};
        int[] pentY2 = {570, 557, 560, 580, 583};
        g.fillPolygon(pentX2, pentY2, 5);
        g.fillArc(1030, 555, 10, 10, 0, 180);
        g.fillArc(1030, 575, 10, 10, 180, 180);
        g.setColor(Color.BLACK);
        g.fillOval(915, 565, 5, 5);
        g2d.setStroke(evenSlighterThickerLine);
        g.drawArc(930, 550, 10, 40, 270, 180);
        g2d.setTransform(old);

        g2d.rotate(0.1, 650, 600);
        g2d.setStroke(slightlyThickerLine);
        g.drawLine(550, 620, 515, 607);
        g.drawLine(550, 620, 515, 633);
        g.drawLine(505, 610, 505, 630);
        g.drawArc(505, 605, 10, 10, 0, 145);
        g.drawArc(505, 625, 10, 10, 180, 270);
        g.drawOval(530, 600, 120, 40);

        g.setColor(fishyOrange);
        g.fillOval(530, 600, 120, 40);
        int[] pentX3 = {550, 515, 505, 505, 515};
        int[] pentY3 = {620, 607, 610, 630, 633};
        g.fillPolygon(pentX3, pentY3, 5);
        g.fillArc(505, 605, 10, 10, 0, 180);
        g.fillArc(505, 625, 10, 10, 180, 180);
        g.setColor(Color.BLACK);
        g.fillOval(630, 615, 5, 5);
        g2d.setStroke(evenSlighterThickerLine);
        g.drawArc(610, 600, 10, 40, 90, 180);
        g2d.setTransform(old);

        g2d.rotate(0.3, 455, 580);
        g2d.setStroke(slightlyThickerLine);
        g.drawLine(355, 600, 320, 587);
        g.drawLine(355, 600, 320, 613);
        g.drawLine(310, 590, 310, 610);
        g.drawArc(310, 585, 10, 10, 0, 145);
        g.drawArc(310, 605, 10, 10, 180, 270);
        g.drawOval(335, 580, 120, 40);

        g.setColor(fishyOrange);
        g.fillOval(335, 580, 120, 40);
        int[] pentX4 = {355, 320, 310, 310, 320};
        int[] pentY4 = {600, 587, 590, 610, 613};
        g.fillPolygon(pentX4, pentY4, 5);
        g.fillArc(310, 585, 10, 10, 0, 180);
        g.fillArc(310, 605, 10, 10, 180, 180);
        g.setColor(Color.BLACK);
        g.fillOval(435, 595, 5, 5);
        g2d.setStroke(evenSlighterThickerLine);
        g.drawArc(415, 580, 10, 40, 90, 180);
        g2d.setTransform(old);
        
        //g2d.setStroke(slightlyThickerLine);
        //g.drawLine(775, 620, 810, 607);
        //g.drawLine(775, 620, 810, 633);
        //g.drawLine(820, 610, 820, 630);
        //g.drawArc(810, 605, 10, 10, 0, 95);
        //g.drawArc(810, 625, 10, 10, 180, 270);
        //g.drawOval(675, 600, 120, 40);

        //g.setColor(Color.ORANGE);
        //g.fillOval(675, 600, 120, 40);
        //int[] pentX = {775, 810, 820, 820, 810};
        //int[] pentY = {620, 607, 610, 630, 633};
        //g.fillPolygon(pentX, pentY, 5);
        //g.fillArc(810, 605, 10, 10, 0, 180);
        //g.fillArc(810, 625, 10, 10, 180, 180);
        //g.setColor(Color.BLACK);
        //g.fillOval(695, 615, 5, 5);
        //g2d.setStroke(evenSlighterThickerLine);
        //g.drawArc(710, 600, 10, 40, 270, 180);
        
        



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
