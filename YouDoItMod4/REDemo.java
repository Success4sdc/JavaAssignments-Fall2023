// Filename: REDemo.java
// Author: Sandi Cook
// Date: September 3, 2023

/**
 * Demonstrates the usage of the RealEstateListing class.
 * Creates a sample real estate listing and displays its details.
 */
public class REDemo {

    /**
     * The main method that serves as the entry point for the program.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating a new real estate listing and displaying its details
        RealEstateListing myListing = new RealEstateListing(2, 250000, "1212 Mansion Lane", 6700);
        myListing.display();
    }
}
