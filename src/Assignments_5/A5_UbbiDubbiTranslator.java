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

        //Continually repeat the translation process
        while (true) {

            Scanner input = new Scanner(System.in);

            //Prompt the user to enter in a sentence or word 
            System.out.println("Enter in a sentence or word in regular English:");
            String wordOrSentence = input.nextLine();

            //Change the case of all letters in the word for ease of translation
            wordOrSentence = wordOrSentence.toLowerCase();

            String translatedWord = wordOrSentence;

            //Check every single letter position of the word or sentence to search for vowels.
            for (int letterPosition = 0; letterPosition < translatedWord.length(); letterPosition++) {

                if (translatedWord.charAt(letterPosition) == 'a'
                        || translatedWord.charAt(letterPosition) == 'e'
                        || translatedWord.charAt(letterPosition) == 'i'
                        || translatedWord.charAt(letterPosition) == 'o'
                        || translatedWord.charAt(letterPosition) == 'u') {

                    //Break up the word into two parts, one before the vowel and one including the vowel and continuing to the end of the sentence/word.
                    String startOfWordOrSentence = translatedWord.substring(0, letterPosition);
                    String endOfWordOrSentence = translatedWord.substring(letterPosition);

                    //Create the translated word by adding ub between the segments (this adds ub in front of the vowel).
                    translatedWord = startOfWordOrSentence + "ub" + endOfWordOrSentence;

                    //After adding ub before the vowel, move three characters forward to continue checking the next letter in the word/sentence.
                    letterPosition = letterPosition + 2;

                }

            }
            System.out.println(translatedWord);
        }
    }
}
