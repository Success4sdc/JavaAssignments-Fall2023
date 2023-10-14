//Sandi Cook
//October 9, 2023
//EventDemo.java
import java.util.Scanner;

public class EventDemo {

    public static class Event {
        private String eventNumber; // as of 10-9-23: Event number identifier
        private int numberOfGuests; // as of 10-9-23: Number of guests attending the event
        private String phoneNumber; // as of 10-9-23: Contact phone number
        private int eventType; // as of 10-9-23: Type of event (0 for default)
        private static final String[] EVENT_TYPE_NAMES = {"wedding", "baptism", "birthday", "corporate", "other"};
        private static final double[] EVENT_PRICES = {40.0, 25.0, 20.0, 32.0, 50.0};

        // as of 10-9-23: Constructor to initialize Event object
        public Event(String eventNumber, int numberOfGuests, String phoneNumber, int eventType) {
            this.eventNumber = eventNumber;
            this.numberOfGuests = numberOfGuests;
            this.phoneNumber = phoneNumber;
            this.eventType = eventType;
        }

        // as of 10-9-23: Getter method for eventNumber
        public String getEventNumber() {
            return eventNumber;
        }

        // as of 10-9-23: Getter method for numberOfGuests
        public int getNumberOfGuests() {
            return numberOfGuests;
        }

        // as of 10-9-23: Getter method for phoneNumber
        public String getPhoneNumber() {
            return phoneNumber;
        }

        // as of 10-9-23: Getter method for eventType
        public int getEventType() {
            return eventType;
        }

        // as of 10-9-23: Get the name of the event type, or "Unknown" if eventType is out of bounds
        public String getEventTypeName() {
            if (eventType >= 0 && eventType < EVENT_TYPE_NAMES.length) {
                return EVENT_TYPE_NAMES[eventType];
            } else {
                return "Unknown";
            }
        }

        // as of 10-9-23: Get the price based on eventType, or 0.0 if eventType is out of bounds
        public double getPrice() {
            if (eventType >= 0 && eventType < EVENT_PRICES.length) {
                return EVENT_PRICES[eventType];
            } else {
                return 0.0;
            }
        }
    }

    public static void main(String[] args) {
        // as of 10-9-23: Create an array to hold three Event objects.
        Event[] events = new Event[3];
        Scanner scanner = new Scanner(System.in);

        // as of 10-9-23: Prompt the user to input data for each Event object.
        for (int i = 0; i < events.length; i++) {
            System.out.println("Enter details for Event " + (i + 1) + ":");
            System.out.print("Event Number: ");
            String eventNumber = scanner.next();
            System.out.print("Number of Guests: ");
            int numberOfGuests;

            // as of 10-9-23: Continually prompt the user for the number of guests until the value falls between 5 and 100 inclusive.
            do {
                numberOfGuests = scanner.nextInt();
                // as of 10-9-23: Consume the newline character
                scanner.nextLine();
            } while (numberOfGuests < 5 || numberOfGuests > 100);

            System.out.print("Contact Phone Number: ");
            String phoneNumber = scanner.nextLine(); // as of 10-9-23: Read the contact phone number including spaces, etc.

            events[i] = new Event(eventNumber, numberOfGuests, phoneNumber, 0); // as of 10-9-23: Default event type to 0
        }

        // as of 10-9-23: Display the event number and contact phone number for each Event.
        System.out.println("Event Details:");
        for (Event event : events) {
            System.out.println("Event Number: " + event.getEventNumber());
            System.out.println("Contact Phone Number: " + event.getPhoneNumber());
            System.out.println();
        }

        System.out.println("Exiting EventDemo.");
    }
}
