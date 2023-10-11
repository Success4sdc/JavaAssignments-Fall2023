// Filename: DivideEvenly.java
// Written by: Sandi Cook
// Written on: September 10, 2023

/*
Purpose: 
This program determines and displays all the numbers up to 100 that evenly divide 100.
It uses a for loop to iterate through numbers from 1 to 100 and checks if each number is a divisor of 100.
*/

public class DivideEvenly 
{
   public static void main(String[] args) 
   {
      final int LIMIT = 100;  // Define the upper limit for checking divisors
      int var;  // Variable to iterate through numbers from 1 to LIMIT
      
      // Display the initial part of the output message
      System.out.print(LIMIT + " is evenly divisible by ");
      
      // Loop through numbers from 1 to LIMIT
      for(var = 1; var <= LIMIT; ++var) 
      {
         // Check if the current number is a divisor of LIMIT
         if(LIMIT % var == 0)
            System.out.print(var + " ");  // Print the divisor
      }
      
      // Move to the next line after printing all divisors
      System.out.println();
   }     
}
