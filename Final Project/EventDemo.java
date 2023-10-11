import java.util.Scanner;

public class EventDemo {

    public static class Event {
        private String eventNumber;
        private int numberOfGuests;
        private String phoneNumber;
        private int eventType;
        private static final String[] EVENT_TYPE_NAMES = {"wedding", "baptism", "birthday", "corporate", "other"};
        private static final double[] EVENT_PRICES = {40.0, 25.0, 20.0, 32.0, 50.0};

        public Event(String eventNumber, int numberOfGuests, String phoneNumber, int eventType) {
            this.eventNumber = eventNumber;
            this.numberOfGuests = numberOfGuests;
            this.phoneNumber = phoneNumber;
            this.eventType = eventType;
        }

        public String getEventNumber() {
            return eventNumber;
        }

        public int getNumberOfGuests() {
            return numberOfGuests;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public int getEventType() {
            return eventType;
        }

        public String getEventTypeName() {
            if (eventType >= 0 && eventType < EVENT_TYPE_NAMES.length) {
                return EVENT_TYPE_NAMES[eventType];
            } else {
                return "Unknown";
            }
        }

        public double getPrice() {
            if (eventType >= 0 && eventType < EVENT_PRICES.length) {
                return EVENT_PRICES[eventType];
            } else {
                return 0.0;
            }
        }
    }

    public static void main(String[] args) {
        // Create three Event objects.
        Event[] events = new Event[3];
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input data for each Event object.
        for (int i = 0; i < events.length; i++) {
            System.out.println("Enter details for Event " + (i + 1) + ":");
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

            System.out.print("Contact Phone Number: ");
            String phoneNumber = scanner.nextLine(); // Read the contact phone number including spaces, etc.

            events[i] = new Event(eventNumber, numberOfGuests, phoneNumber, 0); // Default event type to 0
        }

        // Display the event number and contact phone number for each Event.
        System.out.println("Event Details:");
        for (Event event : events) {
            System.out.println("Event Number: " + event.getEventNumber());
            System.out.println("Contact Phone Number: " + event.getPhoneNumber());
            System.out.println();
        }

        System.out.println("Exiting EventDemo.");
    }
}
