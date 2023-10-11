import java.util.Scanner;

public class PhoneNumberFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.println("Enter a 10-digit number or 999 to exit:");
        while (true) {
            userInput = input.nextLine();

            if (userInput.equals("999")) {
                System.out.println("Exiting the program.");
                break;
            }

            if (userInput.length() != 10 || !isNumeric(userInput)) {
                System.out.println("Error: Please enter exactly 10 digits.");
                continue;
            }

            String formattedNumber = formatPhoneNumber(userInput);
            System.out.println("Formatted Phone Number: " + formattedNumber);
            System.out.println("Enter another 10-digit number or 999 to exit:");
        }
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static String formatPhoneNumber(String number) {
        return "(" + number.substring(0, 3) + ")" + number.substring(3, 6) + "-" + number.substring(6);
    }
}
