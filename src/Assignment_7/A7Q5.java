/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments_7;

/**
 *
 * @author Omar
 */
public class A7Q5 {

    //Create a method that will generate a random number of asterisks for the range entered.
    public static int chaotic(int x, int n, int a){
        //Set up a certain number of lines of asterisks based on user input
        int specifiedLines = x;
        int asteriskLines = 0;
        //Print out as many asterisk lines as specified above
        while(asteriskLines < specifiedLines){
            
            //Use Math.random to generate a random number of asterisks per line based on a range to choose from.
            randNum = (int)(Math.random()*(n - a + 1))+ a
            for(i = 0; i = randNum; i++){
                System.out.print("*")     
        }
            asteriskLines = asteriskLines + 1; 
    }
        return randNum; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Welcome the user and ask them to enter the number of lines they want to generate, and the range they want to work in.
        System.out.println("Hey there partner! Want to see some magic? I can produce lines of asterisks randomly!");
        System.out.print("You should tell me how many lines you want! : ");
        int specifiedLines = input.nextInt();
        
        System.out.print("Now give me the lowest number in the range you want: ");
        int lowestNum = input.nextInt();
        
        System.out.print("Finally, what is the highest number in the range? : ");
        int highestNum = input.nextInt();
        
        //Finally, call upon the chaotic method to generate the lines.
        chaotic(specifiedLines, highestNum, lowestNum);
    }
    
}
