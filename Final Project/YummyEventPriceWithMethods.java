// Filename: YummyEventPriceWithMethods.java
// Written by Sandi Cook
// Written on September 3, 2023

/*
* Purpose: This program calculates the price of a catering event for Yummy Food Company.
* The program uses methods to prompt the user for the number of guests,
* display the company motto, and compute the price of the event.
*
* Description:
* The program first calls the `getNumberOfGuests()` method to get the number of guests.
* Then, the program calls the `printMotto()` method to print the company motto.
* Finally, the program calls the `computePrice()` method to calculate and display the price of the event.
*
* The `getNumberOfGuests()` method prompts the user for the number of guests and returns the value.
* The `printMotto()` method prints the company motto with a border.
* The `computePrice()` method computes the price of the event and displays the price and
* whether the event is a large event.
*/
import java.util.Scanner;

public class YummyEventPriceWithMethods {

  public static void main(String[] args) {
    // Get the number of guests.
    int numberOfGuests = getNumberOfGuests();

    // Print the company motto.
    printMotto();

    // Calculate and display the price of the event.
    computePrice(numberOfGuests);
  }

  // This method prompts the user for the number of guests and returns the value.
  public static int getNumberOfGuests() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of guests: ");
    int numberOfGuests = scanner.nextInt();

    return numberOfGuests;
  }

  // This method prints the company motto with a border.
  public static void printMotto() {
    String motto = "Yummy makes the food that makes it a party";
    int length = motto.length();

    // Print the top border.
    System.out.println("******************************************");

    // Print the motto.
    System.out.println(motto);

    // Print the bottom border.
    System.out.println("******************************************");
  }

  // This method computes the price of the event and displays the price and
  // whether the event is a large event.
  public static void computePrice(int numberOfGuests) {
    double totalPrice = numberOfGuests * 35;
    boolean isLargeEvent = numberOfGuests >= 50;

    System.out.println("Number of guests: " + numberOfGuests);
    System.out.println("Price per guest: $35");
    System.out.println("Total price: $" + totalPrice);
    System.out.println("Is large event? " + isLargeEvent);
  }

}
