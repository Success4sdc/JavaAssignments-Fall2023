/**
 * Filename: RemoveDashes.java
 * Written by Sandi Cook
 * Written on October 4, 2023
 *
 * Purpose: Removes embedded dashes from a phone number.
 *
 * Description: This program defines a method called removeDashes() that removes embedded dashes from a phone number
 * and displays the cleaned phone number.
 */
import java.util.Scanner;

public class RemoveDashes 
{
    public static void main(String[] args) 
    {
        // Declare variables
        Scanner input = new Scanner(System.in);
        String phone;

        // Prompt the user for a phone number and accept it
        System.out.print("Enter phone number >> ");
        phone = input.nextLine();

        // Call the removeDashes() method to process the phone number
        removeDashes(phone);

        // Display a new line at the end of execution
        System.out.println();
    }

    /**
     * Removes embedded dashes from a phone number and displays the cleaned phone number.
     * @param s The phone number with embedded dashes.
     */
    public static void removeDashes(String s) 
    {
        int dashLoc = s.indexOf('-');

        // If no dashes are found, display the original phone number
        if (dashLoc == -1) 
        {
            System.out.print(s);
        } else {
            // Display the substring before the dash
            System.out.print(s.substring(0, dashLoc));

            // Call removeDashes() recursively with the substring after the dash
            removeDashes(s.substring(dashLoc + 1));
        }
    }
}
