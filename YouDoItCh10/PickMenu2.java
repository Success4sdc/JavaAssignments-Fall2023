// Filename: PickMenu2.java
// Written by: Sandi Cook
// Written on: October 2, 2023

/*
 * Purpose: This class represents a menu that allows a user to select from three entrée choices. It can display the menu and get the user's selection, and it can throw a MenuException if the user enters an invalid selection.
 *
 * This class is a modified version of the PickMenu class that uses a Menu2 object instead of a Menu object. It also adds a throws clause to the constructor and setGuestChoice() method headers to indicate that they can throw a MenuException.
 */

import javax.swing.*;

public class PickMenu2 
{

  // Declare a private Menu2 object to store the menu
  private Menu2 briefMenu;

  // Declare a private string to store the user's selection
  private String guestChoice = new String();

  /**
   * Constructor that takes a Menu2 object as a parameter.
   *
   * @param theMenu The Menu2 object to use.
   * @throws MenuException If an error occurs while creating the PickMenu2 object.
   */
  public PickMenu2(Menu2 theMenu) throws MenuException 
  {
    briefMenu = theMenu;
    setGuestChoice();
  }

  /**
   * Displays the menu and gets the user's selection.
   *
   * @throws MenuException If an error occurs while getting the user's selection.
   */
  public void setGuestChoice() throws MenuException 
  {
    JOptionPane.showMessageDialog(null, "Choose from the following menu:");
    guestChoice = briefMenu.displayMenu();
  }

  /**
   * Returns the user's selection.
   *
   * @return The user's selection as a string.
   */
  public String getGuestChoice() 
  {
    return guestChoice;
  }
}
