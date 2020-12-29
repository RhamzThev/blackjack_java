public class Card {

    private int rank;
    private String suit;
    private String name;

    public Card(int r, String s) {
        rank = r;
        suit = s;
        setName();
    }

    public void setName() {
        String aRank = Integer.toString(this.rank);
        if (aRank.equals("11")) {aRank = "Jack";} 
        else if (aRank.equals("12")) {aRank = "Queen";}
        else if (aRank.equals("13")) {aRank = "King";}
        else if (aRank.equals("14")) {aRank = "Ace";}
        this.name = aRank + " of " + this.suit;
    }

    public String toString() {
        return this.name;
    }
}
