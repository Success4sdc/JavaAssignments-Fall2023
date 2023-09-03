// Filename: ParadiseInfo2.java
// Written by Sandi Cook
// Written on September 3, 2023

/*
This program calculates the minimum amount of savings on a service at Paradise Day Spa.

The `main()` method first calls the `displayInfo()` method to print a message.
Then, it prompts the user to enter the minimum price and discount rate.
The program then calculates the minimum amount of savings and prints the results.
*/

import java.util.Scanner;

public class ParadiseInfo2 {

    private static void displayInfo() {
        // Print a message from Paradise Day Spa.
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }

    private static double computeDiscountInfo(double price, int discount) {
        // Calculate the minimum amount of savings.
        return price * discount / 100;
    }

    public static void main(String[] args) {
        // Display a message.
        displayInfo();

        // Get the minimum price and discount rate from the user.
        double price;
        int discount;
        double savings;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter cutoff price for discount >> ");
        price = keyboard.nextDouble();

        System.out.print("Enter discount rate as a whole number >> ");
        discount = keyboard.nextInt();

        // Calculate the minimum amount of savings.
        savings = computeDiscountInfo(price, discount);

        // Display the results.
        System.out.println("Special this week on any service over $" + price);
        System.out.println("Discount of " + discount + "%");
        System.out.println("That's a savings of at least $" + savings);
        // Close the keyboard object.
        keyboard.close();
    }
}
