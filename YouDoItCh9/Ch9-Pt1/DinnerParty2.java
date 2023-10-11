// Filename: DinnerParty2.java
// Written by Sandi Cook
// Written on September 19, 2023

/*
 * Purpose: Define the DinnerParty2 class, which extends the Party class
 * Description: This class represents a dinner party
 * (DinnerParty2) and extends the Party class. It includes methods to
 * get and set the dinner menu choice and overrides the displayInvitation() method.
 */

// Define the DinnerParty2 class, which extends the Party class
public class DinnerParty2 extends Party 
{

    // Declare a private integer variable to represent dinner menu choice
    private int dinnerChoice;

    // Constructor for the DinnerParty2 class (if needed)
    // public DinnerParty2() {
    //     // You can initialize any specific properties for DinnerParty2 here
    // }

    // Method to get the dinnerChoice
    public int getDinnerChoice() {
        return dinnerChoice;
    }

    // Method to set the dinnerChoice
    public void setDinnerChoice(int choice) {
        dinnerChoice = choice;
    }

    // Override the displayInvitation() method from the parent class
    @Override
    public void displayInvitation() {
        System.out.println("Please come to my dinner party!");
    }

    // You can add more methods and properties specific to DinnerParty2 if needed

} // Closing curly brace for the DinnerParty2 class
