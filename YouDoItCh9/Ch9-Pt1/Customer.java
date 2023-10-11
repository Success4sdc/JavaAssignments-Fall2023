// Filename: Customer.java
// Written by Sandi Cook
// Written on September 19, 2023

/*
 * Purpose: Define a Java class named Customer
 * Description: This class represents a customer
 * and includes a constructor to set the customer's ID number and balance owed.
 * It also includes a method to display the customer's information.
 */
public class Customer 
{
private int idNumber; 
private double balanceOwed; 
public Customer(int id, double bal) 
{
idNumber = id; balanceOwed = bal;
}
public void display() {
System.out.println("Customer #" + idNumber + " Balance $" + balanceOwed) ;
} 
} 