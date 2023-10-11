// Filename: DinnerPartyWithConstructor2.java
// Written by Sandi Cook
// Written on September 19, 2023

/*
 * Purpose: Define a Java class named DinnerPartyWithConstructor2
 * Description: This class represents a dinner party and extends
 * the PartyWithConstructor2 class. It includes a constructor that sets
 * the number of guests and methods to get and set the dinner choice.
 */
 
// Define a Java class named DinnerPartyWithConstructor2
public class DinnerPartyWithConstructor2 extends PartyWithConstructor2 
{
    // Private data field to store the choice of dinner
    private String dinnerChoice;

    // Constructor for DinnerPartyWithConstructor2
    public DinnerPartyWithConstructor2(int numGuests) 
    {
        super(numGuests); // Call the superclass constructor to set the number of guests
    }

    // Method to set the dinner choice
    public void setDinnerChoice(String choice) 
    {
        dinnerChoice = choice;
    }

    // Method to get the dinner choice
    public String getDinnerChoice() 
    {
        return dinnerChoice;
    }

    // Method to display a dinner party invitation
    public void displayDinnerInvitation() 
    {
        System.out.println("Please come to my dinner party!"); // Print a dinner invitation message to the console
    }
}
