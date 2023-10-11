//Sandi Cook
//October 10, 2023
//GenericSequence.java

public class GenericSequence {
    public static void main(String[] args) 
    {
        //Declare variables of different data types
        Character grade = 'A';
        Integer score = 0;
        Double pay = 21.34;
        String word = "Hello";

        // Call a method named duplicate() four times, each time passing a different variable
        // and a number of times to duplicate the variable
        duplicate(grade, 5);
        duplicate(score, 10);
        duplicate(pay, 3);
        duplicate(word, 7);
    }

    // Create a generic duplicate() method that accepts two parameters—a generic object
    // and a number of times to duplicate the object
    public static <T> void duplicate(T obj, int num) 
    {
        int x;
        for (x = 0; x < num; ++x) 
        {
            System.out.print(obj + " ");
        }
        System.out.println(); // Display a new line after duplicating the object
    }
}
