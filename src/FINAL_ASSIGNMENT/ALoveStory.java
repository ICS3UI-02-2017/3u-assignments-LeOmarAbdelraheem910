package FINAL_ASSIGNMENT;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author Omar
 */
public class ALoveStory extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 12000;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "Sweet Sweet Veronica :'))) <3333";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));

    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    BufferedImage heartPlayer = loadImage("OmarVeronica's Love.png");
    BufferedImage regularEnemies = loadImage("Broken Heart Enemies.png");
    BufferedImage enemyProjectiles = loadImage("Enemy Projectile.png");
    BufferedImage enemyProjectilesReversed = loadImage("Enemy Projectile Reversed.png");
    // YOUR GAME VARIABLES WOULD GO HERE
    BasicStroke slightlyThickerLine = new BasicStroke(2);
    int playerMovementX = 0;
    int playerMovementY = 0;
    int levelMovementX = 0;
    int levelMovementY = 0;
    int enemyPatrol = 0;
    int bulletSpeed = 0;
    int jumpHeight = 0;
    int gravity = 1;

    boolean jump = false;
    boolean falling = false;
    boolean moveLeft = false;
    boolean moveRight = false;
    boolean projectileShot = false;
    boolean patrolDirectionChanged = false;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public ALoveStory() {
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

    public BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (Exception e) {
            System.out.println("Can't load image");
            e.printStackTrace();
        }
        return img;
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        Graphics2D g2d = (Graphics2D) g;

        g.fillRect(0, 0, WIDTH, WIDTH);

        g.drawImage(heartPlayer, 98, 200, null);
        g.drawImage(regularEnemies, 198 + enemyPatrol + levelMovementX, 200 + levelMovementY, null);

        if (moveRight) {
            if (bulletSpeed <= 0) {
                g.drawImage(enemyProjectiles, 196 + enemyPatrol + levelMovementX + bulletSpeed, 207 + levelMovementY, null);
                bulletSpeed -= 10;
                if (bulletSpeed <= -500) {
                    bulletSpeed = 500;
                    bulletSpeed = 0;
                }
            }
        } else {
            if (bulletSpeed < 0) {
                g.drawImage(enemyProjectiles, 196 + enemyPatrol + levelMovementX + bulletSpeed, 207 + levelMovementY, null);
                bulletSpeed -= 10;
                if (bulletSpeed <= -500) {
                    bulletSpeed = 500;
                    bulletSpeed = 0;
                }
            }
        }
        if (moveLeft) {
            if (bulletSpeed >= 0) {
                g.drawImage(enemyProjectilesReversed, 196 + enemyPatrol + levelMovementX + bulletSpeed, 207 + levelMovementY, null);
                bulletSpeed += 10;
                if (bulletSpeed >= 500) {
                    bulletSpeed = -500;
                    bulletSpeed = 0;
                }
            }
        } else {
            if (bulletSpeed > 0) {
                g.drawImage(enemyProjectilesReversed, 196 + enemyPatrol + levelMovementX + bulletSpeed, 207 + levelMovementY, null);
                bulletSpeed += 10;
                if (bulletSpeed >= +500) {
                    bulletSpeed = -500;
                    bulletSpeed = 0;
                }
            }
        }

        g.setColor(Color.BLACK);
        g.fillRect(300 + levelMovementX, 400 + levelMovementY, 50, 25);
        g.fillRect(500 + levelMovementX, 400 + levelMovementY, 25, 25);
        g.fillRect(550 + levelMovementX, 400 + levelMovementY, 15, 15);
        g.setColor(Color.ORANGE);
        g.fillRect(600 + levelMovementX, 200 + levelMovementY, 100, 25);
        g.setColor(Color.LIGHT_GRAY);
        int[] spikeX = {100 + levelMovementX, 110 + levelMovementX, 120 + levelMovementX};
        int[] spikeY = {100 + levelMovementY, 25 + levelMovementY, 100 + levelMovementY,};
        g.fillPolygon(spikeX, spikeY, 3);

    }
    // GAME DRAWING ENDS HERE
    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!

    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {

        if (jump) {
            if (levelMovementY == 0) {
                jumpHeight = -10;
            }
        }
        if (falling) {
            if (!(levelMovementY <= -10)) {
                levelMovementY -= jumpHeight;
                jumpHeight += gravity;
            }
            if (levelMovementY <= -10) {
                levelMovementY = 0;
            }
        }
        if (moveLeft) {
            levelMovementX = levelMovementX + 7;

        } else if (moveRight) {
            levelMovementX = levelMovementX - 7;
        }
        
        if (enemyPatrol <= -50) {
            patrolDirectionChanged = true;
        } else if (enemyPatrol >= 50 && enemyPatrol >= -50) {
            patrolDirectionChanged = false;
        }
        if(patrolDirectionChanged){
            enemyPatrol = enemyPatrol + 2;
        }else{
            enemyPatrol = enemyPatrol - 2;
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
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_UP) {
                jump = true;
            }
            if (keyCode == KeyEvent.VK_LEFT) {
                moveLeft = true;
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                moveRight = true;
            }
            if (keyCode == KeyEvent.VK_SPACE) {
                projectileShot = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_UP) {
                jump = false;
                falling = true;
            }
            if (keyCode == KeyEvent.VK_LEFT) {
                moveLeft = false;
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                moveRight = false;
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
        ALoveStory game = new ALoveStory();
    }
}
