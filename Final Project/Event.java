/**
 * Filename: Event.java
 * Written by: Sandi Cook
 * Date: October 4, 2023
 * Description: Yummy Catering provides meals for parties and special events.
 *              The Event class holds catering event information, including event number,
 *              number of guests, price, contact phone number, and event type.
 *              It provides methods to set and retrieve these attributes, as well as
 *              additional functionality for event type management.
 */

public class Event {
    public static final double LOWER_PRICE_PER_GUEST = 32.0;
    public static final double HIGHER_PRICE_PER_GUEST = 35.0;
    public static final int CUTOFF_VALUE = 50;

    // New field for event type and constant event type names
    private int eventType;
    private static final String[] EVENT_TYPE_NAMES = {"wedding", "baptism", "birthday", "corporate", "other"};

    private String eventNumber;
    private int numberOfGuests;
    private double price;
    private String phoneNumber;

    // Set the event type based on a numeric value
    public void setEventType(int eventType) {
        if (eventType >= 0 && eventType < EVENT_TYPE_NAMES.length) {
            this.eventType = eventType;
        } else {
            this.eventType = EVENT_TYPE_NAMES.length - 1; // Set to "other" if out of bounds
        }
    }

    // Get the numeric event type
    public int getEventType() {
        return this.eventType;
    }

    // Get the event type name based on the numeric event type
    public String getEventTypeName() {
        return EVENT_TYPE_NAMES[this.eventType];
    }

    // ... (rest of the Event class remains unchanged)
}
