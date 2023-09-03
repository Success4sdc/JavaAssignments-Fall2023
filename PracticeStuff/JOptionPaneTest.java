import javax.swing.JOptionPane;

public class JOptionPaneTest {

  public static void main(String[] args) {
    displayInfo();

    // Get the minimum price and discount rate from the user
    double price;
    int discount;
    double savings;

    price = Double.parseDouble(JOptionPane.showInputDialog("Enter cutoff price for discount >> "));
    discount = Integer.parseInt(JOptionPane.showInputDialog("Enter discount rate as a whole number >> "));

    // Calculate the minimum amount of savings
    savings = computeDiscountInfo(price, discount);

    // Display the results
    JOptionPane.showMessageDialog(null, "Special this week on any service over $" + price);
    JOptionPane.showMessageDialog(null, "Discount of " + discount + "%");
    JOptionPane.showMessageDialog(null, "That's a savings of at least $" + savings);
  }

  private static void displayInfo() {
    JOptionPane.showMessageDialog(null, "Paradise Day Spa wants to pamper you.");
    JOptionPane.showMessageDialog(null, "We will make you look good.");
  }

  private static double computeDiscountInfo(double price, int discount) {
    return price * discount / 100;
  }

}

