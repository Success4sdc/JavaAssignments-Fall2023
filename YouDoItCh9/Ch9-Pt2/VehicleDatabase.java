// Filename: VehicleDatabase.java
// Written by Sandi Cook
// Written on September 20, 2023

/*
 * Purpose: Demonstrate the use of an array of Vehicle references to store and manipulate vehicle objects.
 * Description: This program creates an array of Vehicle references, allowing the user to input data for various
 * types of vehicles (Sailboat or Bicycle), stores them in the array, and then displays the list of available vehicles.
 */

import javax.swing.*;

public class VehicleDatabase 
{
    public static void main(String[] args) 
    {
        // Create an array of Vehicle references
        Vehicle[] vehicles = new Vehicle[5];
        int x;

        // Use a loop to prompt the user for the type of vehicle and instantiate the appropriate object
        for (x = 0; x < vehicles.length; ++x) 
        {
            String userEntry;
            int vehicleType;

            userEntry = JOptionPane.showInputDialog
               (null, "Please select the type of\n " 
               + "vehicle you want to enter: \n1 - Sailboat\n2 - Bicycle");
            vehicleType = Integer.parseInt(userEntry);

            if (vehicleType == 1)
                vehicles[x] = new Sailboat();
            else
                vehicles[x] = new Bicycle();
        }

        // Display the list of available vehicles
        StringBuffer outString = new StringBuffer();
        for (x = 0; x < vehicles.length; ++x) 
        {
            outString.append("\n#" + (x + 1) + " ");
            outString.append(vehicles[x].toString());
        }

        JOptionPane.showMessageDialog(null, 
         "Our available Vehicles include:\n" 
         + outString);
    }
}
