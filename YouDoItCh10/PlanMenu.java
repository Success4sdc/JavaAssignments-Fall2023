// Filename: PlanMenu.java
// Written by: Sandi Cook
// Written on: October 2, 2023

/*
 * Purpose: This class demonstrates how to use the PickMenu class to allow a user to select from a menu.
 */

import javax.swing.*;

public class PlanMenu 
{
    public static void main(String[] args) 
    {

        // Construct a Menu object.
        Menu briefMenu = new Menu();

        // Declare a PickMenu object.
        PickMenu entree = null;

        // Try to construct a PickMenu object.
        try 
        {
            entree = new PickMenu(briefMenu);

            // Get the customer's menu selection.
            String guestChoice = entree.getGuestChoice();

            // Display the customer's choice.
            JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
        } 
        catch (Exception error) 
        {
            // If the PickMenu constructor throws an exception, display a message indicating that the customer made an invalid selection.
            JOptionPane.showMessageDialog(null, "You made an invalid selection.");
        }
    }
}
