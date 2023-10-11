import java.util.Scanner;
import java.util.regex.Pattern;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        int wordCount = countWords(input);
        
        System.out.println("The number of words in the string is: " + wordCount);
    }

    public static int countWords(String input) {
        // Split the string using the specified delimiters
        String[] words = input.split("[\\s.,;?!-]+");
        
        // Return the length of the resulting array
        return words.length;
    }
}
