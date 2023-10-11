// Filename: CharacterInfo.java
// Written by Sandi Cook
// Written on: September 13, 2023
/*
Purpose: This Java program demonstrates character manipulation using the Character class.
*/
// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Define a class named 'CompareStrings'
public class CompareStrings {

    // Main method - the entry point of the program
    public static void main(String[] args) {
        
        // Declare and initialize a string variable with the value "Carmen"
        String aName = "Carmen";
        
        // Declare another string variable without initializing it
        String anotherName;
        
        // Create a new Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name > ");
        
        // Read the user's input and store it in the 'anotherName' variable
        anotherName = input.nextLine();
        
        // Check if the value of 'aName' is equal to the value of 'anotherName'
        if(aName.equals(anotherName)) {
            // If they are equal, this block will execute (currently empty)
        } else {
            // If they are not equal, print a message indicating the difference
            System.out.println(aName + " does not equal " + anotherName);
        }
    }
}
