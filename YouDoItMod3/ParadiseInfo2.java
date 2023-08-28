import java.util.Scanner;

public class ParadiseInfo2 {

  public static void main(String[] args) {
    displayInfo();

    // Get the minimum price and discount rate from the user
    double price;
    int discount;
    double savings;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter cutoff price for discount >> ");
    price = keyboard.nextDouble();

    System.out.print("Enter discount rate as a whole number >> ");
    discount = keyboard.nextInt();

    // Calculate the minimum amount of savings
    savings = computeDiscountInfo(price, discount);

    // Display the results
    System.out.println("Special this week on any service over $" + price);
    System.out.println("Discount of " + discount + "%");
    System.out.println("That's a savings of at least $" + savings);
    // Close the keyboard object
    keyboard.close();
  }

  private static void displayInfo() {
    System.out.println("Paradise Day Spa wants to pamper you.");
    System.out.println("We will make you look good.");
  }

  private static double computeDiscountInfo(double price, int discount) {
    return price * discount / 100;
  }

}
