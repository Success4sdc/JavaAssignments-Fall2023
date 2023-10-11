// Filename: StringBuilderMethods.java
// Written by Sandi Cook
// Written on: [Date]

/*
Purpose: This program demonstrates the usage of methods in the StringBuilder class.
*/
public class StringBuilderMethods {
    public static void main(String[] args) {

        //create a StringBuilder object, and then display it:
        StringBuilder str = new StringBuilder("singing");
        System.out.println(str);

        //Enter the following append() method to add characters to the existing StringBuilder and display it again:
        str.append(" in the dead of ");
        System.out.println(str);

        //Enter the following insert() method to insert characters. 
        // Then display the StringBuilder, insert additional characters, and display it again:
        str.insert(0, "Black");
        System.out.println(str);
        str.insert(5, "bird ");
        System.out.println(str);

        // Add one more append and display sequence:
        str.append("night");
        System.out.println(str);

      
    }

}
