// Filename: UseCustomerAccount.java
// Written by: Sandi Cook
// Written on: October 1, 2023

/*
 * Purpose: This class demonstrates how to use the CustomerAccount class.
 */

import javax.swing.*;

public class UseCustomerAccount 
{
    public static void main(String[] args) 
    {
        int num;
        double balance;
        String input;

        // Prompt the user for the account number and balance.
        input = JOptionPane.showInputDialog(null, "Enter account number");
        num = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Enter balance due");
        balance = Double.parseDouble(input);

        // Try to create a new CustomerAccount object. If the account balance is greater than the maximum credit limit, a HighBalanceException will be thrown.
        try 
        {
            CustomerAccount ca = new CustomerAccount(num, balance);

            // Display a message indicating that the customer account was created successfully.
            JOptionPane.showMessageDialog(null, "Customer #" + num + " has a balance of $" + balance);
        } 
        catch (HighBalanceException hbe) 
        {
            // Display a message indicating that the customer's balance is too high.
            JOptionPane.showMessageDialog(null, "Customer #" + num + " has a balance of $" + balance + " which is higher than the credit limit");
        }
    }
}
