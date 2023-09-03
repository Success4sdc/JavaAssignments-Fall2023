//Filename CreateSpaServices.java
//Written by Sandi Cook
//Written on September 2, 2023

/*
*Purpose: Takes two queries - service and price - for two services and returns 
*service and price of both
*/

package YouDoItCh4;

import java.util.Scanner;

public class CreateSpaServices {

    public static void main(String[] args) {

        // Declare variables to hold the service description and price.
        String service;
        double price;

        // Create two SpaService objects.
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();

        // Create a Scanner object to read input from the user.
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to enter the service description and price for the first spa service.
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();

        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        // Set the service description and price for the first spa service.
        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        // Call the nextLine() method to remove the Enter key that remains in the input buffer.
        keyboard.nextLine(); // to consume the enter key

        // Prompt the user to enter the service description and price for the second spa service.
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();

        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        // Set the service description and price for the second spa service.
        secondService.setServiceDescription(service);
        secondService.setPrice(price);

        // Display the details of the first spa service.
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        // Display the details of the second spa service.
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

        // Close the Scanner object.
        keyboard.close();
    }
}
