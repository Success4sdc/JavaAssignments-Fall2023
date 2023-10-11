// Filename: TwoDimensionalArrayDemo.java
// Written by Sandi Cook
// Written on: September 15, 2023
/*
Purpose: This Java program demonstrates the use of a two-dimensional array to count and display
user input values in a table. The program allows the user to input row and column values,
increments the selected position in the array, and displays the updated array until the user chooses to quit.
*/

import java.util.Scanner;

class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        // Declare a three-by-three array of integers.
        // By default, the elements will all be initialized to 0.
        int[][] count = new int[3][3];

        // Declare a Scanner object for input, variables to hold a row and column,
        // and a constant that can be used to indicate when the user wants to quit.
        Scanner input = new Scanner(System.in);
        int row, column;
        final int QUIT = 99;

        // Prompt the user to enter a row or the QUIT value to quit, and then accept the user’s input.
        System.out.print("Enter a row or " + QUIT + " to quit > ");
        row = input.nextInt();

        // In a loop that continues if the user has not entered the QUIT value, prompt the user for a column.
        while (row != QUIT) {
            System.out.print("Enter a column > ");
            column = input.nextInt();
            
            if (row < count.length && column < count[row].length) {
                // Add 1 to the element in the selected position.
                count[row][column]++;
                
                // Display each row and column of the newly incremented array.
                for (int r = 0; r < count.length; ++r) {
                    for (int c = 0; c < count[r].length; ++c)
                        System.out.print(count[r][c] + " ");
                    System.out.println();
                }
            } else {
                // Display an error message when the row or column value is too high.
                System.out.println("Invalid position selected");
            }
            
            // Prompt the user for the next row number.
            System.out.print("Enter a row or " + QUIT + " to quit > ");
            row = input.nextInt();
        }
    }
}
