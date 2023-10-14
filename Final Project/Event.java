// Filename: Event.java
// Author: Sandi Cook
// Date: October 11, 2023
// Purpose: This class represents events catered by Yummy Catering. 
// It stores information about the event, including an event number, 
// contact phone number, and event type. It also provides methods to 
// set and retrieve this information while enforcing certain constraints 
// on data validity.

public class Event {
    private String eventNumber;
    private String contactPhoneNumber;
    private int eventType;

    // Constants for event types
    private static final String[] EVENT_TYPES = {"wedding", "baptism", "birthday", "corporate", "other"};

    public Event() {
        // Initialize event number, contact phone number, and event type to default values
        this.eventNumber = "A000";
        this.contactPhoneNumber = "0000000000";
        this.eventType = 4; // Default to "other"
    }

    // Method to set the event number
    public void setEventNumber(String eventNumber) {
        // Check if the argument is a valid event number
        if (eventNumber.matches("^[A-Za-z][0-9]{3}$")) {
            // Force the initial letter to uppercase
            this.eventNumber = eventNumber.substring(0, 1).toUpperCase() + eventNumber.substring(1);
        } else {
            // If not valid, set it to "A000"
            this.eventNumber = "A000";
        }
    }

    // Method to set the contact phone number
    public void setContactPhoneNumber(String contactPhoneNumber) {
        // Remove any non-digit characters
        String digitsOnly = contactPhoneNumber.replaceAll("[^0-9]", "");

        // Check if the resulting string is 10 digits long
        if (digitsOnly.length() == 10) {
            this.contactPhoneNumber = digitsOnly;
        } else {
            this.contactPhoneNumber = "0000000000";
        }
    }

    // Method to set the event type
    public void setEventType(int eventType) {
        if (eventType >= 0 && eventType < EVENT_TYPES.length) {
            this.eventType = eventType;
        } else {
            // If eventType is out of bounds, set it to "other"
            this.eventType = 4;
        }
    }

    // Method to get the event type as a String
    public String getEventType() {
        return EVENT_TYPES[eventType];
    }

    // Other methods and constructors as needed
}
