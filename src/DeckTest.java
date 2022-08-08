
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeckTest {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("DeckTest");
    } 
    /**
     * Test to see if the deck is set properly.
     */
    
    @Test
    public void testSetDeck(){
        System.out.println("Testing set deck function");
        Deck deck = new Deck();
        deck.setDeck();
        assertEquals(52, deck.getDeck().size());
    }
    /**
     *  Test to see if the deck is shuffled properly.
     */
     
    @Test
    public void testShuffleDeck(){
        System.out.println("Testing shuffle deck function");
        Deck deck = new Deck();
        deck.setDeck();
        deck.shuffleDeck();
        assertEquals(52, deck.getDeck().size());
    }
    /**
     * Test to see if the card is dealt properly.
     */
    
    @Test 
    public void testDealtCard(){
        System.out.println("Testing dealt card function");
        Deck deck = new Deck();
        deck.setDeck();
        deck.shuffleDeck();
        deck.dealtCard(deck , 7);
        assertEquals(51, deck.getDeck().size());
    }
    /**
     * Test to see if the card is dealt properly.
     */
    @Test 
    public void testDealtCard2(){
        System.out.println("Testing dealt card function 2");
        Deck deck = new Deck();
        deck.setDeck();
        deck.shuffleDeck();
        Card card = deck.dealtCard(deck , 7);
        assertEquals(false, deck.getDeck().contains(card));
    }
    
}
