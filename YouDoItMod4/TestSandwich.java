// Filename: CreateSpaServices.java
// Written by Sandi Cook
// Written on September 3, 2023

/*
* Purpose: This program prompts the user to enter details for a sandwich, 
* creates a Sandwich object with the provided details, and then displays the sandwich's attributes.
*/
import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a Sandwich object
        Sandwich sandwich = new Sandwich();

        // Prompt the user for data and set the Sandwich object's attributes
        System.out.print("Enter the main ingredient (e.g., tuna): ");
        sandwich.setMainIngredient(input.nextLine());

        System.out.print("Enter the bread type (e.g., wheat): ");
        sandwich.setBreadType(input.nextLine());

        System.out.print("Enter the price (e.g., 4.99): ");
        sandwich.setPrice(input.nextDouble());

        // Display the Sandwich object's values
        System.out.println("\nSandwich Details:");
        System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread Type: " + sandwich.getBreadType());
        System.out.println("Price: $" + sandwich.getPrice());

        // Close the scanner
        input.close();
    }
}
