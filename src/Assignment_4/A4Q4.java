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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the high school prom cost calculator! Enter the individual costs that make up your prom experience:");
        System.out.println("");
        
        System.out.print("How much does the food cost? : ");
        int costOfFood = input.nextInt();
        
        System.out.print("How much does the DJ cost? : ");
        int costOfDJ = input.nextInt();
        
        System.out.print("How much does it cost to rent the hall? : ");
        int costToRentHall = input.nextInt();
        
        System.out.print("How much do the decorations cost? : ");
        int costOfDecorations = input.nextInt();
        
        System.out.print("How much does it cost for staff? : ");
        int costOfStaff= input.nextInt();
        
        System.out.print("How much for miscellaneous costs? : ");
        int miscellaneousExpenses = input.nextInt();
        
        int totalCost = costOfFood + costOfDJ + costToRentHall + costOfDecorations + costOfStaff + miscellaneousExpenses;
        int amountOfTickets = totalCost / 35;
        
        System.out.println("The total cost of your prom experience will be $" + totalCost + "." + "\nYou will need to sell " + amountOfTickets + " tickets in order to break even!");
        System.out.println("");
        
    }
    
}
