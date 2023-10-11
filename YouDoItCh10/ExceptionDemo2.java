// Filename: ExceptionDemo2.java
// Written by: Sandi Cook
// Written on: September 25, 2023

/*
 * Purpose: This program demonstrates how to catch exceptions in Java.
 * Description: The program prompts the user to enter the numerator and denominator of a division operation. The program then tries to parse the user input into integers and divide the numerator by the denominator. If the user enters something other than a number, the program will catch an InputMismatchException and print a message to the user indicating that they entered the wrong data type. If the user enters a valid numerator and denominator, but the denominator is zero, the program will catch an ArithmeticException and print a message to the user indicating that division by zero is not allowed. If the user enters a non-numeric value for either the numerator or denominator, the program will catch a NumberFormatException and print a message to the user indicating that only digits are accepted. After the program has tried to divide the numerator by the denominator, it prints a message to the user indicating the result of the division operation.
 */

import javax.swing.*;

public class ExceptionDemo2
{
    public static void main(String[] args)
    {
        // Declare three integers and a String.
        int numerator = 0, denominator = 0, result;
        String inputString;

        // Try to divide the numerator by the denominator.
        try
        {
            // Prompt the user for two numbers.
            inputString = JOptionPane.showInputDialog(null, "Enter a number to be divided");
            numerator = Integer.parseInt(inputString);

            inputString = JOptionPane.showInputDialog(null, "Enter a number to divide into the first number");
            denominator = Integer.parseInt(inputString);

            // Divide the two numbers.
            result = numerator / denominator;
        }
        catch (ArithmeticException exception)
        {
            // If division by 0 is attempted, catch the exception and display an error message.
            JOptionPane.showMessageDialog(null, exception.getMessage());
            result = 0;
        }
        catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "This application accepts digits only!");
            numerator = 999;
            denominator = 999;
            result = 1;
        }

        // Display the result.
        JOptionPane.showMessageDialog(null, numerator + " / " + denominator + "\nResult is " + result);
    }
}
