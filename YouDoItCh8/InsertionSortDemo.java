// Filename: InsertionSortDemo.java
// Written by Sandi Cook
// Written on: September 15, 2023
/*
Purpose: This Java program demonstrates the Insertion Sort algorithm to sort an array of integers.
It prompts the user for input, performs the sorting, and displays the sorted array at each iteration.
*/

import java.util.*;

class InsertionSortDemo {
    public static void main(String[] args) {
        // Declare an array to store integers
        int[] someNums = new int[5];
        
        // Create a Scanner object to read user input
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;

        // Prompt user for input
        for (a = 0; a < someNums.length; ++a) {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        // Display initial array
        display(someNums, 0);

        // Insertion Sort algorithm substituted for Bubble Sort algorithm
        a = 1;
        while (a < someNums.length) {
            temp = someNums[a];
            b = a - 1;
            while (b >= 0 && someNums[b] > temp) {
                someNums[b + 1] = someNums[b];
                --b;
            }
            someNums[b + 1] = temp;
            display(someNums, a);
            ++a;
        }
    }

    // Method to display the current state of the array
    public static void display(int[] someNums, int a) {
        System.out.print("Iteration " + a + ": ");
        for (int x = 0; x < someNums.length; ++x) {
            System.out.print(someNums[x] + " ");
        }
        System.out.println();
    }
}
