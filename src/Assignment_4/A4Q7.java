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
        
        int currentSpace = 1;
        while(currentSpace < 100 || currentSpace == 100){
        
        if(currentSpace > 100){
            System.out.println("You Rick-Rolled too high! Please roll again on your turn:");
        }
        if(currentSpace == 100){
            System.out.println("YOU WIN!!!!");
        }
        System.out.print("Enter the sum of the dice: ");
        int sumOfDice = input.nextInt();
       
        if (sumOfDice == 0){
            System.out.println("You Forfeit!");
        }
        
        
        if (sumOfDice > 1 && sumOfDice <13){
            currentSpace = currentSpace + sumOfDice;
            System.out.println("You are now on square " + currentSpace);
        }
        if (sumOfDice == 1 || sumOfDice > 12){
            System.out.println("Please enter a sum between 2 and 12...");
            
        }
        
        }
        
    }   
    
}