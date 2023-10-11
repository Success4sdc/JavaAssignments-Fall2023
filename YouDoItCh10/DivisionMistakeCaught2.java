// Filename: DivisionMistakeCaught2.java
// Written by: Sandi Cook
// Written on: September 25, 2023

/*
 * Purpose: This program demonstrates how to catch and handle an ArithmeticException.
 * Description: The program prompts the user to enter a numerator and denominator.
 * If the denominator is 0, the program throws an ArithmeticException.
 * Otherwise, the program divides the numerator by the denominator and prints the result.
 */

import java.util.Scanner;

public class DivisionMistakeCaught2 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int numerator, denominator, result;

    // Prompt the user to enter a numerator and denominator.
    System.out.print("Enter numerator >> ");
    numerator = input.nextInt();

    System.out.print("Enter denominator >> ");
    denominator = input.nextInt();

    // Try to divide the numerator by the denominator.
    try 
    {
      result = numerator / denominator;

      // If the division is successful, print the result.
      System.out.println(numerator + " / " + denominator + " = " + result);
    }
    catch (ArithmeticException mistake) 
    {
      // If the denominator is 0, catch the ArithmeticException and print the message.
      System.out.println(mistake.getMessage());
    }

    // Print a message to indicate the end of the program.
    System.out.println("End of program");
  }
}
