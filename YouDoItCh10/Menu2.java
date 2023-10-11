// Filename: Menu2.java
// Written by: Sandi Cook
// Written on: October 2, 2023

/*
 * Purpose: This class represents a menu of three entrée choices. It can display the menu and get the user's selection.
 *
 * This class is a modified version of the Menu class that adds an array to store the first letter of each entrée in the menu. It also adds a check in the displayMenu() method to throw a MenuException if the user enters an invalid menu selection.
 */

import javax.swing.*;

public class Menu2 
{

    // The entrée choices.
    private String[] entreeChoices = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster"};

    // An array to store the first letter of each entrée in the menu.
    protected char initials[] = new char[entreeChoices.length];

    // Displays the menu and gets the user's selection.
    public String displayMenu() throws MenuException 
    {

        // Build the menu string.
        String menu = "";
        for (int x = 0; x < entreeChoices.length; ++x) 
        {
            menu = menu + "\n" + (x + 1) + " for " + entreeChoices[x];
            // Store the first character of each entrée choice in the initials array.
            initials[x] = entreeChoices[x].charAt(0);
        }

        // Display the menu and get the user's selection.
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter." + menu);

        // Check for an invalid menu selection.
        for (int y = 0; y < entreeChoices.length; ++y) 
        {
            if (input.charAt(0) == initials[y]) 
            {
                throw (new MenuException(entreeChoices[y]));
            }
        }

        // Parse the user's selection and return the entrée choice.
        return (entreeChoices[choice - 1]);
    }
}
