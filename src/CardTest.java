
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("CardTest");
    } 
    /**
     * Test to test if get suit function works.
     */

    @Test 
    public void testGetSuit(){
        System.out.println("Testing get suit function");
        Card card = new Card(Card.SUIT.CLUB, Card.TYPE.ACE);
        assertEquals(Card.SUIT.CLUB, card.getSuit());
    }
    /**
     * Test to test if get type function works.
     */
    @Test
    public void testGetType(){
        System.out.println("Testing get type function");
        Card card = new Card(Card.SUIT.CLUB, Card.TYPE.ACE);
        assertEquals(Card.TYPE.ACE, card.getType());
    }
}
