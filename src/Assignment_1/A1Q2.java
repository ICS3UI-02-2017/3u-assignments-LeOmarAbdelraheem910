/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;
import static java.awt.Color.black;

/**
 *
 * @author Omar
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a city for the robot to fetch the newspaper in 
        City fruitopia = new City();
        
        //create the walls or boundaries for the robot's house 
        new Wall(fruitopia, 1, 1, Direction.WEST);
        new Wall(fruitopia, 2, 1, Direction.WEST);
        new Wall(fruitopia, 2, 1, Direction.SOUTH);
        new Wall(fruitopia, 1, 1, Direction.NORTH);
        new Wall(fruitopia, 1, 2, Direction.NORTH);
        new Wall(fruitopia, 1, 2, Direction.EAST);
        new Wall(fruitopia, 1, 2, Direction.SOUTH);
        
        //create the newspaper at the coordinates (2,2)
        new Thing(fruitopia, 2, 2);

        //create the robot peterpan at the coordinates (1,2)
        RobotSE peterpan = new RobotSE(fruitopia, 1, 2, Direction.SOUTH);
        
        //set the colour of the robot to black
        peterpan.setColor(black);
        
        //turn the robot to the right
        peterpan.turnRight();
        
        //move the robot one space towards the west
        peterpan.move();
        
        //turn the robot to the left 
        peterpan.turnLeft();
        
        //move the robot a space down towards the south
        peterpan.move();
        
        //turn the robot to the left
        peterpan.turnLeft();
        
        //move the robot forward one space to the east
        peterpan.move();
        
        //have the robot pick up the newspaper
        peterpan.pickThing();
        
        //make the robot do a 180 degree turn to return to its original position
        peterpan.turnAround();
        
        //now, the robot will repeat all of its movements before pcking up the newspaper in reverse order to reach its orignal position
        //move the robot forward one space to the west
        peterpan.move();
        
        //turn the robot to the right
        peterpan.turnRight();
        
        //move the robot a space down towards the north
        peterpan.move();
        
        //turn the robot to the right 
        peterpan.turnRight();
        
        //move the robot one space towards the east
        peterpan.move();

        //turn the robot to the right
        peterpan.turnRight();
    }
    
}
