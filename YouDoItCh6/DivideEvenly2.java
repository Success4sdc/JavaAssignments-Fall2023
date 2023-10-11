// Filename: DivideEvenly2.java
// Written by: Sandi Cook
// Written on: September 10, 2023

/*
Purpose: 
This program determines and displays the numbers that evenly divide each number up to 100.
For each number from 1 to 100, it uses a nested for loop to iterate through potential divisors and checks if they are actual divisors of the number.
*/

public class DivideEvenly2 
{
   public static void main(String[] args) 
   {
      final int LIMIT = 100;  // Define the upper limit for checking numbers and their divisors
      int var;  // Variable to iterate through potential divisors for each number
      int number;  // Variable to iterate through numbers from 1 to LIMIT
      
      // Outer loop: Iterate through numbers from 1 to LIMIT
      for(number = 1; number <= LIMIT; ++number) 
      {
         // Display the initial part of the output message for each number
         System.out.print(number + " is evenly divisible by "); 
         
         // Inner loop: Check divisors for the current number
         for(var = 1; var <= number; ++var) 
         {
            // If the current number is divisible by var, print var
            if(number % var == 0)
               System.out.print(var + " "); 
         }
         
         // Move to the next line after printing all divisors for the current number
         System.out.println();
      }     
   }
}
