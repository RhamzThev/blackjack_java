public class Card {

    private int rank;
    private String suit;
    private String name;
    public final String RED = "\033[31m";
    public final String BLACK = "\033[34m";
    public final String RESET = "\033[0m";

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

    public String repr() {
        return this.name;
    }

    public String toString() {
        String aRank = "0";
        if (this.rank == 10) {
            aRank = "10";
        } else if (this.rank > 10) {
            aRank = this.name.substring(0, 1);
        } else {
            aRank = Integer.toString(this.rank);
        }

        String aSuit = this.suit.substring(0, 1);

        if(aSuit.equals("C") || aSuit.equals("S")) {
            return BLACK + aRank + aSuit + RESET;
        } else if(aSuit.equals("D") || aSuit.equals("H")) {
            return RED + aRank + aSuit + RESET;
        } else {
            return aRank + aSuit + RESET;
        }
    }
}