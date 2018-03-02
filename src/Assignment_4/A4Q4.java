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
        double costOfFood = input.nextDouble();
        
        System.out.print("How much does the DJ cost? : ");
        double costOfDJ = input.nextDouble();
        
        System.out.print("How much does it cost to rent the hall? : ");
        double costToRentHall = input.nextDouble();
        
        System.out.print("How much do the decorations cost? : ");
        double costOfDecorations = input.nextDouble();
        
        System.out.print("How much does it cost for staff? : ");
        double costOfStaff= input.nextDouble();
        
        System.out.print("How much for miscellaneous costs? : ");
        double miscellaneousExpenses = input.nextDouble();
        
        System.out.println("");
        
        double totalCost = costOfFood + costOfDJ + costToRentHall + costOfDecorations + costOfStaff + miscellaneousExpenses;
        double amountOfTickets = Math.ceil(totalCost / 35);
        System.out.println("The total cost of your prom experience will be $" + totalCost + "." + "\nYou will need to sell " + amountOfTickets + " tickets in order to break even!");
        System.out.println("");
        
    }
    
}
