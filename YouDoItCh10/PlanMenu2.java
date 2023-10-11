// Filename: PlanMenu2.java
// Written by: Sandi Cook
// Written on: October 2, 2023

/*
 * Purpose: This class demonstrates how to use the PickMenu2 class to allow a user to select from a menu and catch any thrown MenuExceptions.
 *
 * This class is a modified version of the PlanMenu class that uses a Menu2 object instead of a Menu object and a PickMenu2 reference instead of a PickMenu reference. It also adds a catch block to catch any thrown MenuExceptions and display their messages.
 */

import javax.swing.*;

public class PlanMenu2 
{

  public static void main(String[] args) throws MenuException 
  {

    // Construct a Menu2 object.
    Menu2 briefMenu = new Menu2();

    // Declare a PickMenu2 reference.
    PickMenu2 entree = null;

    // Try to construct a PickMenu2 object.
    try 
    {
      entree = new PickMenu2(briefMenu);

      // Get the customer's menu selection.
      String guestChoice = entree.getGuestChoice();

      // Display the customer's choice.
      JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    } 
    catch (MenuException error) {
      // If the user makes an invalid selection, display an error message that includes the name of the menu item based on the initial the user entered.
      JOptionPane.showMessageDialog(null, "You chose an invalid menu selection: " + error.getMessage());
    } 
  }
}
