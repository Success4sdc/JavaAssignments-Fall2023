//Filename: RepairName.java
//Written by: Sandi Cook
//Written on: September 13, 2023

/*
Purpose: This program prompts the user for their first and last name, then "repairs" the name 
so that the first letter of each word is capitalized. The program then displays the original 
and repaired names.
*/

import javax.swing.*;

public class RepairName {
    public static void main(String[] args) {
        String name, saveOriginalName;
        int stringLength;
        int i;
        char c;

        // Prompt the user for a name
        name = JOptionPane.showInputDialog(null, "Please enter your first and last name");

        // Store the name entered in the saveOriginalName variable
        saveOriginalName = name;

        // Calculate the length of the name the user entered
        stringLength = name.length();

        // Begin a loop that will examine every character in the name
        for (i = 0; i < stringLength; i++) {
            c = name.charAt(i);

            // The first character of a name is always capitalized
            if (i == 0) {
                c = Character.toUpperCase(c);
                name = c + name.substring(1, stringLength);
            }
            // After the first character in the name is converted, the program looks through the rest of the name
            else if (name.charAt(i) == ' ') {
                ++i;
                c = name.charAt(i);
                c = Character.toUpperCase(c);
                name = name.substring(0, i) + c + name.substring(i + 1, stringLength);
            }
        }

        // After every character has been examined, display the original and repaired names
        JOptionPane.showMessageDialog(null, "Original name was " + saveOriginalName + "\nRepaired name is " + name);
    }
}
