import java.util.Arrays;
import java.util.Scanner;

public class DinnerEventDemo {

    public static class DinnerEvent extends Event {
        private int entréeChoice;
        private int sideDish1Choice;
        private int sideDish2Choice;
        private int dessertChoice;

        private static final String[] ENTRÉE_OPTIONS = {"Chicken", "Beef", "Fish"};
        private static final String[] SIDE_DISH_OPTIONS = {"Salad", "Mashed Potatoes", "Steamed Vegetables"};
        private static final String[] DESSERT_OPTIONS = {"Chocolate Cake", "Fruit Tart", "Cheesecake"};

        public DinnerEvent(String eventNumber, int numberOfGuests, int entréeChoice, int sideDish1Choice, int sideDish2Choice, int dessertChoice) {
            super(eventNumber, numberOfGuests);
            this.entréeChoice = entréeChoice;
            this.sideDish1Choice = sideDish1Choice;
            this.sideDish2Choice = sideDish2Choice;
            this.dessertChoice = dessertChoice;
        }

        // Add a getMenu method to return the menu description
        public String getMenu() {
            StringBuilder menu = new StringBuilder();
            menu.append("Menu for DinnerEvent " + getEventNumber() + ":\n");
            menu.append("Entrée: ").append(ENTRÉE_OPTIONS[entréeChoice]).append("\n");
            menu.append("Side Dishes: ").append(SIDE_DISH_OPTIONS[sideDish1Choice]).append(", ")
                    .append(SIDE_DISH_OPTIONS[sideDish2Choice]).append("\n");
            menu.append("Dessert: ").append(DESSERT_OPTIONS[dessertChoice]).append("\n");
            return menu.toString();
        }
    }

    public static void main(String[] args) {
        DinnerEvent[] dinnerEvents = new DinnerEvent[4];
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input data for each DinnerEvent object.
        for (int i = 0; i < dinnerEvents.length; i++) {
            System.out.println("Enter details for DinnerEvent " + (i + 1) + ":");
            System.out.print("Event Number: ");
            String eventNumber = scanner.next();
            System.out.print("Number of Guests: ");
            int numberOfGuests;

            // Continually prompt the user for the number of guests until the value falls between 5 and 100 inclusive.
            do {
                numberOfGuests = scanner.nextInt();
                // Consume the newline character
                scanner.nextLine();
            } while (numberOfGuests < 5 || numberOfGuests > 100);

            System.out.print("Entrée Choice (0 - Chicken, 1 - Beef, 2 - Fish): ");
            int entréeChoice = scanner.nextInt();

            System.out.print("Side Dish 1 Choice (0 - Salad, 1 - Mashed Potatoes, 2 - Steamed Vegetables): ");
            int sideDish1Choice = scanner.nextInt();

            System.out.print("Side Dish 2 Choice (0 - Salad, 1 - Mashed Potatoes, 2 - Steamed Vegetables): ");
            int sideDish2Choice = scanner.nextInt();

            System.out.print("Dessert Choice (0 - Chocolate Cake, 1 - Fruit Tart, 2 - Cheesecake): ");
            int dessertChoice = scanner.nextInt();

            dinnerEvents[i] = new DinnerEvent(eventNumber, numberOfGuests, entréeChoice, sideDish1Choice, sideDish2Choice, dessertChoice);
        }

        // Sort the DinnerEvent objects based on user's choice
        boolean exit = false;
        while (!exit) {
            System.out.println("Choose sorting option:");
            System.out.println("1. Sort by Event Number");
            System.out.println("2. Sort by Number of Guests");
            System.out.println("3. Sort by Event Type");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Arrays.sort(dinnerEvents, (a, b) -> a.getEventNumber().compareTo(b.getEventNumber()));
                    break;
                case 2:
                    Arrays.sort(dinnerEvents, (a, b) -> a.getNumberOfGuests() - b.getNumberOfGuests());
                    break;
                case 3:
                    Arrays.sort(dinnerEvents, (a, b) -> a.getEventType() - b.getEventType());
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            if (!exit) {
                // Display the sorted DinnerEvent descriptions
                System.out.println("Sorted DinnerEvent Descriptions:");
                for (DinnerEvent dinnerEvent : dinnerEvents) {
                    System.out.println(dinnerEvent.getMenu());
                }
            }
        }

        System.out.println("Exiting DinnerEventDemo.");
    }
}
