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

        //Create a sorting system for the numbers. The numbers will be ordered from least to greatest.
        for (int check = 0; check < 2; check++) {
            A[check] = input.nextInt();
        }
        for (int check = 0; check < 1; check++) {
            if (A[check] > A[check + 1]) {
                int firstInt = A[check];
                int secondInt = A[check + 1];
                firstInt = A[check + 1];
                secondInt = A[check];

            }
        }
        System.out.println(Arrays.toString(A));
    }
}
