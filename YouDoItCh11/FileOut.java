// Filename: FileOut.java
// Written by Sandi Cook
// Written on October 1, 2023

/*
 * Purpose: This program writes the string "ABCDF" to the file "Grades.txt" using the Java NIO API.
 * Description: The program first creates a Path object for the file to write to. 
 * Then, it converts the string to a byte array. Next, it declares an OutputStream reference 
 * and tries to open the file for writing. If the file can be opened, the program writes the 
 * data to the file and flushes the output stream. Finally, the program closes the output stream, even if an exception occurred.
 */

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class FileOut 
{
    public static void main(String[] args) 
    {
        // Create a Path object for the file to write to.
        Path file = Paths.get("Grades.txt");

        // Convert the string to a byte array.
        String s = "ABCDF";
        byte[] data = s.getBytes();

        // Declare an OutputStream reference.
        OutputStream output = null;

        // Try to open the file for writing.
        try {
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));

            // Write the data to the file.
            output.write(data);

            // Flush the output stream.
            output.flush();

            // Close the output stream.
            output.close();
        } catch (Exception e) {
            System.out.println("Message: " + e);
        } finally {
            // Close the output stream, even if an exception occurred.
            if (output != null) 
            {
                try 
                {
                    output.close();
                } 
                catch (IOException e) {
                    // Ignore the exception.
                }
            }
        }
    }
}
