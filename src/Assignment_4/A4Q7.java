/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Snakes and Ladders!");
        System.out.println("We didn't have a true board for you and your friend to play on but you know what that's okay because we have a coding edition! :)");
        System.out.print("Please Enter Player 1's Name : ");
        String name1 = input.nextLine();
        System.out.print("Please Enter Player 2's Name : ");
        String name2 = input.nextLine();
        System.out.println("");
        System.out.println("You have now started a game of Snakes and Ladders! " + name1 + " rolls first!");
        System.out.print("Enter the sum of the dice: ");
        int sumOfDice = input.nextInt();
        int startingSpace = 1;
        int moveGamePiece = startingSpace + sumOfDice;
        if (sumOfDice == 0){
            System.out.println("You Forfeit!");
        }
        while (sumOfDice > 1 && sumOfDice <13){
            System.out.println("You are now on square " + moveGamePiece);
            System.out.print("Enter the sum of the dice: ");
            sumOfDice = input.nextInt();
            int continueMovingGamePiece = moveGamePiece + sumOfDice;
        }
        while (sumOfDice == 1 || sumOfDice > 12){
            System.out.println("Please enter a sum between 2 and 12...");
            System.out.print("Enter the sum of the dice: ");
            sumOfDice = input.nextInt();
            int continueMovingGamePiece = moveGamePiece + sumOfDice;
            

        }
        input.nextLine();
        
    }   
    
}
