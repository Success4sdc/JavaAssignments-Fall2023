// Filename: CustomerAccount.java
// Written by: Sandi Cook
// Written on: October 1, 2023

/*
 * Purpose: This class defines a customer account object.

 * Attributes:
 *     acctNum: The account number.
 *     balance: The account balance.
 *     HIGH_CREDIT_LIMIT: The maximum credit limit for a customer account.

 * Methods:
 *     __init__(self, num, bal): Initializes the customer account object with the given account number and balance.
 */

public class CustomerAccount 
{
    public static double HIGH_CREDIT_LIMIT = 20000.00;

    private int acctNum;
    private double balance;

    public CustomerAccount(int num, double bal) throws HighBalanceException 
    {
        acctNum = num;
        balance = bal;

        // Throw a HighBalanceException if the account balance is greater than the maximum credit limit.
        if (balance > HIGH_CREDIT_LIMIT) 
        {
            throw new HighBalanceException();
        }
    }
}
