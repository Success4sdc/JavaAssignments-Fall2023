// Filename: Sailboat.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Define the Sailboat class that extends the Vehicle class.
 * Description: This class represents a sailboat, extending the abstract Vehicle class.
 * It includes specific data fields for sailboat length and methods for setting and getting the length,
 * as well as overriding methods for setting the price and generating a description.
 */
import javax.swing.*;

public class Sailboat extends Vehicle 
{
    private int length; // Data field for the length of the sailboat

    // Constructor for Sailboat class that calls the parent's constructor and sets the length
    public Sailboat() 
    {
        super("wind", 0);
        setLength();
    }

    // Setter method for setting the length of the sailboat based on user input
    public void setLength() 
    {
        String entry;
        entry = JOptionPane.showInputDialog
         (null, "Enter sailboat length in feet ");
        length = Integer.parseInt(entry);
    }

    // Getter method for retrieving the length of the sailboat
    public int getLength() 
    {
        return length;
    }

    // Overridden method to set the price of the sailboat with a maximum limit
    @Override
    public void setPrice() 
    {
        String entry;
        final int MAX = 100000;
        entry = JOptionPane.showInputDialog
         (null, "Enter sailboat price ");
        price = Integer.parseInt(entry);
        if (price > MAX) 
        price = MAX;
    }

    // Overridden method to generate a description of the sailboat
    @Override
    public String toString() 
    {
        return ("The " + getLength() 
         + " foot sailboat is powered by " 
         + getPowerSource() + "; it has " 
         + getWheels() + " wheels and costs $" 
         + getPrice());
    }
}
