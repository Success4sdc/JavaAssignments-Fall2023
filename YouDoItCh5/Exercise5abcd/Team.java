//Filename Team.java
//Written by Sandi Cook
//Written on September 9, 2023

/**
 * The Team class represents a high school sports team.
 * Purpose: To store information about a high school sports team.
 * Description: This class holds data fields for the high school name, sport, and team name.
 */
public class Team {
    // Data fields
    private String highSchoolName;  // e.g., Roosevelt High
    private String sport;           // e.g., Basketball
    private String teamName;        // e.g., Dolphins

    // A public final static String for the team's motto
    public final static String MOTTO = "Sportsmanship!";

    // Constructor that initializes the data fields
    public Team(String highSchoolName, String sport, String teamName) {
        this.highSchoolName = highSchoolName;
        this.sport = sport;
        this.teamName = teamName;
    }

    // Get methods to return the values of the fields
    public String getHighSchoolName() {
        return highSchoolName;
    }

    public String getSport() {
        return sport;
    }

    public String getTeamName() {
        return teamName;
    }
}
