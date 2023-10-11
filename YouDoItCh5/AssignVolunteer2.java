// Filename: AssignVolunteer2.java
// Author: Sandi Cook
// Date: September 6, 2023

/**
 * Purpose: Assign a volunteer based on the type of donation received.
 * This program streamlines the process of pricing items by directing them to the appropriate volunteer.
 * 
 * Description: 
 * - The program prompts the user to specify the type of donation (either clothing or other).
 * - Assigns the donation to a specific volunteer responsible for pricing that type of item.
 * - Displays the name of the assigned volunteer.
 */

import java.util.Scanner;

public class AssignVolunteer2
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
        String message;
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in); 
        
        // Prompt the user for the type of donation
        System.out.println("What type of donation is this?"); 
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else... "); 
        donationType = input.nextInt();
        
        // Determine the appropriate volunteer based on the donation type
        if(donationType == CLOTHING_CODE) 
        {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        }
        else 
        {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
        }
        
        // Display the donation type and assigned volunteer
        System.out.println("You entered " + donationType);
        System.out.println("This is a " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);

        // Close the Scanner object to prevent resource leaks
        input.close();
    }
}
