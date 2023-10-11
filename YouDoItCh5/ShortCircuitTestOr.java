// Filename: ShortCircuitTestOr.java
// Author: Sandi Cook
// Date: [Insert Date Here], 2023

/**
 * Purpose:
 * This program demonstrates the short-circuit behavior of the logical OR (||) operator in Java.
 * 
 * Description:
 * - The program uses two methods: trueMethod() and falseMethod().
 * - trueMethod() always returns true and prints a message indicating it was called.
 * - falseMethod() always returns false and prints a message indicating it was called.
 * - In the main method, the program checks the result of trueMethod() || falseMethod().
 * - Due to short-circuiting, if the first method (trueMethod()) returns true, the second method (falseMethod()) won't be called.
 * - However, in this case, since trueMethod() returns true, falseMethod() will not be called.
 * - The program then prints a message based on the combined result.
 */

public class ShortCircuitTestOr 
{
    public static void main(String[] args) 
    {
        // Check the result of trueMethod() || falseMethod() and print the appropriate message
        if(trueMethod() || falseMethod()) 
            System.out.println("Both are true");
        else 
            System.out.println("Both are not true");
    }
   
    // Method that always returns true and prints a message
    public static boolean trueMethod() 
    {
        System.out.println("Within trueMethod()"); 
        return true;
    }  

    // Method that always returns false and prints a message
    public static boolean falseMethod() 
    {
        System.out.println("Within falseMethod()"); 
        return false;
    }
}
