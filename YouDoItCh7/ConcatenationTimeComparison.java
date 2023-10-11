// Filename: ConcatenationTimeComparison.java
// Written by: Sandi Cook
// Written on: [Enter Date Here]

/*
Purpose: 
This program compares the time taken to append a string to two different StringBuilders:
1. An empty StringBuilder.
2. A StringBuilder initialized with a specific capacity.
*/

import java.time.*;

public class ConcatenationTimeComparison {
    public static void main(String[] args) {
        // Declare variables for start and end times
        long startTime, endTime;
        
        // Constants for the number of times the loop will run and the factor for time conversion
        final int TIMES = 200_000;
        final int FACTOR = 1_000_000;
        
        // Loop counter
        int x;

        // Create an empty StringBuilder
        StringBuilder string1 = new StringBuilder("");
        
        // Create a StringBuilder initialized with a specific capacity
        StringBuilder string2 = new StringBuilder(TIMES * 4);
        
        // Get the current time and set it as the start time
        LocalDateTime now = LocalDateTime.now();
        startTime = now.getNano();
        
        // Append "Java" to the empty StringBuilder multiple times
        for(x = 0; x < TIMES; ++x) {
            string1.append("Java");
        }
        
        // Get the current time and set it as the end time
        now = LocalDateTime.now();
        endTime = now.getNano();
        
        // Print the time taken for appending to the empty StringBuilder
        System.out.println("Time with empty StringBuilder: " + ((endTime - startTime) / FACTOR) + " milliseconds");
        
        // Get the current time and set it as the start time
        now = LocalDateTime.now();
        startTime = now.getNano();
        
        // Append "Java" to the initialized StringBuilder multiple times
        for(x = 0; x < TIMES; ++x) {
            string2.append("Java");
        }
        
        // Get the current time and set it as the end time
        now = LocalDateTime.now();
        endTime = now.getNano();
        
        // Print the time taken for appending to the initialized StringBuilder
        System.out.println("Time with initialized StringBuilder: " + ((endTime - startTime) / FACTOR) + " milliseconds");
    }
}
