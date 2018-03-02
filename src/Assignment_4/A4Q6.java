/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author abdeo8431
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("This is the police department and we are suspicious of your reckless driving habits. We have reason to believe that you were speeding down this very street today.");
        System.out.println("You must state the speed limit of the street and your recorded speed below:");
        System.out.println("");
        System.out.print("Enter the speed limit of that street! : ");
        int speedLimit = input.nextInt();
        System.out.print("Enter the recorded speed of your vehicle! : ");
        int recordedSpeed = input.nextInt();
        if (input.speedLimit < recordedSpeed <= 20);
        }
}
