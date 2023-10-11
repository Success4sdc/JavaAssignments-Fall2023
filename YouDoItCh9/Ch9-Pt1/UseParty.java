//Filename UseParty.java
//Written by Sandi Cook
//Written on September 19, 2023

/*
 * Purpose: Define the Party class
 * Description: This class contains the main method to 
 * demonstrate the use of the Party class by getting the number of guests, 
 * setting the number of guests, and displaying a party invitation.
 */

import java.util.*;

// Define the Party class
public class UseParty 
{
    public static void main(String[] args) 
    {
        int guests; // Declare a variable to store the number of guests
        int choice;
        Party aParty = new Party(); // Create a Party object
        Scanner keyboard = new Scanner(System.in); // Create a Scanner object for input
        
        // Prompt the user for a number of guests and accept the value from the keyboard
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        
        // Set the number of guests in the Party object
        aParty.setGuests(guests);
        
        // Display the number of guests in the Party object
        System.out.println("The party has " + aParty.getGuests() + " guests");
        
        // Display the party invitation
        aParty.displayInvitation();
        
        // Close the main() method
    }
    
    // Close the UseParty class
}

