// Filename: HighBalanceException.java
// Written by: Sandi Cook
// Written on: October 1, 2023

/*
 * Purpose: This class defines a custom exception class that 
 * can be used to throw an exception when a customer's balance is too high.
 */

public class HighBalanceException extends Exception 
{
    public HighBalanceException() 
    {
        super("Customer balance is high");
    }
}
