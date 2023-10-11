/**
 * Filename: StudentsStanding2.java
 * Written by Sandi Cook
 * Written on October 4, 2023
 *
 * Purpose: Display student records and GPA differences for students in good standing
 * and on academic probation.
 *
 * Description: This program reads data from two files, one containing students in good standing
 * and another containing students on academic probation. It calculates the difference between each
 * student's GPA and the 2.0 cutoff and displays the information for both groups.
 */
import java.io.*;

public class StudentsStanding2 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Open the files for reading
            FileReader goodStandingFile = new FileReader("students_good_standing.txt");
            FileReader probationFile = new FileReader("students_academic_probation.txt");

            BufferedReader goodStandingReader = new BufferedReader(goodStandingFile);
            BufferedReader probationReader = new BufferedReader(probationFile);

            // Display heading for good standing students
            System.out.println("Students in Good Standing:");
            System.out.printf("%-10s %-15s %-15s %-10s %-10s%n", "ID", "First Name", "Last Name", "GPA", "Difference");

            // Process and display good standing records
            String line;
            while ((line = goodStandingReader.readLine()) != null) 
            {
                String[] studentData = line.split(", ");
                if (studentData.length == 4) {
                    String id = studentData[0];
                    String firstName = studentData[1];
                    String lastName = studentData[2];
                    double gpa = Double.parseDouble(studentData[3]);
                    double difference = gpa - 2.0;

                    System.out.printf("%-10s %-15s %-15s %-10.2f %-10.2f%n", id, firstName, lastName, gpa, difference);
                }
            }

            // Display heading for students on academic probation
            System.out.println("\nStudents on Academic Probation:");
            System.out.printf("%-10s %-15s %-15s %-10s %-10s%n", "ID", "First Name", "Last Name", "GPA", "Difference");

            // Process and display probation records
            while ((line = probationReader.readLine()) != null) 
            {
                String[] studentData = line.split(", ");
                if (studentData.length == 4) 
                {
                    String id = studentData[0];
                    String firstName = studentData[1];
                    String lastName = studentData[2];
                    double gpa = Double.parseDouble(studentData[3]);
                    double difference = gpa - 2.0;

                    System.out.printf("%-10s %-15s %-15s %-10.2f %-10.2f%n", id, firstName, lastName, gpa, difference);
                }
            }

            // Close the readers and files
            goodStandingReader.close();
            probationReader.close();
        } catch (IOException e) {
            System.err.println("Error reading from files: " + e.getMessage());
        }
    }
}
