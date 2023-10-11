// Filename: AssignVolunteer3.java
// Author: Sandi Cook
// Date: September 6, 2023

/**
 * Purpose:
 * This program is designed to assign a volunteer based on the type of donation received.
 * It helps in streamlining the process of pricing items by directing them to the appropriate volunteer.
 * Additionally, it handles invalid donation types by providing appropriate feedback to the user.
 * 
 * Description:
 * - The program prompts the user to specify the type of donation (either clothing or other).
 * - Based on the user's input, it assigns the donation to a specific volunteer responsible for pricing that type of item.
 * - If the user enters an invalid donation type, the program informs the user of the error.
 * - The program then displays the donation type and the name of the assigned volunteer or an error message for invalid inputs.
 */

import java.util.Scanner;

public class AssignVolunteer3
{
    public static void main(String[] args) 
    {
        // Variable declarations
        int donationType; 
        String volunteer; 
        final int CLOTHING_CODE = 1; 
        final int OTHER_CODE = 2; 
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        String message;
        
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in); 
        
        // Prompt user for donation type
        System.out.println("What type of donation is this?"); 
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else... "); 
        donationType = input.nextInt();
        
        // Determine volunteer based on donation type
        if(donationType == CLOTHING_CODE) 
        {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        }
        else if(donationType == OTHER_CODE)
        {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
        }
        else
        {
            // Handle invalid donation type
            System.out.println("You entered an invalid code: " + donationType);
            System.out.println("This is an invalid donation type");
            System.out.println("The volunteer who will price this item is invalid");
            input.close();
            return;  
        }      
        
        // Display donation type and assigned volunteer
        System.out.println("You entered " + donationType);
        System.out.println("This is a " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);

        // Close the Scanner object to prevent resource leaks
        input.close();
    }
}
