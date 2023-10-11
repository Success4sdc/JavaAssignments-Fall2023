//Filename: BowlingTeamDemo.java
//Written by Sandi Cook
//Written on: September 15, 2023

/*
Purpose: This Java class demonstrates the use of the BowlingTeam class to create a bowling team, set its name,
and add team members. It also displays the details of the team, including its members.
*/

// Import the necessary Java utility classes
import java.util.*;

// Define the BowlingTeamDemo class
public class BowlingTeamDemo {

    // Main method
    public static void main(String[] args) {
        
        // Declare a String variable to hold user input
        String name;
        
        // Declare and initialize a BowlingTeam object
        BowlingTeam bowlTeam = new BowlingTeam();
        
        // Declare an integer variable to use as a subscript
        int x;
        
        // Declare and initialize a constant for the number of team members
        final int NUM_TEAM_MEMBERS = 4;
        
        // Declare and initialize a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for a bowling team name
        System.out.print("Enter team name >> ");
        name = input.nextLine();
        
        // Set the team name in the BowlingTeam object
        bowlTeam.setTeamName(name);

        // Loop to get the names of the team members
        for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
            System.out.print("Enter team member's name >> ");
            name = input.nextLine();
            
            // Set the team member's name in the BowlingTeam object
            bowlTeam.setMember(x, name);
        }

        // Display the team details
        System.out.println("\nMembers of team " + bowlTeam.getTeamName());
        for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
            System.out.print(bowlTeam.getMember(x) + " ");
        }
        System.out.println();
    } // End of main method

} // End of BowlingTeamDemo class
