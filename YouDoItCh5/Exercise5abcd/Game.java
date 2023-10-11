//Filename Game.java
//Written by Sandi Cook
//Written on September 9, 2023

/**
 * The Game class represents a sports game between two teams.
 * Purpose: To store information about a game between two high school sports teams.
 * Description: This class holds data fields for the two participating teams and the game time.
 */
public class Game 
{
    // Data fields
    private Team team1;
    private Team team2;
    private String gameTime;  // e.g., 7 PM

    // Constructor that initializes the data fields
    public Game(Team team1, Team team2, String gameTime) 
    {
        this.team1 = team1;
        this.team2 = team2;
        this.gameTime = gameTime;
    }

    // Get methods to return the values of the fields
    public Team getTeam1() 
    {
        return team1;
    }

    public Team getTeam2() 
    {
        return team2;
    }

    public String getGameTime() 
    {
        return gameTime;
    }
}
