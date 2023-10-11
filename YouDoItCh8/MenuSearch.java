// Filename: MenuSearch.java
// Written by Sandra Cook
// Written on: September 15, 2023

/*
Purpose: This Java program allows the user to enter a menu of entrées at a restaurant,
search for an item in the menu, and indicate whether the requested item is on the menu.
It demonstrates the use of Arrays class methods, input dialogs, and error handling.

Instructions:
Enter menu items, and use "zzz" to quit data entry.
Enter a menu choice to check if it's on the menu.

Note: The program sorts the menu items before searching to ensure proper functionality.
*/

import java.util.*;
import javax.swing.*;

public class MenuSearch {
    public static void main(String[] args) {
        String[] menuChoices = new String[10];
        String entry = "", menuString = "";
        int x = 0;
        int numEntered;
        int highestSub = menuChoices.length - 1;

        // Fill the menu array with "zzzzzzz" as placeholder values
        Arrays.fill(menuChoices, "zzzzzzz");

        // Input loop to enter menu items
        menuChoices[x] = JOptionPane.showInputDialog(null, "Enter an item for today's menu, or zzz to quit");
        while (!menuChoices[x].equals("zzz") && x < highestSub) {
            menuString = menuString + menuChoices[x] + "\n";
            ++x;
            if (x < highestSub)
                menuChoices[x] = JOptionPane.showInputDialog(null, "Enter an item for today's menu, or zzz to quit");
        }
        numEntered = x;

        // Display the menu and prompt for a selection
        entry = JOptionPane.showInputDialog(null, "Today's menu is:\n" + menuString + "Please make a selection:");

        // Sort the array
        Arrays.sort(menuChoices, 0, numEntered);

        // Use binarySearch to find the requested entry
        x = Arrays.binarySearch(menuChoices, entry);
        if (x >= 0 && x < numEntered)
            JOptionPane.showMessageDialog(null, "Excellent choice");
        else
            JOptionPane.showMessageDialog(null, "Sorry - that item is not on tonight's menu");
    }
}
