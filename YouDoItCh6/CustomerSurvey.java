//Filename: CustomerSurvey.java
//Written by: Sandi Cook
//Written on: September 10, 2023

/*
Purpose: 
This program collects customer satisfaction ratings for a service. 
Users are prompted to provide a rating between a specified range (MIN to MAX).
If the user provides an invalid rating, they are asked to try again until a valid rating is given.
*/

import java.util.*; 

public class CustomerSurvey 
{
   public static void main (String args[]) 
   {
      // Declare and initialize rating variable and constants for minimum and maximum valid ratings
      int rating; 
      final int MIN = 1; 
      final int MAX = 5;

      // Use try-with-resources to ensure the Scanner object is closed after use
      try (Scanner input = new Scanner(System.in)) 
      {
         // Prompt the user for their satisfaction rating
         System.out.println("Please enter a value that"); 
         System.out.println("represents your satisfaction with"); 
         System.out.println("our service."); 
         System.out.println("enter a value between " + MIN); 
         System.out.println("and " + MAX);
         System.out.println("with " + MAX + " meaning highly"); 
         System.out.println("satisfied and"); 
         System.out.println(MIN + " meaning not at all satisfied."); 
         System.out.print("enter your rating >> ");
   
         // Read the user's rating
         rating = input.nextInt();
   
         // Check if the rating is outside the valid range and prompt the user to try again if necessary
         while(rating < MIN || rating > MAX) 
         {
            System.out.println("You must enter a value"); 
            System.out.println("between " + MIN + " and " + MAX);
            System.out.print("Please try again >> "); 
            rating = input.nextInt();
         }
      
         // Thank the user for their input
         System.out.println("Thank you."); 
      }
   }
}
