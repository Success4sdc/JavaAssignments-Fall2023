public class Card {
    private int value; // Numeric value of the card
    private String suit; // Suit of the card
    private String rank; // String representation of the card's rank

    // Constants for suits
    public static final String SPADES = "Spades";
    public static final String HEARTS = "Hearts";
    public static final String DIAMONDS = "Diamonds";
    public static final String CLUBS = "Clubs";

    // Constructor
    public Card(int value, String suit) {
        setValue(value);
        setSuit(suit);
    }

    // Set the value of the card and its rank
    public void setValue(int value) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("Invalid card value");
        }
        this.value = value;

        // Set the rank based on the value
        if (value == 1) {
            this.rank = "Ace";
        } else if (value >= 2 && value <= 10) {
            this.rank = String.valueOf(value);
        } else if (value == 11) {
            this.rank = "Jack";
        } else if (value == 12) {
            this.rank = "Queen";
        } else if (value == 13) {
            this.rank = "King";
        }
    }

    // Set the suit of the card
    public void setSuit(String suit) {
        if (!suit.equals(SPADES) && !suit.equals(HEARTS) && !suit.equals(DIAMONDS) && !suit.equals(CLUBS)) {
            throw new IllegalArgumentException("Invalid card suit");
        }
        this.suit = suit;
    }

    // Get the value of the card
    public int getValue() {
        return value;
    }

    // Get the suit of the card
    public String getSuit() {
        return suit;
    }

    // Get the rank of the card
    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public static void main(String[] args) {
        Card card = new Card(1, SPADES);
        System.out.println(card); // Outputs: Ace of Spades
    }
}
