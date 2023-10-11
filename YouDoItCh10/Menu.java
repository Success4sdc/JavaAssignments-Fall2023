// Filename: Menu.java
// Written by: Sandi Cook
// Written on: October 2, 2023

/*
 * Purpose: This class represents a menu of three entrée choices.
 * It can display the menu and get the user's selection.
 */

import javax.swing.*;

public class Menu 
{
  // Declare a protected array of strings to store the entrée choices
  protected String[] entreeChoices = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster"};

  // Declare a private string to store the menu string
  private String menu = "";

  // Declare a private integer to store the user's selection
  private int choice;

  /**
   * Displays the menu and gets the user's selection.
   *
   * @return The user's selection as a string.
   * @throws Exception If an error occurs while getting the user's selection.
   */
  public String displayMenu() throws Exception 
  {
    // Build the menu string
    for (int x = 0; x < entreeChoices.length; ++x) 
    {
      menu = menu + "\n" + (x + 1) + " for " + entreeChoices[x];
    }

    // Prompt the user to enter their selection
    String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter." + menu);

    // Parse the user's input into an integer
    choice = Integer.parseInt(input);

    // Validate the user's selection
    if (choice < 1 || choice > entreeChoices.length) 
    {
      throw new Exception("Invalid selection");
    }

    // Return the user's selection as a string
    return entreeChoices[choice - 1];
  }
}
