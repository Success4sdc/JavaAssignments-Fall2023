//Filename: BowlingTeamDemo3.java
//Written by Sandi Cook
//Written on: September 23, 2023

/*
Purpose: This Java class demonstrates the use of the BowlingTeam class to create multiple bowling teams,
set their names, add team members, display the details of each team, including its members,
and allow the user to enter a team name to see its roster.
*/

// Import the necessary Java utility classes
import java.util.*;

// Define the BowlingTeamDemo3 class
public class BowlingTeamDemo3 {

    // Main method
    public static void main(String[] args) {
        
        // Declare a String variable to hold user input
        String name;
        
        // Declare and initialize a constant for the number of team members
        final int NUM_TEAM_MEMBERS = 4;
        
        // Declare and initialize a constant for the number of teams
        final int NUM_TEAMS = 4;
        
        // Declare and initialize an array of BowlingTeam objects
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        
        // Declare an integer variable to use as a subscript for team members
        int x;
        
        // Declare an integer variable to use as a subscript for teams
        int y;
        
        // Declare and initialize a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Loop to get the details for each team
        for(y = 0; y < NUM_TEAMS; ++y) {
            
            // Allocate memory for the current BowlingTeam object in the array
            teams[y] = new BowlingTeam();
            
            // Prompt the user for a bowling team name
            System.out.print("Enter team name >> ");
            name = input.nextLine();
            
            // Set the team name in the current BowlingTeam object in the array
            teams[y].setTeamName(name);

            // Loop to get the names of the team members for the current team
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                
                // Set the team member's name in the current BowlingTeam object in the array
                teams[y].setMember(x, name);
            }
        }

        // Display the details for each team
        for(y = 0; y < NUM_TEAMS; ++y) {
            System.out.println("\nMembers of team " + teams[y].getTeamName());
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
                System.out.print(teams[y].getMember(x) + " ");
            }
            System.out.println();
        }

        // Prompt the user to enter a team name to see its roster
        System.out.print("\n\nEnter a team name to see its roster >> ");
        name = input.nextLine();

        // Loop through the teams to find the entered team name and display its roster
        for(y = 0; y < teams.length; ++y) {
            if(name.equals(teams[y].getTeamName())) {
                for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
                    System.out.print(teams[y].getMember(x) + " ");
                }
            }
        }

        // Insert an additional empty println() method call
        System.out.println();
    } // End of main method

} // End of BowlingTeamDemo3 class