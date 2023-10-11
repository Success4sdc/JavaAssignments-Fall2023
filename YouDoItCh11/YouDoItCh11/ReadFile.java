// Filename: ReadFile.java
// Written by Sandi Cook
// Written on October 1, 2023

/*
 * Purpose: This program reads the contents of a file and prints them to the console.
 * Description: The program first creates a Path object for the file to read.
 * Then, it opens the file for reading using the NIO API. Next, it creates a BufferedReader
 * object to read the contents of the file line by line. Finally, it prints each line to
 * the console and closes the BufferedReader object.
 */
import java.nio.file.*;
import java.io.*;

public class ReadFile 
{
    public static void main(String[] args) 
    {
        // Create the file if it does not exist.
        Path file = Paths.get("Grades.txt");
        
        // Open the file for reading.
        InputStream input = null;
        try 
        {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Read a line from the file.
            String s = reader.readLine();

            // Print the line to the console.
            System.out.println(s);

            // Close the input stream.
            input.close();
        } 
        catch (IOException e) 
        {
            System.out.println(e);
        }
    }
}
