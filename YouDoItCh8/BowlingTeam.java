//Filename: BowlingTeam.java
//Written by Sandi Cook
//Written on: September 15, 2023
/*
Purpose: This Java class represents a bowling team and provides methods to set and get the team name,
set and get individual team member names, and store up to 4 team members.
*/

public class BowlingTeam {
    // Fields
    private String teamName;
    private String[] members = new String[4];

    // Set team name
    public void setTeamName(String team) {
        teamName = team;
    }

    // Get team name
    public String getTeamName() {
        return teamName;
    }

    // Set a team member's name
    public void setMember(int number, String name) {
        if (number >= 0 && number < 4) { // Ensure the index is within the bounds of the array
            members[number] = name;
        } else {
            System.out.println("Invalid member number. Please provide a number between 0 and 3.");
        }
    }

    // Get a team member's name
    public String getMember(int number) {
        if (number >= 0 && number < 4) { // Ensure the index is within the bounds of the array
            return members[number];
        } else {
            System.out.println("Invalid member number. Please provide a number between 0 and 3.");
            return null;
        }
    }
}
