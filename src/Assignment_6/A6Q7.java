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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter in a number n: ");
        int n = input.nextInt();

       boolean range[] = new boolean[n +1];
     
       for(int i=0;i<range.length;i++)
            range[i] = true;
        for(int p = 2; p*p <=n; p++)
        {
            if(range[p] == true)
            {
                for(int i = p*2; i <= n; i += p)
                    range[i] = false;
            }
        }
         
        for(int i = 2; i <= n; i++)
        {
            if(range[i] == true)
                System.out.print(i + " ");
        }
    }
}
