// Filename: RealEstateListing.java
// Author: Sandi Cook
// Date: September 3, 2023

/*
* Purpose: This program represents a real estate listing with details about a property, 
* including its listing number, price, address, and square footage. It allows for the creation 
* of a real estate listing and provides a method to display the listing's details.
*/

public class RealEstateListing {

    
    // Variables to store listing details
    private int listingNumber; 
    private double price; 
    private HouseData houseData; 

    // Constructor to initialize a real estate listing
    public RealEstateListing(int num, double price, String address, int sqFt)
    {
        listingNumber = num; 
        this.price = price; 
        houseData = new HouseData(address, sqFt);
    }

    // Method to display the details of the listing
    public void display() 
    {
        System.out.println("Listing number # " + listingNumber + 
            " Selling for $" + price);
        System.out.println("Address: " + houseData.streetAddress); 
        System.out.println(houseData.squareFeet + " square feet");
    }

    // Inner class to represent specific house data
    private class HouseData {
        private String streetAddress; 
        private int squareFeet; 

        // Constructor to initialize house data
        public HouseData(String address, int sqFt) 
        {
            streetAddress = address; 
            squareFeet = sqFt;
        }
    }
}
