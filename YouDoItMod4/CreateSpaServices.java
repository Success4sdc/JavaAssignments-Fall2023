// Filename: CreateSpaServices.java
// Written by Sandi Cook
// Written on September 3, 2023

/*
* Purpose: This program creates three spa services and prints their details.
* 
* Updates:
* - Commented the purpose of the program.
* - Commented the `getData()` method to explain what it does.
* - Add data field using the this variable
*/

import java.util.Scanner;

public class CreateSpaServices 
{


  /*
  * Create two SpaService objects and get their data from the user.
  */
  public static void main(String[] args) {


    // Create a SpaService object named firstService.
    SpaService firstService = new SpaService(); 

    // Create a SpaService object named secondService.
    SpaService secondService = new SpaService(); 

    SpaService thirdService = new SpaService("facial", 22.99);
  

    // Get the data for the first spa service.
    firstService = getData(firstService);

    // Get the data for the second spa service.
   // secondService = getData(secondService);

    // Print the details of the first spa service.
    System.out.println("First service details:"); 
    System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

    // Print the details of the second spa service.
    System.out.println("Second service details:"); 
    System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

    System.out.println("Third service details:"); 
    System.out.println(thirdService.getServiceDescription() + " $" + thirdService.getPrice());
  }

  /*
  * Get the data for a spa service from the user.
  */
  public static SpaService getData(SpaService service) {
    String serviceDescription; 
    double price;

   
    try (Scanner keyboard = new Scanner(System.in)) {
      // Get the service name from the user.
      System.out.print("Enter service >> "); 
      serviceDescription = keyboard.nextLine(); 
      
      // Get the price from the user.
      System.out.print("Enter price >> "); 
      price = keyboard.nextDouble(); 
      keyboard.nextLine();
    }

    // Set the service name and price on the spa service object.
    service.setServiceDescription(serviceDescription); 
    service.setPrice(price); 

    // Return the spa service object.
    return service;
    

  }
  
}
