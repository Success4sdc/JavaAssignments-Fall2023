// Filename: bookstore_credit.java
// Written by Sandi Cook
// Written on September 3, 2023

/*
This program calculates the bookstore credit for a student based on their GPA.

The user is prompted to enter their name and GPA.
The program then calculates the bookstore credit and prints it to the console.
*/

import java.util.Scanner;

public class BookstoreCredit {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name.
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Prompt the user to enter their GPA.
        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        // Calculate the bookstore credit.
        double credit = calculateBookstoreCredit(gpa);

        // Print the bookstore credit to the console.
        System.out.println("Hello " + name + ", your GPA is " + gpa + ". Your bookstore credit is $" + credit + "!");

        // Close the Scanner object.
        sc.close();
    }

    // This method calculates the bookstore credit for a student based on their GPA.
    public static double calculateBookstoreCredit(double gpa) {
        // Return the GPA multiplied by 10.
        return gpa * 10;
    }
}
