// Define a Java class named PartyWithConstructor2
public class PartyWithConstructor2 {
    // Private data field to store the number of guests
    private int guests;

    // Constructor that takes an argument to set the number of guests
    public PartyWithConstructor2(int numGuests) {
        guests = numGuests;
    }

    // Method to get the number of guests
    public int getGuests() {
        return guests; // Return the value of the 'guests' data field
    }

    // Method to set the number of guests
    public void setGuests(int numGuests) {
        guests = numGuests; // Set the 'guests' data field to the provided value
    }

    // Method to display a party invitation
    public void displayInvitation() {
        System.out.println("Please come to my party!"); // Print an invitation message to the console
    }
}
