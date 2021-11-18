public class Card {
    private Suit suit;
    private int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value=" + value +
                '}';
    }

//
//    public void setSuit(Suit suit) {
//        this.suit = suit;
//    }
//
//
//    public void setValue(Value value) {
//        this.value = value;
//    }
}
