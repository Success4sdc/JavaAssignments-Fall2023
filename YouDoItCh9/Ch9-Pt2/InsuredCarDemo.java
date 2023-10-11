// Filename: InsuredCarDemo.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Demonstrate the usage of the InsuredCar class by creating an InsuredCar object and displaying its information.
 * Description: This program creates an InsuredCar object, which represents an insured car. It then displays
 * information about the insured car using the toString() method and a dialog box.
 */

import javax.swing.*;

public class InsuredCarDemo 
{
    public static void main(String[] args) 
    {
        // Create an InsuredCar object
        InsuredCar myCar = new InsuredCar();

        // Display car information using toString()
        JOptionPane.showMessageDialog(null, myCar.toString());
    }
}
