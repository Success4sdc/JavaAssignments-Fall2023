// Filename: DemoIncrement.java
// Written by: Sandi Cook
// Written on: September 10, 2023
/*
Purpose: 
This program demonstrates the difference between pre-increment (++v) and post-increment (v++). 
It initializes a variable 'v' with the value 4 and then applies both pre and post increment operations. 
The results of these operations are then printed to the console.
*/

import java.util.*;  // Importing the java utility package

public class DemoIncrement 
{
   public static void main(String[] args) 
   {
      int v = 4;  // Initialize variable 'v' with value 4
      
      int plusPlusV = ++v;  // Pre-increment: Increment the value of 'v' before assigning it to 'plusPlusV'
      v = 4;  // Reset the value of 'v' to 4
      
      int vPlusPlus = v++;  // Post-increment: Assign the value of 'v' to 'vPlusPlus' before incrementing 'v'
      
      // Print the results to the console
      System.out.println("v is " + v); 
      System.out.println("++v is " + plusPlusV); 
      System.out.println("v++ is " + vPlusPlus);
   }
}
