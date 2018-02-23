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

        //create a robot named speedyboi at the coordinates(3,4)
        RobotSE speedyboi = new RobotSE(fruitopia, 2, 1, Direction.NORTH);

        //set the colour of speedyboi to black
        speedyboi.setColor(Color.black);

        //If ever in a positive integer street coordinate, to reach street 0, face north!
        while (speedyboi.getStreet() > 0) {
            if (!speedyboi.isFacingNorth()) {
                speedyboi.turnRight();
            } else if (speedyboi.isFacingNorth()) {
                speedyboi.move();
            }
            if (speedyboi.getStreet() == 0) {
                speedyboi.turnRight();
            }
        }
        //If ever in a negative integer street coordinate, to reach street 0, face south!
        while (speedyboi.getStreet() < 0) {
            if (!speedyboi.isFacingSouth()) {
                speedyboi.turnRight();
            } else if (speedyboi.isFacingSouth()) {
                speedyboi.move();
            }
            if (speedyboi.getStreet() == 0) {
                speedyboi.turnRight();
            }
        }
        //If ever in a positive integer avenue coordinate, to reach avenue 0, face west!
        while (speedyboi.getAvenue() > 0) {
            if (!speedyboi.isFacingWest()) {
                speedyboi.turnRight();
            } else if (speedyboi.isFacingWest()) {
                speedyboi.move();
            }
        }
        //If ever in a negative integer avenue coordinate, to reach avenue 0, face east!
        while (speedyboi.getAvenue() < 0) {
            if (!speedyboi.isFacingEast()) {
                speedyboi.turnRight();
            } else if (speedyboi.isFacingEast()) {
                speedyboi.move();
            }
        }
    }
}
