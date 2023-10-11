// Filename: DemoVehicles.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Demonstrate the use of different vehicle classes (Sailboat and Bicycle) and their descriptions.
 * Description: This program creates instances of Sailboat and Bicycle classes, displays their descriptions, and
 * prompts the user to input information for these vehicles.
 */

import javax.swing.*;

public class DemoVehicles 
{
    public static void main(String[] args) 
    {
        // Create instances of Sailboat and Bicycle
        Sailboat aBoat = new Sailboat();
        Bicycle aBike = new Bicycle();

        // Display descriptions of the sailboat and bicycle
        JOptionPane.showMessageDialog(null, 
         "\nVehicle descriptions:\n" +
         aBoat.toString() + "\n" + aBike.toString());
    }
}
