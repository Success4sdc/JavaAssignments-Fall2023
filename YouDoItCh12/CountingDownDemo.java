/**
 * Filename: CountingDownDemo.java
 * Written by Sandi Cook
 * Written on October 4, 2023
 *
 * Purpose: Demonstrates a recursive countdown method.
 *
 * Description: This program defines a recursive method called countingDown() that counts
 * down from an initial value to 1, displaying each value along the way. It then displays "Blastoff!"
 * when the countdown reaches 1.
 */
public class CountingDownDemo 
{
    public static void main(String[] args) 
    {
     // Call the countingDown() method with an initial value of 10
     countingDown(10);
     
     // Display "Blastoff!"
     System.out.println("Blastoff!");
    }

    /**
     * Recursively counts down from the given value to 1 and displays each value.
     * @param count The initial value to start the countdown.
     */
    public static void countingDown(int count) 
    {
        // Check if the count is greater than 0
        if (count > 0) 
        {
            // Display the current count
            System.out.println(count);

            // Call countingDown() recursively with a count value one less than the current count
            countingDown(count - 1);
        }
    }
}
