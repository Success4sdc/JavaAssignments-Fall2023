// Filename: NumberInput.java
// Written by Sandi Cook
// Written on: [Date]

/*
Purpose: This program takes user input, multiplies it by a constant factor,
         and displays the result using JOptionPane dialogs.
*/
import javax.swing.*;

public class NumberInput {
    public static void main(String[] args) {
        //Declare the following variables for the input String, the integer to which it is converted, and the result:
        String inputString;
        int inputNumber;
        int result;

        //Declare a constant that holds a multiplier factor. This program will multiply the user’s input by 10:
        final int FACTOR = 10;

        //Enter the following input dialog box statement that stores the user keyboard input in the String variable inputString:
        inputString = JOptionPane.showInputDialog(null, "Enter a number");

        //Use the following Integer.parseInt() method to convert the input String to an integer.
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;
        JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR + " = " + result);
    }
}
