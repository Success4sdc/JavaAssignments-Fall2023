// Filename: BankBalance2.java
// Written by: Sandi Cook
// Written on: September 10, 2023

/*
Purpose: 
To calculate and display the bank balance for a given number of years based on a fixed interest rate. 
The user is prompted each year to decide if they want to continue seeing the balance for the next year.

Description:
The program initializes the bank balance with a user input. It then calculates the new balance 
each year by applying a fixed interest rate. After displaying the balance for each year, 
the user is asked if they want to see the balance for the next year. The program continues 
until the user decides to stop.
*/

import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        // Initialize variables for balance, user response, year, and interest rate
        double balance;
        int response;
        int year = 1;
        final double INT_RATE = 0.03;
        Scanner keyboard = new Scanner(System.in);

        // Prompt user for initial bank balance
        System.out.print("Enter initial bank balance > ");
        balance = keyboard.nextDouble();
        keyboard.nextLine();

        // Loop to calculate and display balance for each year based on user's decision
        do {
            // Calculate new balance with interest
            balance = balance + balance * INT_RATE;

            // Display the balance for the current year
            System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);

            // Increment the year
            year = year + 1;

            // Ask user if they want to continue for the next year
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print(" or any other number for no >> ");
            response = keyboard.nextInt();
        } while (response == 1);
    }
}
