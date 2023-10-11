// Filename: AssignVolunteer4.java
// Author: Sandi Cook
// Date: September 6, 2023

/**
 * Purpose:
 * The AssignVolunteer4 program efficiently assigns a volunteer to price a donation based on its type.
 * 
 * Description:
 * The program prompts the user to input the type of donation they have (clothing, furniture, electronics, or other).
 * Depending on the user's input, the program assigns the donation to a specific volunteer who specializes in pricing that particular type of item.
 * If the user provides an invalid donation type, the program alerts the user about the error.
 * Finally, the program displays the type of donation and the name of the assigned volunteer.
 */

import java.util.Scanner;

public class AssignVolunteer4
{
    public static void main(String[] args) 
    {
        // Declare variables for donation type, volunteer name, and donation message
        int donationType; 
        String volunteer; 
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3; 
        final int OTHER_CODE = 4; 
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        final String FURNITURE_PRICER = "Wei";
        final String ELECTRONICS_PRICER = "Lydia";
        String message;
        
        // Initialize a Scanner object to capture user input
        Scanner input = new Scanner(System.in); 
        
        // Prompt the user to enter the donation type
        System.out.println("Enter an integer representing the donation type: "); 
        donationType = input.nextInt();
        
        // Use a switch-case structure to determine the appropriate volunteer for the donation type
        switch(donationType) 
        {
            case CLOTHING_CODE: 
                volunteer = CLOTHING_PRICER; 
                message = "a clothing donation"; 
                break;
            case FURNITURE_CODE: 
                volunteer = FURNITURE_PRICER; 
                message = "a furniture donation"; 
                break;
            case ELECTRONICS_CODE: 
                volunteer = ELECTRONICS_PRICER; 
                message = "an electronics donation"; 
                break;
            case OTHER_CODE: 
                volunteer = OTHER_PRICER; 
                message = "another donation type"; 
                break;
            default: 
                volunteer = "invalid"; 
                message = "an invalid donation type"; 
                break;
        }
        
        // Display the results: donation type, donation message, and assigned volunteer
        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);

        // Close the Scanner object to free up resources
        input.close();
    }
}
