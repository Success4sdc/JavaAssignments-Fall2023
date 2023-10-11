//Filename Party.java
//Written by Sandi Cook
//Written on September 19, 2023
/*
 * Purpose: Define a Java class named Party
 * Description: This class represents a party and includes 
 * methods to get the number of guests, set the number of guests, 
 * and display a party invitation.
 */

// Define a Java class named Party
public class Party 
{
    // Private data field to store the number of guests
    private int guests;

    // Method to get the number of guests
    public int getGuests() 
    {
        return guests; // Return the value of the 'guests' data field
    }

    // Method to set the number of guests
    public void setGuests(int numGuests) 
    {
        guests = numGuests; // Set the 'guests' data field to the provided value
    }

    // Method to display a party invitation
    public void displayInvitation() {
        System.out.println("Please come to my party!"); // Print an invitation message to the console
    }
}
   