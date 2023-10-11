// Filename: CreateSpaServices.java
// Author: Sandi Cook
// Date: September 3, 2023

/*
* Purpose: This program measures the time it takes for a user to respond to a question.
* It displays a question using a dialog box and then calculates the difference in seconds 
* between when the question was shown and when the user responded.
*/

import javax.swing.JOptionPane; 
import java.time.*;

public class TimedResponse 
{
    public static void main(String[] args) 
    {
        // Variables to store the start and end times
        LocalDateTime time1, time2; 
        // Variables to store the seconds of start and end times and their difference
        int seconds1, seconds2, difference;
      
        // Capture the current time (start time)
        time1 = LocalDateTime.now(); 
        seconds1 = time1.getSecond();

        // Display a question to the user and wait for their response
        JOptionPane.showConfirmDialog(null, "Is stealing ever justified? ");

        // Capture the current time again (end time)
        time2 = LocalDateTime.now(); 
        seconds2 = time2.getSecond();

        // Calculate the difference in seconds between start and end times
        difference = seconds2 - seconds1;

        // Display the result to the user
        JOptionPane.showMessageDialog(null, "End seconds: " + 
            seconds2 + "\nStart seconds: " + seconds1 + 
            "\nIt took " + difference + 
            " seconds for you to answer");
    }
}
