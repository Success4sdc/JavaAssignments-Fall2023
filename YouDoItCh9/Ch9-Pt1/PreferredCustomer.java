// Filename: PreferredCustomer.java
// Written by Sandi Cook
// Written on September 19, 2023

/*
 * Purpose: Define a Java class named PreferredCustomer
 * Description: This class represents a preferred
 * customer and extends the Customer class.
 * It includes a constructor to set the customer's 
 * ID number, balance owed, and discount rate.
 * It also overrides the display method to display
 * the customer's information along with the discount rate.
 */
public class PreferredCustomer extends Customer 
{
double discountRate; 
public PreferredCustomer(int id, double bal, double rate)
 {
 super(id, bal); 
 discountRate = rate;
}
@Override public void display() 
{
super.display(); 
System.out.println(" Discount rate is " + discountRate); 
} 
}