/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author abdeo8431
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create the city in which the supermarket and home will exist
        City fruitopia = new City();
        
        //create the first robot's home, peterpan, in an approximate "9" shape
        new Wall(fruitopia, 2, 3, Direction.WEST);
        new Wall(fruitopia, 2, 3, Direction.NORTH);
        new Wall(fruitopia, 2, 3, Direction.EAST);
        new Wall(fruitopia, 3, 3, Direction.EAST);
        new Wall(fruitopia, 3, 3, Direction.SOUTH);
        
        //create the expensive items that have fallen onto the ground at the following coordinates:
        
        //expensive item at (0,0)
        new Thing(fruitopia, 0, 0);
        
        //expensive item at (1,0)
        new Thing(fruitopia, 1, 0);
        
        //expensive item at (1,1)
        new Thing(fruitopia, 1, 1);
        
        //expensive item at (1,2)
        new Thing(fruitopia, 1, 2);
        
        //expensive item at (2,2)
        new Thing(fruitopia, 2, 2);
        
        //create the first robot, peterpan, in its home at coordinates (3,3)
        RobotSE peterpan = new RobotSE(fruitopia, 3, 3, Direction.EAST);
        
        //change the colour of peterpan to green
        peterpan.setColor(Color.green);
        
        //set the label of peterpan to "P"
        peterpan.setLabel("P");
        
        //create the second robot, tinkerbell, at coordinates (0,1)
        RobotSE tinkerbell = new RobotSE(fruitopia, 0, 1, Direction.WEST);
        
        //change the colour of tinker bell to pink
        tinkerbell.setColor(Color.pink);
        
        //set the label of tinkerbell to "T"
        tinkerbell.setLabel("T");
        
        //make peterpan do a full 180 degree spin 
        peterpan.turnAround();
        
        //move tinkerbell one space to the west
        tinkerbell.move();
        
        //move peterpan one space to the west
        peterpan.move();
        
        //turn peterpan to the right
        peterpan.turnRight();
        
        //move peterpan one space to the north
        peterpan.move();
        
        //make tinkerbell pick up the expensive item at (0,0)
        tinkerbell.pickThing();
        
        //make peterpan pick up the expensive item at (2,2)
        peterpan.pickThing();
        
        //turn tinkerbell to the left
        tinkerbell.turnLeft();
        
        //move tinkerbell one space to the south
        tinkerbell.move();
        
        //move peterpan one space to the north
        peterpan.move();
        
        //make peterpan pick up the expensive item at (1,2)
        peterpan.pickThing();
        
        //make tinkerbell pick up the expensive item at (1,0)
        tinkerbell.pickThing();
        
        //turn tinkerbell to the left
        tinkerbell.turnLeft();
        
        //turn peterpan to the left
        peterpan.turnLeft();
        
        //move tinkerbell one space to the east
        tinkerbell.move();
        
        //make tinkerbell pick up the thing at (1,1)
        tinkerbell.pickThing();
        
        //move peterpan one space to the west
        peterpan.move();
        
        
        
        
        
        

        
        
    }
}
