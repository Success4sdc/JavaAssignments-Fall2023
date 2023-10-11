// Filename: Bicycle.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Define the Bicycle class that extends the Vehicle class.
 * Description: This class represents a bicycle, extending the abstract Vehicle class.
 * It includes specific methods for setting the power source, wheels, price, and generating a description.
 */

import javax.swing.*;

public class Bicycle extends Vehicle 
{
    // Constructor for Bicycle class that calls
    // the parent's constructor with default values
    public Bicycle() 
    {
        super("a person", 2);
    }

    // Override the setPrice() method to set the bicycle's 
    //price with a maximum limit
    @Override
    public void setPrice() 
    {
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog
         (null, "Enter bicycle price ");
        price = Integer.parseInt(entry);
        if (price > MAX) 
         price = MAX;
    }

    // Override the toString() method to generate 
    //a description of the bicycle
    @Override
    public String toString() 
    {
        return ("The bicycle is powered by " 
        + getPowerSource() + "; it has " 
        + getWheels() 
        + " wheels and costs $" 
        + getPrice());
    }
}
