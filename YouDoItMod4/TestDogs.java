// Filename: TestDogs.java
// Author: Sandi Cook
// Date: September 3, 2023

/*
* Purpose: This class is designed to test the functionality of the DogTriathlonParticipant class.
* It creates instances of dogs participating in a triathlon and displays their details and scores.
*/

public class TestDogs 
{
    public static void main(String[] args) { 
        // Creating a dog participant with name "Bowser" who participated in 2 events with respective scores
        DogTriathlonParticipant dog1 = new DogTriathlonParticipant("Bowser", 2, 85, 89, 0); 
        dog1.display(); // Displaying Bowser's details and scores

        // Creating a dog participant with name "Rush" who participated in 3 events with respective scores
        DogTriathlonParticipant dog2 = new DogTriathlonParticipant("Rush", 3, 78, 72, 80); 
        dog2.display(); // Displaying Rush's details and scores

        // Creating a dog participant with name "Ginger" who participated in 3 events with respective scores
        DogTriathlonParticipant dog3 = new DogTriathlonParticipant("Ginger", 3, 90, 86, 72); 
        dog3.display(); // Displaying Ginger's details and scores
    }
}
