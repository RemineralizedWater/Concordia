// -------------------------------------------------------
// Assignment 1
// Written by: Michael Rowe 2601267
// For COMP 248 Section EE – Fall 2017
// -------------------------------------------------------

//**********************************************************************************
//Completed: 2017/09/21
//This program illustrates text output to console, java.util.Scanner for user input,
//and usage of 'do-while' and 'if' statements to ensure variable entered in range
//
//Key Points: 
//	1) Import Scanner to allow text input by user
//	2) Welcome message
//	3) Create & initialize Scanner object & 7 variables
//	4) Message asking for & user input of first 3 variables
//	5) Do-while loop that asks for user input, gets it, & checks to ensure it falls
//	within required range. If so it exits loop, if not displays message and loops.
//	6) Message asking for & user input of last 3 variables
//	7) Close Scanner object to prevent memory leak
//	8) Outputs generated email with 7 variables filled in to appropriate places
//	9) Closing message
//**********************************************************************************

//Scanner class needed for text input by user
import java.util.Scanner;

//Class for Question 2
public class a1q2_26101267 {
	
	//Main method for Question 2
	public static void main(String[] args) {

		//Welcome message
		System.out.println("----------------------------------------------------");
		System.out.println("   Welcome to Michael's Homework Excuse Generator");
		System.out.println("----------------------------------------------------");

		//Creates Scanner object to allow text input by user
		Scanner keyboard = new Scanner(System.in);

		//Creates & initializes 7 variables to be used to store text entry, 6 Strings and 1 double
		String instructorName = "", studentName = "", food = "";
		double fever = 0.0;
		String adjective = "", colour = "", animal = "";

		//Prompts with asking for user input, then gets user input. Repeats for next 2 String variables
		System.out.print("\nWhat is your teacher's first or last name? ");
		instructorName = keyboard.next();
		System.out.print("What is your name? ");
		studentName = keyboard.next();
		System.out.print("Enter a food: ");
		food = keyboard.next();
		
		//Prompts by asking for user input, then runs once to allow input of double 'fever'.
		//Exits loop if 'fever' is in correct range. If 'fever' isn't in correct range, 
		//displays message to alert user of incorrect entry value for 'fever', & then loops.
		do {
			System.out.print("Enter the amount of fever (between 37.0 and 40.0): ");
			fever = keyboard.nextDouble();
			if (fever < 37.0 || fever > 40.0) {
				System.out.println("That number is not between 37.0 and 40.0. Please enter a valid number.");
			}
		} while (fever < 37.0 || fever > 40.0);

		//Prompts with asking for user input, then gets user input. Repeats for last 2 String variables
		System.out.print("Enter an animal: ");
		animal = keyboard.next();
		System.out.print("Enter an adjective that will describe your pet: ");
		adjective = keyboard.next();
		System.out.print("Enter a colour: ");
		colour = keyboard.next();
		
		//Closes Scanner object 'keyboard' to prevent possible memory leak
		keyboard.close();
		
		//Following text outputs formatted email, with String variables 'instructorName', 'studentName', 
		//'food', 'animal', 'adjective', & 'colour', and double variable 'fever' included in appropriate places
		System.out.println("\n\nDear professor " + instructorName + ",\n\nI am sorry that I am unable to turn in my computer assignment at this time. First,\nI ate a rotten " + food + ", which made me turn " + colour + " and extremely ill. I came down\nwith a fever of " + fever + ". Next my " + adjective + " pet " + animal + " must have smelled the\nremains of the " + food + " on my USB key (which is where my program was stored)\nbecause he ate it.\nI am currently rewriting my programs and hope you will accept my assignment late.\n\nSincerely,\n" + studentName);
		
		//Closing message so that user knows that program has terminated
		System.out.println("\n\nThank you for using Michael's Homework Excuse Generator!");
	} //End of main method

} //End of a1q2_26101267 class
