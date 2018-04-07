/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Force the user to enter in two integers... literally any integers. Store the integers in an array.
        System.out.println("HEY YOU! You'd better enter in two integers right now! Any integers, let's go mister/miss. >:(");

        int[] A = new int[2];

        //Set up a for statement to allow the user to enter in the two integers.
        for (int check = 0; check < 2; check++) {
            A[check] = input.nextInt();
        }
        //Create a sorting system that will rearrange the two integers if the first is larger than the second. If not, the original array will be displayed to the user. 
        for (int check = 0; check < 1; check++) {
            //If first integer is greater than the second integer, then split and rearrange the array.
            if (A[check] > A[check + 1]) {
                int[] firstInt = Arrays.copyOfRange(A, 0, check + 1);
                int[] secondInt = Arrays.copyOfRange(A, check + 1, A.length);
                System.out.println("The integers entered from least to greatest are: " + Arrays.toString(secondInt) + " , " + Arrays.toString(firstInt) + ".");
            } 
            //If not, leave as is. 
            else if (A[check] < A[check + 1]) {
                System.out.println("The integers entered from least to greatest are: " + Arrays.toString(A) + ".");
            }
        }
    }
}
