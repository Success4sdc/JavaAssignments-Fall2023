// Filename: PreSchoolDemo.java
// Author: Sandi Cook
// Date: September 6, 2023

/**
 * Purpose:
 * The PreSchoolDemo program demonstrates the creation and manipulation of PreschoolStudent objects.
 * 
 * Description:
 * The program initializes two PreschoolStudent objects with specific ID numbers and ages.
 * It then displays the details of each student using the display() method.
 * The age of the first student is then updated twice, and the details are displayed after each update.
 */

public class PreSchoolDemo 
{
    public static void main(String[] args) 
    {
        // Create two PreschoolStudent objects with initial ID numbers and ages
        PreschoolStudent ps1 = new PreschoolStudent(2345, 5);
        PreschoolStudent ps2 = new PreschoolStudent(67890, 8);
        
        // Display the details of both students
        display(ps1); 
        display(ps2); 
        
        // Update the age of the first student and display the updated details
        ps1.setAge(6); 
        display(ps1);
        
        // Update the age of the first student again and display the updated details
        ps1.setAge(7); 
        display(ps1);
    }
   
    /**
     * This method displays the ID number and age of a given PreschoolStudent.
     * @param ps The PreschoolStudent object whose details are to be displayed.
     */
    public static void display(PreschoolStudent ps)
    {
        System.out.print("student ID " + ps.getIdNum()); 
        System.out.println(" student age " + ps.getAge()); 
        System.out.println();
    }
}
