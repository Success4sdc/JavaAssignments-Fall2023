//Filename: AssignVolunteer.java
//Written by: Sandi Cook
//Written on: September 6, 2023

/*Purpose:
*This program is designed to assign a volunteer based on the 
*type of donation received.
*It helps in streamlining the process of pricing items by 
*directing them to the appropriate volunteer.
*
*Description: 
*The program prompts the user to specify the type of donation 
*(either clothing or other).
*Based on the user's input, it assigns the donation to a specific 
*volunteer who is responsible for pricing that type of item.
*The program then displays the name of the assigned volunteer.
*/

import java.util.Scanner;

public class AssignVolunteer 
{
	public static void main(String[] args) 
   {
      // Declare variables
      int donationType; 
      String volunteer; 
      final int CLOTHING_CODE = 1; 
      final int OTHER_CODE = 2; 
      final String CLOTHING_PRICER = "Regina";
      final String OTHER_PRICER = "Marco";
      
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in); 
      
      // Prompt the user for the type of donation
      System.out.println("What type of donation is this?"); 
      System.out.print("Enter " + CLOTHING_CODE + 
         " for clothing, " + OTHER_CODE + " for anything else... "); 
      donationType = input.nextInt();
      
      // Assign the appropriate volunteer based on the donation type
      if(donationType == CLOTHING_CODE) 
         volunteer = CLOTHING_PRICER;
      else 
         volunteer = OTHER_PRICER;
      
      // Display the donation type and assigned volunteer
      System.out.println("You entered " + donationType); 
      System.out.println("The volunteer who will price this item is " + volunteer);

	   // Close the Scanner object
	   input.close();
   }
}
