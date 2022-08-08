

public class Card {
    public SUIT suit;
    public TYPE type;
    //ENUM TO STORE THE COLLECTION OF SUITS
    public static enum SUIT{
        SPADE('\u2660'),
        DIAMOND('\u2B29'),
        HEART('\u2665'),
        CLUB('\u2663');
        public final char label;
        private SUIT(char label) {
            this.label = label;
        }

      
    }
    //ENUM TO STORE THE COLLECTION OF TYPES IN A DECK
    public static enum TYPE{
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"), 
        JACK("J") ,
        QUEEN("Q"),
        KING("K"),
        ACE("A");
        public final String label;
        private TYPE(String label) {
            this.label = label;
        }
    }
    public Card(){}
    public Card(SUIT s, TYPE t) {
        this.suit = s;
        this.type = t;
    }
   
    /**
     * @description gets the suit of the card
     * @return SUIT
     */
    public SUIT getSuit() {
        return suit;
    }
    /**
     * @description gets the type of the card
     * @return TYPE
     */
    public TYPE getType() {
        return type;
    }
    
}
