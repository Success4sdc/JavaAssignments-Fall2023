//Filename PartyWithConstructor.java
//Written by Sandi Cook
//Written on September 19, 2023

/*
 * Purpose: Define a Java class named PartyWithConstructor
 * Description: This class represents a party and includes 
 * a constructor that displays a message when a PartyWithConstructor object is created.
 */
// Define a Java class named PartyWithConstructor
public class PartyWithConstructor {
    // Private data field to store the number of guests
    private int guests;

    // Constructor that displays a message
    public PartyWithConstructor() {
        System.out.println("Creating a Party");
    }

    // Method to get the number of guests
    public int getGuests() {
        return guests; // Return the value of the 'guests' data field
    }

    // Method to set the number of guests
    public void setGuests(int numGuests) {
        guests = numGuests; // Set the 'guests' data field to the provided value
    }

    // Method to display a party invitation
    public void displayInvitation() {
        System.out.println("Please come to my party!"); // Print an invitation message to the console
    }
}
