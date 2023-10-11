// Filename: CalculatorDemo.java
// Written by: Sandi Cook
// Written on: October 2, 2023

/*
 * Purpose: This program asks a user to complete a simple arithmetic problem and displays the Windows calculator to help the user.
 */

import java.util.Scanner;
import java.io.IOException;

public class CalculatorDemo 
{
    public static void main(String[] args) throws IOException, InterruptedException 
    {
        Scanner input = new Scanner(System.in);
        Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\calc.exe");

        double num1 = 279.6;
        double num2 = 872.8;
        double answer = num1 + num2;
        double usersAnswer;

        System.out.print("What is the sum of " + num1 + " and " + num2 + "? >> ");
        usersAnswer = input.nextDouble();

        // Display an appropriate message to the user.
        if (usersAnswer == answer) 
        {
            System.out.println("Correct!");
        } 
        else 
        {
            System.out.println("Sorry - the answer is " + answer);
        }

        // Close the calculator program.
        try 
        {
            proc.waitFor();
        } 
        catch (InterruptedException e) 
        {
            System.out.println("The calculator process was interrupted.");
        }
    }
}
