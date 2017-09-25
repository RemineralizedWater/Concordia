// -------------------------------------------------------
// Assignment 1
// Written by: Michael Rowe 2601267
// For COMP 248 Section EE – Fall 2017
// -------------------------------------------------------

//***************************************************************
//Completed: 2017/09/21
//This program illustrates how escape characters display 
//when outputting text to the console
//
//Key Points: 
//	1) Welcome message
//	2) Snowflake pattern to demonstrate the escape character '\\'
//	3) Pattern complete message
//	4) Closing message
//***************************************************************

//Class for Question 1
public class a1q1_26101267 {
	
	//Main method for Question 1
	public static void main(String[] args) {
		
		//Welcome message
		System.out.println("--------------------------------------------");
		System.out.println("   Welcome to Michael's Snowflake Program");
		System.out.println("--------------------------------------------\n");
		
		//Following 6 lines of code print snowflake pattern, which uses '\' character, 
		//so therefore requires using '\\' escape character to output it
		System.out.println("  \\/");
		System.out.println(" \\\\//");
		System.out.println("\\\\\\///");
		System.out.println("///\\\\\\");
		System.out.println(" //\\\\");
		System.out.println("  /\\");
		
		//Pattern complete message
		System.out.println("\nAll done!");

		//Closing message so that user knows that program has terminated
		System.out.println("\n\nThis concludes my snowflake demonstration.");
	} //End of main method

} //End of a1q1_26101267 class
