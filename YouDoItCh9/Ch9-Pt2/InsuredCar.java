// Filename: InsuredCar.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Define the InsuredCar class that extends the Vehicle class and implements the Insured interface.
 * Description: This class represents an insured car, providing implementations for the setPrice(), setCoverage(),
 * getCoverage(), and toString() methods required by the Vehicle and Insured interfaces.
 */

import javax.swing.*;

public class InsuredCar extends Vehicle implements Insured 
{
    // Variable to hold the amount covered by insurance
    private int coverage;

    // Constructor for InsuredCar, setting power source and number of wheels for cars
    public InsuredCar() 
    {
        super("gas", 4);
        setCoverage();
    }

    // Implement the setPrice() method to set a maximum price of $60,000 for insured cars
     public void setPrice() 
    {
        String entry;
        final int MAX = 60000;
        entry = JOptionPane.showInputDialog(null, "Enter car price ");
        price = Integer.parseInt(entry);
        if (price > MAX)
            price = MAX;
    }

    // Implement the setCoverage() method to set the coverage value for insured cars
      public void setCoverage() 
      {
        coverage = (int) (price * 0.9); // 90% of the car's price is set as coverage
    }

    // Implement the getCoverage() method to retrieve the coverage value
    public int getCoverage() 
    {
        return coverage;
    }

    // Implement the toString() method to provide a string representation of the insured car
    public String toString() 
    {
        return ("The insured car is powered by " 
        + getPowerSource() 
        + "; it has " + getWheels() 
        + " wheels, costs $" 
        + getPrice() + " and is insured for $" + getCoverage());
    }
}
