// Filename: PickMenu.java
// Written by: Sandi Cook
// Written on: October 2, 2023

/*
 * Purpose: This class represents a menu that allows a user to select from three entrée choices.
 * It uses a Menu object to display the menu and get the user's selection.
 */

import javax.swing.*;

public class PickMenu 
{
  // Declare a private Menu object to store the menu
  private Menu briefMenu;

  // Declare a private string to store the user's selection
  private String guestChoice = new String();

  /**
   * Constructor that takes a Menu object as a parameter.
   *
   * @param theMenu The Menu object to use.
   * @throws Exception If an error occurs while creating the PickMenu object.
   */
  public PickMenu(Menu theMenu) throws Exception 
  {
    briefMenu = theMenu;
    setGuestChoice();
  }

  /**
   * Displays the menu and gets the user's selection.
   *
   * @throws Exception If an error occurs while getting the user's selection.
   */
  public void setGuestChoice() throws Exception 
  {
    JOptionPane.showMessageDialog(null, "Choose from the following menu:");
    guestChoice = briefMenu.displayMenu();
  }

  /*
   * Returns the user's selection.
   *
   * @return The user's selection as a string.
   */
  public String getGuestChoice() 
  {
    return guestChoice;
  }
}
