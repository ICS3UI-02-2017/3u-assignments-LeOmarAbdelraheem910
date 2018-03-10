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
        System.out.print("Enter the speed limit of that street in km/h! : ");
        int speedLimit = input.nextInt();
        System.out.print("Enter the recorded speed of your vehicle in km/h! : ");
        int recordedSpeed = input.nextInt();
        int differenceBetweenLimit = recordedSpeed - speedLimit;
        if (differenceBetweenLimit == 0) {
            System.out.println("Congratualtions, our suspicions have been dropped. You are within the speed limit. Carry on with your day.");
        }
        if (differenceBetweenLimit > 0 && differenceBetweenLimit < 21) {
            System.out.println("Our suspicions were correct; you were speeding 1-20 km/h over the speed limit and your subsequent fine is $100. Enjoy paying us hahahahaha!");
        }
        if (differenceBetweenLimit > 20 && differenceBetweenLimit < 31) {
            System.out.println("Our suspicions were correct; you were speeding 21-30 km/h over the speed limit and your subsequent fine is $270. Enjoy paying us hahahahaha!");
        }
        if (differenceBetweenLimit > 30) {
            System.out.println("Our suspicions were correct; you were speeding 31+ km/h over the speed limit and your subsequent fine is $500. Enjoy paying us hahahahaha!");
        }
    }
}
