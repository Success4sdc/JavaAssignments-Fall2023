// In these steps, you write a program that demonstrates some methods in the StringBuilder class.

// Step 1: Open a new text file, and type the following first lines of a StringBuilderMethods class:
public class StringBuilderMethods {
    public static void main(String[] args) {

        // Step 2: Use the following code to create a StringBuilder object, and then display it:
        StringBuilder str = new StringBuilder("singing");
        System.out.println(str);

        // Step 3: Enter the following append() method to add characters to the existing StringBuilder and display it again:
        str.append(" in the dead of ");
        System.out.println(str);

        // Step 4: Enter the following insert() method to insert characters. 
        // Then display the StringBuilder, insert additional characters, and display it again:
        str.insert(0, "Black");
        System.out.println(str);
        str.insert(5, "bird ");
        System.out.println(str);

        // Step 5: Add one more append and display sequence:
        str.append("night");
        System.out.println(str);

        // Step 6: Add a closing curly brace for the main() method.
    }

    // Step 7: Type the closing curly brace for the class.
}
