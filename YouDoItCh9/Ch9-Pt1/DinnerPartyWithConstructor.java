//Filename DinnerPartyWithConstructor.java
//Written by Sandi Cook
//Written on September 19, 2023

/*
 * Purpose: Define a Java class named DinnerPartyWithConstructor
 * Description: This class represents a dinner party and extends
 * the PartyWithConstructor class. It includes a constructor that
 * displays a message when a DinnerPartyWithConstructor object is created.
 */

// Define a Java class named DinnerPartyWithConstructor
public class DinnerPartyWithConstructor extends PartyWithConstructor 
{
    // Private data field to store the number of dinner guests
    private int dinnerGuests;

    // Constructor for DinnerPartyWithConstructor
    public DinnerPartyWithConstructor() 
    {
        System.out.println("Creating a Dinner Party");
    }

    // Method to get the number of dinner guests
    public int getDinnerGuests() 
    {
        return dinnerGuests; // Return the value of the 'dinnerGuests' data field
    }

    // Method to set the number of dinner guests
    public void setDinnerGuests(int numDinnerGuests) 
    {
        dinnerGuests = numDinnerGuests; // Set the 'dinnerGuests' data field to the provided value
    }

    // Method to display a dinner party invitation
    public void displayDinnerInvitation() 
    {
        System.out.println("Please come to my dinner party!"); // Print a dinner invitation message to the console
    }
}
