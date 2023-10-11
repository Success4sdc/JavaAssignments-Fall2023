// FindDiscount.java
// Written by Sandra Cook
// Written on: September 15, 2023

import javax.swing.*;

/**
 * This program calculates the discount rate for a given number of items ordered
 * based on predefined ranges and discount rates.
 */
public class FindDiscount {
    public static void main(String[] args) {
        final int NUM_RANGES = 5;
        int[] discountRangeLimits = {1, 13, 50, 100, 200};
        double[] discountRates = {0.00, 0.10, 0.14, 0.18, 0.20}; // Array to store discount rates

        double customerDiscount;
        String strNumOrdered;
        int numOrdered;
        int sub = NUM_RANGES - 1;

        // Prompt the user for the number of items ordered
        strNumOrdered = JOptionPane.showInputDialog(null, "How many items are ordered?");
        numOrdered = Integer.parseInt(strNumOrdered);

        // Find the appropriate discount rate based on the number of items ordered
        while (sub >= 0 && numOrdered < discountRangeLimits[sub]) {
            --sub;
        }
        customerDiscount = discountRates[sub];

        // Display the calculated discount rate
        JOptionPane.showMessageDialog(null, "Discount rate for " + numOrdered + " items is " + customerDiscount);
    }
}
