
import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.junit.*;

public class PlayerTest {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("PlayerTest");
    } 
    /**
     * Test to check if correct evaluation is returned.
     */
    @Test 
    public void testEvaluateHand() {
        System.out.println("Testing evaluate hand function");
        ArrayList<Card> hand = new ArrayList<Card>();
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.ACE));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.KING));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.QUEEN));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.JACK));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.TEN));
        Player player = new Player(hand);
        assertEquals("Straight Flush", player.evaluateHand(hand));
    }
    /**
     * Test to check if the print function is working
     * @throws UnsupportedEncodingException
     */
    @Test
    public void testPrintHand() throws UnsupportedEncodingException{
        System.out.println("Testing print hand function");
        ArrayList<Card> hand = new ArrayList<Card>();
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.ACE));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.KING));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.QUEEN));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.JACK));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.TEN));
        String handString = "";
        for(int i = 0; i < hand.size(); i++){
           handString += hand.get(i).getType().label + hand.get(i).getSuit().label + " " ;
        }
        Player player = new Player(hand);
        assertEquals(handString, player.printHand(hand));
    }
    /**
     * Test to check if the hand is set correctly
     */
    
    @Test
    public void testGetHand() {
        System.out.println("Testing get hand function");
        ArrayList<Card> hand = new ArrayList<Card>();
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.ACE));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.KING));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.QUEEN));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.JACK));
        hand.add(new Card(Card.SUIT.CLUB, Card.TYPE.TEN));
        Player player = new Player(hand);
        assertEquals(hand, player.getHand());
        assertEquals(hand.size(), player.getHand().size());

    }
    
}
