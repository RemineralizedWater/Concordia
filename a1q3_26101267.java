// -------------------------------------------------------
// Assignment 1
// Written by: Michael Rowe 2601267
// For COMP 248 Section EE – Fall 2017
// -------------------------------------------------------

//***********************************************************************************
//Completed: 2017/09/21
//This program illustrates text output to console, java.util.Scanner for user input, 
//and String methods .length(), .charAt(), & .substring()
//
//Key Points: 
//	1) Import Scanner to allow text input by user
//	2) Welcome message
//	3) Create & initialize Scanner object & 2 variables
//	4) Message asking for & user input of 2 variables
//	5) Close Scanner object to prevent memory leak
//	6) Message with 2 variables, along with their length, and first & last characters
//	7) Create & initialize 2 new variables
//	8) Swaps first & last characters in first variable with first & last characters
//	in second variable, and stores those changes in 2 new variables
//	9) Displays 2 new variables
//	10) Closing message
//***********************************************************************************

//Scanner class needed for text input by user
import java.util.Scanner;

//Class for Question 3
public class a1q3_26101267 {
	
	//Main method for Question 3
	public static void main(String[] args) {

		//Welcome message
		System.out.println("---------------------------------");
		System.out.println("     Michael's Text Swapper");
		System.out.println("---------------------------------");
		
		//Creates Scanner object to allow text input by user
		Scanner keyboard = new Scanner(System.in);
		
		//Creates & initializes 2 String variables to be used to store text entry
		String firstWord = "";
		String secondWord = "";

		//Prompts with asking for user input of two words separated by space, then gets user input of both words
		System.out.println("\nEnter 2 words on one line separated by at least one space (no white space allowed IN each word):");
		firstWord = keyboard.next();
		secondWord = keyboard.next();

		//Closes Scanner object 'keyboard' to prevent possible memory leak
		keyboard.close();

		//Displays message with first word, it's length, and it's first & last characters
		System.out.println("\nFirst word you entered is <" + firstWord + "> which is " + firstWord.length() + " characters long.");
		System.out.println("It starts with the character '" + firstWord.charAt(0) + "' and ends with the character '" + firstWord.charAt(firstWord.length()-1) + "'");

		//Displays message with second word, it's length, and it's first & last characters
		System.out.println("\nSecond word you entered is <" + secondWord + "> which is " + secondWord.length() + " characters long.");
		System.out.println("It starts with the character '" + secondWord.charAt(0) + "' and ends with the character '" + secondWord.charAt(secondWord.length()-1) + "'");

		//Creates & initializes 2 new String variables to be used to store modifications to variables 'firstWord' & 'secondWord'
		String newFirstWord = "";
		String newSecondWord = "";
		
		//Swaps first & last characters in 'firstWord' with first & last characters in 'secondWord',
		// and stores those changes in 'newFirstWord' & 'newSecondWord' respectively
		newFirstWord = secondWord.charAt(0) + firstWord.substring(1, firstWord.length()-1) + secondWord.charAt(secondWord.length()-1);
		newSecondWord = firstWord.charAt(0) + secondWord.substring(1, secondWord.length()-1) + firstWord.charAt(firstWord.length()-1);
		
		//Outputs newly-created words in the 2 new String variables
		System.out.println("\nNew words: " + newFirstWord + " " + newSecondWord);

		//Closing message so that user knows that program has terminated
		System.out.println("\n\nThank you for using Michael's Text Swapper!");
	} //End of main method

} //End of a1q3_26101267 class
