/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments_5;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class A5_UbbiDubbiTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter in a sentence in regular English.");
        String wordOrSentence = input.nextLine();

        wordOrSentence = wordOrSentence + "   ";

        int length = 1;
       
        String t = wordOrSentence;
        while (length < t.length()) {
            String s = t.substring(0, length);
            String e = t.substring(length + 1);
            t = s + e;
            while (t.charAt(length) == 'u' || t.charAt(length) == 'e' || t.charAt(length) == 'a' || t.charAt(length) == 'i' || t.charAt(length) == 'o' || t.charAt(length) == 'U' || t.charAt(length) == 'A' || t.charAt(length) == 'E' || t.charAt(length) == 'I' || t.charAt(length) == 'O') {
                if (t.charAt(length) == 'u') {
                    t = s + "ub" + e;
                }
                if (t.charAt(length) == 'a') {
                    t = s + "ub" + e;
                }

                if (t.charAt(length) == 'e') {
                    t = s + "ub" + e;
                }

                if (t.charAt(length) == 'i') {
                    t = s + "ub" + e;
                }

                if (t.charAt(length) == 'o') {
                    t = s + "ub" + e;
                }

                if (t.charAt(length) == 'U') {
                    t = s + "UB" + e;
                }

                if (t.charAt(length) == 'A') {
                    t = s + "UB" + e;
                }

                if (t.charAt(length) == 'E') {
                    t = s + "UB" + e;
                }

                if (t.charAt(length) == 'I') {
                    t = s + "UB" + e;
                }

                if (t.charAt(length) == 'O') {
                    t = s + "UB" + e;
                }
                length = length + 3;
                if (length > t.length()) {
                    length = length - 3;
                }
            }
            length = length + 1;
        
            if(length == t.length()){
            System.out.println(t);
            }
        }
        
    }

}
