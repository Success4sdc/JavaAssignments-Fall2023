//Sandi Cook
//October 10, 2023
//PurchaseArrayList.java

import java.util.*;

public class PurchasesArrayList 
{
    public static void main(String[] args) 
    {
        //Create an ArrayList of Purchases
        ArrayList<Purchase> purchases = new ArrayList<Purchase>();

        //Initialize Scanner object, variables, and sentinel value
        Scanner kb = new Scanner(System.in);
        String category;
        double price;
        final String QUIT = "ZZZ";

        //Data entry loop
        System.out.print("Enter category for purchase or " + QUIT + " to quit >> ");
        category = kb.nextLine();
        while (!category.equals(QUIT)) {
            System.out.print("Enter amount spent >> ");
            price = kb.nextDouble();
            kb.nextLine(); // Consume the Enter key

            // Create a new Purchase object and add it to the ArrayList
            purchases.add(new Purchase(category, price));

            System.out.print("Enter category for purchase or " + QUIT + " to quit >> ");
            category = kb.nextLine();
        }

        //Display and sort the ArrayList
        System.out.println();
        System.out.println("Before sort: ");
        display(purchases);

        Collections.sort(purchases);

        System.out.println("After sort: ");
        display(purchases);
    }

    //Display method for ArrayList of Purchases
    public static void display(ArrayList<Purchase> p) 
    {
        int x;
        for (x = 0; x < p.size(); ++x) {
            System.out.println(" " + p.get(x).getCategory() + " " + p.get(x).getPrice());
        }
        System.out.println();
    }
}
