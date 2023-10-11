// Filename: DogTriathlonParticipant.java
// Author: Sandi Cook
// Date: September 3, 2023

/*
* Purpose: This class represents a dog participating in a triathlon event. 
* It captures the dog's name, scores in various events, and calculates the average score.
* Additionally, it keeps track of the cumulative score of all participating dogs.
*/

public class DogTriathlonParticipant 
{
    // Constant to store the number of events a dog participates in
    private final int NUM_EVENTS; 

    // Static variable to keep track of the cumulative score of all dogs
    private static int totalCumulativeScore = 0;

    // Variables to store the dog's name and scores in various events
    private String name; 
    private int obedienceScore; 
    private int conformationScore; 
    private int agilityScore; 
    private int total; 
    private double avg;

    // Constructor to initialize the dog's details and scores
    public DogTriathlonParticipant(String name, int numEvents, int score1, int score2, int score3)
    {
        this.name = name; 
        NUM_EVENTS = numEvents; 
        obedienceScore = score1; 
        conformationScore = score2; 
        agilityScore = score3;

        // Calculate the total and average scores for the dog
        total = obedienceScore + conformationScore + agilityScore; 
        avg = (double) total / NUM_EVENTS;

        // Update the cumulative score with the dog's total score
        totalCumulativeScore = totalCumulativeScore + total; 
    }

    // Method to display the dog's details and scores
    public void display() 
    {
        System.out.println(name + " participated in " + NUM_EVENTS + " events and has an average score of " + avg); 
        System.out.println(" " + name + " has a total score of " + total + " bringing the total cumulative score to " + totalCumulativeScore);
    }
}
