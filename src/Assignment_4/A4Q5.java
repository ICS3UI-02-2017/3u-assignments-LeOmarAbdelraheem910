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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("You are a Huron Heights Secondary School Student and you want know your marks (approximately) in math class!");
        System.out.print("Please enter your lovely name: ");
        String name = input.nextLine();
        
        System.out.println("");
        
        System.out.print("What was the first test out of? HUH? : ");
        double firstTestTotalMarks = input.nextInt();
        System.out.print("How many marks out of " + firstTestTotalMarks + " did you obtain??? : ");
        double firstTestMarksAcheived = input.nextInt();
        
        System.out.println("");
        
        System.out.print("What was the second test out of? HUH? : ");
        double secondTestTotalMarks = input.nextInt();
        System.out.print("How many marks out of " + secondTestTotalMarks + " did you obtain??? : ");
        double secondTestMarksAcheived = input.nextInt();
        
        System.out.println("");
        
        System.out.print("What was the third test out of? HUH? : ");
        double thirdTestTotalMarks = input.nextInt();
        System.out.print("How many marks out of " + thirdTestTotalMarks + " did you obtain??? : ");
        double thirdTestMarksAcheived = input.nextInt();
        
        System.out.println("");
        
        System.out.print("What was the fourth test out of? HUH? : ");
        double fourthTestTotalMarks = input.nextInt();
        System.out.print("How many marks out of " + fourthTestTotalMarks + " did you obtain??? : ");
        double fourthTestMarksAcheived = input.nextInt();
        
        System.out.println("");
        
        System.out.print("What was the fifth test out of? HUH? : ");
        double fifthTestTotalMarks = input.nextInt();
        System.out.print("How many marks out of " + fifthTestTotalMarks + " did you obtain??? : ");
        double fifthTestMarksAcheived = input.nextInt();
        
        System.out.println("");
        
        System.out.println("Here are your test scores for " + name + " :");
        
        System.out.println("");
        
        double percentageFirstTest = firstTestMarksAcheived / firstTestTotalMarks * 100;
        System.out.println("Test 1: " + percentageFirstTest + "%");
        
        double percentageSecondTest = secondTestMarksAcheived / secondTestTotalMarks * 100;
        System.out.println("Test 1: " + percentageSecondTest + "%");
        
        double percentageThirdTest = thirdTestMarksAcheived / thirdTestTotalMarks * 100;
        System.out.println("Test 1: " + percentageThirdTest + "%");
        
        double percentageFourthTest = fourthTestMarksAcheived / fourthTestTotalMarks * 100;
        System.out.println("Test 1: " + percentageFourthTest + "%");
        
        double percentageFifthTest = fifthTestMarksAcheived / fifthTestTotalMarks * 100;
        System.out.println("Test 1: " + percentageFifthTest + "%");
        
        System.out.println("");
        
        double averagePercentage = (percentageFirstTest + percentageSecondTest + percentageThirdTest + percentageFourthTest + percentageFifthTest) / 5;
        System.out.println("Average: " + averagePercentage + "%");
    }
    
}
