public class Event {

  // Public final static fields.
  public static final double PRICE_PER_GUEST = 35.0;
  public static final int CUTOFF_VALUE = 50;

  // Private fields.
  private String eventNumber;
  private int numberOfGuests;
  private double price;

  // Public set methods.
  public void setEventNumber(String eventNumber) {
    this.eventNumber = eventNumber;
  }

  public void setGuests(int numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
    this.price = numberOfGuests * PRICE_PER_GUEST;
  }

  // Public get methods.
  public String getEventNumber() {
    return this.eventNumber;
  }

  public int getNumberOfGuests() {
    return this.numberOfGuests;
  }

  public double getPrice() {
    return this.price;
  }

  // Constructors.
  public Event(String eventNumber, int numberOfGuests) {
    this.setEventNumber(eventNumber);
    this.setGuests(numberOfGuests);
  }

  public Event() {
    this("A000", 0);
  }

}
