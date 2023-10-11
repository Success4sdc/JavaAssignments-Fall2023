// Filename: TestCustomers.java
// Written by Sandi Cook
// Written on September 19, 2023

/*
 * Purpose: Define the TestCustomers class
 * Description: This class contains the main method to
 * demonstrate the use of the Customer and PreferredCustomer classes.
 * It creates instances of both classes and displays their
 * information using the display method.
 */
public class TestCustomers 
{
public static void main(String[] args) 
{
Customer oneCust = new Customer(124, 123.45); 
PreferredCustomer onePCust = new 
PreferredCustomer(125, 3456.78, 0.15); 
oneCust.display(); 
onePCust.display();
} 
}
