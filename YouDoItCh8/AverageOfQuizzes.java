// AverageOfQuizzes.java
// Written by Sandra Cook
// Written on: September 15, 2023
/*
 * This Java program calculates the average of quiz scores entered by the user.
 * It allows the user to input quiz scores and then calculates and displays the average.
 * The user can input scores up to a maximum limit or choose to quit entering scores.
 */

import java.util.*;

// Calculate the average of quiz scores
public class AverageOfQuizzes {
    public static void main(String[] args) {
        int[] scores = new int[10];  // Array to store quiz scores
        int score = 0;              // Variable to store the current score
        int count = 0;              // Counter for the number of scores entered
        int total = 0;              // Total sum of scores
        final int QUIT = 999;       // Constant to quit input
        final int MAX = 10;         // Maximum number of scores
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quiz scores or " + QUIT + " to quit:");

        score = input.nextInt();
        while (score != QUIT) {
            scores[count] = score;  // Store the current score in the array
            total += scores[count]; // Add the score to the total
            ++count;                // Increment the count of scores entered
            
            if (count == MAX)
                score = QUIT;
            else {
                System.out.print("Enter next quiz score or " + QUIT + " to quit >> ");
                score = input.nextInt();
            }
        }

        System.out.println("\nThe scores entered were:");
        for (int x = 0; x < count; ++x) {
            System.out.print(scores[x] + " ");  // Display the entered scores
        }

        if (count != 0) {
            double average = (double) total / count; // Calculate the average
            System.out.println("\nThe average score is: " + average);
        } else {
            System.out.println("\nNo scores were entered.");
        }
    }
}
