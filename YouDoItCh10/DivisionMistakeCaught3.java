// Filename DivisionMistakeCaught3.java
// Written by Sandi Cook
// Written on October 3, 2023

/*
 * Purpose: To prevent division by zero and handle invalid user input.
 * Description: Prompts the user to enter a numerator and denominator, then divides the numerator by the denominator. If the denominator is zero, the program catches the ArithmeticException and prints a message to the console. If the user enters an invalid data type, the program catches the InputMismatchException and prints a message to the console.
 */
import java.util.*; // Imports the Scanner class

public class DivisionMistakeCaught3 
{
  // Declares a class called DivisionMistakeCaught3

  public static void main(String[] args) 
  {                                                      
    // Declares a main method

    Scanner input = new Scanner(System.in); // Creates a Scanner object to read user input

    int numerator, denominator, result; // Declares variables to store the numerator, denominator, and result of the division operation

    try 
    {
      // Starts a try block

      System.out.print("Enter numerator >> "); // Prompts the user to enter the numerator
      numerator = input.nextInt(); // Parses the user input into an integer and stores it in the numerator variable

      System.out.print("Enter denominator >> "); // Prompts the user to enter the denominator
      denominator = input.nextInt(); // Parses the user input into an integer and stores it in the denominator variable

      result = numerator / denominator; // Divides the numerator by the denominator and stores the result in the result variable
      System.out.println(numerator + " / " + denominator + " = " + result); // Prints the result of the division operation to the console
   } 
   catch(ArithmeticException mistake) 
   {
      System.out.println(mistake.getMessage());
   }
   catch(InputMismatchException mistake) 
   {
      System.out.println("Wrong data type"); 
   } 
      System.out.println("End of program"); 
   } 
} 