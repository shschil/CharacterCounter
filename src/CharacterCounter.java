/**
 * Java program to print used different characters in a given string. It ignores special characters and digits.
 */

import java.util.Scanner; //Imports Scanner class to find user input.
import java.util.ArrayList;

public class CharacterCounter {
    public static void main (String [] args) {

        Scanner userInput = new Scanner (System.in);
        System.out.println("Please enter the string that you would like to examine:");

        //Read user input & confirm that it was read correctly.
        String inputString = userInput.nextLine();
        System.out.printf("The entered string was: %s%n", inputString);

        //ArrayList for holding the unique letters in the given string.
        ArrayList<Character> letterArray = new ArrayList<Character>();
        for (int i = 0; i < inputString.length(); i++) {
            //If the letter is not already in the array made for unique characters and it is NOT a space, add it.
            if (!letterArray.contains(inputString.charAt(i)) && Character.isLetter(inputString.charAt(i))) {
                letterArray.add(inputString.charAt(i));
            }
        }

        for (Character a : letterArray) {
            System.out.printf("%s ", Character.toUpperCase(a)); //Converts characters to uppercase for readability.
        }

        System.out.printf("\nThe number of unique characters in the string '%s' is %d.", inputString, letterArray.size());
    }
}
