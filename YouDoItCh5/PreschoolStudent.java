// Filename: PreschoolStudent.java
// Author: Sandi Cook
// Date: [Insert Date Here], 2023

/**
 * Purpose:
 * The PreschoolStudent class represents a preschool student with attributes like ID number and age.
 * It ensures that the ID number and age of the student are within acceptable limits.
 * 
 * Description:
 * - The class contains two main attributes: idNum (ID number) and age.
 * - The HIGH_ID constant represents the maximum acceptable ID number for a student.
 * - The HIGH_AGE constant represents the maximum acceptable age for a preschool student.
 * - The class provides methods to set and get the ID number and age, ensuring they are within the defined limits.
 */

public class PreschoolStudent 
{
   // Attributes of the PreschoolStudent class
   int idNum;
   int age;
   public final int HIGH_ID = 9999;  // Maximum acceptable ID number
   public final int HIGH_AGE = 6;    // Maximum acceptable age for a preschool student
   
   // Constructor to initialize a PreschoolStudent object with ID number and age
   public PreschoolStudent(int num, int studentAge)
   {
      setIdNum(num);
      setAge(studentAge);
   }
   
   // Method to set the ID number; if the provided number exceeds HIGH_ID, it defaults to 0
   public void setIdNum(int num)
   { 
      if (num <= HIGH_ID)
         idNum = num;
      else
         idNum = 0;
   }
   
   // Method to set the age; if the provided age exceeds HIGH_AGE, it defaults to 0
   public void setAge(int studentAge)
   {
      if(studentAge <= HIGH_AGE)
         age = studentAge;
      else
         age = 0;
   }
   
   // Method to retrieve the ID number of the student
   public int getIdNum()
   {
      return idNum;
   }
   
   // Method to retrieve the age of the student
   public int getAge()
   {
      return age;
   }
}
