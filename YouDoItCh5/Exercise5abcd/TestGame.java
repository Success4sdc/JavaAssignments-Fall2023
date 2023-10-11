//Filename TestGame.java
//Written by Sandi Cook
//Written on September 9, 2023

import java.util.Scanner;

/**
 * The TestGame class tests the Game class.
 * Purpose: To create and display details of a Game object.
 * Description: This class prompts the user for game details and then displays them.
 */
public class TestGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for game details
        System.out.println("Enter details for Team 1:");
        Team team1 = setTeamData();

        System.out.println("\nEnter details for Team 2:");
        Team team2 = setTeamData();

        System.out.print("Enter game time (e.g., 7 PM): ");
        String gameTime = input.nextLine();

        // Create a Game object with the provided details
        Game game = new Game(team1, team2, gameTime);

        // Display game details
        displayGameData(game);
    }

    public static Team setTeamData() 
    {
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

    public static void displayGameData(Game game) 
    {
        System.out.println("\nGame Details:");
        System.out.println("Team 1 - High School Name: " + game.getTeam1().getHighSchoolName());
        System.out.println("Team 1 - Sport: " + game.getTeam1().getSport());
        System.out.println("Team 1 - Team Name: " + game.getTeam1().getTeamName());

        System.out.println("\nTeam 2 - High School Name: " + game.getTeam2().getHighSchoolName());
        System.out.println("Team 2 - Sport: " + game.getTeam2().getSport());
        System.out.println("Team 2 - Team Name: " + game.getTeam2().getTeamName());

        System.out.println("\nGame Time: " + game.getGameTime());
    }
}

