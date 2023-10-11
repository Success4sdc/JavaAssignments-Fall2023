import javax.swing.*;

public class NumberInput {
    public static void main(String[] args) {
        // 2. Declare the following variables for the input String, the integer to which it is converted, and the result:
        String inputString;
        int inputNumber;
        int result;

        // 3. Declare a constant that holds a multiplier factor. This program will multiply the user’s input by 10:
        final int FACTOR = 10;

        // 4. Enter the following input dialog box statement that stores the user keyboard input in the String variable inputString:
        inputString = JOptionPane.showInputDialog(null, "Enter a number");

        // 5. Use the following Integer.parseInt() method to convert the input String to an integer.
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;
        JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR + " = " + result);
    }
}
