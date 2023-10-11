//Filename TestTeam.java
//Written by Sandi Cook
//Written on September 9, 2023


import java.util.Scanner;

/**
 * The TestTeam class tests the Team class.
 * Purpose: To create and display details of three Team objects.
 * Description: This class declares three Team objects and prompts the user for their details.
 */
public class TestTeam {
    public static void main(String[] args) {
        // Declare three Team objects
        Team team1, team2, team3;

        // Set data for each Team object
        team1 = setTeamData();
        team2 = setTeamData();
        team3 = setTeamData();

        // Display data for each Team object
        displayTeamData(team1);
        displayTeamData(team2);
        displayTeamData(team3);
    }

    public static Team setTeamData() {
        Scanner input = new Scanner(System.in);

        // Prompt user for team details
        System.out.print("Enter high school name: ");
        String highSchoolName = input.nextLine();

        System.out.print("Enter sport: ");
        String sport = input.nextLine();

        System.out.print("Enter team name: ");
        String teamName = input.nextLine();

        // Create and return a new Team object with the provided details
        return new Team(highSchoolName, sport, teamName);
    }

    public static void displayTeamData(Team team) {
        System.out.println("\nHigh School Name: " + team.getHighSchoolName());
        System.out.println("Sport: " + team.getSport());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Motto: " + Team.MOTTO);
    }
}

