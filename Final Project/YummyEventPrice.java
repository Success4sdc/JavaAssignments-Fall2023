import java.util.Scanner;

public class YummyEventPrice {

  public static void main(String[] args) {
    // Create a Scanner object to read user input.
    Scanner scanner = new Scanner(System.in);

    // Print the company motto.
    printMotto();

    // Prompt the user for the number of guests.
    System.out.print("Enter the number of guests: ");
    int numberOfGuests = scanner.nextInt();

    // Calculate the total price.
    double totalPrice = numberOfGuests * 35;

    // Check if the event is a large event.
    boolean isLargeEvent = numberOfGuests >= 50;

    // Display the results.
    System.out.println("Number of guests: " + numberOfGuests);
    System.out.println("Price per guest: $35");
    System.out.println("Total price: $" + totalPrice);
    System.out.println("Is large event? " + isLargeEvent);
  }

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

}
