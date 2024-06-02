import java.util.Random;

public class Card {
    private String suit;
    private String faceValue;

    // Constructor
    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    // Getter methods
    public String getSuit() {
        return suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    // Method to generate a random card
    public static Card getRandomCard() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faceValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Random random = new Random();
        String randomSuit = suits[random.nextInt(suits.length)];
        String randomFaceValue = faceValues[random.nextInt(faceValues.length)];

        return new Card(randomSuit, randomFaceValue);
    }

    // toString method
    public String toString() {
        return faceValue + " of " + suit;
    }

    public static void main(String[] args) {
        // Deal five random cards
        System.out.println("Dealt Cards:");
        for (int i = 0; i < 5; i++) {
            Card card = Card.getRandomCard();
            System.out.println(card);
        }
    }
}

