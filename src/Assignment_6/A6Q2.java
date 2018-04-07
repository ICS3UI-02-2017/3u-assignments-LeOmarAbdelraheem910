/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Welcome the user to your new and improved height check program!
        System.out.println("Greetings young or old user! I'm sure you'd like to get started with your height checking business!");

        //Make the user enter in the amount of height readings and store the variables in an array
        System.out.print("How many people are you deciding to read in? : ");
        int numberOfPeople = input.nextInt();
        int[] collectedHeights = new int[numberOfPeople];

        //Initialize a variable to count the number of people above average in the reading.
        int aboveAverage = 0;

        //Now, the user will be asked to enter in the heights of every person in the reading.
        System.out.println("With that out of the way, enter in the heights of each person in centimetres. A reminder: Average human height worldwide is 5 feet and 6 inches or 167.64 centimetres!");
        for (int check = 0; check < collectedHeights.length; check++) {
            double individualHeights = input.nextDouble();

            //After that, the program will sift through the array, checking if any of the heights entered are above the worldwide average for height.
            for (check = 0; check < 1; check++) {
                if (individualHeights < 167.64) {
                    System.out.println("The person with a height of " + individualHeights + " cm is below average height. Sorry, better luck next time :)");
                } else if (individualHeights == 167.64) {
                    System.out.println("The person with a height of " + individualHeights + " cm is of average height. What an average fellow...");
                } else if (individualHeights > 167.64) {
                    System.out.println("The person with a height of " + individualHeights + " cm is above average height! Wow you're tall!");
                    aboveAverage = aboveAverage + 1;
                }
            }
        }
        //State a final total of the number of people above average height in the reading.
        System.out.println("The amount of people that are about average height in the reading are " + aboveAverage + ".");
    }
}
