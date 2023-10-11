// Filename: BubbleSortDemo.java
// Written by Sandi Cook
// Written on: 2023-09-16

/*
Purpose: This Java program demonstrates the Bubble Sort algorithm to sort an array of integers.
It prompts the user for input, performs the sorting, and displays the sorted array at each iteration.
*/

import java.util.*;

class BubbleSortDemo {
    public static void main(String[] args) {
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length - 1;
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;

        // Prompt user for input
        for (a = 0; a < someNums.length; ++a) 
        {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        // Display initial array
        display(someNums, 0);

        // Bubble Sort algorithm
        for (a = 0; a < someNums.length - 1; ++a) 
        {
            for (b = 0; b < comparisonsToMake; ++b) 
            {
                if (someNums[b] > someNums[b + 1]) 
                {
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
            }
            display(someNums, (a + 1));
            --comparisonsToMake;
        }
    }

    public static void display(int[] someNums, int a) 
    {
        System.out.print("Iteration " + a + ": ");
        for (int x = 0; x < someNums.length; ++x) 
        System.out.print(someNums[x] + " ");
        System.out.println();
    }
}
