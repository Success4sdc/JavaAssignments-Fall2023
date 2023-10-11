// Filename: CharacterInfo.java
// Written by Sandi Cook
// Written on: September 13, 2023

/*
Purpose: This program demonstrates various character manipulation methods
         provided by the Character class in Java.

Description:
This program showcases the functionality of the Character class in Java, specifically focusing on methods to manipulate and analyze characters. It examines whether a character is uppercase, lowercase, a letter, a digit, or whitespace, and demonstrates the transformation between uppercase and lowercase characters.

Usage:
Run this program to see the behavior of the Character class methods on the character 'C'.
*/

public class CharacterInfo {
   public static void main(String[] args) {
      char aChar = 'C';
      System.out.println("The character is " + aChar);
      
      // Check if the character is uppercase
      if(Character.isUpperCase(aChar))
         System.out.println(aChar + " is uppercase");
      else
         System.out.println(aChar + " is not uppercase");
      
      // Check if the character is lowercase
      if(Character.isLowerCase(aChar))
         System.out.println(aChar + " is lowercase");
      else
         System.out.println(aChar + " is not lowercase");
      
      // Convert the character to lowercase and display
      aChar = Character.toLowerCase(aChar);
      System.out.println("After toLowerCase(), aChar is " + aChar);
      
      // Convert the character back to uppercase and display
      aChar = Character.toUpperCase(aChar);
      System.out.println("After toUpperCase(), aChar is " + aChar);
      
      // Check if the character is a letter or digit
      if(Character.isLetterOrDigit(aChar))
         System.out.println(aChar + " is a letter or digit");
      else
         System.out.println(aChar +
            " is neither a letter nor a digit");
      
      // Check if the character is whitespace
      if(Character.isWhitespace(aChar))
         System.out.println(aChar + " is whitespace");
      else
         System.out.println(aChar + " is not whitespace");
   }
}
