// Filename: ShortCircuitTestAnd.java
// Author: Sandi Cook
// Date: September 6, 2023

/**
 * Purpose:
 * To demonstrate the short-circuit behavior of the logical AND (&&) operator in Java.
 * 
 * Description:
 * The program utilizes two methods: trueMethod() and falseMethod().
 * - trueMethod() always returns true and prints a message indicating its invocation.
 * - falseMethod() always returns false and prints a message indicating its invocation.
 * In the main method, the program evaluates the result of trueMethod() && falseMethod().
 * Due to short-circuiting behavior, if the first operand of the && operator evaluates to false, 
 * the second operand won't be evaluated. However, in this case, since trueMethod() returns true, 
 * falseMethod() will be evaluated.
 * The program outputs a message based on the combined result of the two methods.
 */

public class ShortCircuitTestAnd 
{
    public static void main(String[] args) 
    {
        // Evaluate the result of trueMethod() && falseMethod() and print the corresponding message
        if(trueMethod() && falseMethod()) 
            System.out.println("Both are true");
        else 
            System.out.println("Both are not true");
    }
   
    // Method that returns true and prints its invocation message
    public static boolean trueMethod() 
    {
        System.out.println("Within trueMethod()"); 
        return true;
    }  

    // Method that returns false and prints its invocation message
    public static boolean falseMethod() 
    {
        System.out.println("Within falseMethod()"); 
        return false;
    }
}
