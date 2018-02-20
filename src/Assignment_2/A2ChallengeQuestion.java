/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/**
 *
 * @author abdeo8431
 */
public class A2ChallengeQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the snowy winter city in which two star crossed lovers help each other in shoveling people's driveways
        City snowyfruitopia = new City();
        
        //create the walls that will set the boundaries for the road
        //create the left boundary for the road
        new Wall(snowyfruitopia, 0, 0, Direction.WEST);
        new Wall(snowyfruitopia, 1, 0, Direction.WEST);
        new Wall(snowyfruitopia, 2, 0, Direction.WEST);
        new Wall(snowyfruitopia, 3, 0, Direction.WEST);
        new Wall(snowyfruitopia, 4, 0, Direction.WEST);
        new Wall(snowyfruitopia, 5, 0, Direction.WEST);
        new Wall(snowyfruitopia, 6, 0, Direction.WEST);
        new Wall(snowyfruitopia, 7, 0, Direction.WEST);
        new Wall(snowyfruitopia, 8, 0, Direction.WEST);
        new Wall(snowyfruitopia, 9, 0, Direction.WEST);
        //create the right boundary for the road
        new Wall(snowyfruitopia, 0, 1, Direction.EAST);
        new Wall(snowyfruitopia, 1, 1, Direction.EAST);
        new Wall(snowyfruitopia, 2, 1, Direction.EAST);
        new Wall(snowyfruitopia, 3, 1, Direction.EAST);
        new Wall(snowyfruitopia, 4, 1, Direction.EAST);
        new Wall(snowyfruitopia, 5, 1, Direction.EAST);
        new Wall(snowyfruitopia, 6, 1, Direction.EAST);
        new Wall(snowyfruitopia, 7, 1, Direction.EAST);
        new Wall(snowyfruitopia, 8, 1, Direction.EAST);
        new Wall(snowyfruitopia, 9, 1, Direction.EAST);
        //create the remaining boundaries for the sidewalk
        new Wall(snowyfruitopia, 0, 3, Direction.EAST);
        new Wall(snowyfruitopia, 3, 3, Direction.EAST);
        new Wall(snowyfruitopia, 5, 3, Direction.EAST);
        new Wall(snowyfruitopia, 6, 3, Direction.EAST);
        new Wall(snowyfruitopia, 9, 3, Direction.EAST);
        new Wall(snowyfruitopia, 9, 3, Direction.SOUTH);
        //create driveway number 1
        new Wall(snowyfruitopia, 1, 3, Direction.SOUTH);
        new Wall(snowyfruitopia, 1, 4, Direction.SOUTH);
        new Wall(snowyfruitopia, 1, 5, Direction.SOUTH);
        new Wall(snowyfruitopia, 1, 6, Direction.SOUTH);
        new Wall(snowyfruitopia, 1, 7, Direction.SOUTH);
        new Wall(snowyfruitopia, 2, 7, Direction.SOUTH);
        new Wall(snowyfruitopia, 2, 6, Direction.SOUTH);
        new Wall(snowyfruitopia, 2, 5, Direction.SOUTH);
        new Wall(snowyfruitopia, 2, 4, Direction.SOUTH);
        new Wall(snowyfruitopia, 2, 3, Direction.SOUTH);
        //create driveway number 2
        new Wall(snowyfruitopia, 4, 3, Direction.SOUTH);
        new Wall(snowyfruitopia, 4, 4, Direction.SOUTH);
        new Wall(snowyfruitopia, 4, 5, Direction.SOUTH);
        new Wall(snowyfruitopia, 4, 6, Direction.SOUTH);
        new Wall(snowyfruitopia, 4, 5, Direction.SOUTH);
        new Wall(snowyfruitopia, 4, 4, Direction.SOUTH);
        new Wall(snowyfruitopia, 4, 3, Direction.SOUTH);
        //create driveway number 3
        new Wall(snowyfruitopia, 9, 3, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 4, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 5, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 6, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 7, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 3, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 3, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 3, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 3, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 3, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 3, Direction.SOUTH);
        new Wall(snowyfruitopia, 9, 3, Direction.SOUTH);
       
        
    }
    
}
