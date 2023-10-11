//Filename DinnerParty.java
//Written by Sandi Cook
//Written on September 19, 2023

/*
 * Purpose: Define the DinnerParty class, which extends the Party class
 * Description: This class represents a dinner party and extends the 
 * Party class. It includes methods to get and set the dinner menu choice.
 */

// Define the DinnerParty class, which extends the Party class
public class DinnerParty extends Party {

    // Declare a private integer variable to represent dinner menu choice
    private int dinnerChoice;

    // Constructor for the DinnerParty class (if needed)
    // public DinnerParty() {
    //     // You can initialize any specific properties for DinnerParty here
    // }

    // Method to get the dinnerChoice
    public int getDinnerChoice() {
        return dinnerChoice;
    }

    // Method to set the dinnerChoice
    public void setDinnerChoice(int choice) {
        dinnerChoice = choice;
    }

    // You can add more methods and properties specific to DinnerParty if needed

} // Closing curly brace for the DinnerParty class
