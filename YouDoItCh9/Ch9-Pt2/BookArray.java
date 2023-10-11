import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to hold 10 books
        Book[] books = new Book[10];

        // Prompt the user to enter book details
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Book #" + (i + 1));

            // Prompt for the title
            System.out.print("Enter the title: ");
            String title = scanner.nextLine();

            // Prompt for fiction or nonfiction
            String bookType;
            do {
                System.out.print("Is it Fiction (F) or NonFiction (N)? ");
                bookType = scanner.nextLine().toUpperCase();
            } while (!bookType.equals("F") && !bookType.equals("N"));

            // Create the appropriate book type and store it in the array
            if (bookType.equals("F")) {
                books[i] = new Fiction(title);
            } else {
                books[i] = new NonFiction(title);
            }
        }

        // Display details about all 10 books
        System.out.println("\nBook Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Book #" + (i + 1));
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Price: $" + books[i].getPrice());
            System.out.println(); // Add a blank line for separation
        }

        // Close the scanner
        scanner.close();
    }
}
