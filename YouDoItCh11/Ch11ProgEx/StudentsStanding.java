/**
 * Created by Sandi Cook - StudentsStanding.java - October 4, 2023
 * This program allows users to enter student data, categorizes students into
 * "good standing" or "academic probation" based on their GPA, and saves the
 * records to separate files.
 */
import java.io.*;
import java.util.Scanner;

public class StudentsStanding 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        try 
        {
        // Create files for good standing and academic probation
        FileWriter goodStandingFile = new FileWriter("students_good_standing.txt");
        FileWriter probationFile = new FileWriter("students_academic_probation.txt");

         // Create writers for each file
         BufferedWriter goodStandingWriter = new BufferedWriter(goodStandingFile);
         BufferedWriter probationWriter = new BufferedWriter(probationFile);

         while (true) 
         {
             System.out.println("Enter student data (ID, First Name, Last Name, GPA), or 'exit' to quit:");
             String input = scanner.nextLine();
             
             if (input.equalsIgnoreCase("exit")) 
             {
                 break;
              }
                
             String[] studentData = input.split(",");
             
             if (studentData.length == 4) 
             {
                 String id = studentData[0].trim();
                 String firstName = studentData[1].trim();
                 String lastName = studentData[2].trim();
                 double gpa = Double.parseDouble(studentData[3].trim());
                 
                 if (gpa >= 2.0) 
                 {
                  // Student is in good standing, write to the good standing file
                  goodStandingWriter.write(id + ", " + firstName + ", " + lastName + ", " + gpa);
                  goodStandingWriter.newLine();
                 }
                 else 
                 {
                  // Student is on academic probation, write to the probation file
                  probationWriter.write(id + ", " + firstName + ", " + lastName + ", " + gpa);
                  probationWriter.newLine();
                 }
                 }
                 else 
                 {
                    System.out.println("Invalid input. Please enter data in the format: ID, First Name, Last Name, GPA");
                }
            }

            // Close the writers and files
            goodStandingWriter.close();
            probationWriter.close();
            
            System.out.println("Student data has been saved to files.");
        } 
        catch (IOException e) {
            System.err.println("Error writing to files: " + e.getMessage());
        }
    }
}
