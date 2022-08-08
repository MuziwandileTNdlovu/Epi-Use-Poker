


import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("AppTest");
    } 
       

    @Test
    public void testDealHands(){
        System.out.println("Testing Dealing hands");
        Deck deck = new Deck();
        deck.setDeck();
        deck.shuffleDeck();
        assertEquals(5, App.dealHands(deck,5).size());
    }
    @Test
    public void testDealHands2(){
        System.out.println("Testing Dealing hands 2");
        Deck deck = new Deck();
        deck.setDeck();
        deck.shuffleDeck();
        ArrayList<Card> hand =App.dealHands(deck, 5);
        Player player = new Player(hand);
        assertEquals(player.getHand(), hand);
    }
    @Test
    public void testHandSize(){
        System.out.println("Testing hand size function");
        App.setHandSize(4);
        assertEquals(4, App.HAND_SIZE);
    }

    
    
}
