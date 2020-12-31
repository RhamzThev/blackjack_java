public class Main {

    public static final int[] RANKS = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static void main(String[] args) {
        Queue deck = new Queue(52);
        for (String suit : SUITS) {
            for (int rank: RANKS) {
                Card card = new Card(rank, suit);
                deck.enqueue(card);
            }
        }
        deck.shuffle();
        System.out.println(deck);
    }
}

// Next Step: Make Learn about Blackjack, then make Blackjack.