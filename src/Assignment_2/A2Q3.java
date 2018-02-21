/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/**
 *
 * @author abdeo8431
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a city for the this monstrosity of question to exist
        City fruitopia = new City();
        
        //create a robot named speedyboi at the coordinates(?,?)
         RobotSE speedyboi = new RobotSE(fruitopia, -10, 6, Direction.WEST);
         
        //set the colour of speedyboi to black
        speedyboi.setColor(Color.black);
        
        //while the front of the speedyboi's path is clear, execute this command
        while(speedyboi.getStreet()>0){
            if(!speedyboi.isFacingNorth()){
                speedyboi.turnRight();
        }else if(speedyboi.isFacingNorth()){
            speedyboi.move();
        }
        if(speedyboi.getStreet() == 0){
            speedyboi.turnRight();
            }
        }
        
        while(speedyboi.getStreet()<0){
            if(!speedyboi.isFacingSouth()){
                speedyboi.turnRight();
        }else if(speedyboi.isFacingSouth()){
            speedyboi.move();
        }
        if(speedyboi.getStreet() == 0){
            speedyboi.turnRight();
            }
        }
        
        while(speedyboi.getAvenue()>0){
            if(!speedyboi.isFacingWest()){
                speedyboi.turnRight();
        }else if(speedyboi.isFacingWest()){
            speedyboi.move();
        }        

        }
        while(speedyboi.getAvenue()<0){
            if(!speedyboi.isFacingEast()){
                speedyboi.turnRight();
        }else if(speedyboi.isFacingEast()){
            speedyboi.move();
        }
            }
        }
        
        }
    

        



