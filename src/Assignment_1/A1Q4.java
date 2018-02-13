/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author abdeo8431
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a city for two robots to manuver in\
        City fruitopia = new City();
        
        //create a set of walls in an "L" shape in between the robots
        new Wall(fruitopia, 0, 1, Direction.WEST);
        new Wall(fruitopia, 1, 1, Direction.WEST);
        new Wall(fruitopia, 1, 1, Direction.SOUTH);
        
        //create the first robot named peterpan at coordinates (0,0)
        RobotSE peterpan = new RobotSE(fruitopia, 0, 0, Direction.SOUTH);
        
        //change the colour of peterpan to green
        peterpan.setColor(Color.green);
        //create the second robot named tinkerbell at corrdinates (0,1)
        RobotSE tinkerbell = new RobotSE(fruitopia, 0, 1, Direction.SOUTH);
        
        //change the colour of tinker to pink
        tinkerbell.setColor(Color.pink);
        
        //move peterpan one space to the south
        peterpan.move();
        
        //move tinkerbell one space to the south
        tinkerbell.move();
        
        //turn tinkerbell to the left
        tinkerbell.turnLeft();
        
        //move tinkerbell one space to the east
        tinkerbell.move();
        
        //move peterpan one more space to the south
        peterpan.move();
        
        //turn peterpan to the left
        peterpan.turnLeft();
        
        //turn tinkerbell to the right
        tinkerbell.turnRight();
        
        //move tinkerbell one space to the south
        tinkerbell.move();
        
        //turn tinkerbell to the right
        tinkerbell.turnRight();
        
        //move peterpan one space to the east
        peterpan.move();
        
        //move tinkerbell one space to the west
        tinkerbell.move();
        
        
        
        
        
        
    }
}
