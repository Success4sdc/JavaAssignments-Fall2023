import java.util.Scanner;
import java.util.Random;

public class Eliza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Hello! How can I help you today?");
        
        while (true) {
            input = scanner.nextLine().toLowerCase();
            
            if (input.equals("goodbye")) {
                System.out.println("Goodbye! Take care.");
                break;
            }
            
            if (input.contains(" my ")) {
                int index = input.indexOf(" my ") + 4;
                String noun = input.substring(index, input.indexOf(" ", index));
                System.out.println("Tell me more about your " + noun + ".");
            } else if (input.contains("love") || input.contains("hate")) {
                System.out.println("You seem to have strong feelings about that.");
            } else {
                respondRandomly();
            }
        }
        
        scanner.close();
    }

    public static void respondRandomly() {
        String[] responses = {"Please go on.", "Tell me more.", "Continue."};
        Random random = new Random();
        int index = random.nextInt(responses.length);
        System.out.println(responses[index]);
    }
}
