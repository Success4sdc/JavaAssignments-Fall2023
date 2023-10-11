// Filename: UseDinnerParty.java
// Written by Sandi Cook
// Written on September 19, 2023

/*
 * Purpose: Define the UseDinnerParty class
 * Description: This class contains the main method to 
 * demonstrate the use of the Party and DinnerParty classes.
 * It prompts the user for the number of guests for both the Party
 * and DinnerParty, as well as the dinner choice for DinnerParty.
 */
 
import java.util.*;// Filename: UseDinnerParty.java
// Written by Sandi Cook
// Written on September 19, 2023

/*
 * Purpose: Define the UseDinnerParty class
 * Description: This class contains the main method to demonstrate the use of the Party and DinnerParty classes.
 * It prompts the user for the number of guests for both the Party and DinnerParty, as well as the dinner choice for DinnerParty.
 */// Define the UseDinnerParty class
public class UseDinnerParty 
{
    public static void main(String[] args) 
    {
        int guests; // Declare a variable to store the number of guests
        int choice; // Declare a variable to store the dinner choice
        Party aParty = new Party(); // Create a Party object
        DinnerParty aDinnerParty = new DinnerParty(); // Declare and create a DinnerParty object
        Scanner keyboard = new Scanner(System.in); // Create a Scanner object for input
        
        // Prompt the user for a number of guests for the Party and accept the value from the keyboard
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        
        // Set the number of guests in the Party object
        aParty.setGuests(guests);
        
        // Display the number of guests in the Party object
        System.out.println("The party has " + aParty.getGuests() + " guests");
        
        // Display the party invitation for the Party
        aParty.displayInvitation();
        
                
        // Prompt the user for a number of guests for the DinnerParty and accept the value
        System.out.print("Enter number of guests for the dinner party >> ");
        guests = keyboard.nextInt();
        
        // Set the number of guests in the DinnerParty object
        aDinnerParty.setGuests(guests);
        
        // Prompt the user for a dinner choice
        System.out.print("Enter the menu option -- 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        
        // Set the dinner choice for the DinnerParty object
        aDinnerParty.setDinnerChoice(choice);
        
        // Display the number of guests for the DinnerParty
        System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");
        
        // Display the dinner choice for the DinnerParty
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");
        
        // Call the displayInvitation() method for the DinnerParty
        aDinnerParty.displayInvitation();
        
        // Close the main() method
    }
    
    // Close the UseDinnerParty class
}
