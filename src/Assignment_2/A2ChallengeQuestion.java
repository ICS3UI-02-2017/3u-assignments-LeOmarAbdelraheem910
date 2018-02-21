/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

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
        new Wall(snowyfruitopia, 0, 2, Direction.EAST);
        new Wall(snowyfruitopia, 3, 2, Direction.EAST);
        new Wall(snowyfruitopia, 5, 2, Direction.EAST);
        new Wall(snowyfruitopia, 6, 2, Direction.EAST);
        new Wall(snowyfruitopia, 9, 2, Direction.EAST);
        new Wall(snowyfruitopia, 9, 2, Direction.SOUTH);
        //create driveway number 1
        new Wall(snowyfruitopia, 1, 3, Direction.NORTH);
        new Wall(snowyfruitopia, 1, 4, Direction.NORTH);
        new Wall(snowyfruitopia, 1, 5, Direction.NORTH);
        new Wall(snowyfruitopia, 1, 6, Direction.NORTH);
        new Wall(snowyfruitopia, 1, 6, Direction.EAST);
        new Wall(snowyfruitopia, 2, 6, Direction.EAST);
        new Wall(snowyfruitopia, 2, 6, Direction.SOUTH);
        new Wall(snowyfruitopia, 2, 5, Direction.SOUTH);
        new Wall(snowyfruitopia, 2, 4, Direction.SOUTH);
        new Wall(snowyfruitopia, 2, 3, Direction.SOUTH);
        //create driveway number 2
        new Wall(snowyfruitopia, 4, 3, Direction.NORTH);
        new Wall(snowyfruitopia, 4, 4, Direction.NORTH);
        new Wall(snowyfruitopia, 4, 5, Direction.NORTH);
        new Wall(snowyfruitopia, 4, 5, Direction.EAST);
        new Wall(snowyfruitopia, 4, 5, Direction.SOUTH);
        new Wall(snowyfruitopia, 4, 4, Direction.SOUTH);
        new Wall(snowyfruitopia, 4, 3, Direction.SOUTH);
        //create driveway number 3
        new Wall(snowyfruitopia, 7, 3, Direction.NORTH);
        new Wall(snowyfruitopia, 7, 4, Direction.NORTH);
        new Wall(snowyfruitopia, 7, 5, Direction.NORTH);
        new Wall(snowyfruitopia, 7, 6, Direction.NORTH);
        new Wall(snowyfruitopia, 7, 7, Direction.NORTH);
        new Wall(snowyfruitopia, 7, 7, Direction.EAST);
        new Wall(snowyfruitopia, 8, 7, Direction.EAST);
        new Wall(snowyfruitopia, 8, 7, Direction.SOUTH);
        new Wall(snowyfruitopia, 8, 6, Direction.SOUTH);
        new Wall(snowyfruitopia, 8, 5, Direction.SOUTH);
        new Wall(snowyfruitopia, 8, 4, Direction.SOUTH);
        new Wall(snowyfruitopia, 8, 3, Direction.SOUTH);
       
        //now, create the piles of snow scattered across the driveway, road, and yards
        //create the snow piles for the road 
        new Thing(snowyfruitopia, 0, 1);
        new Thing(snowyfruitopia, 1, 0);
        new Thing(snowyfruitopia, 2, 0);
        new Thing(snowyfruitopia, 3, 0);
        new Thing(snowyfruitopia, 3, 1);
        new Thing(snowyfruitopia, 4, 0);
        new Thing(snowyfruitopia, 5, 1);
        new Thing(snowyfruitopia, 7, 0);
        new Thing(snowyfruitopia, 7, 1);
        new Thing(snowyfruitopia, 8, 1);
        new Thing(snowyfruitopia, 9, 0);
        new Thing(snowyfruitopia, 9, 1);
        //create the snow piles for the sidewalk
        new Thing(snowyfruitopia, 1, 2);
        new Thing(snowyfruitopia, 2, 2);
        new Thing(snowyfruitopia, 4, 2);
        new Thing(snowyfruitopia, 7, 2);
        //create the snow pils for driveway 1
        new Thing(snowyfruitopia, 1, 3);
        new Thing(snowyfruitopia, 1, 4);
        new Thing(snowyfruitopia, 1, 5);
        new Thing(snowyfruitopia, 2, 4);
        new Thing(snowyfruitopia, 2, 6);
        //create the snow piles for driveway 2
        new Thing(snowyfruitopia, 4, 3);
        new Thing(snowyfruitopia, 4, 4);
        //create the snow piles for driveway 3
        new Thing(snowyfruitopia, 7, 3);
        new Thing(snowyfruitopia, 7, 7);
        new Thing(snowyfruitopia, 8, 3);
        new Thing(snowyfruitopia, 8, 4);
        new Thing(snowyfruitopia, 8, 6);
        //create the snow piles for the yards
        new Thing(snowyfruitopia, 0, 3);
        new Thing(snowyfruitopia, 0, 4);
        new Thing(snowyfruitopia, 0, 6);
        new Thing(snowyfruitopia, 1, 7);
        new Thing(snowyfruitopia, 3, 4);
        new Thing(snowyfruitopia, 3, 6);
        new Thing(snowyfruitopia, 4, 6);
        new Thing(snowyfruitopia, 4, 7);
        new Thing(snowyfruitopia, 5, 5);
        new Thing(snowyfruitopia, 5, 7);
        new Thing(snowyfruitopia, 6, 4);
        new Thing(snowyfruitopia, 6, 6);
        new Thing(snowyfruitopia, 9, 3);
        new Thing(snowyfruitopia, 9, 4);
        new Thing(snowyfruitopia, 9, 6);
        
        //create the first shoveling bot, speedyboi, who will shovel the snow from the driveways to the sidewalk at coordinates (0,2)
        RobotSE speedyboi = new RobotSE(snowyfruitopia, 0, 2, Direction.SOUTH);
        
        //set the colour of speedyboi to black
        speedyboi.setColor(Color.black);
        
        //create the second shoveling bot, speedygurl, who will shovel the snow to the end of the sidewalk at coordinates (0,2)
        RobotSE speedygurl = new RobotSE(snowyfruitopia, 0, 2, Direction.SOUTH);
        
        //set the colour of speedygurl to white
        speedygurl.setColor(Color.white);
        
        while(speedyboi.getStreet()!=9){
            speedyboi.move();
        if(speedyboi.getAvenue()==2){
            speedyboi.putAllThings();
        }
        if(!speedyboi.isBesideThing(IPredicate.aWall)){
            speedyboi.turnLeft();
        }
        if(speedyboi.canPickThing()){
            speedyboi.pickThing();
        }
        if(!speedyboi.frontIsClear()){
            speedyboi.turnAround();
        }
        }
        speedyboi.turnAround();
        
        speedygurl.turnRight(4);
        
        while(speedygurl.getStreet()!=9){
            speedygurl.move();
        if(speedygurl.canPickThing()){
            speedygurl.pickAllThings();
        }else if(!speedygurl.frontIsClear()){
            speedygurl.putAllThings();
        }
        }
    }
    
}
