import java.util.*;

// Define the UseDinnerParty2 class
public class UseDinnerParty2 
{
    public static void main(String[] args) 
    {
        int guests; // Declare a variable to store the number of guests
        int choice; // Declare a variable to store the dinner choice
        Party aParty = new Party(); // Create a Party object
        DinnerParty2 aDinnerParty = new DinnerParty2(); // Declare and create a DinnerParty2 object
        Scanner keyboard = new Scanner(System.in); // Create a Scanner object for input
        
        // Prompt the user for a number of guests for the Party and accept the value from the keyboard
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        
        // Set the number of guests in the Party object
        aParty.setGuests(guests);
        
        // Display the number of guests in the Party object
        System.out.println("The party has " + aParty.getGuests() + " guests");
        
        // Display the party invitation for the Party
        aParty.displayInvitation();
        
        // Prompt the user for a number of guests for the DinnerParty2 and accept the value
        System.out.print("Enter number of guests for the dinner party >> ");
        guests = keyboard.nextInt();
        
        // Set the number of guests in the DinnerParty2 object
        aDinnerParty.setGuests(guests);
        
        // Prompt the user for a dinner choice
        System.out.print("Enter the menu option -- 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        
        // Set the dinner choice for the DinnerParty2 object
        aDinnerParty.setDinnerChoice(choice);
        
        // Display the number of guests for the DinnerParty2
        System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");
        
        // Display the dinner choice for the DinnerParty2
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");
        
        // Call the displayInvitation() method for the DinnerParty2
        aDinnerParty.displayInvitation();
        
        // Close the main() method
    }
    
    // Close the UseDinnerParty2 class
}
